package com.algaworks.curso.fjoo.excessoes;

public class TesteExcessoesChecadas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(100);
		try {
			contaCorrente.sacar(20);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Desculpe , saldo insuficiente");

		}
		System.out.println("Saldo: " + contaCorrente.getSaldo());

		try {
			contaCorrente.sacar(50);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Desculpe , saldo insuficiente");

		} finally {
			System.out.println("Obrigado por usar nosso sistema!");
		}
		System.out.println("Saldo Agora: " + contaCorrente.getSaldo());

	}

}
