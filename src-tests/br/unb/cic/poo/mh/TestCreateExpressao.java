package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.*;

public class TestCreateExpressao {

	@Test
	public void test_base() {
		String tree = ParserTranslator.parse("1 + 2");

		ValorInteiro v3 = new ValorInteiro(3);
		
		Assert.assertEquals(v3, CreateExpressao.choose(tree).avaliar());
	}
	@Test
	public void test1() {
		String tree = ParserTranslator.parse("if false then 5 else 4 + 10 <= 2 * 5 + 4");
		
		ValorBooleano vtrue = new ValorBooleano(true);
		
		Assert.assertEquals(vtrue, CreateExpressao.choose(tree).avaliar());
	}
	
	@Test
	public void test2() {
		String tree = ParserTranslator.parse("f a b c d = if a then b + c else d < 20 and (false or a)");
		
		System.out.println(tree);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		String tree = ParserTranslator.parse("1 + 2 * 3");
		
		System.out.println(tree);
		Assert.assertTrue(true);
	}

}
