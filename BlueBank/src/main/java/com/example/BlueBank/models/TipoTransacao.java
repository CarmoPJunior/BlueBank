package com.example.BlueBank.models;

public enum TipoTransacao {

	SAQUE(1), DEPOSITO(2), TRANSFERENCIA(3);
	
	public int id;
	
	TipoTransacao(int id) {
		this.id = id;
	}

	
	
}