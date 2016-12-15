package br.unb.poo.mh;

public class PrettyPrinter implements Visitor{

	private String str = new String();
	
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
		str = str + "(";
		exp.expEsquerda.aceitar(this);
		str = str + " " + sim + " ";
		exp.expDireita.aceitar(this);
		str = str + ")";
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
		str = str + "if(";
		exp.condicao.aceitar(this);
		str = str + ")";
		
		str = str + " then { ";
		exp.clausulaThen.aceitar(this);
		
		str = str + " } else { " ;
		exp.clausulaElse.aceitar(this);
		str = str + " }" ;
	}

	@Override
	public void visitar(AplicacaoFuncao exp) {
		str = str + exp.nome;
		str = str + "(";
		int i = 0;
		while(i < exp.parametros.size() - 1) {
			exp.parametros.get(i++).aceitar(this);
			str = str + ", ";
		}
		if(i == exp.parametros.size() - 1) {
			exp.parametros.get(i++).aceitar(this);
		}
		str = str + ")";
	}

	@Override
	public void visitar(Identificador exp) {
		str = str + exp.id;
	}

	@Override
	public void visitar(ExpressaoNot exp) {
		str = str + "not ";
		exp.exp.aceitar(this);
		
		
	}

	@Override
	public void visitar(Parentesis exp) {
		str = str + "( ";
		exp.exp.aceitar(this);
		str = str + " )";
		
	}

	@Override
	public void visitar(Guarda exp) {
		str = str + "| ";
		exp.condicao.aceitar(this);
		str = str + " =";
		exp.clausula.aceitar(this);
		str = str + "\n";
	}

	@Override
	public void visitar(Guardas exp) {
		for (int i = 0; i < exp.opcoes.size(); i++) {
			exp.opcoes.get(i).aceitar(this);
		}
	}
}
