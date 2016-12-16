package br.unb.poo.mh;

import java.util.Vector;

public class NotacaoPolonesaReversa implements Visitor{

	private String str = new String();
	
	private int tamanho_lista = 0;
	
	public String getStr() {
		return str;
	}
	
	@Override
	public void visitar(ValorInteiro exp) {
		str = str + exp.getValor().toString();
	}

	@Override
	public void visitar(ValorBooleano exp) {
		str = str + exp.getValor().toString();
	}

	private void visitarBin(ExpressaoBinaria exp, String sim) {
		exp.expEsquerda.aceitar(this);
		str = str + " ";
		exp.expDireita.aceitar(this);
		str = str + " " + sim + " (" + 2 + ")";
	}
	
	@Override
	public void visitar(ExpressaoSoma exp) {
		visitarBin(exp, "+");
	}

	@Override
	public void visitar(ExpressaoSubtracao exp) {
		visitarBin(exp, "-");
	}
	
	@Override
	public void visitar(Multiplicacao exp) {
		visitarBin(exp, "*");
	}
	
	@Override
	public void visitar(ExpressaoDivisor exp) {
		visitarBin(exp, "/");
	}
	
	@Override
	public void visitar(ExpressaoAnd exp) {
		visitarBin(exp, "and");
	}
	
	@Override
	public void visitar(ExpressaoOr exp) {
		visitarBin(exp, "or");
	}

	@Override
	public void visitar(ExpressaoEqual exp) {
		visitarBin(exp, "==");
		
	}

	@Override
	public void visitar(ExpressaoGreaterThan exp) {
		visitarBin(exp, ">");
		
	}

	@Override
	public void visitar(ExpressaoLessThan exp) {
		visitarBin(exp, "<");
		
	}

	@Override
	public void visitar(ExpressaoGreaterOrEqual exp) {
		visitarBin(exp, ">=");
		
	}

	@Override
	public void visitar(ExpressaoLessOrEqual exp) {
		visitarBin(exp, "<=");
		
	}

	@Override
	public void visitar(IfThenElse exp) {
		exp.condicao.aceitar(this);
		str = str + " ";
		exp.clausulaThen.aceitar(this);
		str = str + " ";
		exp.clausulaElse.aceitar(this);
		str = str + " ifThenElse" + " (" + 3 + ")";
	}

	@Override
	public void visitar(AplicacaoFuncao exp) {
		int i = 0;
		while(i < exp.parametros.size()) {
			exp.parametros.get(i++).aceitar(this);
			str = str + " ";
		}
		str = str + exp.nome + " (" + exp.parametros.size() + ")";
	}

	@Override
	public void visitar(Identificador exp) {
		str = str + exp.id;
	}

	@Override
	public void visitar(ExpressaoNot exp) {
		exp.exp.aceitar(this);
		str = str + " not" + " (" + 1 + ")";
		
	}

	@Override
	public void visitar(Parentesis exp) {
		exp.exp.aceitar(this);
		
	}

	@Override
	public void visitar(Guarda exp) {
		exp.condicao.aceitar(this);
		str = str + " ";
		exp.clausula.aceitar(this);
		str = str + " | (2)";
	}

	@Override
	public void visitar(Guardas exp) {
		for (int i = 0; i < exp.opcoes.size() - 1; i++) {
			exp.opcoes.get(i).aceitar(this);
			str = str + "\n";
		}
		exp.opcoes.get(exp.opcoes.size() - 1).aceitar(this);
	}

	@Override
	public void visitar(ListaComValor listaComValor) {
		listaComValor.guard.aceitar(this);
		str = str + " ";
		tamanho_lista++;
		listaComValor.next.aceitar(this);
	}

	@Override
	public void visitar(ListaVazia listaVazia) {
		str = str + "[]" + " (" + tamanho_lista + ")";
		tamanho_lista = 0;
	}

	@Override
	public void visitar(ValorLista valorLista) {
		Vector<Valor> a = valorLista.getValor();
		
		for (int i = 0; i < a.size(); i++) {
			a.get(i).aceitar(this);
			str = str + " ";
		}
		str = str + "[]" + " (" + a.size() + ")";
	}

	@Override
	public void visitar(Concatenar concatenar) {
		visitarBin(concatenar, "++");
		
	}

	@Override
	public void visitar(GuardaFalsa guardaFalsa) {
		guardaFalsa.clausula.aceitar(this);
	}
}
