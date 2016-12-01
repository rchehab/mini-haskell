package br.unb.poo.mh;

public class Identificador implements Expressao {
	String id;
	Tipo tipo_id; //TODO TODO TODO TODO //TODO TODO TODO TODO //TODO TODO TODO TODO //TODO TODO TODO TODO //TODO TODO TODO TODO

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
		Expressao exp = Ambiente.instance().getExpressao(id);
		Tipo ret = exp.tipo(padrao);
		
		return tipo_id = (ret == padrao || padrao == Tipo.Indefinido) ? ret : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
