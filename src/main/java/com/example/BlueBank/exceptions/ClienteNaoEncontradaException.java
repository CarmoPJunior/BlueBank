package com.example.BlueBank.exceptions;

public class ClienteNaoEncontradaException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClienteNaoEncontradaException() {
        super("Cliente não encotrado!");
    }


}
