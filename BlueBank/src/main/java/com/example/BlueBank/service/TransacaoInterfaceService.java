package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.DTO.TransacaoDTO;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.models.Transacoes;

public interface TransacaoInterfaceService {

	Transacoes obterPorCod(Integer id);
	
	List<Transacoes> obterTodos();
	
	Transacoes transferenciaContas(Conta origem, Conta destino, Double valor);
	
	Transacoes deposito(Conta conta, Double valor);
	
	Transacoes saque(Conta conta, Double valor);

	TransacaoDTO obterPorCodDTO(Integer id);

	List<TransacaoDTO> obterTodosDTO();
	
}
