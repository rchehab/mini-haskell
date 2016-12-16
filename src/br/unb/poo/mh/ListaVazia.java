package br.unb.poo.mh;

import java.util.Vector;

public class ListaVazia extends Lista {

	public ListaVazia() {
		super(Tipo.Indefinido);
	}
	
	@Override
	public Valor avaliar() {
		Vector<Valor> a = new Vector<Valor>();
		return new ValorLista(a);
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
