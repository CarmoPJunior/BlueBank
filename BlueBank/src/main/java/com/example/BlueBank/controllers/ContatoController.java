package com.example.BlueBank.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.BlueBank.models.Contato;
import com.example.BlueBank.service.ContatoService;


@RestController
@RequestMapping(path = "/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoService contatoService;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Contato> findById(@PathVariable Integer id) {
		Contato obj = this.contatoService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	};

	@GetMapping
	public ResponseEntity<List<Contato>> findAll() {
		List<Contato> list = contatoService.obterTodos();
		return ResponseEntity.ok().body(list);
	}

//	@PutMapping(value = "/{id}")
//	public ResponseEntity<Contato> update(@PathVariable Integer id, @RequestBody Contato obj) {
//		Contato newObj = contatoService.(id, obj);
//		return ResponseEntity.ok().body(newObj);
//	}

	@PostMapping
	public ResponseEntity<Contato> create(@RequestBody Contato obj) {
				
		Contato newObj = contatoService.criar(obj);
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();	
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		contatoService.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
