package com.algaworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private Connection connection;

	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/estudos", "root", "root");
		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conexão no banco");
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}

}
