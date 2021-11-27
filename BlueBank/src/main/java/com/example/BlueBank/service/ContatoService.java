package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.DTO.ContatoDTO;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.ContatoNaoEncontradoException;
import com.example.BlueBank.models.Contato;
import com.example.BlueBank.repositories.ContatoRepository;

@Service
public class ContatoService implements ContatoInterfaceService {

	@Autowired
	ContatoRepository contatoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public ContatoDTO obterPorCod(Integer id) throws ContatoNaoEncontradoException {
		Contato obj = this.contatoRepository.findById(id).orElseThrow(ContatoNaoEncontradoException::new);
		return contatoDTO(obj);
	}
	
	@Override
	public List<ContatoDTO> obterTodos() {
		return this.contatoRepository.findAll().stream().map(this::contatoDTO).collect(Collectors.toList());
	}

	@Override
	public Contato criar(Contato contato) throws ClienteNaoEncontradaException {
		ClienteDTO cliente = clienteService.obterPorCod(contato.getCliente().getId());
		return this.contatoRepository.save(contato);
	}
	
	@Override
	public ContatoDTO alterarContato(Integer id, ContatoDTO obj) throws ContatoNaoEncontradoException {
		//ContatoDTO newObj = obterPorCod(id);
		Contato contato = obterContatoPorCod(id);
		contato.setNumeroTelefone(obj.getNumeroTelefone());
		contato.setEmail(obj.getEmail());
		contatoRepository.save(contato);
		return contatoDTO(contato);
	}

	@Override
	public void deletar(Integer id) throws ContatoNaoEncontradoException {
		obterPorCod(id);
		this.contatoRepository.deleteById(id);
	}
	
	private ContatoDTO contatoDTO(Contato contato) {
		return modelMapper.map(contato, ContatoDTO.class);
	}
	
//	private Contato contato(ContatoDTO contatoDTO) {
//		return modelMapper.map(contatoDTO, Contato.class);
//	}

	@Override
	public Contato obterContatoPorCod(Integer id) throws ContatoNaoEncontradoException {
		Optional<Contato> obj = this.contatoRepository.findById(id);
		return obj.orElseThrow(ContatoNaoEncontradoException::new);
	}
}