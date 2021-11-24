package com.example.BlueBank.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

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

import com.example.BlueBank.DTO.EnderecoDTO;
import com.example.BlueBank.exceptions.EnderecoNaoEncontradoException;
import com.example.BlueBank.models.Endereco;
import com.example.BlueBank.service.EnderecoService;

@RestController
@RequestMapping(path = "/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EnderecoDTO> findById(@PathVariable Integer id) throws EnderecoNaoEncontradoException {
		EnderecoDTO obj = this.enderecoService.obterPorCodDTO(id);
		return ResponseEntity.ok().body(obj);
	};

	@GetMapping
	public ResponseEntity<List<EnderecoDTO>> findAll() {
		List<EnderecoDTO> list = enderecoService.obterTodos();
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<EnderecoDTO> update(@PathVariable Integer id, @RequestBody EnderecoDTO obj) throws EnderecoNaoEncontradoException {
		EnderecoDTO newObj = enderecoService.alterarEndereco(id, obj);
		return ResponseEntity.ok().body(newObj);
	}

	@PostMapping
	public ResponseEntity<Endereco> create(@RequestBody @Valid Endereco obj) {
				
		Endereco newObj = enderecoService.criar(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).body(newObj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) throws EnderecoNaoEncontradoException {
		enderecoService.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
