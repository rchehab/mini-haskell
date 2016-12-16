package br.unb.cic.poo.mh;

import org.junit.Test;

import br.unb.poo.mh.*;

import org.junit.Assert;

public class TestGuarda {

	@Test
	public void testBasico() {
		Guarda ng = new Guarda(new ExpressaoOr(new ValorBooleano(false), new ValorBooleano(true)), new ValorInteiro(1));
		
		Assert.assertEquals(ng.tipo(Tipo.Indefinido), Tipo.Inteiro);
		Assert.assertEquals(ng.avaliar(), new ValorInteiro(1));
		
	}
	@Test
	public void testComplexo() {
		Guarda ng = new Guarda(new ValorBooleano(false), new ValorInteiro(1));
		
		Assert.assertEquals(ng.tipo(Tipo.Indefinido), Tipo.Inteiro);
		Assert.assertEquals(ng.avaliar(), null);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		ng.aceitar(pp);
		
		System.out.println(pp.getStr());
	}

}
