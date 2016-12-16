package br.unb.cic.poo.mh;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.unb.poo.mh.*;

public class TesteConcatena {

	public Vector<Valor> t1 = new Vector<>();
	public Vector<Valor> t2 = new Vector<>();
	public Vector<Valor> tb = new Vector<>();
	public Vector<Valor> tv = new Vector<>();
	
	private ValorLista t3;
	private ValorLista t4;
	private ValorLista tbl;
	private ValorLista tvl;
	
	private Concatenar t_1;

	
	@Before
	public void Setup(){
		t1 = new Vector<>();
		t2 = new Vector<>();
		tb = new Vector<>();
		tv = new Vector<>();
		
		t1.add(new ValorInteiro(1));
		t1.add(new ValorInteiro(1));
		t1.add(new ValorInteiro(2));
		

		t2.add(new ValorInteiro(3));
		t2.add(new ValorInteiro(5));
		t2.add(new ValorInteiro(8));
		t2.add(new ValorInteiro(13));
		
		tb.add(new ValorBooleano(true));
		tb.add(new ValorBooleano(true));
		
		t3 = new ValorLista(t1);
		t4 = new ValorLista(t2);
		tbl = new ValorLista(tb);
		tvl = new ValorLista(tv);
		
		t_1 = new Concatenar(t3,t4);
	}
	
	@Test
	public void TesteConcatSimples() {
		
		Concatenar t_2 = new Concatenar(tvl, t_1);
		Concatenar t_3 = new Concatenar(t3, tbl);

		t_1.avaliar();
		t_2.avaliar();
		t_3.avaliar();
		
		Assert.assertEquals(t_1.tipo(Tipo.Lista), Tipo.Lista);
		Assert.assertEquals(t_2.tipo(Tipo.Lista), Tipo.Lista);
		Assert.assertEquals(t_3.tipo(Tipo.Lista), Tipo.Error);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		t_3.aceitar(pp);
		
		System.out.println(pp.getStr() + "\n");
		
		TamanhoDasExpressoes te = new TamanhoDasExpressoes();
		
		t_3.aceitar(te);
		
		System.out.println(te.getTamanho() + "\n");
		
		NotacaoPolonesaReversa npr = new NotacaoPolonesaReversa();
		
		t_3.aceitar(npr);
		
		System.out.println(npr.getStr() + "\n");
	}
}
