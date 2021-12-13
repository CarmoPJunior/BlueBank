package com.example.BlueBank.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ContaNaoEncontradaException extends Exception {

	private static final long serialVersionUID = 1L;

	public ContaNaoEncontradaException() {
		super("Conta não encotrada");
	}

}
