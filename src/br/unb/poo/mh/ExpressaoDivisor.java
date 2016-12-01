package br.unb.poo.mh;

public class ExpressaoDivisor extends ExpressaoBinaria{

	public ExpressaoDivisor(Expressao expDireita, Expressao expEsquerda) {
		super(expDireita, expEsquerda);
	}

	@Override
	public Valor avaliar() {
		ValorInteiro ve = (ValorInteiro)expEsquerda.avaliar();
		ValorInteiro vd = (ValorInteiro)expDireita.avaliar();
		
		return new ValorInteiro(ve.getValor() / vd.getValor());
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret = (expEsquerda.tipo(Tipo.Inteiro) == Tipo.Inteiro && expDireita.tipo(Tipo.Inteiro) == Tipo.Inteiro) ? Tipo.Inteiro : Tipo.Error;
		
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