package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import br.unb.poo.mh.*;


public class TestParentesis {
	private ValorInteiro v2;
	private ValorInteiro v10;
	
	@Before
	public void SetUp() {
		v2 = new ValorInteiro(2);
		v10 = new ValorInteiro(10);
	}
	
	@Test
	public void testeParentesis() {
		Parentesis a = new Parentesis(new ExpressaoSoma(v2, v10));
		Parentesis b = new Parentesis(new Parentesis(new Parentesis(new Parentesis(v2))));
		
		Multiplicacao c = new Multiplicacao(a, b);
		
		Assert.assertEquals(a.tipo(Tipo.Indefinido), Tipo.Inteiro);
		
		Assert.assertEquals(new ValorInteiro(12), a.avaliar());
		Assert.assertEquals(new ValorInteiro(2), b.avaliar());
		Assert.assertEquals(new ValorInteiro(24), c.avaliar());
		
		PrettyPrinter pp = new PrettyPrinter();
		
		c.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		c.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		c.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}
}
