package com.algaworks.curso.fjoo.desafiostatic;

public class MatematicaUtil {

	public final static Double PI = 3.14;

	public static double calcularAreaCirculo(double raio) {
		return (raio * raio) * PI;
	}

	// http://pt.wikipedia.org/wiki/Número_de_Fibonacci
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}

}
