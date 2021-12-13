package com.example.BlueBank.exceptions;

public class ClienteJaPossuiContaException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClienteJaPossuiContaException() {
		super("Este cliente já possui conta!");
	}

}
