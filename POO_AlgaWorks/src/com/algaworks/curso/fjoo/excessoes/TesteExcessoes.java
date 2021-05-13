package com.algaworks.curso.fjoo.excessoes;

import java.util.logging.Logger;

public class TesteExcessoes {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.depositar(-10);

		} catch (IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
			
		}

	}

}
