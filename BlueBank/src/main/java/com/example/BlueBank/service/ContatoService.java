package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlueBank.DTO.ContatoDTO;
import com.example.BlueBank.models.Contato;
import com.example.BlueBank.repositories.ContatoRepository;

@Service
public class ContatoService implements ContatoInterfaceService {

	@Autowired
	ContatoRepository contatoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public ContatoDTO obterPorCod(Integer id) {
		Optional<Contato> obj = this.contatoRepository.findById(id);
		return contatoDTO(obj.get());
	}
	
	@Override
	public List<ContatoDTO> obterTodos() {
		return this.contatoRepository.findAll().stream().map(this::contatoDTO).collect(Collectors.toList());
	}

	@Override
	public Contato criar(Contato contato) {
		return this.contatoRepository.save(contato);
	}
	
	@Override
	public Contato alterarContato(Integer id, ContatoDTO obj) {
		ContatoDTO newObj = obterPorCod(id);
		Contato contato = contato(newObj);
		contato.setNumeroTelefone(obj.getNumeroTelefone());
		contato.setEmail(obj.getEmail());
		return contatoRepository.save(contato);
	}

	@Override
	public void deletar(Integer id) {
		obterPorCod(id);
		this.contatoRepository.deleteById(id);
	}
	
	private ContatoDTO contatoDTO(Contato contato) {
		return modelMapper.map(contato, ContatoDTO.class);
	}
	
	private Contato contato(ContatoDTO contatoDTO) {
		return modelMapper.map(contatoDTO, Contato.class);
	}

	@Override
	public Contato obterContatoPorCod(Integer id) {
		Optional<Contato> obj = this.contatoRepository.findById(id);
		return obj.orElse(null);
	}
}