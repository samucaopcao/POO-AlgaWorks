package com.algaworks.curso.fjoo.heranca;

public class Pessoa {

	public String nome;
	protected int idade;

	public void seApresentar() {
		System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
	}
}
