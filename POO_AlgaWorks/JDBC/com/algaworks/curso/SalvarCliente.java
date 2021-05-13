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

		2 - Interface ClienteDAO = Nessa classe colocamos métodos publicos para salvar clientes , buscar clientes por codigo, e buscar todos os clientes porém nenhum deles tem lógica implementada;

		3 - Class Abstract DAOFactory = temos o metodo static DAOFactory que pode ser usado em outras classes e retorna o método que conecta ao banco  que esta na classe JdbcDAOFactory;

		4 - Class DAOExceptio = Essa classe é uma excessão personalizada para erros no banco;

		5 - Class JdbcDAOFactory = classe onde são colocadas as informações da conexão do banco;

		6 - Class JdbcClienteDAO =  Nessa classe implementamos os métodos da interface ClienteDAO , inserindo as queries SQL .
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
