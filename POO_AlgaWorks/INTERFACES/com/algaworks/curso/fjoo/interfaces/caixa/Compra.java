package com.algaworks.curso.fjoo.interfaces.caixa;

import com.algaworks.curso.fjoo.interfaces.Imprimivel;
import com.algaworks.curso.fjoo.interfaces.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private String produto;
	private String nomeCliente;

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getvalorTotal();
	}

	@Override
	public String getCorpoPagina() {
		return "Nome:" + this.getNomeCliente() + "\nProduto: " + this.getProduto();
	}

	@Override
	public double getvalorTotal() {
		return this.valorTotal;
	}

}
