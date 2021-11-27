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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.example.BlueBank.exceptions.ContaBloqueadaException;
import com.example.BlueBank.exceptions.PossuiSaldoException;
import com.example.BlueBank.exceptions.SaldoInsuficienteException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Conta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne()
	@JoinColumn(name = "idCliente", referencedColumnName = "id")
	@NotNull(message =  "{cliente.not.null}")
	private Cliente cliente;
	@NotNull(message =  "{status.not.null}")
	private boolean status = true;
	@NotNull(message =  "{tipoConta.not.null}")
	private TipoConta tipoConta;
	@NotBlank(message =  "{numeroConta.not.null}")
	private String numeroConta;
	@NotBlank(message =  "{agencia.not.null}")
	private String agencia; 

	@PositiveOrZero(message =  "{saldo.Positive}")
	//@NotEmpty(message =  "{saldo.not.empty}")
	//@NotBlank(message =  "{saldo.not.null}")	
	@NotNull(message =  "{saldo.not.null}")
	private double saldo;
	
	@OneToMany(mappedBy="contaOrigem", cascade = CascadeType.ALL )
	@JsonIgnoreProperties({"contaOrigem", "contaDestino"})
	private List<Transacoes> transacoes;
	
	public Conta() {
		super();
	}

	

	public Conta(Integer id, Cliente cliente, @NotNull boolean status, @NotNull TipoConta tipoConta,
			@NotNull String numeroConta, @NotNull String agencia, @PositiveOrZero @NotNull double saldo,
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

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
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

	public void setStatus(boolean status) throws  PossuiSaldoException {
		
		if(this.saldo >0 ) {
			throw new PossuiSaldoException();
		}
		
		this.status = status;
	}

	public void somaSaldo(double valor) throws ContaBloqueadaException {
		if(!status) {
			throw new ContaBloqueadaException();
		}
		this.saldo = saldo + valor;
	}
	
	public void subtraiSaldo(double valor) throws SaldoInsuficienteException, ContaBloqueadaException{
		if(!status) {
			throw new ContaBloqueadaException();
		}else if(valor > saldo ) {
			
			throw new SaldoInsuficienteException();
		}
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
