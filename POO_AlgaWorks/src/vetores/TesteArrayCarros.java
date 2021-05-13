package vetores;

import estudos.Carro;

public class TesteArrayCarros {

	public static void main(String[] args) {
		
		Carro[] carros = new Carro[4];
		
		carros[0] = new Carro();
		
		carros[0].anoDeFabricacao = 2011;
		
		System.out.println(carros[0].anoDeFabricacao);

	}

}
