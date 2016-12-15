package br.unb.poo.mh;

import java.util.Vector;

public class ValorLista<T extends Valor> extends ValorParametrizado<Vector<T>>{

	public ValorLista(Vector<T> valor) {
		super(valor);
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret =  Tipo.Lista;
		
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
