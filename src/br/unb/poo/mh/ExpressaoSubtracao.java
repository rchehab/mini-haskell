package br.unb.poo.mh;

public class ExpressaoSubtracao extends ExpressaoBinaria{

	public ExpressaoSubtracao(Expressao expEsquerda, Expressao expDireita) {
		super(expEsquerda, expDireita);
	}

	@Override
	public Valor avaliar() {
		ValorInteiro ve = (ValorInteiro)expEsquerda.avaliar();
		ValorInteiro vd = (ValorInteiro)expDireita.avaliar();
		
		return new ValorInteiro(ve.getValor() - vd.getValor());
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret = (expEsquerda.tipo(Tipo.Inteiro) == Tipo.Inteiro && expDireita.tipo(Tipo.Inteiro) == Tipo.Inteiro) ? Tipo.Inteiro : Tipo.Error;
		
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
