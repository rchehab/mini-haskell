package br.unb.poo.mh;

public class Parentesis implements Expressao {

	Expressao exp;
	
	public Parentesis(Expressao exp) {
		this.exp = exp;
	}

	@Override
	public Valor avaliar() {
		Valor v = (Valor) exp.avaliar();
		
		return v;
		
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret = exp.tipo(padrao);
		
		return (ret == padrao || padrao == Tipo.Indefinido) ? ret : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
