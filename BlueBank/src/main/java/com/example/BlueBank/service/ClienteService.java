package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BlueBank.models.Cliente;
import com.example.BlueBank.repositories.ClienteRepository;

@Service
public class ClienteService implements ClienteInterfaceService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public Cliente obterPorCod(Integer id) {
		Optional<Cliente> obj = this.clienteRepository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public List<Cliente> obterTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente criar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	@Override
	public void deletar(Integer id) {
		obterPorCod(id);
		this.clienteRepository.deleteById(id);
	}
	
	@Override
	public Cliente alterarCliente(Integer id, Cliente cliente) {
		Cliente newObj = obterPorCod(id);
		newObj.setNome(cliente.getNome());
		//newObj.setCpf(cliente.getCpf());
		newObj.setDataDeNascimento(cliente.getDataDeNascimento());
		return this.clienteRepository.save(newObj);
	}

}