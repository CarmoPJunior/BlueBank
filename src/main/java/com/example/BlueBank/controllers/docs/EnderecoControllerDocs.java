package com.example.BlueBank.controllers.docs;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.BlueBank.DTO.EnderecoDTO;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.EnderecoNaoEncontradoException;
import com.example.BlueBank.models.Endereco;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface EnderecoControllerDocs {

	@ApiOperation(value = "Retorna um endereço, passando o id do endereço")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Endereço encontrado!"),
			@ApiResponse(code = 404, message = "Endereço não encontrado!") })
	ResponseEntity<EnderecoDTO> findById(@PathVariable Integer id) throws EnderecoNaoEncontradoException;

	@ApiOperation(value = "Retorna todos os endereços cadastrados")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Endereços encontrados!") })
	ResponseEntity<List<EnderecoDTO>> findAll();

	@ApiOperation(value = "Atualiza os dados cadastrais de um endereço, passando o id do endereço")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Endereço encontrado!"),
			@ApiResponse(code = 400, message = "Requisição possui campos inválidos!"),
			@ApiResponse(code = 404, message = "Endereço não encontrado!") })
	ResponseEntity<EnderecoDTO> update(@PathVariable Integer id, @RequestBody EnderecoDTO obj)
			throws EnderecoNaoEncontradoException;

	@ApiOperation(value = "Cria um novo endereço")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Endereço criado!"),
			@ApiResponse(code = 400, message = "Requisição possui campos inválidos!")

	})
	ResponseEntity<EnderecoDTO> create(@RequestBody @Valid Endereco obj) throws ClienteNaoEncontradaException;

	@ApiOperation(value = "Deleta um endereço, passando o id do endereço")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Endereço deletado!"),
			@ApiResponse(code = 404, message = "Endereço não encontrado!")

	})
	ResponseEntity<Void> delete(@PathVariable Integer id) throws EnderecoNaoEncontradoException;
}
