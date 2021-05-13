package com.algaworks;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.Assert;

public class FibonacciTest {

	@Test
	public void deve_retornar_fibonacci_posicao_1() {
		//1. Cenário
		long posicao = 1L;
		Fibonacci fibonacci = new Fibonacci();
				
		//2. Ação
		long valor = fibonacci.calcular(posicao);
		
		//3. Validação
		Assert.checkNull(1L,valor);
	}
}
