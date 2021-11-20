package com.example.BlueBank.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.repositories.ContaRepository;


@Service
public class ContaService implements ContaInterfaceService {

	@Autowired
	ContaRepository contaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Conta obterPorCod(Integer id) {
		Optional<Conta> obj = this.contaRepository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public List<ContaDTO> obterTodos() {
		return this.contaRepository.findAll().stream().map(this::contaDTO).collect(Collectors.toList());
	}

	@Override
	public Conta criar(Conta conta) {
		return this.contaRepository.save(conta);
	}
	
	public Conta atualizar(Integer id, Conta obj) {
		Conta newObj = obterPorCod(id);
        newObj.setTipoConta(obj.getTipoConta());
        newObj.setNumeroConta(obj.getNumeroConta());
        newObj.setAgencia(obj.getAgencia());
        //newObj.setSaldo(obj.getSaldo());
        return contaRepository.save(newObj);
    }
	
	public Conta atualizarStatus(Integer id, Conta obj) {
		Conta newObj = obterPorCod(id);        
        newObj.setStatus(obj.isStatus());
        return contaRepository.save(newObj);
    }
	
	@Override
	public void deletar(Integer id) {
		obterPorCod(id);
		this.contaRepository.deleteById(id);
	}
	
	private ContaDTO contaDTO(Conta conta) {
		return modelMapper.map(conta, ContaDTO.class);
	}
	
	
}
