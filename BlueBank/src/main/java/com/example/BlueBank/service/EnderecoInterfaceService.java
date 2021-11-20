package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.DTO.EnderecoDTO;
import com.example.BlueBank.models.Endereco;

public interface EnderecoInterfaceService {
	
	public Endereco obterPorCod(Integer id);
	
	public EnderecoDTO obterPorCodDTO(Integer id);
	
	public List<EnderecoDTO> obterTodos();	
	
	public Endereco criar(Endereco endereco);
	
	public void deletar(Integer id);
	
	public EnderecoDTO alterarEndereco(Integer id, Endereco endereco);

}
