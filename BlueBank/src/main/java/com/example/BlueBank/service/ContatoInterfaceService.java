package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.DTO.ContatoDTO;
import com.example.BlueBank.exceptions.ContatoNaoEncontradoException;
import com.example.BlueBank.models.Contato;

public interface ContatoInterfaceService {
	
	ContatoDTO obterPorCod(Integer id) throws ContatoNaoEncontradoException;
	
	Contato obterContatoPorCod(Integer id) throws ContatoNaoEncontradoException;
	
	List<ContatoDTO> obterTodos();	
	
	Contato criar(Contato contato);
	
	ContatoDTO alterarContato(Integer id, ContatoDTO obj) throws ContatoNaoEncontradoException;
	
	void deletar(Integer id) throws ContatoNaoEncontradoException;
	}