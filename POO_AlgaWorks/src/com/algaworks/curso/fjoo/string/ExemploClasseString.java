package com.algaworks.curso.fjoo.string;

public class ExemploClasseString {

	public static void main(String[] args) {

		String nome = "Pedro";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);

		nome = nome.toUpperCase();
		System.out.println(nome);

		// -------------------------------

		String s1 = "Pedro";
		String s2 = "Pedro";
		System.out.println("s1 == s2 ? " + (s1 == s2));

		String s3 = new String("Pedro");
		System.out.println("s3 == s1 ? " + (s3 == s1));

		System.out.println("s1.equals(s2) ? " + (s1.equals(s2)));
		System.out.println("s3.equals(s1) ? " + (s3.equals(s1)));

		String s4 = "PeDro";
		System.out.println("s4.equals(s1) ? " + (s4.equals(s1)));
		System.out.println("s4.equals(s1) ? " + (s4.equalsIgnoreCase(s1)));

		String s = "ALGAWORKS";
		// System.out.println(s.charAt(0));

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		// SUBSTRING
		String sam = "Desenvolvimento Java";
		System.out.println(sam.substring(16));
		String sam2 = "Cursos online de desenvolvimento de software";
		System.out.println(sam2.substring(7, 12));

		// TRIM TIRA ESPAÇOS
		String cv = "      ALGAWORKS2      ";
		System.out.println(">" + cv + "<");
		System.out.println(">" + cv.trim() + "<");

		// SPLIT RETIRAR CARACTERES
		String c = "Cursos_online_de_desenvolvimento_de_software";
		String x = "12;40.30;12";

		String[] array = c.split("_");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]" + array[i]);

		}

		//INDEXOF SABER A POSIÇÃO DE UM CARACTER
		String text = "Java";
		int indice = text.indexOf("a");
		
		System.out.println(indice);
		
		indice = text.lastIndexOf("a");
		System.out.println(indice);
		
		//REPLACE ALL
		
		String gg = "Desenvolvimento Java";
		System.out.println(gg.replaceAll("Java", "de Software"));
		
		
	}

}
