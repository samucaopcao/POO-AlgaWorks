package vetores;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Estoque estoque = new Estoque();

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos a serem cadastrados: ");
		int quantidade = sc.nextInt();

		sc.nextLine();

		estoque.produtos = new Produto[quantidade];

		for (int i = 0; i < estoque.produtos.length; i++) {

			estoque.produtos[i] = new Produto();

			System.out.println("\n");
			System.out.println("Produto " + (i + 1));
			System.out.println("--------------------------------------------\n");
			System.out.print("Descrição: ");
			estoque.produtos[i].descricao = sc.nextLine();
			System.out.print("Quantidade: ");
			estoque.produtos[i].quantidade = sc.nextInt();
			sc.nextLine();
		}

		estoque.listarProdutos();
		estoque.totalProdutos();
	}

}
