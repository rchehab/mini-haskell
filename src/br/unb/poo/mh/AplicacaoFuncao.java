package br.unb.poo.mh;

import java.util.List;
import java.util.Vector;

/**
 * Corresponde a uma expressao do tipo 
 * aplicacao de funcao. 
 * 
 * @author rbonifacio
 */
public class AplicacaoFuncao implements Expressao {
	
	String nome;
	List<Expressao> parametros;

	public AplicacaoFuncao(String nome, List<Expressao> parametros) {
		this.nome = nome;
		this.parametros = parametros;
	}

	@Override
	public Valor avaliar() {
		DeclaracaoFuncao dec = Ambiente.instance().getDeclaracaoFuncao(nome, parametros.size());
		
		Vector<Expressao> pmt_li = new Vector<Expressao>();
		
		//Esse loop acaba com a avaliacao preguicosa
		//Essa mudanca foi feita para permitir recursao
		//Se o argumento nao for avaliado antes de usar empilha(),
		//pode ocorrer do valor de um identificador depender dele
		//mesmo gerando loop infinito
		for(int i = 0; i < dec.getArgs().size(); i++) {
			Expressao pmt = parametros.get(i);
			pmt_li.add(pmt.avaliar());
		}
		
		Ambiente.instance().empilha();
		
		for(int i = 0; i < dec.getArgs().size(); i++) {
			String arg = dec.getArgs().get(i);
			
			Ambiente.instance().associaExpressao(arg, pmt_li.get(i));
		}
		Valor res = dec.getCorpo().avaliar();
		Ambiente.instance().desempilha();
		
		return res;
	}

	@Override
	public Tipo tipo(Tipo padrao) {
		DeclaracaoFuncao dec = Ambiente.instance().getDeclaracaoFuncao(nome, parametros.size());

		Ambiente.instance().empilha();
		
		for(int i = 0; i < dec.getArgs().size(); i++) {
			String arg = dec.getArgs().get(i);
			Expressao pmt = parametros.get(i);
			
			Ambiente.instance().associaExpressao(arg, pmt);
		}
		//Tipo ret = dec.getCorpo().tipo(Tipo.Indefinido);
		  Tipo ret = dec.tipo(padrao);
		Ambiente.instance().desempilha();
		
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
