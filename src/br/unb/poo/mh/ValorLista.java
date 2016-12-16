package br.unb.poo.mh;

import java.util.Vector;

public class ValorLista extends ValorParametrizado<Vector<Valor>>{

	public ValorLista(Vector<Valor> valor) {
		super(valor);
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret =  Tipo.Lista;
		
		Tipo interno = Tipo.Indefinido;
		
		for (int i = 0; i < valor.size(); i++) {
			Tipo a = valor.get(i).tipo(Tipo.Indefinido);
			interno = (a == interno || interno == Tipo.Indefinido) ? a : Tipo.Error;
		}
		
		if (interno == Tipo.Error)
			ret = Tipo.Error;
		
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
