package com.algaworks.curso.fjoo.log4j;

public class Cliente {

	private String nome;

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}

}
