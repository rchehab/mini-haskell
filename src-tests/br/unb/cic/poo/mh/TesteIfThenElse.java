package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.IfThenElse;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.ExpressaoOr;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.PrettyPrinter;


public class TesteIfThenElse {
	private Expressao ifthen;
	
	@Before
	public void SetUp() {
		ifthen = new IfThenElse(new ExpressaoOr(new ValorBooleano(true), new ValorBooleano(false)), new ValorInteiro(20), new ValorInteiro(10));
	}
	
	@Test
	public void testeIfThenElseSimples() {
		ValorInteiro v20 = new ValorInteiro(20);
		
		Assert.assertEquals(v20, ifthen.avaliar());
	}
	
	@Test
	public void testeIfThenElseComplexo() {
		IfThenElse a = new IfThenElse(new ValorBooleano(false), new ValorInteiro(0), ifthen);
		
		Assert.assertEquals(a.tipo(Tipo.Indefinido), Tipo.Inteiro);
		
		ValorInteiro v20 = new ValorInteiro(20);
		
		Assert.assertEquals(v20, a.avaliar());
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		System.out.println(pp.getStr());
	}
}
