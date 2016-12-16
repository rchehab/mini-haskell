package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.PrettyPrinter;
import br.unb.poo.mh.TamanhoDasExpressoes;
import br.unb.poo.mh.ExpressaoLessThan;
import br.unb.poo.mh.NotacaoPolonesaReversa;


public class TestExpressaoLessThan {
	private ValorInteiro v10;
	private ValorInteiro v5;
	
	@Before
	public void SetUp() {
		v10 = new ValorInteiro(10);
		v5 = new ValorInteiro(5);
	}
	
	@Test
	public void testeExpressaoLessThan() {
		ExpressaoLessThan a = new ExpressaoLessThan(v10, v10); // ==
		ExpressaoLessThan b = new ExpressaoLessThan(v5, v10); // <
		ExpressaoLessThan c = new ExpressaoLessThan(v10, v5); // >
		ExpressaoLessThan d = new ExpressaoLessThan(v10, new ValorBooleano(true)); // erro
		Assert.assertEquals(d.tipo(Tipo.Indefinido), Tipo.Error);
		
		Assert.assertEquals(a.tipo(Tipo.Indefinido), Tipo.Booleano);
		
		Assert.assertEquals(new ValorBooleano(false), a.avaliar());
		Assert.assertEquals(new ValorBooleano(true), b.avaliar());
		Assert.assertEquals(new ValorBooleano(false), c.avaliar());
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}
}
