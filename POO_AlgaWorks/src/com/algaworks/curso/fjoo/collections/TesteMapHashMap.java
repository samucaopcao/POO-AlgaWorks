package com.algaworks.curso.fjoo.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TesteMapHashMap {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");


		Map<String, Aluno> alunos = new HashMap<String, Aluno>();

		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);

		imprimirAlunos(alunos);
		
		Aluno alunoRecuperado = alunos.get("3");
		System.out.println("Aluno de Chave 3: " + alunoRecuperado.getNome());

	}

	public static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno aluno : alunos.values()) {
			System.out.println(aluno.getNome());
		}
	}
}
