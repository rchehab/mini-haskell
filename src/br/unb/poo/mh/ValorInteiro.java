package br.unb.poo.mh;

public class ValorInteiro extends ValorParametrizado<Integer> {

	public ValorInteiro(Integer valor) {
		super(valor);
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret = Tipo.Inteiro;
		
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
