package br.unb.cic.poo.mh;

import org.junit.Test;

import br.unb.poo.mh.*;

import org.junit.Assert;

public class TestGuardaFalsa {

	@Test
	public void testBasico() {
		GuardaFalsa ng = new GuardaFalsa(new ValorInteiro(1));
		
		Assert.assertEquals(ng.tipo(Tipo.Indefinido), Tipo.Inteiro);
		Assert.assertEquals(ng.avaliar(), new ValorInteiro(1));
		
	}
	@Test
	public void testComplexo() {
		GuardaFalsa ng = new GuardaFalsa(new ValorBooleano(true));
		
		Assert.assertEquals(ng.tipo(Tipo.Indefinido), Tipo.Booleano);
		Assert.assertEquals(ng.avaliar(), new ValorBooleano(true));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		ng.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		ng.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		ng.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}

}
