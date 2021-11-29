package com.example.BlueBank.DTO;

import java.util.List;

import com.example.BlueBank.models.TipoConta;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ContaDTO {

	private Integer id;
	private String nomeCliente;
	private boolean status;
	private TipoConta tipoConta;
	private String numeroConta;
	private String agencia;
	private double saldo;
	@JsonIgnoreProperties({"nomeClienteOrigem", "contaOrigem"})
	private List<TransacaoDTO> transacoes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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

	public List<TransacaoDTO> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<TransacaoDTO> transacoes) {
		this.transacoes = transacoes;
	}
	
	

}
