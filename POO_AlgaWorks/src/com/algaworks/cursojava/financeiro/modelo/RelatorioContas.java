package com.algaworks.cursojava.financeiro.modelo;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {
		System.out.println("RELATÓRIO DE CONTAS\n");
		for (Conta conta : contas) {
			conta.exibirDetalhes();
		}
	}
}
