package com.algaworks.curso.fjoo.entrada_arq;

import java.io.BufferedReader;
import java.io.FileReader;

public class LendoArquivo {

	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("email_2.txt"))) {

			//Le a linha toda
			String email = reader.readLine();
			
			//Enquanto tiver conte?do no arquivo continua a leitura do mesmo, tirando os espa?os e linhas em branco
			while(email!=null ) {
				System.out.println("Enviando email para: " + email);
				email = reader.readLine();
			}
			
		} catch (Exception e) {
			System.err.println("N?o foi poss?vel ler o arquivo.");
		}

		
	}

}
