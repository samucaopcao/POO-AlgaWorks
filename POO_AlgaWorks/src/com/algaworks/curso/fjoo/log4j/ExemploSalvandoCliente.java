package com.algaworks.curso.fjoo.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ExemploSalvandoCliente {

	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		logger.info("Iniciando a aplica??o");

		Cliente cliente = new Cliente("Jo?o");
		new ClienteDAO().salvar(cliente);

		new ClienteDAO().salvar(null);

		logger.info("Finalizando a aplica??o.");
	}
}
