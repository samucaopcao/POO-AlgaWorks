package com.algaworks.curso.fjoo.desafiointerface;

public class Barco implements Seguravel {

	private double valorMercado;
	private int cavaloPotencia;

	public Barco(double valorMercado, int cavaloPotencia) {
		this.valorMercado = valorMercado;
		this.cavaloPotencia = cavaloPotencia;
	}

	public double calcularValorApolice() {
		double valorApolice = this.valorMercado;
		if (cavaloPotencia > 4) {
			valorApolice = valorApolice * valorApolice;
		} else {
			valorApolice = this.valorMercado * 0.5;
		}

		return valorApolice;
	}

	public String obterDescricao() {
		return "Barco com valor de mercado de R$ " + this.valorMercado + " e " + this.cavaloPotencia
				+ " cavalos de potência.";
	}

}
