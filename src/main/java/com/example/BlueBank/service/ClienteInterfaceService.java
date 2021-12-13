package com.example.BlueBank.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.exceptions.ClienteJaExisteException;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.models.Cliente;

public interface ClienteInterfaceService {

	ClienteDTO obterPorCod(Integer id) throws ClienteNaoEncontradaException;

	Page<ClienteDTO> obterTodos(Pageable page);

	ClienteDTO criar(Cliente cliente) throws ClienteJaExisteException;

	ClienteDTO atualizar(Integer id, ClienteDTO clienteDTO) throws ClienteNaoEncontradaException;

	void deletar(Integer id) throws ClienteNaoEncontradaException;

	Cliente obterClientePorCod(Integer id) throws ClienteNaoEncontradaException;

}
