package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.DTO.EnderecoDTO;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.EnderecoNaoEncontradoException;
import com.example.BlueBank.models.Endereco;
import com.example.BlueBank.repositories.EnderecoRepository;

@Service
public class EnderecoService implements EnderecoInterfaceService {
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ClienteService clienteService;

	@Override
	public EnderecoDTO obterPorCodDTO(Integer id) throws EnderecoNaoEncontradoException {
		Endereco obj = this.enderecoRepository.findById(id).orElseThrow(EnderecoNaoEncontradoException::new);
		return enderecoDTO(obj);
	}

	@Override
	public List<EnderecoDTO> obterTodos() {
		return this.enderecoRepository.findAll().stream().map(this::enderecoDTO).collect(Collectors.toList());
	}

	@Override
	public EnderecoDTO criar(Endereco endereco) throws ClienteNaoEncontradaException {
		ClienteDTO cliente = clienteService.obterPorCod(endereco.getCliente().getId());
		endereco.getCliente().setNome(cliente.getNome());;
		this.enderecoRepository.save(endereco);
		EnderecoDTO enderecoDTO = enderecoDTO(endereco);
		return enderecoDTO;
	}

	public EnderecoDTO alterarEndereco(Integer id, EnderecoDTO obj) throws EnderecoNaoEncontradoException {		
	//  EnderecoDTO newObj = obterPorCod(id);
		Endereco endereco = obterPorCod(id);

		endereco.setCep(obj.getCep());
		endereco.setCidade(obj.getCidade());
		endereco.setEstado(obj.getEstado());
		endereco.setLogradouro(obj.getLogradouro());
		endereco.setNumero(obj.getNumero());
		
		enderecoRepository.save(endereco);
		return enderecoDTO(endereco);
	}
	
	
	@Override
	public void deletar(Integer id) throws EnderecoNaoEncontradoException {
		obterPorCod(id);
		this.enderecoRepository.deleteById(id);	
	}

	private EnderecoDTO enderecoDTO(Endereco endereco) {
		return modelMapper.map(endereco, EnderecoDTO.class);
	}
	
//	private Endereco endereco(EnderecoDTO enderecoDTO) {
//		return modelMapper.map(enderecoDTO, Endereco.class);
//	}
	
	@Override
	public Endereco obterPorCod(Integer id) throws EnderecoNaoEncontradoException {
		Optional<Endereco> obj = this.enderecoRepository.findById(id);		
		return obj.orElseThrow(EnderecoNaoEncontradoException::new);
	}
	

}
