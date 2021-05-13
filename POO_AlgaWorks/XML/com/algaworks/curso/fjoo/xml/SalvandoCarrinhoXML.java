package com.algaworks.curso.fjoo.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.curso.fjoo.abstrata.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoCarrinhoXML {

	public static void main(String[] args) throws FileNotFoundException {
		List<ProdutoXML> carrinho = new ArrayList<>();
		
		carrinho.add(new ProdutoXML(1L,"sabonete",new BigDecimal("3.50")));
		carrinho.add(new ProdutoXML(2L,"shampoo",new BigDecimal("13.50")));
	
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("produto", ProdutoXML.class);
		xStream.aliasAttribute(ProdutoXML.class, "codigo","codigoooo");
		xStream.alias("carrinho",List.class);
		
		OutputStream os = new FileOutputStream("./carrinho.xml");
		xStream.toXML(carrinho, os);
		
		


	}

}
