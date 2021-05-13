package com.algaworks.curso.fjoo.collections;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class TESTE {

	public static void main(String[] args) {

		int opc = 0;
		Set<String> nomes = new HashSet<>();

		while (opc != 1) {
			nomes.add(JOptionPane.showInputDialog(null, "Digite um nome: "));
			Object[] opcoes = { "Sim", "Não" };
			opc = JOptionPane.showOptionDialog(null, "Você gostaria de continuar ?", "Nome",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
		}
		String busca = JOptionPane.showInputDialog(null, "Digite o nome para localizar: ");
		if (nomes.contains(busca)) {
			JOptionPane.showMessageDialog(null, "O nome " + busca + " faz parte da lista de nomes.");
		} else {
			JOptionPane.showMessageDialog(null, "O nome não foi encontrado!");

		}
	}
}
