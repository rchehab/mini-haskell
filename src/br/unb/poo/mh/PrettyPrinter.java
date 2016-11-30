package br.unb.poo.mh;

public class PrettyPrinter implements Visitor{

	@Override
	public void visitar(ValorInteiro exp) {
		System.out.print(exp.getValor());
	}

	@Override
	public void visitar(ValorBooleano exp) {
		System.out.print(exp.getValor());
	}

	private void visitarBin(ExpressaoBinaria exp, String sim) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print(sim);
		exp.expDireita.aceitar(this);
		System.out.print(")");
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
	public void visitar(IfThenElse exp) {
		System.out.print("if( ");
		exp.condicao.aceitar(this);
		System.out.println(")");
		
		System.out.print(" then ");
		exp.clausulaThen.aceitar(this);
		
		System.out.println(" else " );
		exp.clausulaElse.aceitar(this);
	}

	@Override
	public void visitar(AplicacaoFuncao exp) {
		System.out.print(exp.nome);
		System.out.print("(");
		int i = 0;
		while(i < exp.parametros.size() - 1) {
			exp.parametros.get(i++).aceitar(this);
			System.out.print(",");
		}
		if(i == exp.parametros.size() - 1) {
			exp.parametros.get(i++).aceitar(this);
		}
		System.out.println(")");
	}

	@Override
	public void visitar(Identificador exp) {
		System.out.println(exp.id);
	}
}
