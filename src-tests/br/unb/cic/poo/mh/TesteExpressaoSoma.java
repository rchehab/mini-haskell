package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoSoma;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.PrettyPrinter;


public class TesteExpressaoSoma {

	private ValorInteiro v5 = new ValorInteiro(5);
	private ValorInteiro v10 = new ValorInteiro(10);
	private Expressao soma = new ExpressaoSoma(v5, v10);
	
	@Test
	public void testeSomaSimples() {
		ValorInteiro v15 = new ValorInteiro(15);
		
		Assert.assertEquals(v15, soma.avaliar());
	}
	
	@Test
	public void testeSomaComplexa() {
		ValorInteiro v25 = new ValorInteiro(25);
		Expressao soma2 = new ExpressaoSoma(v10, soma);
		Assert.assertEquals(v25, soma2.avaliar());
		
		Assert.assertEquals(soma2.tipo(), Tipo.Inteiro);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		soma2.aceitar(pp);
		System.out.println(pp.getStr());
	}
}
