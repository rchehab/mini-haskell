package br.unb.poo.mh;

import java.util.Vector;

public class Guardas implements Expressao {

	Vector<Guarda> opcoes;
	
	public Guardas(Vector<Guarda> opcoes) {
		this.opcoes = opcoes;
	} 
	
	public Valor avaliar() {
		for (int i = 0; i < opcoes.size(); i++) {
			Guarda temp = opcoes.get(i);
			ValorBooleano valor = (ValorBooleano)temp.condicao.avaliar();
			if(valor.getValor()) {
				return temp.clausula.avaliar();
			}
		}
		return null;
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		
		Tipo ret = Tipo.Indefinido;
		
		for (int i = 0; i < opcoes.size(); i++) {
			Guarda temp = opcoes.get(i);
			Tipo v1 = temp.condicao.tipo(Tipo.Booleano);
			Tipo v2 = temp.clausula.tipo(Tipo.Indefinido);

			ret = (v1 == Tipo.Booleano) ? ((v2 == ret || ret == Tipo.Indefinido) ? v2 : Tipo.Error) : Tipo.Error;
		}
		
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