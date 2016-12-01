package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.PrettyPrinter;

import br.unb.poo.mh.ExpressaoLessOrEqual;


public class TestExpressaoLessOrEqual {
	private ValorInteiro v10;
	private ValorInteiro v5;
	
	@Before
	public void SetUp() {
		v10 = new ValorInteiro(10);
		v5 = new ValorInteiro(5);
	}
	
	@Test
	public void testeExpressaoLessOrEqual() {
		ExpressaoLessOrEqual a = new ExpressaoLessOrEqual(v10, v10); // ==
		ExpressaoLessOrEqual b = new ExpressaoLessOrEqual(v5, v10); // >
		ExpressaoLessOrEqual c = new ExpressaoLessOrEqual(v10, v5); // <
		
		Assert.assertEquals(a.tipo(Tipo.Indefinido), Tipo.Booleano);
		
		Assert.assertEquals(new ValorBooleano(true), a.avaliar());
		Assert.assertEquals(new ValorBooleano(false), b.avaliar());
		Assert.assertEquals(new ValorBooleano(true), c.avaliar());
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		System.out.println(pp.getStr());
	}
}
