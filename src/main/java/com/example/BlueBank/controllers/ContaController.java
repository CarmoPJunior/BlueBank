package com.example.BlueBank.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.DTO.TransacaoDTO;
import com.example.BlueBank.controllers.docs.ContaControllerDocs;
import com.example.BlueBank.exceptions.ClienteJaPossuiContaException;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.ContaNaoEncontradaException;
import com.example.BlueBank.exceptions.PossuiSaldoException;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.models.Transacoes;
import com.example.BlueBank.service.ContaService;

@RestController
@RequestMapping(path = "/contas")
public class ContaController implements ContaControllerDocs{

	@Autowired
	private ContaService contaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ContaDTO> findById(@PathVariable Integer id) throws ContaNaoEncontradaException {
		ContaDTO obj = this.contaService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	};
	
	@GetMapping(value = "/{id}/transacoes")
	public ResponseEntity<Page<TransacaoDTO>> findById(@PathVariable Integer id,@PageableDefault(size = 6) Pageable page) throws ContaNaoEncontradaException {
		Page<TransacaoDTO> obj = this.contaService.obterContasPaginadas(id, page);
		return ResponseEntity.ok().body(obj);
	};

	@GetMapping
	public ResponseEntity<List<ContaDTO>> findAll() {
		List<ContaDTO> list = contaService.obterTodos();
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ContaDTO> update(@PathVariable Integer id, @RequestBody ContaDTO obj) throws ContaNaoEncontradaException {
		ContaDTO newObj = contaService.atualizar(id, obj);
		return ResponseEntity.ok().body(newObj);
	}

	@PutMapping(value = "/atualizarstatus/{id}")
	public ResponseEntity<ContaDTO> updateStatus(@PathVariable Integer id, @RequestBody ContaDTO obj) throws ContaNaoEncontradaException, PossuiSaldoException {
		ContaDTO newObj = contaService.atualizarStatus(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	
	@PostMapping
	public ResponseEntity<ContaDTO> create(@RequestBody @Valid Conta obj) throws ClienteNaoEncontradaException, ClienteJaPossuiContaException {
				
		ContaDTO newObj = contaService.criar(obj);
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).body(newObj);
		
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) throws ContaNaoEncontradaException {
		contaService.deletar(id);
		return ResponseEntity.noContent().build();
	}
		
}
