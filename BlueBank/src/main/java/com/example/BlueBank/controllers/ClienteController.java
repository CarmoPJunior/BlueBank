package com.example.BlueBank.controllers;

import java.net.URI;
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
import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.controllers.docs.ClienteControllerDocs;
import com.example.BlueBank.exceptions.ClienteJaExisteException;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.models.Cliente;
import com.example.BlueBank.service.ClienteService;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController implements ClienteControllerDocs{
	
	@Autowired
	private ClienteService clienteService;
		
	@GetMapping(value = "/{id}")
	public ResponseEntity<ClienteDTO> findById(@PathVariable Integer id) throws ClienteNaoEncontradaException {
		ClienteDTO obj = this.clienteService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	};

	@GetMapping
	public ResponseEntity<Page<ClienteDTO>> findAll(@PageableDefault(size = 6) Pageable page) {
		Page<ClienteDTO> list = clienteService.obterTodos(page);
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ClienteDTO> update(@PathVariable Integer id, @RequestBody @Valid ClienteDTO obj) throws ClienteNaoEncontradaException {
		ClienteDTO newObj = clienteService.atualizar(id, obj);
		return ResponseEntity.ok().body(newObj);
	}

	@PostMapping
	public ResponseEntity<ClienteDTO> create(@RequestBody @Valid Cliente obj) throws ClienteJaExisteException {		
		ClienteDTO newObj = clienteService.criar(obj);
		URI uri =
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) throws ClienteNaoEncontradaException {
		clienteService.deletar(id);
		return ResponseEntity.noContent().build();
	}
}
