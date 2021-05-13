package estudos;

public class Carro {

	public String fabricante;
	public String modelo;
	public String cor;
	public int anoDeFabricacao;
	public boolean biCombustivel;

	Proprietario dono;

	void alterarModelo(String modelo) {
		if (modelo != null) {
			this.modelo = modelo;
		}
	}

	void ligar() {
		System.out.println("Ligando o carro: " + modelo);
	}
}
