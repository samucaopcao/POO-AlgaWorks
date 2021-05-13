package com.algaworks.curso.fjoo.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.algaworks.curso.fjoo.abstrata.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LendoProdutoXML {

	public static void main(String[] args) throws FileNotFoundException {

		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(ProdutoXML.class, "codigo", "codigoooo");

		ProdutoXML p = (ProdutoXML) xstream.fromXML(new FileInputStream("./produto2.xml"));
		System.out.println(p.getCodigo());
		System.out.println(p.getDescricao());
		System.out.println(p.getValor());
		

	}

}
