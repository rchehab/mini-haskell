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
		Tipo ret;
		
		if (!Ambiente.instance().is_executing()) { //Declaracao da funcao
			
			if (tipo_id == Tipo.Indefinido) {
				tipo_id = padrao;
			}
			ret = tipo_id;
			
			tipo_id = (ret == padrao || padrao == Tipo.Indefinido) ? ret : Tipo.Error;
		} else {
			Expressao exp = Ambiente.instance().getExpressao(id);
			ret = exp.tipo(padrao);
		}
		
		return (ret == padrao || padrao == Tipo.Indefinido) ? ret : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
