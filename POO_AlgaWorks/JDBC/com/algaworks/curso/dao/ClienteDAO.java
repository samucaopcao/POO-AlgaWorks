package com.algaworks.curso.dao;

import java.util.List;

import com.algaworks.curso.model.Cliente;

public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();
	
}
