package com.algaworks.curso.fjoo.entrada_arq;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoArquivo {

	public static void main(String[] args) {
		String[] emails = { "joao2@joao.com", "maria2@maria.com", "ricardo2@ricardo.com" };

		//BufferedWriter Armazena as informa??es no buffer depois descarrega no arquivo
		// Criamos o Stream para escrever, e direcionamos para um arquivo colocamos o TRUE para que seja feito
		// o append dos dados , caso contrario ele apaga e cria o arquivo novamente
		
		//try (BufferedWriter writer = new BufferedWriter(new FileWriter("./email.txt", true))) {
//--------------------------------------------------------------------------------------------------------------
		
		
		
		
		try(PrintStream writer = new PrintStream("email_2.txt")){
		
			// Percorreremos a lista e vamos escrevendo
			for (String email : emails) {
				//writer.write(email);      ---> USado no BufferedWriter p gravar
				//writer.newLine(); 	    ---> USado no BufferedWriter p pular linha
				
				writer.println(email);
				System.out.println("Teste");
			}

		} catch (IOException e) {
			System.err.println("N?o foi poss?vel gravar o arquivo" + e.getMessage());

		}

	}

}
