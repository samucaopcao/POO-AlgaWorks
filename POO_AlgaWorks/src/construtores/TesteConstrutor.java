package construtores;

public class TesteConstrutor {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Leticia",35);

		System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");

		p1.nome = "Samuel";
		p1.idade = 34;
		
		System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
		
	}

}
