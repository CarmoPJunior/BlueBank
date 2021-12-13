package com.example.BlueBank.exceptions;

public class ContaBloqueadaException extends Exception {

	private static final long serialVersionUID = 1L;

	public ContaBloqueadaException() {
		super("Conta Bloqueada!");
	}

}
