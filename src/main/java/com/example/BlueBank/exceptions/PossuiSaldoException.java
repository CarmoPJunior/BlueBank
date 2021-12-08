package com.example.BlueBank.exceptions;


public class PossuiSaldoException extends Exception {

	private static final long serialVersionUID = 1L;

	public PossuiSaldoException() {
        super("A conta possui saldo, retire o dinheiro para bloquear!");
    }


}
