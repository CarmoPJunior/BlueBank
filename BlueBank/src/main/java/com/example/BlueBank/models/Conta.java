package com.example.BlueBank.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Conta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne()
	@JoinColumn(name = "idCliente", referencedColumnName = "id")
	private Cliente cliente;
	@NotNull
	private boolean status = true;
	@NotNull
	private TipoConta tipoConta;
	@NotNull
	private Integer numeroConta;
	@NotNull
	private Integer agencia; 

	@PositiveOrZero
	@NotNull
	private double saldo;
	
	@OneToMany(mappedBy="contaOrigem", cascade = CascadeType.ALL )
	@JsonIgnoreProperties("contaOrigem")
	private List<Transacoes> transacoes;
	
	public Conta() {
		super();
	}

	

	public Conta(Integer id, Cliente cliente, @NotNull boolean status, @NotNull TipoConta tipoConta,
			@NotNull Integer numeroConta, @NotNull Integer agencia, @PositiveOrZero @NotNull double saldo,
			List<Transacoes> transacoes) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.status = status;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.transacoes = transacoes;
		
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

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void somaSaldo(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void subtraiSaldo(double valor) {
		this.saldo = saldo - valor;
	}

	public List<Transacoes> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacoes> transacoes) {
		this.transacoes = transacoes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, id, cliente, numeroConta, tipoConta, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(agencia, other.agencia) && Objects.equals(id, other.id)
				&& Objects.equals(cliente, other.cliente) && Objects.equals(numeroConta, other.numeroConta)
				&& Objects.equals(tipoConta, other.tipoConta);
	}
	
	
}
