package com.example.BlueBank.DTO;

import java.util.List;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ClienteDTO {

	private Integer id;
	@NotEmpty(message = "{cliente.nome.not.blank}")
	private String nome;
	@NotEmpty(message = "{cliente.cpf.not.blank}")
	@CPF
	private String cpf;
	@NotEmpty(message = "{cliente.dataDeNascimento.not.blank}")
	private String dataDeNascimento;
	@JsonIgnoreProperties("nomeCliente")
	private EnderecoDTO endereco;
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
