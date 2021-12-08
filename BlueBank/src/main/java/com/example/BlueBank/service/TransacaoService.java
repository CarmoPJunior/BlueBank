package com.example.BlueBank.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.example.BlueBank.DTO.TransacaoDTO;
import com.example.BlueBank.exceptions.ContaBloqueadaException;
import com.example.BlueBank.exceptions.ContaNaoEncontradaException;
import com.example.BlueBank.exceptions.SaldoInsuficienteException;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.models.TipoTransacao;
import com.example.BlueBank.models.Transacoes;
import com.example.BlueBank.repositories.ContaRepository;
import com.example.BlueBank.repositories.TransacaoRepository;

@Service
public class TransacaoService implements TransacaoInterfaceService {

	@Autowired
	TransacaoRepository transacaoRepository;
	
	@Autowired
	ContaRepository contaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ContaService contaService;
	
	private SimpleDateFormat  fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static final String AWS_ACCESS_KEY_ID = "aws.accessKeyId";
	public static final String AWS_SECRET_KEY = "aws.secretKey";
	static {
		System.setProperty(AWS_ACCESS_KEY_ID, "AKIA6BZRT7L43R62EAHD");
		System.setProperty(AWS_SECRET_KEY, "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");
	}
	
	
	public void sendSMS (String messege, String phoneNumber) {
		AmazonSNS snsClient = AmazonSNSClient.builder().withRegion(Regions.US_EAST_1).build();
		Map<String, MessageAttributeValue> smsAttributes = new HashMap<>();
		smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue().withStringValue("BlueBak")
													.withDataType("String")); 
		
		smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue().withStringValue("Transactional")
				.withDataType("String")); 
		
		PublishResult result = snsClient.publish(new PublishRequest()
				.withMessage(messege)
				.withPhoneNumber(phoneNumber)
				.withMessageAttributes(smsAttributes));
		
		System.out.println("Messagem enviada com sucesso! " + result.getMessageId());
		
	}
	
	@Override
	public Transacoes obterPorCod(Integer id) {
		Optional<Transacoes> obj = this.transacaoRepository.findById(id);
		return obj.orElse(null);

	}
	
	@Override
	public TransacaoDTO obterPorCodDTO(Integer id) {
		Optional<Transacoes> obj = this.transacaoRepository.findById(id);		
		return transacaoDTO(obj.get());
	}
	
//	@Override
//	public List<TransacaoDTO> obterPorTipoTransacao(Integer id) {
//				
//		return this.transacaoRepository.findAllByTipo(id).stream().map(this::transacaoDTO).collect(Collectors.toList());
//	}

	@Override
	public List<Transacoes> obterTodos() {		
		return this.transacaoRepository.findAll();
	}
	
	@Override
	public List<TransacaoDTO> obterTodosDTO() {
		return this.transacaoRepository.findAll().stream().map(this::transacaoDTO).collect(Collectors.toList());
	}

	@Override
	public TransacaoDTO transferenciaContas(Conta origem, Conta destino, Double valor) throws SaldoInsuficienteException, ContaNaoEncontradaException, ContaBloqueadaException {
		
		BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);	
		valor = bd.doubleValue();
		
		Conta contaDestino = contaService.obterContaPorCod(destino.getId());
		contaDestino.somaSaldo(valor);
		contaRepository.save(contaDestino);
		
		Conta contaOrigem = contaService.obterContaPorCod(origem.getId());
		contaOrigem.subtraiSaldo(valor);
		contaRepository.save(contaOrigem);
		
		Transacoes transacaoOri = new Transacoes();
		transacaoOri.setContaOrigem(contaOrigem);
		transacaoOri.setContaDestino(contaDestino);
		transacaoOri.setData(fmt.format(new Date()));
		transacaoOri.setValor(valor);
		transacaoOri.setTipoTransacao(TipoTransacao.TRANSFERENCIA);
		transacaoRepository.save(transacaoOri);
		TransacaoDTO transacaoDTO = transacaoDTO(transacaoOri);
		sendSMS("Foi transferido R$ " + valor + " em sua conta! BlueBak - Teste" , "+5581987428692");
		return transacaoDTO;
	}

	@Override
	public TransacaoDTO deposito(Conta conta, Double valor) throws ContaNaoEncontradaException, ContaBloqueadaException {
		
		BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);	
		valor = bd.doubleValue();
		
		
		Conta contaAux = contaService.obterContaPorCod(conta.getId());
		contaAux.somaSaldo(valor);
		contaRepository.save(contaAux);
		
		Transacoes transacaoAux = new Transacoes();
		transacaoAux.setContaOrigem(contaAux);
		transacaoAux.setData(fmt.format(new Date()));
		transacaoAux.setValor(valor);
		transacaoAux.setTipoTransacao(TipoTransacao.DEPOSITO);
		transacaoRepository.save(transacaoAux);
		TransacaoDTO transacaoDTO = transacaoDTO(transacaoAux);
		//String numero = conta.getCliente().getContato().stream().forEach(n -> n.getNumeroTelefone());
		
		sendSMS("Foi depositado R$ " + valor + " em sua conta! BlueBak - Teste" , "+5511948541077");
		
		return transacaoDTO;
	}

	@Override
	public TransacaoDTO saque(Conta conta, Double valor) throws SaldoInsuficienteException, ContaNaoEncontradaException, ContaBloqueadaException {
		
		BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);	
		valor = bd.doubleValue();
		
		Conta contaAux = contaService.obterContaPorCod(conta.getId());
		contaAux.subtraiSaldo(valor);
		contaRepository.save(contaAux);
		
		Transacoes transacaoAux = new Transacoes();
		transacaoAux.setContaOrigem(contaAux);
		transacaoAux.setData(fmt.format(new Date()));
		transacaoAux.setValor(valor);
		transacaoAux.setTipoTransacao(TipoTransacao.SAQUE);
		transacaoRepository.save(transacaoAux);
		TransacaoDTO transacaoDTO = transacaoDTO(transacaoAux);
		sendSMS("Foi sacado R$ " + valor + " em sua conta! BlueBak - Teste" , "+5581987428692");
		return transacaoDTO;
		
	}

//	private Transacoes transacao(TransacaoDTO transacaoDTO) {
//		return modelMapper.map(transacaoDTO, Transacoes.class);
//	}
	
	public TransacaoDTO transacaoDTO(Transacoes transacao) {
		return modelMapper.map(transacao, TransacaoDTO.class);
	}




}
