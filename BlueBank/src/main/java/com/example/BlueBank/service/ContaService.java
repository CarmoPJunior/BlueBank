package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.repositories.ContaRepository;


@Service
public class ContaService implements ContaInterfaceService {

	@Autowired
	ContaRepository contaRepository;
	
	@Override
	public Conta obterPorCod(Integer id) {
		Optional<Conta> obj = this.contaRepository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public List<Conta> obterTodos() {
		return this.contaRepository.findAll();
	}

	@Override
	public Conta criar(Conta conta) {
		return this.contaRepository.save(conta);
	}
	
	@Override
	public void deletar(Integer id) {
		obterPorCod(id);
		this.contaRepository.deleteById(id);
	}
	
}
