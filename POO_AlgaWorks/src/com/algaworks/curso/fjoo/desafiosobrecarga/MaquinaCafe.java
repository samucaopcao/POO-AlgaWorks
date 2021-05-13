package com.algaworks.curso.fjoo.desafiosobrecarga;

public class MaquinaCafe {

	public int acucarDisponivel;

	public void fazerCafe() {
		fazerCafe(10);
	}

	public void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("N�o h� quantidade de a�ucar suficiente para fazer seu caf�.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo caf� com " + quantidadeAcucar + " gramas de a�ucar.");
		}
	}

}
