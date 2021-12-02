package com.example.BlueBank.controllers.docs;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.BlueBank.DTO.ContatoDTO;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.ContatoNaoEncontradoException;
import com.example.BlueBank.models.Contato;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("Gerencia os Clientes")
public interface  ContatoControllerDocs {
	
	@ApiOperation(value = "Retorna o contato do cliente, passando o id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Contato encontrado!"),
            @ApiResponse(code = 404, message = "Contato não encontrado!")
    })
	ResponseEntity<ContatoDTO> findById(@PathVariable Integer id) throws ContatoNaoEncontradoException;

	
	@ApiOperation(value = "Retorna todos os contato do cliente.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Contatos encontrados com sucesso!"),
            @ApiResponse(code = 404, message = "Contatos não encontrados!")
    })
	ResponseEntity<List<ContatoDTO>> findAll();

	
	@ApiOperation(value = "Atualiza os dados do contato do cliente, passando o ID do Cliente e os dados a serem alterados")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Contato atualizado com sucesso!"),
            @ApiResponse(code = 404, message = "Contato não encontrado!")
    })
	ResponseEntity<ContatoDTO> update(@PathVariable Integer id, @RequestBody ContatoDTO obj) throws ContatoNaoEncontradoException;
		
	
	@ApiOperation(value = "Cadastra o contato do cliente, passando os dados do contato.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Contato cadastrado com sucesso!"),
            @ApiResponse(code = 404, message = "Campos de cadastro Inválido(s)!")
    })
	ResponseEntity<ContatoDTO> create(@RequestBody @Valid Contato obj) throws ClienteNaoEncontradaException;
	

	@ApiOperation(value = "Deleta o contato do cliente, passando o ID do contato.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Contato deletado com sucesso!"),
            @ApiResponse(code = 404, message = "Contato não encontrado!")
    })
	ResponseEntity<Void> delete(@PathVariable Integer id) throws ContatoNaoEncontradoException;
}
