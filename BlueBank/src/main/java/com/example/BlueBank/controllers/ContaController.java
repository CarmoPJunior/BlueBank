package com.example.BlueBank.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.BlueBank.models.Conta;
import com.example.BlueBank.service.ContaInterfaceService;
import com.example.BlueBank.service.ContaService;

@RestController
@RequestMapping(path = "/contas")
public class ContaController {

	@Autowired
	private ContaService contaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Conta> findById(@PathVariable Integer id) {
		Conta obj = this.contaService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	};

	@GetMapping
	public ResponseEntity<List<Conta>> findAll() {
		List<Conta> list = contaService.obterTodos();
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Conta> update(@PathVariable Integer id, @RequestBody Conta obj) {
		Conta newObj = contaService.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}

	@PostMapping
	public ResponseEntity<Conta> create(@RequestBody Conta obj) {
				
		Conta newObj = contaService.criar(obj);
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		contaService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
}
