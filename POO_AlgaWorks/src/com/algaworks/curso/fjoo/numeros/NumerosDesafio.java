package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosDesafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor digite o valor do Produto: R$ ");
		double produto = 0;
		try {
			produto = sc.nextDouble();
			BigDecimal bg = new BigDecimal(produto);
			bg = bg.divide(bg.TEN);
			DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
			System.out.println("O valor digitado inicialmente foi: " 
			+ formatador.format(produto)
			+ " e 10% desse valor é " 
			+ formatador.format(bg) + ".");
			
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido, por favor utilize virgula como separador decimal.");
		}

	}

}
