package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.models.Cliente;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.repositories.ClienteRepository;

@Service
public class ClienteService implements ClienteInterfaceService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public ClienteDTO obterPorCod(Integer id) {
		Optional<Cliente> obj = this.clienteRepository.findById(id);
		
		return mapperClienteParaClienteDTO(obj.get());
	}
	
	@Override
	public List<ClienteDTO> obterTodos() {
		return this.clienteRepository.findAll().stream().map(this::mapperClienteParaClienteDTO).collect(Collectors.toList());
	}

	@Override
	public Cliente criar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	public Cliente atualizar(Integer id, ClienteDTO obj) {
		ClienteDTO clienteTemp = obterPorCod(id);
		Cliente newCliente = mapperClienteDTOParaCliente(clienteTemp);
		newCliente.setNome(obj.getNome());
		newCliente.setCpf(obj.getCpf());
		newCliente.setDataDeNascimento(obj.getDataDeNascimento());
        return this.clienteRepository.save(newCliente);
    }
	
	@Override
	public void deletar(Integer id) {
		obterPorCod(id);
		this.clienteRepository.deleteById(id);
	}

	
	private ClienteDTO mapperClienteParaClienteDTO(Cliente cliente) {
		return modelMapper.map(cliente, ClienteDTO.class);
	}
	
	private Cliente mapperClienteDTOParaCliente(ClienteDTO clienteDTO) {
		return modelMapper.map(clienteDTO, Cliente.class);
	}
	

}

