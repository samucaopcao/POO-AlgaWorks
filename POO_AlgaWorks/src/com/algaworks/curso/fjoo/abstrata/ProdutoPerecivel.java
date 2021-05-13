package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto {

	public String dataValidade;

	public void imprimirDescricao() {
		System.out.println("Descrição: " + super.getDescricao() + " Vencendo em : " + dataValidade);

	}

}
