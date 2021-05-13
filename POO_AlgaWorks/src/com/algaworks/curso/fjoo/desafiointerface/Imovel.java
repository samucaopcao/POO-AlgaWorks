package com.algaworks.curso.fjoo.desafiointerface;

public class Imovel implements Seguravel {

	private double valorMercado;
	private int areaConstruida;

	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

	public String obterDescricao() {
		return "Imóvel com área construida de " + this.areaConstruida + " m2 e valor de mercado de R$ "
				+ this.valorMercado;
	}

}
