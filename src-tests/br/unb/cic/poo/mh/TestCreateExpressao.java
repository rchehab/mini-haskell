package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.CreateExpressao;
import br.unb.poo.mh.ParserTranslator;

public class TestCreateExpressao {

	@Test
	public void test1() {
		String tree = ParserTranslator.parse("1 + 2");
		
		System.out.println(tree);
		
		CreateExpressao a = new CreateExpressao();

		a.choose(tree);
		
		Assert.assertTrue(true);
	}

}
