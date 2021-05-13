package com.algaworks.cursojava.financeiro.modelo;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {
		System.out.println("RELAT�RIO DE CONTAS\n");
		for (Conta conta : contas) {
			conta.exibirDetalhes();
		}
	}
}
