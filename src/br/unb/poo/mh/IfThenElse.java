package br.unb.poo.mh;

public class IfThenElse implements Expressao {
	Expressao condicao;
	Expressao clausulaThen;
	Expressao clausulaElse;
	
	public IfThenElse(Expressao condicao, Expressao clausulaThen, Expressao clausulaElse) {
		this.condicao = condicao;
		this.clausulaThen = clausulaThen;
		this.clausulaElse = clausulaElse;
	} 
	
	public Valor avaliar() {
		ValorBooleano valor = (ValorBooleano)condicao.avaliar();
		if(valor.getValor()) {
			return clausulaThen.avaliar();
		}
		return 			clausulaElse.avaliar();
	}

	@Override
	public Tipo tipo() {
		Tipo v1 = condicao.tipo();
		
		if (v1 != Tipo.Booleano) {
			return Tipo.Error;
		}
		Tipo v2 = clausulaThen.tipo();
		Tipo v3 = clausulaElse.tipo();
		
		return v2 == v3 ? v2 : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}