package com.algaworks.curso.fjoo.enviando_objetos_rede;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("192.168.1.102", 3333);

		// Quero sair com dados aqui uso:
		OutputStream saida = socket.getOutputStream();
		// Quero Escrever um objeto
		ObjectOutput objectOutput = new ObjectOutputStream(saida);

		Pedido pedido = new Pedido();
		pedido.setCodigo(1L);
		pedido.setDescricao("Sabonete");
		pedido.setQuantidade(5);

		// Escrevendo o Objeto
		objectOutput.writeObject(pedido);

		// Depois que receber crio a entrada do meu socket ou seja do meu programa para
		// enviar
		InputStream entrada = socket.getInputStream();
		DataInputStream dataInputStream = new DataInputStream(entrada);
		System.out.println("Recebeu do servidor: " + dataInputStream.readUTF());

		socket.close();

	}
}
