package com.example.BlueBank.service;

import java.util.List;
import com.example.BlueBank.models.Cliente;

public interface ClienteInterfaceService {
	
	Cliente obterPorCod(Integer id);
	
	List<Cliente> obterTodos();	
	
	public Cliente criar(Cliente cliente);
	
	public void deletar(Integer id);
	
	public Cliente alterarCliente(Integer id, Cliente cliente);
}