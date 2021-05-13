package com.algaworks.curso.fjoo.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.algaworks.curso.fjoo.abstrata.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LendoCarrinhoXML {

	public static void main(String[] args) throws FileNotFoundException {

		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", ProdutoXML.class);
		xstream.aliasAttribute(ProdutoXML.class, "codigo", "codigoooo");
		xstream.alias("carrinho", List.class);

		List<ProdutoXML> carrinho = (List<ProdutoXML>) xstream.fromXML(new FileInputStream("./carrinho.xml"));
		for (ProdutoXML p : carrinho) {
			System.out.println(p.getCodigo());
			System.out.println(p.getDescricao());
			System.out.println(p.getValor());
		}
	}

}
