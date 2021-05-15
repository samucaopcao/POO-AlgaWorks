package com.algaworks.curso.fjoo.enviando_objetos_rede;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(3333);

		// Socket é o de transmissão canal entre o Client e o Server
		System.out.println("Aguardando Conexão...");
		Socket socket = server.accept();
		System.out.println("Conectado a: " + socket.getRemoteSocketAddress());

		// Para receber as coisas usamos a linha de baixo
		InputStream entrada = socket.getInputStream();
		// Como receberemos um objeto precisamos:
		ObjectInputStream objectInputStream = new ObjectInputStream(entrada);
		Pedido pedido = (Pedido) objectInputStream.readObject();
		System.out.println("Código: " + pedido.getCodigo());
		System.out.println("Descrição: " + pedido.getDescricao());
		System.out.println("Quantidade: " + pedido.getQuantidade());

		OutputStream saida = socket.getOutputStream();
		DataOutput dataOutput = new DataOutputStream(saida);
		dataOutput.writeUTF("Recebido com sucesso");

		server.close();

	}

}