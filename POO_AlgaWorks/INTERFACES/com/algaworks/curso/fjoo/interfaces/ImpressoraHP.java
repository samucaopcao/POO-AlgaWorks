package com.algaworks.curso.fjoo.interfaces;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {

		System.out.println("*+-*+-*+-*+-*+-*+-*+-*+-*+-*+-*+-*+-*+-*");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("*+-*+-*+-*+-*+-*+-*+-*+-*+-*+-*+-*+-*+-*");
		System.out.println(imprimivel.getCorpoPagina() + "\n");
		System.out.println("---------------------------------------");
		System.out.println("|                   HP                 |");
		System.out.println("---------------------------------------");

	}

}
