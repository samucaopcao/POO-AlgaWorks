package com.algaworks.curso.fjoo.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElemento {

	public static void main(String[] args) {
		List<Funcionario> nomes = new ArrayList<>();
		nomes.add(new Funcionario("Ricardo"));

		Funcionario f = RetiraElementos.recuperaPrimeiro(nomes);
		System.out.println(f.getNome());
	}

}
