package com.algaworks.curso.fjoo.desafiosobrecarga;

public class MaquinaCafe {

	public int acucarDisponivel;

	public void fazerCafe() {
		fazerCafe(10);
	}

	public void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há quantidade de açucar suficiente para fazer seu café.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo café com " + quantidadeAcucar + " gramas de açucar.");
		}
	}

}
