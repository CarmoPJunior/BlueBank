package com.example.BlueBank.controllers.docs;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.BlueBank.DTO.TransacaoDTO;
import com.example.BlueBank.exceptions.ContaBloqueadaException;
import com.example.BlueBank.exceptions.ContaNaoEncontradaException;
import com.example.BlueBank.exceptions.SaldoInsuficienteException;
import com.example.BlueBank.models.Transacoes;
import com.example.BlueBank.validacao.GroupTransacao;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface TransacaoControllerDocs {
	
	
	@ApiOperation(value = "Retorna uma transação, passando o id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Transação encontrada!")
    })
	public ResponseEntity<TransacaoDTO> findById(@PathVariable Integer id);
	
	@ApiOperation(value = "Retorna todas as transações realizadas")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Transações encontradas!")
    })
	public ResponseEntity<List<TransacaoDTO>> findAll();
	
	@ApiOperation(value = "Retorna todas as transações realizadas por tipo, saque, deposito ou transferência")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Transações encontradas!")
    })
	public ResponseEntity<List<TransacaoDTO>> findByTipo(@PathVariable Integer id);
	
	@ApiOperation(value = "Insere uma transferência")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Transações inserida com sucesso!"),
            @ApiResponse(code = 404, message = "Conta não encontrada!"),
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos"),
            @ApiResponse(code = 401, message = "Saldo Insuficiente!"),
            @ApiResponse(code = 401, message = "Conta Bloqueada!")
    })
	public ResponseEntity<TransacaoDTO> transferencia(@RequestBody @Validated(GroupTransacao.class) Transacoes transacao) throws SaldoInsuficienteException, ContaNaoEncontradaException, ContaBloqueadaException;
	
	
	@ApiOperation(value = "Realiza um deposito")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Deposito realizado com sucesso!"),
            @ApiResponse(code = 404, message = "Conta não encontrada!"),
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos"),
            @ApiResponse(code = 401, message = "Conta Bloqueada!")
    })
	public ResponseEntity<TransacaoDTO> deposito(@RequestBody @Valid Transacoes transacao) throws ContaNaoEncontradaException, ContaBloqueadaException;
	
	
	@ApiOperation(value = "Realiza um saque")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Saque realizado com sucesso!"),
            @ApiResponse(code = 404, message = "Conta não encontrada!"),
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos"),
            @ApiResponse(code = 401, message = "Saldo Insuficiente!"),
            @ApiResponse(code = 401, message = "Conta Bloqueada!")
    })
	public ResponseEntity<TransacaoDTO> saque(@RequestBody @Valid Transacoes transacao) throws SaldoInsuficienteException, ContaNaoEncontradaException, ContaBloqueadaException;
}
