package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;
import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoSubtracao;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.PrettyPrinter;

public class TestExpressaoSubtracao {

	private ValorInteiro v5 = new ValorInteiro(5);
	private ValorInteiro v10 = new ValorInteiro(10);
	private Expressao subtcao = new ExpressaoSubtracao(v10, v5);
	
	@Test
	public void testeSubtracaoSimples() {
		ValorInteiro vt5 = new ValorInteiro(5);
		Assert.assertEquals(vt5, subtcao.avaliar());
	}
	
	@Test
	public void testeSubtracaoComplexa() {
		ValorInteiro vt = new ValorInteiro(-5);
		Expressao sub = new ExpressaoSubtracao(subtcao, v10);
		Assert.assertEquals(vt, sub.avaliar());
		
		Assert.assertEquals(subtcao.tipo(Tipo.Indefinido), Tipo.Inteiro);
		Assert.assertEquals(subtcao.tipo(Tipo.Booleano), Tipo.Error);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		sub.aceitar(pp);
		System.out.println(pp.getStr());
	}
}
