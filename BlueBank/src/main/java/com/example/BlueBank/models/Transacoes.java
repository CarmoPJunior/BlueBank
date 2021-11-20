package com.example.BlueBank.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Transacoes implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date data;
	
	private Double valor;
	
	private TipoTransacao tipoTransacao;
	
	@JsonIgnoreProperties("transacoes")
	@ManyToOne
	@JoinColumn(name = "idContaOrigem", nullable = false)
	private Conta contaOrigem;
	
	@JsonIgnoreProperties("transacoes")
	@ManyToOne
	@JoinColumn(name = "idContaDestino", nullable = true)
	private Conta contaDestino;

	

	public Transacoes(Date data, Double valor, TipoTransacao tipoTransacao, Conta contaOrigem, Conta contaDestino) {
		super();
		this.data = data;
		this.valor = valor;
		this.tipoTransacao = tipoTransacao;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
	}

	public Transacoes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(TipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	

	public Conta getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Conta getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transacoes other = (Transacoes) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
