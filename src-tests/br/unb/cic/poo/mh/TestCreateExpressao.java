package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.unb.poo.mh.*;

public class TestCreateExpressao {

	CreateExpressao ce;
	
	@Before
	public void SetUp() {
		ce = new CreateExpressao();
	}
	
	@Test
	public void test_base() {
		System.out.println("Testb");
		String tree = ParserTranslator.parse("1 + 2");

		ValorInteiro v3 = new ValorInteiro(3);
		
		Assert.assertEquals(v3, ce.choose(tree).avaliar());
	}
	@Test
	public void test1() {
		System.out.println("Test1");
		String tree = ParserTranslator.parse("if false then 5 else 4 + 10 <= 2 * 5 + 4");
		
		ValorBooleano vtrue = new ValorBooleano(true);
		
		Assert.assertEquals(vtrue, ce.choose(tree).avaliar());
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
		String tree = ParserTranslator.parse("f a b c d = if a then b + c else d < 20 and (false or a)");
		
		System.out.println(tree);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
		String tree = ParserTranslator.parse("1 + 2 * 3");
		
		System.out.println(tree);
		Assert.assertTrue(true);
	}
	@Test
	public void test4() {
		System.out.println("Test4");
		String tree = ParserTranslator.parse("soma (1 2)");
		
		System.out.println(tree);
		Assert.assertTrue(true);
	}

}
