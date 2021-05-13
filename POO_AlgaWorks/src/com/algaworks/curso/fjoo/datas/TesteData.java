package com.algaworks.curso.fjoo.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteData {

	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(hoje));
		
		String dataAniversario = "25/07/1986";
		DateFormat formatadorAniversario = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date aniversario = formatadorAniversario.parse(dataAniversario);
			System.out.println(formatadorAniversario.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de Data Inválido");
			e.printStackTrace();
		}
	}

}
