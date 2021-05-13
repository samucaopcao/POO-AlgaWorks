package com.algaworks.curso.fjoo.excessoes;

public class SaldoInsuficienteException extends Exception {
/*Excess�es Checadas - S�o mais usadas para erros de neg�cios,
 *  por exemplo ao sacar de uma conta,
 *  n�o seja permitido que o saldo fique negativo, deste modo
 *   criamos uma excess�o personalizada.*/
	
	public SaldoInsuficienteException(String message) {
		super(message);

	}
}
