package com.example.BlueBank.exceptions;


public class ClienteJaExisteException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClienteJaExisteException() {
        super("Este cliente já existe!");
    }


}
