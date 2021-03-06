package com.algaworks.curso.fjoo.entrada_arq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivoItensPedido {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("itens_pedido.txt")))) {

			sc.useDelimiter(";");
			Locale localeBrasil = new Locale("pt", "BR");
			sc.useLocale(localeBrasil);

			NumberFormat formatador = NumberFormat.getCurrencyInstance(localeBrasil);

			while (sc.hasNext()) {

				String produto = sc.next();
				int qnt = sc.nextInt();
				double valor = sc.nextDouble();
				sc.nextLine();

				System.out.printf("Produto %s. Quantidade: %d. Por: %s\n", produto, qnt, formatador.format(valor));
			}

		} catch (IOException e) {
			System.err.println("Erro ao abrir arquivo");
		}

	}

}
