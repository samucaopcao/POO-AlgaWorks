package com.algaworks.curso.fjoo.heranca;

public class Pessoa {

	public String nome;
	protected int idade;

	public void seApresentar() {
		System.out.println("Ol�, meu nome � " + nome + " e tenho " + idade + " anos.");
	}
}
