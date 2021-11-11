package com.example.BlueBank.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
//  @NotEmpty
	@JsonIgnoreProperties("endereco")
	@OneToOne()
	@JoinColumn(name = "idCliente", referencedColumnName = "id")
	private Cliente cliente;
	@NotEmpty
	private String logradouro;
	@NotEmpty
	private String cidade;
	@NotEmpty
	private String estado;
	@NotNull
	private Integer numero;
	@NotEmpty
	private String cep;
	
	public Endereco() {
		super();
	}

	public Endereco(@NotEmpty Cliente cliente, @NotEmpty String logradouro, @NotEmpty String cidade,
			@NotEmpty String estado, @NotEmpty int numero, @NotEmpty String cep) {
		super();
		this.cliente = cliente;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.cep = cep;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cep, id, cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(id, other.id)
				&& Objects.equals(cliente, other.cliente);
	}
	
	
	
}
