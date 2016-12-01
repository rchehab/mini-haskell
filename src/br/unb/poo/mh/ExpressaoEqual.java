package br.unb.poo.mh;

public class ExpressaoEqual extends ExpressaoBinaria {

	public ExpressaoEqual(Expressao expDireita, Expressao expEsquerda) {
		super(expDireita, expEsquerda);
	}

	@Override
	public Valor avaliar() {
		ValorInteiro v1 = (ValorInteiro) expEsquerda.avaliar();
		ValorInteiro v2 = (ValorInteiro) expDireita.avaliar();
		
		return new ValorBooleano(v1.getValor() == v2.getValor());
		
	}

	@Override
	public Tipo tipo() {
		return (expEsquerda.tipo() == Tipo.Inteiro && expDireita.tipo() == Tipo.Inteiro) ? Tipo.Booleano : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
