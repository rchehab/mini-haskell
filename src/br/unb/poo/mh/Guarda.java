package br.unb.poo.mh;

public class Guarda implements Expressao {
	Expressao condicao;
	Expressao clausula;
	
	public Guarda(Expressao condicao, Expressao clausula) {
		this.condicao = condicao;
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