package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.ParserTranslator;

public class TestParserTranslator {

	@Test
	public void test1() {
		String tree = ParserTranslator.parse("if true then 5 else 4 + 10 < 2 * 5 + 4");
		
		System.out.println(tree);
		Assert.assertTrue(true);
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
	
	@Test
	public void test4() {
		String tree = ParserTranslator.parse("fat n\n\t|n == 0 = 1\n\t|true = n * fat(n-1)");
		
		System.out.println(tree);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test5() {
		String tree = ParserTranslator.parse("[true, false, true]");
		
		System.out.println(tree);
		Assert.assertTrue(true);
	}

}
