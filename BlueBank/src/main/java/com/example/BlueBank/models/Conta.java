package com.example.BlueBank.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne()
	@JoinColumn(name = "idCliente", referencedColumnName = "id")
	private Cliente cliente;

	@NotNull
	private TipoConta tipoConta;
	@NotNull
	private Integer numeroConta;
	@NotNull
	private Integer agencia;

	@PositiveOrZero
	@NotNull
	private double saldo;

	public Conta() {
		super();
	}

	public Conta(Cliente cliente, @NotNull TipoConta tipoConta, @NotNull Integer numeroConta,
			@NotNull Integer agencia, @PositiveOrZero @NotNull double saldo) {
		super();
		this.cliente = cliente;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
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

	@Override
	public int hashCode() {
		return Objects.hash(agencia, id, cliente, numeroConta, tipoConta);
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
