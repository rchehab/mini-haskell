package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.PrettyPrinter;
import br.unb.poo.mh.TamanhoDasExpressoes;
import br.unb.poo.mh.ExpressaoNot;
import br.unb.poo.mh.NotacaoPolonesaReversa;
import br.unb.poo.mh.ExpressaoAnd;


public class TestExpressaoNot {
	private ValorBooleano vtrue;
	private ValorBooleano vfalse;
	
	@Before
	public void SetUp() {
		vtrue = new ValorBooleano(true);
		vfalse = new ValorBooleano(false);
	}
	
	@Test
	public void testeExpressaoNot() {
		ExpressaoNot a = new ExpressaoNot(vtrue);
		ExpressaoNot b = new ExpressaoNot(vfalse);
		ExpressaoNot c = new ExpressaoNot( new ExpressaoAnd(vtrue, vfalse));
		
		Assert.assertEquals(a.tipo(Tipo.Indefinido), Tipo.Booleano);
		
		Assert.assertEquals(new ValorBooleano(false), a.avaliar());
		Assert.assertEquals(new ValorBooleano(true), b.avaliar());
		Assert.assertEquals(new ValorBooleano(true), c.avaliar());
		
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
