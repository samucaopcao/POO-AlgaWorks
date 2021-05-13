package com.algaworks.curso.fjoo.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {

	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();

		logger.info("Come�ando a aplica��o.");
		// codigo aplica��o
		logger.info("Finalizando a aplica��o");

	}

}
