package com.example.BlueBank.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.BlueBank.models.Endereco;
import com.example.BlueBank.service.EnderecoService;

@RestController
@RequestMapping(path = "/enderecos")
public class EnderecoController {
	
	@Autowired
	EnderecoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable Integer id) {
		Endereco obj = this.service.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	};

	@GetMapping
	public ResponseEntity<List<Endereco>> findAll() {
		List<Endereco> list = service.obterTodos();
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Endereco> update(@PathVariable Integer id, @RequestBody Endereco obj) {
		Endereco newObj = service.alterarEndereco(id, obj);
		return ResponseEntity.ok().body(newObj);
	}

	@PostMapping
	public ResponseEntity<Endereco> create(@RequestBody Endereco obj) {
				
		Endereco newObj = service.criar(obj);
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();

		
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.deletar(id);
		System.out.println(id);
		return ResponseEntity.noContent().build();
	}

}
