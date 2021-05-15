package com.algaworks.curso.fjoo.salvar_objetos_arquivo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.algaworks.curso.fjoo.salvar_objetos_arquivo.model.Pessoa;

public class SerializandoObjeto {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("João da Silva");
		p.setIdade(34);
		p.setProfissao("Motorista");

		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("joao.obj"))) {
			out.writeObject(p);
			System.out.println("Objeto salvo com sucesso.");

		} catch (IOException e) {
			System.out.println("Erro salvando objeto" + e.getMessage());
		}

	}

}