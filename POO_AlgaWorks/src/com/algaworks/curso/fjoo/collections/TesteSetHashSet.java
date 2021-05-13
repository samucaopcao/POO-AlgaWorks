package com.algaworks.curso.fjoo.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jo�o");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Jos�");
		Aluno a4 = new Aluno("Pedro");

		// HashSet n�o aceita a adi��o de objetos repetidos.Ex.: Adicionar 2x
		// alunos.add(a1), ao trazer sua impress�o ele n�o tr�s na ordem os itens adicionados
		Set<Aluno> alunos = new HashSet<Aluno>();

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);

		imprimirAlunos(alunos);

	}

	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	}

}
