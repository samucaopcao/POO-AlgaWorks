package com.algaworks.cursojava.financeiro.modelo;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public ContaReceber() {
	}

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void cancelar() throws OperacaoContaException{
		if (this.getValor() > 50000d) {
			throw new OperacaoContaException("Essa conta a receber não pode ser cancelada. "
					+ "É muito dinheiro para deixar de receber: " + this.getDescricao());
		} else {
			super.cancelar();
		}
	}

	public void receber() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Não pode receber uma conta que já está paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Não pode receber uma conta que está cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println(
					"Recebendo conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do cliente " + this.getCliente().getNome() + ".");

			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void exibirDetalhes() {
		System.out.println("Conta a Receber: ");
		System.out.println("---------------------------");
		System.out.println(" Cliente: " + getCliente().getNome() + "\n Descrição: " + getDescricao() + "\n Valor: R$ " + getValor()
				+ "\n Data de Vencimento: " + getDataVencimento() + "\n");
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
