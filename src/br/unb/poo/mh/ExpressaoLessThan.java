package br.unb.poo.mh;

public class ExpressaoLessThan extends ExpressaoBinaria {

	public ExpressaoLessThan(Expressao expEsquerda, Expressao expDireita) {
		super(expEsquerda, expDireita);
	}

	@Override
	public Valor avaliar() {
		ValorInteiro v1 = (ValorInteiro) expEsquerda.avaliar();
		ValorInteiro v2 = (ValorInteiro) expDireita.avaliar();
		
		return new ValorBooleano(v1.getValor() < v2.getValor());
		
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret = (expEsquerda.tipo(Tipo.Inteiro) == Tipo.Inteiro && expDireita.tipo(Tipo.Inteiro) == Tipo.Inteiro) ? Tipo.Booleano : Tipo.Error;
		
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
