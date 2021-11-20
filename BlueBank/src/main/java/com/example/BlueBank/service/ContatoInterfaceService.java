package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.DTO.ContatoDTO;
import com.example.BlueBank.models.Contato;

public interface ContatoInterfaceService {
	
	ContatoDTO obterPorCod(Integer id);
	
	Contato obterContatoPorCod(Integer id);
	
	List<ContatoDTO> obterTodos();	
	
	Contato criar(Contato contato);
	
	Contato alterarContato(Integer id, ContatoDTO obj);
	
	void deletar(Integer id);
	}