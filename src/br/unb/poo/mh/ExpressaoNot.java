package br.unb.poo.mh;

public class ExpressaoNot implements Expressao {

	Expressao exp;
	
	public ExpressaoNot(Expressao exp) {
		this.exp = exp;
	}

	@Override
	public Valor avaliar() {
		ValorBooleano v1 = (ValorBooleano) exp.avaliar();
		
		return new ValorBooleano(!v1.getValor());
		
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret = (exp.tipo(Tipo.Booleano) == Tipo.Booleano) ? Tipo.Booleano : Tipo.Error;
		
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
