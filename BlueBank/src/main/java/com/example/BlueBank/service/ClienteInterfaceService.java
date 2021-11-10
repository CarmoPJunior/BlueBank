package com.example.BlueBank.service;

import java.util.List;
import com.example.BlueBank.models.Cliente;

public interface ClienteInterfaceService {
	
	Cliente obterPorCod(Integer id);
	
	List<Cliente> obterTodos();	
	
	Cliente criar(Cliente cliente);
	
	void deletar(Integer id);

}
