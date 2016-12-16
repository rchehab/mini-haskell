package br.unb.poo.mh;

import java.util.Vector;

public class Concatenar extends ExpressaoBinaria {

	public Concatenar(Expressao expEsquerda, Expressao expDireita) {
		super(expEsquerda, expDireita);
	}

	@Override
	public Valor avaliar() {
		ValorLista v1 = (ValorLista) expEsquerda.avaliar();
		ValorLista v2 = (ValorLista) expDireita.avaliar();

		Vector<Valor> fi = v1.getValor();
		Vector<Valor> ne = v2.getValor();
		
		for (int i = 0; i < ne.size(); i++) {
			fi.add(ne.get(i));
		}
		
		return new ValorLista(fi);
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		//Tenho duas listas?
		Tipo ret = (expEsquerda.tipo(Tipo.Lista) == Tipo.Lista && expDireita.tipo(Tipo.Lista) == Tipo.Lista) ? Tipo.Lista : Tipo.Error;
		
		ValorLista v1 = (ValorLista) expEsquerda.avaliar();
		ValorLista v2 = (ValorLista) expDireita.avaliar();

		Vector<Valor> fi = v1.getValor();
		Vector<Valor> ne = v2.getValor();
		
		Tipo a = fi.size() == 0 ? Tipo.Indefinido : fi.get(0).tipo(Tipo.Indefinido);
		Tipo b = ne.size() == 0 ? Tipo.Indefinido : ne.get(0).tipo(Tipo.Indefinido);

		//Essas listas possuem o mesmo tipo
		Tipo interno = (a == b || b == Tipo.Indefinido) ? a : Tipo.Error;
		
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