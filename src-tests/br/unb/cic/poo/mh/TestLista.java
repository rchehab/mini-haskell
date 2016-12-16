package br.unb.cic.poo.mh;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorLista;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.Valor;
import br.unb.poo.mh.PrettyPrinter;
import br.unb.poo.mh.TamanhoDasExpressoes;
import br.unb.poo.mh.Lista;
import br.unb.poo.mh.ListaComValor;
import br.unb.poo.mh.ListaVazia;
import br.unb.poo.mh.NotacaoPolonesaReversa;


public class TestLista {
	private ValorInteiro v10;
	private ValorInteiro v5;
	private ValorBooleano vtrue;
	
	@Before
	public void SetUp() {
		v10 = new ValorInteiro(10);
		v5 = new ValorInteiro(5);
		vtrue = new ValorBooleano(true);
	}
	
	@Test
	public void testeLista() {
		Lista a = new ListaComValor(v10, new ListaComValor(v5, new ListaVazia()));
		Lista b = new ListaComValor(v10, new ListaComValor(vtrue, new ListaVazia()));
		Lista c = new ListaVazia();
		
		Vector<Valor> aux = new Vector<Valor>();
		
		aux.add(v10);
		aux.add(v5);
		
		Vector<Valor> aux2 = new Vector<Valor>();
		
		aux2.add(v10);
		aux2.add(vtrue);

		Vector<Valor> aux3 = new Vector<Valor>();
		
		ValorLista aa = new ValorLista(aux);
		ValorLista bb = new ValorLista(aux2);
		ValorLista cc = new ValorLista(aux3);
		
		a.avaliar();
		b.avaliar();
		c.avaliar();
		
		Assert.assertEquals(Tipo.Lista, a.tipo(Tipo.Indefinido));
		Assert.assertEquals(Tipo.Error, b.tipo(Tipo.Indefinido));
		Assert.assertEquals(Tipo.Lista, c.tipo(Tipo.Indefinido));
		
		Assert.assertEquals(Tipo.Lista, aa.tipo(Tipo.Indefinido));
		Assert.assertEquals(Tipo.Error, bb.tipo(Tipo.Indefinido));
		Assert.assertEquals(Tipo.Lista, cc.tipo(Tipo.Indefinido));
		
		Assert.assertEquals(Tipo.Error, a.tipo(Tipo.Inteiro));
		Assert.assertEquals(Tipo.Error, b.tipo(Tipo.Inteiro));
		Assert.assertEquals(Tipo.Error, c.tipo(Tipo.Inteiro));
	}
}
