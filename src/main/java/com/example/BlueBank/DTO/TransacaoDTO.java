package com.example.BlueBank.DTO;

import com.example.BlueBank.models.TipoTransacao;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class TransacaoDTO {

	private Integer id;
	private String nomeClienteOrigem;
	private String contaOrigem;
	private String nomeClienteDestino;
	private String contaDestino;
	private TipoTransacao tipoTransacao;
	private String data;
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

	public String getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public String getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}

	public String getNomeClienteDestino() {
		return nomeClienteDestino;
	}

	public void setNomeClienteDestino(String nomeClienteDestino) {
		this.nomeClienteDestino = nomeClienteDestino;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
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
