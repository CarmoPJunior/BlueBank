package com.example.BlueBank.exceptions;

public class ContatoNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ContatoNaoEncontradoException() {
        super("Contado não encontrado!");
    }


}
