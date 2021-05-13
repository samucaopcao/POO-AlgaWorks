package com.algaworks.curso;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.model.Cliente;

public class SalvarCliente {

	public static void main(String[] args) throws Exception {
		
		/*
		1 - Class Cliente = Modelo de um cliente;

		2 - Interface ClienteDAO = Nessa classe colocamos m�todos publicos para salvar clientes , buscar clientes por codigo, e buscar todos os clientes por�m nenhum deles tem l�gica implementada;

		3 - Class Abstract DAOFactory = temos o metodo static DAOFactory que pode ser usado em outras classes e retorna o m�todo que conecta ao banco  que esta na classe JdbcDAOFactory;

		4 - Class DAOExceptio = Essa classe � uma excess�o personalizada para erros no banco;

		5 - Class JdbcDAOFactory = classe onde s�o colocadas as informa��es da conex�o do banco;

		6 - Class JdbcClienteDAO =  Nessa classe implementamos os m�todos da interface ClienteDAO , inserindo as queries SQL .
		*/
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente", "AlgaWorks", JOptionPane.PLAIN_MESSAGE);

		Cliente cliente = new Cliente();
		if (nome != null) {

			cliente.setNome(nome);

			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvar(cliente);
			System.out.println("Cliente Salvo com Sucesso!");
		}

	}

}
