package br.unb.cic.poo.mh;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.unb.poo.mh.Concatenar;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.Valor;
import br.unb.poo.mh.ValorLista;

public class TesteConcatena {

	private Vector<Valor> t1 = new Vector<>();
	private Vector<Valor> t2 = new Vector<>();
	
	private ValorLista t3;
	private ValorLista t4;
	
	private Concatenar t_1;
//	private Concatenar t_2;
//	private Concatenar t_3;
//	private Concatenar t_4;

	
	@Before
	public void Setup(){
		t3 = new ValorLista(t1);
		t4 = new ValorLista(t2);
		
		t_1 = new Concatenar(t4,t3);
//		t_2 = new Concatenar(t3,t4);
//		t_3 = new Concatenar(t4,t3);
//		t_4 = new Concatenar(t3,t3);
	}
	
	@Test
	public void TesteConcatSimples() {
		
		//Assert.assertEquals(t_1, new Concatenar(t4,t3));
		Assert.assertEquals(t_1.tipo(Tipo.Lista), Tipo.Lista);
	}
}
