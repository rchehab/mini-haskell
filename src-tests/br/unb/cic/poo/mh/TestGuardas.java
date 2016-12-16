package br.unb.cic.poo.mh;

import org.junit.Test;

import br.unb.poo.mh.*;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Before;

public class TestGuardas {

	Guarda ng;
	
	@Before
	public void SetUp() {
		ng = new Guarda(new ExpressaoOr(new ValorBooleano(false), new ValorBooleano(true)), new ValorInteiro(1));
		
	}
	
	@Test
	public void testBasico() {
		Assert.assertEquals(ng.tipo(Tipo.Indefinido), Tipo.Inteiro);
		Assert.assertEquals(ng.avaliar(), new ValorInteiro(1));
		
	}
	@Test
	public void testComplexo() {
		
		ValorInteiro v1 = new ValorInteiro(1);
		ValorInteiro v10 = new ValorInteiro(10);
		
		Guarda a = new Guarda(new ValorBooleano(false), new ValorInteiro(1));
		Guarda b = new Guarda(new ExpressaoLessThan(new Multiplicacao(v1, v10), new ExpressaoSoma(v1, v10)), new ValorBooleano(true));
		Guarda c = new Guarda(new ValorBooleano(true), new ExpressaoOr(new ValorBooleano(true), new ValorBooleano(false)));
		
		Vector<Guarda> gua = new Vector<Guarda>();
		
		gua.add(a);
		gua.add(b);
		gua.add(ng);
		gua.add(c);
		
		Guardas g = new Guardas(gua);
		
		Assert.assertEquals(g.tipo(Tipo.Indefinido), Tipo.Error);
		Assert.assertEquals(g.avaliar(), new ValorBooleano(true));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		g.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		g.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		g.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}

}
