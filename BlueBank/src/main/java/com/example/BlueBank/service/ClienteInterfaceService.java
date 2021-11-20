package com.example.BlueBank.service;

import java.util.List;
import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.models.Cliente;

public interface ClienteInterfaceService {
	
	ClienteDTO obterPorCod(Integer id);
	
	List<ClienteDTO> obterTodos();	
	
	public Cliente criar(Cliente cliente);	

	Cliente atualizar(Integer id, ClienteDTO obj);
	
	void deletar(Integer id);
	
}

