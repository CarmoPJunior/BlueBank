package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.models.Conta;

public interface ContaInterfaceService {

	ContaDTO obterPorCod(Integer id);
	
	Conta obterContaPorCod(Integer id);
	
	List<ContaDTO> obterTodos();	
	
	Conta criar(Conta conta);
	
	Conta atualizar(Integer id, ContaDTO obj);
	
	void deletar(Integer id);
	
}
