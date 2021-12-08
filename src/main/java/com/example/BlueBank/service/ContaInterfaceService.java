package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.exceptions.ClienteJaPossuiContaException;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.ContaNaoEncontradaException;
import com.example.BlueBank.models.Conta;

public interface ContaInterfaceService {

	ContaDTO obterPorCod(Integer id) throws ContaNaoEncontradaException;
	
	Conta obterContaPorCod(Integer id) throws ContaNaoEncontradaException;
	
	List<ContaDTO> obterTodos();	
	
	ContaDTO criar(Conta conta) throws ClienteNaoEncontradaException, ClienteJaPossuiContaException;
	
	ContaDTO atualizar(Integer id, ContaDTO obj) throws ContaNaoEncontradaException;
	
	void deletar(Integer id) throws ContaNaoEncontradaException;
	
}
