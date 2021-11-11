package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.models.Contato;

public interface ContatoInterfaceService {
	
	Contato obterPorCod(Integer id);
	
	List<Contato> obterTodos();	
	
	Contato criar(Contato contato);
	
	void deletar(Integer id);

}
