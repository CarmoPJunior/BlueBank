package com.example.BlueBank.models;



public enum TipoConta {
	
	CORRENTE(0),POUPANCA(1), SALARIO(2);

	public int id;
	
	
	private TipoConta(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	


}
