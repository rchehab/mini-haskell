package br.unb.poo.mh;

public class Identificador implements Expressao {
	String id;
	Tipo tipo_id;

	public Identificador(String id) {
		this.id = id;
		tipo_id = Tipo.Indefinido;
	}
	
	public Valor avaliar() {
		Expressao exp = Ambiente.instance().getExpressao(id);
		return exp.avaliar();
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		Tipo ret = tipo_id;
		
		return tipo_id = (ret == padrao || padrao == Tipo.Indefinido) ? ret : Tipo.Error;
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
