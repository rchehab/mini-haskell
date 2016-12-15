package br.unb.poo.mh;

import java.util.Vector;

public class ListaVazia<T extends Valor> extends Lista<T> {

	public ListaVazia() {
	}
	
	@Override
	public Valor avaliar() {
		Vector<T> a = new Vector<T>();
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
