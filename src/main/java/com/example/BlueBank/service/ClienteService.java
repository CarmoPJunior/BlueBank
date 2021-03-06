package com.example.BlueBank.service;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.exceptions.ClienteJaExisteException;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.models.Cliente;
import com.example.BlueBank.repositories.ClienteRepository;

@Service
public class ClienteService implements ClienteInterfaceService {

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ClienteDTO obterPorCod(Integer id) throws ClienteNaoEncontradaException {

		Cliente obj = this.clienteRepository.findById(id).orElseThrow(ClienteNaoEncontradaException::new);
		;

		return mapperClienteParaClienteDTO(obj);
	}

	@Override
	public Cliente obterClientePorCod(Integer id) throws ClienteNaoEncontradaException {

		return this.clienteRepository.findById(id).orElseThrow(ClienteNaoEncontradaException::new);
	}

	@Override
	public Page<ClienteDTO> obterTodos(Pageable page) {

		Page<Cliente> clientes = clienteRepository.findAll(page);
		int totalElements = (int) clientes.getTotalElements();

		return new PageImpl<ClienteDTO>(
				clientes.getContent().stream().map(this::mapperClienteParaClienteDTO).collect(Collectors.toList()),
				page, totalElements);

	}

	@Override
	public ClienteDTO criar(Cliente cliente) throws ClienteJaExisteException {

		try {
			this.clienteRepository.save(cliente);

			return mapperClienteParaClienteDTO(cliente);
		} catch (DataIntegrityViolationException e) {
			throw new ClienteJaExisteException();
		}

	}

	public ClienteDTO atualizar(Integer id, ClienteDTO clienteDTO) throws ClienteNaoEncontradaException {

		Cliente clienteParaAtualizar = obterClientePorCod(id);
		clienteParaAtualizar.setNome(clienteDTO.getNome());
		clienteParaAtualizar.setCpf(clienteDTO.getCpf());
		clienteParaAtualizar.setDataDeNascimento(clienteDTO.getDataDeNascimento());

		this.clienteRepository.save(clienteParaAtualizar);

		return mapperClienteParaClienteDTO(clienteParaAtualizar);
	}

	@Override
	public void deletar(Integer id) throws ClienteNaoEncontradaException {
		obterPorCod(id);
		this.clienteRepository.deleteById(id);
	}

	private ClienteDTO mapperClienteParaClienteDTO(Cliente cliente) {
		return modelMapper.map(cliente, ClienteDTO.class);
	}

}