package br.unb.poo.mh;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.Valor;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.Visitor;
import br.unb.poo.mh.Visitor2;

public class GuardaFalsa implements Expressao {
	Expressao condicao;
	Expressao clausula;
	
	public GuardaFalsa(Expressao clausula) {
		this.condicao = new ValorBooleano(true);
		this.clausula = clausula;
	} 
	
	public Valor avaliar() {
		ValorBooleano valor = (ValorBooleano)condicao.avaliar();
		if(valor.getValor()) {
			return clausula.avaliar();
		}
		return null;
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo v1 = condicao.tipo(Tipo.Booleano);
		Tipo v2 = clausula.tipo(Tipo.Indefinido);
		
		Tipo ret = (v1 == Tipo.Booleano) ? v2 : Tipo.Error;
		
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