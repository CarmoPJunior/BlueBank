package com.example.BlueBank.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ClienteDTO {

	private Integer id;
	private String nome;
	private String cpf;
	@JsonIgnoreProperties("nomeCliente")
	private EnderecoDTO endereco;
	private String dataDeNascimento;
	@JsonIgnoreProperties("nomeCliente")
	private List<ContatoDTO> contato;
	@JsonIgnoreProperties("nomeCliente")
	private ContaDTO conta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public List<ContatoDTO> getContato() {
		return contato;
	}

	public void setContato(List<ContatoDTO> contato) {
		this.contato = contato;
	}

	public ContaDTO getConta() {
		return conta;
	}

	public void setConta(ContaDTO conta) {
		this.conta = conta;
	}

}
