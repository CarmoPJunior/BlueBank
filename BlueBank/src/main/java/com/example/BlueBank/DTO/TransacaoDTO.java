package com.example.BlueBank.DTO;

import java.util.Date;

import com.example.BlueBank.models.TipoTransacao;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class TransacaoDTO {

	private Integer id;
	private String nomeClienteOrigem;
	private Integer contaOrigem;
	private String nomeClienteDestino;
	private Integer contaDestino;
	private TipoTransacao tipoTransacao;
	private Date data;
	private Double valor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeClienteOrigem() {
		return nomeClienteOrigem;
	}
	public void setNomeClienteOrigem(String nomeClienteOrigem) {
		this.nomeClienteOrigem = nomeClienteOrigem;
	}
	public Integer getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(Integer contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public String getNomeClienteDestino() {
		return nomeClienteDestino;
	}
	public void setNomeClienteDestino(String nomeClienteDestino) {
		this.nomeClienteDestino = nomeClienteDestino;
	}
	public Integer getContaDestino() {
		return contaDestino;
	}
	public void setContaDestino(Integer contaDestino) {
		this.contaDestino = contaDestino;
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
	
	
}