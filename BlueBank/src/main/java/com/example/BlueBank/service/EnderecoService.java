package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.DTO.EnderecoDTO;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.models.Endereco;
import com.example.BlueBank.repositories.EnderecoRepository;

@Service
public class EnderecoService implements EnderecoInterfaceService {
	
	
	@Autowired
	EnderecoRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Endereco obterPorCod(Integer id) {
		Optional<Endereco> obj = this.repository.findById(id);
		return obj.orElse(null);
	}

	@Override
	public List<EnderecoDTO> obterTodos() {
		return this.repository.findAll().stream().map(this::enderecoToDTO).collect(Collectors.toList());
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
	public EnderecoDTO alterarEndereco(Integer id, Endereco endereco) {
		Endereco newObj = obterPorCod(id);;

		newObj.setCep(endereco.getCep());
		newObj.setCidade(endereco.getCidade());
		newObj.setEstado(endereco.getEstado());
		newObj.setLogradouro(endereco.getLogradouro());
		newObj.setNumero(endereco.getNumero());
		
		this.repository.save(newObj);
		return enderecoToDTO(newObj);
	}

	@Override
	public EnderecoDTO obterPorCodDTO(Integer id) {
		Optional<Endereco> obj = this.repository.findById(id);		
		return enderecoToDTO(obj.get());
	}
	
	private EnderecoDTO enderecoToDTO(Endereco endereco) {
		return modelMapper.map(endereco, EnderecoDTO.class);
	}
	

}
