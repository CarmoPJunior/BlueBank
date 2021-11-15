package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlueBank.models.Endereco;
import com.example.BlueBank.repositories.EnderecoRepository;

@Service
public class EnderecoService implements EnderecoInterfaceService {
	
	
	@Autowired
	EnderecoRepository repository;

	@Override
	public Endereco obterPorCod(Integer id) {
		Optional<Endereco> obj = this.repository.findById(id);
		return obj.orElse(null);
	}

	@Override
	public List<Endereco> obterTodos() {
		return this.repository.findAll();
	}

	@Override
	public Endereco criar(Endereco endereco) {
		return this.repository.save(endereco);
	}

	@Override
	public void deletar(Integer id) {
		obterPorCod(id);
		this.repository.deleteById(id);
		
	}

	@Override
	public Endereco alterarEndereco(Integer id, Endereco endereco) {
		Endereco newObj = obterPorCod(id);
		newObj.setCep(endereco.getCep());
		newObj.setCidade(endereco.getCidade());
		newObj.setEstado(endereco.getEstado());
		newObj.setLogradouro(endereco.getLogradouro());
		newObj.setNumero(endereco.getNumero());
		return this.repository.save(newObj);
	}

}
