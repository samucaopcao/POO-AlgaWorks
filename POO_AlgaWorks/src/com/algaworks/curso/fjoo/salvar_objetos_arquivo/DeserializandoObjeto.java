package com.algaworks.curso.fjoo.salvar_objetos_arquivo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.algaworks.curso.fjoo.salvar_objetos_arquivo.model.Pessoa;

public class DeserializandoObjeto {
	public static void main(String[] args) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("joao.obj"))) {
			Pessoa p = (Pessoa) in.readObject();
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Profissão: " + p.getProfissao());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro convertendo para a classe Pessoa ");
			e.printStackTrace();
		}
	}
}
