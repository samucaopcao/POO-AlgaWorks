package com.algaworks.curso.fjoo.salvar_objetos_arquivo.model;

import java.io.Serializable;

public class Pessoa implements Serializable {

	//serialVersionUID = Esse comando define a versão da classe 
	private static final long serialVersionUID = 1L;

	private String nome;
	private int idade;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
