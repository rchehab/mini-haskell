package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoDivisor;
import br.unb.poo.mh.ValorInteiro;

public class TesteExpressaoDivisor {
	
	private ValorInteiro v5 = new ValorInteiro(2);
	private ValorInteiro v10 = new ValorInteiro(40);
	private Expressao div = new ExpressaoDivisor(v5, v10);
	
	@Test
	public void testeDivisaoSimples() {
		ValorInteiro v2 = new ValorInteiro(20);
		Assert.assertEquals(v2, div.avaliar());
	}
	
	@Test
	public void testeDivisaoComplexa() {
		ValorInteiro v10 = new ValorInteiro(10);
		Expressao divisao = new ExpressaoDivisor(v5, div);
		Assert.assertEquals(v10, divisao.avaliar());
	}
}
