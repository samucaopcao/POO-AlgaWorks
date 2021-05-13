package com.algaworks.curso.fjoo.excessoes;

public class SaldoInsuficienteException extends Exception {
/*Excessões Checadas - São mais usadas para erros de negócios,
 *  por exemplo ao sacar de uma conta,
 *  não seja permitido que o saldo fique negativo, deste modo
 *   criamos uma excessão personalizada.*/
	
	public SaldoInsuficienteException(String message) {
		super(message);

	}
}
