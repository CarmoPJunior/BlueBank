package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.models.Conta;

public interface ContaInterfaceService {

	Conta obterPorCod(Integer id);
	
	List<Conta> obterTodos();	
	
	Conta criar(Conta conta);
	
	void deletar(Integer id);
	
}
