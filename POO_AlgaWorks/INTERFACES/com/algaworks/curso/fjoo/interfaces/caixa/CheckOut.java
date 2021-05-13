package com.algaworks.curso.fjoo.interfaces.caixa;

import com.algaworks.curso.fjoo.interfaces.Impressora;
import com.algaworks.curso.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.curso.fjoo.interfaces.pagamento.Operadora;

public class CheckOut {

	private Operadora operadora;
	private Impressora impressora;

	public CheckOut(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}

	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);

		if (autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.out.println("Pagamento foi negado!");
		}

	}

}
