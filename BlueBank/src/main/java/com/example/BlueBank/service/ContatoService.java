package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BlueBank.models.Contato;
import com.example.BlueBank.repositories.ContatoRepository;

@Service
public class ContatoService implements ContatoInterfaceService {

	@Autowired
	ContatoRepository contatoRepository;
	
	@Override
	public Contato obterPorCod(Integer id) {
		Optional<Contato> obj = this.contatoRepository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public List<Contato> obterTodos() {
		return this.contatoRepository.findAll();
	}

	@Override
	public Contato criar(Contato contato) {
		return this.contatoRepository.save(contato);
	}
	
	@Override
	public void deletar(Integer id) {
		obterPorCod(id);
		this.contatoRepository.deleteById(id);
	}

}
