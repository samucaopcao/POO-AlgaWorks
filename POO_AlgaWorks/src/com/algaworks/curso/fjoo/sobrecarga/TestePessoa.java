package com.algaworks.curso.fjoo.sobrecarga;

public class TestePessoa {

	public static void main(String[] args) {
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		
		Pessoa pessoa = new Pessoa("Samuel Macedo dos Santos", 34);
		cadastroPessoa.cadastrar(pessoa);
		
		//-----------------------------------------------
		
		cadastroPessoa.cadastrar("Leticia Nascimento Soares",35);
		
	}

}
