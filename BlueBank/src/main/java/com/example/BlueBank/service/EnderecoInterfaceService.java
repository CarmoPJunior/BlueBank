package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.models.Endereco;

public interface EnderecoInterfaceService {
	
	public Endereco obterPorCod(Integer id);
	
	public List<Endereco> obterTodos();	
	
	public Endereco criar(Endereco endereco);
	
	public void deletar(Integer id);
	
	public Endereco alterarEndereco(Integer id, Endereco endereco);

}
