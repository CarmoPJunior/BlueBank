package com.example.BlueBank.service;

import java.util.List;

import com.example.BlueBank.DTO.EnderecoDTO;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.EnderecoNaoEncontradoException;
import com.example.BlueBank.models.Endereco;

public interface EnderecoInterfaceService {

	EnderecoDTO obterPorCodDTO(Integer id) throws EnderecoNaoEncontradoException;

	Endereco obterPorCod(Integer id) throws EnderecoNaoEncontradoException;

	List<EnderecoDTO> obterTodos();

	Endereco criar(Endereco endereco) throws ClienteNaoEncontradaException;

	EnderecoDTO alterarEndereco(Integer id, EnderecoDTO endereco) throws EnderecoNaoEncontradoException;

	void deletar(Integer id) throws EnderecoNaoEncontradoException;
}