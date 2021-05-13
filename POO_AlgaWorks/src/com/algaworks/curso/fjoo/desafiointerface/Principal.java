package com.algaworks.curso.fjoo.desafiointerface;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();

		Barco barco = new Barco(1000d, 4);
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);

		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(barco);

	}

}
