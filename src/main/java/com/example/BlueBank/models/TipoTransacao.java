package com.example.BlueBank.models;

public enum TipoTransacao {

	SAQUE(0), DEPOSITO(1), TRANSFERENCIA(2);

	public int id;

	TipoTransacao(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
