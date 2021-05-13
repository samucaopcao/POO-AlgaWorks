package com.algaworks.curso.fjoo.excessoes;

import java.util.logging.Logger;

public class TesteExcessoes {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.depositar(-10);

		} catch (IllegalArgumentException e) {
			System.out.println("Voc� executou uma opera��o ilegal: " + e.getMessage());
			
		}

	}

}
