package br.unb.poo.mh;

import java.util.Vector;

public class ListaComValor extends Lista {

	Valor guard;
	Lista next;
	
	public ListaComValor(Expressao guard) {
		super(guard.tipo(Tipo.Indefinido));
		
		this.guard = guard.avaliar();
		this.next = null;
	}
	public ListaComValor(Expressao guard, Lista next) {
		super(guard.tipo(Tipo.Indefinido));
		
		this.guard = guard.avaliar();
		this.next = next;
	}
	
	@Override
	public Valor avaliar() {
		Vector<Valor> a = new Vector<Valor>();
		
		a.add(guard);

		ValorLista test = (ValorLista) next.avaliar();
		Vector<Valor> ne = test.getValor();
		
		for (int i = 0; i < ne.size(); i++) {
			a.add(ne.get(i));
		}
		
		return new ValorLista(a);
	}

	//TODO
	@Override
	public Tipo tipo(Tipo padrao) {
		
		Tipo v1 = next.tipo(padrao);
		boolean igual = (tipoBase == next.tipoBase || next.tipoBase == Tipo.Indefinido) ? true : false;
		Tipo ret = igual ? v1 : Tipo.Error;
		
		return (ret == padrao || padrao == Tipo.Indefinido) ? ret : Tipo.Error;
	}
	
	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

	@Override
	public void aceitar(Visitor2 v, String f) {
		v.visitar(this, f);
		
	}

}
