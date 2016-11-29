package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.ExpressaoOr;

public class TesteExpressaoOr {

	private ValorBooleano vtrue;
	private ValorBooleano vfalse;
	private ExpressaoOr test_1;
	
	@Before
	public void SetUp() {
		vtrue = new ValorBooleano(true);
		vfalse = new ValorBooleano(false);
		test_1 = new ExpressaoOr(vfalse, vfalse);
	}
	
	@Test
	public void TesteOrSimples() {
		ExpressaoOr test_2 = new ExpressaoOr(vfalse, vtrue);
		ExpressaoOr test_3 = new ExpressaoOr(vtrue, vfalse);
		ExpressaoOr test_4 = new ExpressaoOr(vtrue, vtrue);
		
		//Testa as 4 combinações de somas simples
		
		Assert.assertEquals(test_1.avaliar(), vfalse);
		Assert.assertEquals(test_2.avaliar(), vtrue);
		Assert.assertEquals(test_3.avaliar(), vtrue);
		Assert.assertEquals(test_4.avaliar(), vtrue);
	}
	@Test
	public void TesteOrComplexo() {
		ExpressaoOr test_complexo_1 = new ExpressaoOr(test_1, vtrue);
		ExpressaoOr test_complexo_2 = new ExpressaoOr(test_1, vfalse);
		
		//Testa as 4 combinações de somas simples
		
		Assert.assertEquals(test_complexo_1.avaliar(), vtrue);
		Assert.assertEquals(test_complexo_2.avaliar(), vfalse);
	}

}
