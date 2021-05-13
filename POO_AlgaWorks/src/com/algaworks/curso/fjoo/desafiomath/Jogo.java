package com.algaworks.curso.fjoo.desafiomath;

import java.util.Arrays;

public class Jogo {

	private int quantidadeJogos;

	public Jogo(int quantidadeJogos) {
		this.quantidadeJogos = quantidadeJogos;
	}

	public void sequenciaNumerica() {
		int[] jogo = new int[6];

		for (int i = 0; i < 6; i++) {
			double numero = (Math.random() * 60);
			boolean repetido = Arrays.asList(jogo).contains(numero);
			if (repetido) {
				jogo[i] = (int) (Math.random() * 60);
			} else {
				jogo[i] = (int) numero;
			}

			System.out.print(jogo[i] + " ");
		}
	}

	public void quantidadeJogos() {
		System.out.println("MEGA SENA - QUANTIDADE DE JOGOS: " + quantidadeJogos);
		for (int i = 0; i < this.quantidadeJogos; i++) {
			sequenciaNumerica();
			System.out.println();
		}
	}
}
