package com.algaworks.curso.dao;

import java.sql.SQLException;

public class DAOException extends RuntimeException {

	public DAOException(String msg, Throwable e) {
		super(msg, e);
	}

}
