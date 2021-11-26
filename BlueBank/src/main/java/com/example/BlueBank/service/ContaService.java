package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.exceptions.ContaNaoEncontradaException;
import com.example.BlueBank.exceptions.PossuiSaldoException;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.repositories.ContaRepository;

@Service
public class ContaService implements ContaInterfaceService {

	@Autowired
	ContaRepository contaRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ContaDTO obterPorCod(Integer id) throws ContaNaoEncontradaException {
		Conta obj = this.contaRepository.findById(id).orElseThrow(ContaNaoEncontradaException::new);

		return contaDTO(obj);
	}

	@Override
	public List<ContaDTO> obterTodos() {
		return this.contaRepository.findAll().stream().map(this::contaDTO).collect(Collectors.toList());
	}

	@Override
	public Conta criar(Conta conta) {
		return this.contaRepository.save(conta);
	}

	public Conta atualizar(Integer id, ContaDTO obj) throws ContaNaoEncontradaException {
		ContaDTO newObj = obterPorCod(id);
		Conta conta = conta(newObj);
		conta.setTipoConta(obj.getTipoConta());
		conta.setNumeroConta(obj.getNumeroConta());
		conta.setAgencia(obj.getAgencia());
		// newObj.setSaldo(obj.getSaldo());
		return contaRepository.save(conta);
	}

	public ContaDTO atualizarStatus(Integer id, ContaDTO obj) throws ContaNaoEncontradaException, PossuiSaldoException {
//		ContaDTO newObj = obterPorCod(id);
		Conta conta = obterContaPorCod(id);
		conta.setStatus(obj.isStatus());
		contaRepository.save(conta);
		return contaDTO(conta);
	}

	@Override
	public void deletar(Integer id) throws ContaNaoEncontradaException {
		obterPorCod(id);
		this.contaRepository.deleteById(id);
	}

	private ContaDTO contaDTO(Conta conta) {
		return modelMapper.map(conta, ContaDTO.class);
	}

	private Conta conta(ContaDTO contaDTO) {
		return modelMapper.map(contaDTO, Conta.class);
	}

	@Override
	public Conta obterContaPorCod(Integer id) throws ContaNaoEncontradaException {
		Optional<Conta> obj = this.contaRepository.findById(id);
		return obj.orElseThrow(() ->  new ContaNaoEncontradaException());

	}

}
