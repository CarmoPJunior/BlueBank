package com.example.BlueBank.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.BlueBank.DTO.TransacaoDTO;
import com.example.BlueBank.exceptions.ContaBloqueadaException;
import com.example.BlueBank.exceptions.ContaNaoEncontradaException;
import com.example.BlueBank.exceptions.SaldoInsuficienteException;
import com.example.BlueBank.models.Transacoes;
import com.example.BlueBank.service.TransacaoService;
import com.example.BlueBank.validacao.GroupTransacao;

@RestController
@RequestMapping(path = "/transacoes")
public class TransacaoController {
	
	@Autowired
	private TransacaoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TransacaoDTO> findById(@PathVariable Integer id) {
		TransacaoDTO obj = this.service.obterPorCodDTO(id);
		return ResponseEntity.ok().body(obj);
	};
	
	@GetMapping
	public ResponseEntity<List<TransacaoDTO>> findAll() {
		List<TransacaoDTO> list = service.obterTodosDTO();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/tipo/{id}")
	public ResponseEntity<List<TransacaoDTO>> findByTipo(@PathVariable Integer id) {
		List<TransacaoDTO> list = service.obterPorTipoTransacao(id);
		return ResponseEntity.ok().body(list);
	};
	
	@PostMapping(value = "/transferencia")
	public ResponseEntity<Transacoes> create(@RequestBody @Validated(GroupTransacao.class) Transacoes transacao) throws SaldoInsuficienteException, ContaNaoEncontradaException, ContaBloqueadaException {
				
		Transacoes newObj = service.transferenciaContas(transacao.getContaOrigem(), transacao.getContaDestino(), transacao.getValor());
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PostMapping(value = "/deposito")
	public ResponseEntity<Transacoes> deposito(@RequestBody @Valid Transacoes transacao) throws ContaNaoEncontradaException, ContaBloqueadaException {
				
		Transacoes newObj = service.deposito(transacao.getContaOrigem(), transacao.getValor());
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		}

	@PostMapping(value = "/saque")
	public ResponseEntity<Transacoes> saque(@RequestBody @Valid Transacoes transacao) throws SaldoInsuficienteException, ContaNaoEncontradaException, ContaBloqueadaException {
				
		Transacoes newObj = service.saque(transacao.getContaOrigem(), transacao.getValor());
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
		}
	
}
	
