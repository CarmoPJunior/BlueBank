package com.example.BlueBank.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.BlueBank.DTO.TransacaoDTO;
import com.example.BlueBank.exceptions.SaldoInsuficienteException;
import com.example.BlueBank.models.Transacoes;
import com.example.BlueBank.service.TransacaoService;

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
	
	@PostMapping(value = "/transferencia")
	public ResponseEntity<Transacoes> create(@RequestBody Transacoes transacao) throws SaldoInsuficienteException {
				
		Transacoes newObj = service.transferenciaContas(transacao.getContaOrigem(), transacao.getContaDestino(), transacao.getValor());
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}



	@PostMapping(value = "/deposito")
	public ResponseEntity<Transacoes> deposito(@RequestBody Transacoes transacao) {
				
		Transacoes newObj = service.deposito(transacao.getContaOrigem(), transacao.getValor());
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
		}
	
	

	@PostMapping(value = "/saque")
	public ResponseEntity<Transacoes> saque(@RequestBody Transacoes transacao) throws SaldoInsuficienteException {
				
		Transacoes newObj = service.saque(transacao.getContaOrigem(), transacao.getValor());
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
		}
	
}
	
