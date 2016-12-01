package br.unb.poo.mh;

public class Identificador implements Expressao {
	String id;
	Tipo tipo_id; //TODO

	public Identificador(String id) {
		this.id = id;
	}
	
	public Valor avaliar() {
		Expressao exp = Ambiente.instance().getExpressao(id);
		return exp.avaliar();
	}

	@Override
	public Tipo tipo() {
		return Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
