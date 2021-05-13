package com.algaworks.curso.fjoo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValindandoEmails {

	public static void main(String[] args) {
		String[] emails = {"joao@joao.com","mari@","jose@jose","samuel@gmail.com"};
		
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if(matcher.matches()) {
				System.out.println(email + " é uma e-mail válido!" );	
			}
		}
	}

}
