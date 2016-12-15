package br.unb.poo.mh;

import java.util.Vector;

public class ListaComValor<T extends Valor> extends Lista<T> {

	T guard;
	Lista<T> next;
	
	public ListaComValor(T guard) {
		this.guard = guard;
		this.next = null;
	}
	public ListaComValor(T guard, Lista<T> next) {
		this.guard = guard;
		this.next = next;
	}
	
	@Override
	public Valor avaliar() {
		Vector<T> a = new Vector<T>();
		
		a.add(guard);

		@SuppressWarnings("unchecked")
		ValorLista<T> test = (ValorLista<T>) next.avaliar();
		Vector<T> ne = test.getValor();
		
		for (int i = 0; i < ne.size(); i++) {
			a.add(ne.get(i));
		}
		
		return new ValorLista<T>(a);
	}

	//TODO
	@Override
	public Tipo tipo(Tipo padrao) {
		
		Tipo ret = Tipo.Lista;
		
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
