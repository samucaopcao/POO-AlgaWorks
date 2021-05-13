package com.algaworks.curso.fjoo.interfaces;

import com.algaworks.curso.fjoo.interfaces.caixa.CheckOut;
import com.algaworks.curso.fjoo.interfaces.caixa.Compra;
import com.algaworks.curso.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.curso.fjoo.interfaces.pagamento.Operadora;
import com.algaworks.curso.fjoo.interfaces.pagamento.operadoras.RedeCard;

public class TesteCheckOut {

	public static void main(String[] args) {

		Operadora operadora = new RedeCard();
		Impressora impressora = new ImpressoraHP();

		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Samuel M Santos");
		cartao.setNumeroCartao("456");

		Compra compra = new Compra();
		compra.setNomeCliente("Samuel Macedo dos Santos");
		compra.setProduto("Playstation 5");
		compra.setValorTotal(5000);

		CheckOut checkout = new CheckOut(operadora, impressora);
		checkout.fecharCompra(compra, cartao);

	}

}
