package com.example.BlueBank.exceptions;

public class EnderecoNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public EnderecoNaoEncontradoException() {
		super("Endereço não encotrado!");
	}

}