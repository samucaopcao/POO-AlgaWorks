package com.algaworks.cursojava.arquivo_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Conectar BD

		/*
		 * Sabemos que as Strings abaixo s�o constantes que n�o mudar�o com frequ�ncia
		 * deste modo para que n�o seja necess�rio alterar na classe caso um dia desejem
		 * mudar, por exemplo, a String de conex�o para PL/SQL , inserimos esta
		 * informa��o no arquivo aplication properties
		 */

		String url = "jdbc:mysql://localhost/estudos";
		String usuario = "root";
		String senha = "root";

		/*
		 * Deste modo o java tem sua propria classe para chamar os dados que est�o no
		 * arquivo properties conforme vemos abaixo:
		 */

		Properties prop = new Properties();
		prop.load(new FileInputStream("./PROPERTIES/config.properties"));

		// Agora podemos preencher as Strings citadas acima com os dados do aplication
		// properties

		String url1 = prop.getProperty("banco.dados.url");
		String usuario1 = prop.getProperty("banco.dados.usuario");
		String senha1 = prop.getProperty("banco.dados.senha");

		System.out.printf("Conectando no banco de dados com a URL: %s e Usu�rio: %s\n", url1, usuario1);
		
		try {
			//Imagine que isso  venha de um erro na configura��o da conex�o do BD
			int x = 5/0;
		} catch (Exception e) {
			// Se acontecer algum erro, voc� precisar� informar o administrador por e-mail
			String email = prop.getProperty("email.admin");
			System.err.printf("Enviando o erro para %s informando o erro: %s",email,e.getMessage());
		}
	}

}
