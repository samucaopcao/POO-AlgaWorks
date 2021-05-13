package com.algaworks.cursojava.financeiro.modelo;

public abstract class Conta {

	private String descricao;
	private Double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;

	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public void cancelar() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("N�o pode cancelar uma conta que j� foi paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("N�o pode cancelar uma conta que j� foi cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println("Cancelando conta " + this.getDescricao() + ".");

			// altera situa��o da conta para CANCELADA
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}

	public abstract void exibirDetalhes();

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return this.dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return this.situacaoConta;
	}
}
