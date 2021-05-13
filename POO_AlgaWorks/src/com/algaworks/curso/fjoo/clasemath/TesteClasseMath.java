package com.algaworks.curso.fjoo.clasemath;

public class TesteClasseMath {

	public static void main(String[] args) {
		//Comprimento de uma circunferência 2 x r x PI (3.14)
		int raio = 4;
		double comprimento = 2 * raio * Math.PI;
		System.out.println("Comprimento : " + comprimento);
		
		//Máximo e minimo
		double[] precosProdutoA = {30.20,25.49};
		System.out.println("Maior preço: " + Math.max(precosProdutoA[0], precosProdutoA[1]));
		System.out.println("Menor preço: " + Math.min(precosProdutoA[0], precosProdutoA[1]));
		
		//Potencia
		System.out.println("2^3 = "+Math.pow(2, 3));
				
		//Raiz Quadrada
		System.out.println("Raiz quadrada de 9 = "+Math.sqrt(9));
		
		//Arredondamento ceil, floor e round
		double n = 5.68;
		System.out.println("\nConsiderando o valor 5.68 usamos respectivamente:");
		System.out.println("MATH.FLOOR - Menor inteiro: " + Math.floor(n));
		
		double n1 = 5.68;
		System.out.println("MATH.CEIL - Maior inteiro: " + Math.ceil(n1));
		
		double n2 = 5.68;
		System.out.println("MATH.ROUND - Arredondamento: " + Math.round(n2));
		
		//Trigonometria
		System.out.println("\nSeno de 90 = " + Math.sin(90) );
		
		//Números Randomicos entre 0 e 100
		double numeroAleatorio = Math.random() * 100; 
		System.out.println("Número aleatório = " + numeroAleatorio);
		
		
	}

}
