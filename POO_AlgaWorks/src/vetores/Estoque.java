package vetores;

public class Estoque {

	public Produto[] produtos;

	public void listarProdutos() {
		System.out.println("\nProdutos em Estoque:");
		System.out.println("------------------------------------------------");

		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();

		}
	}

	public void totalProdutos() {
		int total = 0;
		for (int i = 0; i < produtos.length; i++) {
			total += produtos[i].quantidade;

		}

		System.out.println("Quantidade Total de Produtos: " + total);
	}
}
