package com.algaworks.curso.fjoo.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(1000);
		imprimirSaldo(conta);
		System.out.println();
		// -----------------------------------------
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(2000);
		imprimirSaldo(contaCorrente);
		System.out.println();
		// -----------------------------------------
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(3000);
		imprimirSaldo(contaPoupanca);
		System.out.println();
		// -----------------------------------------
		Conta contaPoupanca2 = new ContaPoupanca();
		contaPoupanca2.setSaldo(4000);
		imprimirSaldo(contaPoupanca2);
		System.out.println();
		// -----------------------------------------
		Conta contaCorrente2 = new ContaCorrente();
		contaCorrente2.setSaldo(5000);
		imprimirSaldo(contaCorrente2);
		System.out.println();
	}

	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$ " + conta.getSaldo());

		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da conta corrente é: R$ " + cc.getLimite());
		}

		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da conta poupança é : R$ " + cp.getRendimentos());

		}
	}
}
