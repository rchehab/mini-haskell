package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.ParserInterface;

public class TestParser {

	@Test
	public void test() {
		String tree = ParserInterface.parse("((if true then 5 else 4) + 10) < 14");
		
		System.out.println(tree);
		Assert.assertTrue(true);
	}

}
