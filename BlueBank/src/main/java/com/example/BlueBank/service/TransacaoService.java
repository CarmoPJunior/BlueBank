package com.example.BlueBank.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	private ContaService contaService;
	
	@Override
	public Transacoes obterPorCod(Integer id) {
		Optional<Transacoes> obj = this.transacaoRepository.findById(id);
		return obj.orElse(null);

	}

	@Override
	public List<Transacoes> obterTodos() {		
		return this.transacaoRepository.findAll();
	}

	@Override
	public Transacoes transferenciaContas(Conta origem, Conta destino, Double valor) {
		Conta contaDestino = contaService.obterPorCod(destino.getId());
		contaDestino.somaSaldo(valor);
		contaRepository.save(contaDestino);
		
		Conta contaOrigem = contaService.obterPorCod(origem.getId());
		contaOrigem.subtraiSaldo(valor);
		contaRepository.save(contaOrigem);
		
		Transacoes transacaoDest = new Transacoes();
		transacaoDest.setContaDestino(contaDestino);
		transacaoDest.setContaOrigem(contaOrigem);
		transacaoDest.setData(new Date());
		transacaoDest.setValor(valor);
		transacaoDest.setTipoTransacao(TipoTransacao.TRANSFERENCIA);
		transacaoRepository.save(transacaoDest);
		
		
		Transacoes transacaoOri = new Transacoes();
		transacaoOri.setContaOrigem(contaOrigem);
		transacaoOri.setContaDestino(contaDestino);
		transacaoOri.setData(new Date());
		transacaoOri.setValor(valor);
		transacaoOri.setTipoTransacao(TipoTransacao.TRANSFERENCIA);
		return transacaoRepository.save(transacaoOri);
	}

	@Override
	public Transacoes deposito(Conta conta, Double valor) {
		
		Conta contaAux = contaService.obterPorCod(conta.getId());
		contaAux.somaSaldo(valor);
		contaRepository.save(contaAux);
		
		Transacoes transacaoAux = new Transacoes();
		transacaoAux.setContaOrigem(contaAux);
		transacaoAux.setData(new Date());
		transacaoAux.setValor(valor);
		transacaoAux.setTipoTransacao(TipoTransacao.DEPOSITO);
		return transacaoRepository.save(transacaoAux);
	}

	@Override
	public Transacoes saque(Conta conta, Double valor) {
		Conta contaAux = contaService.obterPorCod(conta.getId());
		contaAux.subtraiSaldo(valor);
		contaRepository.save(contaAux);
		
		Transacoes transacaoAux = new Transacoes();
		transacaoAux.setContaOrigem(contaAux);
		transacaoAux.setData(new Date());
		transacaoAux.setValor(valor);
		transacaoAux.setTipoTransacao(TipoTransacao.SAQUE);
		return transacaoRepository.save(transacaoAux);
		
	}

	
	
}
