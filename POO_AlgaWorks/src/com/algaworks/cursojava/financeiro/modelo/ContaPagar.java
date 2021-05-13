package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta {

	private Fornecedor fornecedor;

	public ContaPagar() {
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void pagar() throws OperacaoContaException{
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("N�o pode pagar uma conta que j� est� paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("N�o pode pagar uma conta que est� cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println(
					"Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + ".");

			// altera situa��o da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void exibirDetalhes() {
		System.out.println("Conta a pagar:");
		System.out.println("---------------------------");
		System.out.println(" Fornecedor: " + getFornecedor().getNome() + "\n Descri��o: " + getDescricao()
				+ "\n Valor: R$ " + getValor() + "\n Data de Vencimento: " + getDataVencimento() + "\n");
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}
