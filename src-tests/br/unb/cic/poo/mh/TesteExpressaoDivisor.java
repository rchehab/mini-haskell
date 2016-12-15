package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoDivisor;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.PrettyPrinter;

public class TesteExpressaoDivisor {
	
	private ValorInteiro v2 = new ValorInteiro(2);
	private ValorInteiro v40 = new ValorInteiro(40);
	private Expressao div = new ExpressaoDivisor(v40, v2);
	
	@Test
	public void testeDivisaoSimples() {
		ValorInteiro v20 = new ValorInteiro(20);
		Assert.assertEquals(v20, div.avaliar());
	}
	
	@Test
	public void testeDivisaoComplexa() {
		ValorInteiro v10 = new ValorInteiro(10);
		Expressao divisao = new ExpressaoDivisor(div, v2);
		Assert.assertEquals(v10, divisao.avaliar());
		Assert.assertEquals(divisao.tipo(Tipo.Indefinido), Tipo.Inteiro);
		PrettyPrinter pp = new PrettyPrinter();
		divisao.aceitar(pp);
		System.out.println(pp.getStr());
	}
}
