package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.unb.poo.mh.ParserTranslator;
import br.unb.poo.mh.PrettyPrinter;
import br.unb.poo.mh.TamanhoDasExpressoes;
import br.unb.poo.mh.CreateExpressao;
import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.NotacaoPolonesaReversa;

public class TestNotacaoPolonesaReversa {


	CreateExpressao ce;
	
	@Before
	public void SetUp() {
		ce = new CreateExpressao();
	}
	
	@Test
	public void test_base() {
		System.out.println("Testb");
		String tree = ParserTranslator.parse("1 + 2");

		Expressao a = ce.choose(tree);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
		Assert.assertTrue(true);
	}
	@Test
	public void test1() {
		System.out.println("\nTest1");
		String tree = ParserTranslator.parse("if false then 5 else 4 + 10 <= 2 * 5 + 4");

		Expressao a = ce.choose(tree);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}
	
	@Test
	public void test2() {
		System.out.println("\nTest2");
		String tree = ParserTranslator.parse("f a b c d = if a then b + c else d < 20 and (false or a)");

		System.out.println(tree);
		ce.choose2(tree);
		System.out.println("a");
		Expressao a = ce.choose2(tree).getCorpo();
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}
	
	@Test
	public void test3() {
		System.out.println("\nTest3");
		String tree = ParserTranslator.parse("1 + 2 * 3");

		Expressao a = ce.choose(tree);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}
	@Test
	public void test4() {
		System.out.println("\nTest4");
		String tree = ParserTranslator.parse("soma (1 2)");

		Expressao a = ce.choose(tree);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}
	
	@Test
	public void test5() {
		System.out.println("\nTest5");
		String tree = ParserTranslator.parse("fat n\n\t|n == 0 = 1\n\t|true = n * fat(n-1)");

		Expressao a = ce.choose2(tree).getCorpo();
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test6() {
		System.out.println("\nTest6");
		String tree = ParserTranslator.parse("[1, 2, 3, 4, 5, 6]");

		Expressao a = ce.choose(tree);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test7() {
		System.out.println("\nTest7");
		String tree = ParserTranslator.parse("[true, false, true]");

		Expressao a = ce.choose(tree).avaliar();
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
		Assert.assertTrue(true);
	}
	@Test
	public void test8() {
		System.out.println("\nTest8");
		String tree = ParserTranslator.parse("gcd(soma (soma (1 2) 10) 24 * 3)");

		Expressao a = ce.choose(tree);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		a.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		a.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		a.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}

}
