package estudos;

public class ExemploThis {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "P�lio";
		System.out.println(carro.modelo);
		
		carro.alterarModelo("Civic");
		System.out.println(carro.modelo);

	}

}
