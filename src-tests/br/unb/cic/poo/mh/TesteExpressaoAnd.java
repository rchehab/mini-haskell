package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.ExpressaoAnd;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.PrettyPrinter;

public class TesteExpressaoAnd {

	private ValorBooleano vtrue;
	private ValorBooleano vfalse;
	private ExpressaoAnd test_1;
	
	@Before
	public void SetUp() {
		vtrue = new ValorBooleano(true);
		vfalse = new ValorBooleano(false);
		test_1 = new ExpressaoAnd(vtrue, vtrue);
	}
	
	@Test
	public void TesteAndSimples() {
		ExpressaoAnd test_2 = new ExpressaoAnd(vtrue, vfalse);
		ExpressaoAnd test_3 = new ExpressaoAnd(vfalse, vtrue);
		ExpressaoAnd test_4 = new ExpressaoAnd(vfalse, vfalse);
		
		//Testa as 4 combinações de somas simples
		
		Assert.assertEquals(test_1.avaliar(), vtrue);
		Assert.assertEquals(test_2.avaliar(), vfalse);
		Assert.assertEquals(test_3.avaliar(), vfalse);
		Assert.assertEquals(test_4.avaliar(), vfalse);
		Assert.assertEquals(test_1.tipo(Tipo.Indefinido), Tipo.Booleano);
	}
	@Test
	public void TesteAndComplexo() {
		ExpressaoAnd test_complexo_1 = new ExpressaoAnd(test_1, vfalse);
		ExpressaoAnd test_complexo_2 = new ExpressaoAnd(test_1, vtrue);
		
		//Testa as 4 combinações de somas simples
		
		Assert.assertEquals(test_complexo_1.avaliar(), vfalse);
		Assert.assertEquals(test_complexo_2.avaliar(), vtrue);
		Assert.assertEquals(test_complexo_1.tipo(Tipo.Indefinido), Tipo.Booleano);
		
		PrettyPrinter pp = new PrettyPrinter();
		test_complexo_1.aceitar(pp);
		System.out.println(pp.getStr());
	}

}
