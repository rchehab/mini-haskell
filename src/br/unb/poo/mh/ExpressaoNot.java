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
	public Tipo tipo() {
		return (exp.tipo() == Tipo.Booleano) ? Tipo.Booleano : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
