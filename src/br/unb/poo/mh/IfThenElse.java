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
	public Tipo tipo(Tipo padrao) {
		Tipo v1 = condicao.tipo(Tipo.Booleano);
		Tipo v2 = clausulaThen.tipo(Tipo.Indefinido);
		Tipo v3 = clausulaElse.tipo(v2);
		v2 = clausulaThen.tipo(v3); //Pode ser necessario para tipar identificadores
		
		Tipo ret = (v1 == Tipo.Booleano && v2 == v3) ? v2 : Tipo.Error;
		
		return (ret == padrao || padrao == Tipo.Indefinido) ? ret : Tipo.Error;
	}
	
	@Override
	public Tipo tipo() {
		return tipo(Tipo.Indefinido);
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}