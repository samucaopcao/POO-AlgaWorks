package com.algaworks.curso.fjoo.joptionpane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane1 {

	public static void main(String[] args) throws Exception {

		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
		JOptionPane.showMessageDialog(null, "Atenção - Email não informado!", "Atenção", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Favor informar o CPF", "ERRO", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Obrigado", "OBRIGADO", JOptionPane.PLAIN_MESSAGE);

		// Colocando icone personalizado
		URL url = ExemploJOptionPane1.class.getResource("narutoIcone.png");
		Icon icone = new ImageIcon(url);
		JOptionPane.showMessageDialog(null, "Naruto é um ótimo anime", "OBRIGADO", JOptionPane.INFORMATION_MESSAGE,
				icone);

		// Receber informação do usuário
		Object[] opcoes = { "Sim", "Não", "Sim, com e-mail" };

		int opc = JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro?", "CADASTRO",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);

		System.out.println("Opção selecionada: " + opc);

		Object[] possibilidades = { "Masculino", "Feminino" };
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "AlgaWorks",
				JOptionPane.PLAIN_MESSAGE, null, possibilidades, possibilidades[0]);

		System.out.println("Sexo selecionado: " + sexo);

		String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "AlgaWorks", JOptionPane.PLAIN_MESSAGE);
		System.out.println("Seu nome: " + nome);

	}

}
