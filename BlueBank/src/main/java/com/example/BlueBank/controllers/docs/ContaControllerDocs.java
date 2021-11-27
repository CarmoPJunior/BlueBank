package com.example.BlueBank.controllers.docs;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.ContaNaoEncontradaException;
import com.example.BlueBank.models.Conta;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("Gerencia as Contas")
public interface ContaControllerDocs {

	@ApiOperation(value = "Retorna uma conta, passando o ID da Conta")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Conta encontrada!"),
            @ApiResponse(code = 404, message = "Conta não encontrado!")
    })
	ResponseEntity<ContaDTO> findById(@PathVariable Integer id) throws ContaNaoEncontradaException;

	@ApiOperation(value = "Retorna todas as contas existentes")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Consulta Realizada com sucesso!"),
            @ApiResponse(code = 404, message = "Erro de execução!")
    })
	ResponseEntity<List<ContaDTO>> findAll();
	
	@ApiOperation(value = "Atualiza os dados de uma conta, passando o ID da Conta e os dados a serem alterados")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Conta atualizada com sucesso!"),
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos!"),
            @ApiResponse(code = 404, message = "Conta não encontrada!")
    })
	ResponseEntity<ContaDTO> update(@PathVariable Integer id, @RequestBody ContaDTO obj) throws ContaNaoEncontradaException;
	
	@ApiOperation(value = "Atualiza o Status de uma conta, passando o ID da Conta o estado a ser alterado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Conta bloqueada com sucesso!"),
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos!"),
            @ApiResponse(code = 401, message = "Não foi possível fazer a operação. É preciso estar zerada a conta!"),
            @ApiResponse(code = 404, message = "Conta não encontrada!")
    })
	ResponseEntity<ContaDTO> updateStatus(@PathVariable Integer id, @RequestBody ContaDTO obj) throws ContaNaoEncontradaException;
	
	@ApiOperation(value = "Cadastra uma nova conta, passando os dados da conta.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Conta cadastrada com sucesso!"),
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos!"),
            @ApiResponse(code = 404, message = "Conta não encontrada!")
    })
	ResponseEntity<Conta> create(@RequestBody @Valid Conta obj) throws ClienteNaoEncontradaException;
	
	@ApiOperation(value = "Deleta uma conta, passando o ID da conta.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Conta deletada com sucesso!"),
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos!"),
            @ApiResponse(code = 404, message = "Conta não encontrada!")
    })
	ResponseEntity<Void> delete(@PathVariable Integer id) throws ContaNaoEncontradaException;
}
