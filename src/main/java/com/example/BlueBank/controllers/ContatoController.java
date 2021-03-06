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

import com.example.BlueBank.DTO.ContatoDTO;
import com.example.BlueBank.controllers.docs.ContatoControllerDocs;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.ContatoNaoEncontradoException;
import com.example.BlueBank.models.Contato;
import com.example.BlueBank.service.ContatoService;

@RestController
@RequestMapping(path = "/contatos")
public class ContatoController implements ContatoControllerDocs {

	@Autowired
	private ContatoService contatoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<ContatoDTO> findById(@PathVariable Integer id) throws ContatoNaoEncontradoException {
		ContatoDTO obj = this.contatoService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	};

	@GetMapping
	public ResponseEntity<List<ContatoDTO>> findAll() {
		List<ContatoDTO> list = contatoService.obterTodos();
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ContatoDTO> update(@PathVariable Integer id, @RequestBody ContatoDTO obj)
			throws ContatoNaoEncontradoException {
		ContatoDTO newObj = contatoService.alterarContato(id, obj);
		return ResponseEntity.ok().body(newObj);
	}

	@PostMapping
	public ResponseEntity<ContatoDTO> create(@RequestBody @Valid Contato obj) throws ClienteNaoEncontradaException {

		ContatoDTO newObj = contatoService.criar(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).body(newObj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) throws ContatoNaoEncontradoException {
		contatoService.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
