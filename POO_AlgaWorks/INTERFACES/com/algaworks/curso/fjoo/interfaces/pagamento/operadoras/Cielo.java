package com.algaworks.curso.fjoo.interfaces.pagamento.operadoras;

import com.algaworks.curso.fjoo.interfaces.pagamento.Autorizavel;
import com.algaworks.curso.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.curso.fjoo.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123") 
				&& autorizavel.getvalorTotal() < 6000;
	}

}
