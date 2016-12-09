package br.unb.poo.mh;

public class ExpressaoOr extends ExpressaoBinaria {

	public ExpressaoOr(Expressao expEsquerda, Expressao expDireita) {
		super(expEsquerda, expDireita);
	}

	@Override
	public Valor avaliar() {
		ValorBooleano v1 = (ValorBooleano) expEsquerda.avaliar();
		ValorBooleano v2 = (ValorBooleano) expDireita.avaliar();
		
		return new ValorBooleano(v1.getValor() || v2.getValor());
		
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret =  (expEsquerda.tipo(Tipo.Booleano) == Tipo.Booleano && expDireita.tipo(Tipo.Booleano) == Tipo.Booleano) ? Tipo.Booleano : Tipo.Error;
		
		return (ret == padrao || padrao == Tipo.Indefinido) ? ret : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
	
}