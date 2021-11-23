package com.example.BlueBank.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
        super("Saldo Insuficiente!");
    }

}
