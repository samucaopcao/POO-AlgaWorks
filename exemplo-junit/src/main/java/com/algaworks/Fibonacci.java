package com.algaworks;

public class Fibonacci {

	/*
	 * F(n) = F(n-1) + F(n-1) 1,1,2,3,5,8...
	 */
	public long calcular(long posicao) {
		return calcular(posicao - 1) + calcular(posicao - 2);
	}

}
