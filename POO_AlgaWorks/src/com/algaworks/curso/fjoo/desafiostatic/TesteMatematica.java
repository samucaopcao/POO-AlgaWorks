package com.algaworks.curso.fjoo.desafiostatic;

public class TesteMatematica {

	public static void main(String[] args) {

		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("N?mero de Fibonacci da posi??o 8: " + numeroFibonacci);

		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.printf("?rea do c?rculo: %.2f",areaCirculo);

	}

}
