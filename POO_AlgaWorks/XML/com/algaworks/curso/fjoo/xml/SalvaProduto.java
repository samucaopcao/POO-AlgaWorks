package com.algaworks.curso.fjoo.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.algaworks.curso.fjoo.abstrata.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvaProduto {

	public static void main(String[] args) throws FileNotFoundException {

		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(ProdutoXML.class, "codigo","codigoooo"); 

		ProdutoXML sabonete = new ProdutoXML(1L, "sabonete", new BigDecimal("2.30"));

		String xml = xstream.toXML(sabonete);
		System.out.println(xml);

		OutputStream os = new FileOutputStream("./produto1.xml");
		xstream.toXML(sabonete, os);
		
		OutputStream os1 = new FileOutputStream("./produto2.xml");
		xstream.toXML(sabonete, os1);
		
	}

}
