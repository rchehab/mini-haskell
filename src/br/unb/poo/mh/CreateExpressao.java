package br.unb.poo.mh;

public class CreateExpressao{

	private Expressao exp;
	
	public CreateExpressao () {
		exp = null;
	}
	
	public Expressao getExp() {
		return exp;
	}
	//Concertar
	public Expressao choose(String s) {
		String str = s.split("\\(")[0];
		String str2 = s.split("\\)")[0];
		
		String f;
		
		if (str.length() < str2.length()) {
			f = str;
		} else {
			f = str2;
		}
		String o = s.substring(f.length() + 1);
		
		System.out.println(f);
		System.out.println(o);
		
		switch (f) {
		case "ValorInteiro":
		{
			ValorInteiro e = null;
			visitar(e, o);
			return e;
		}
		case "ValorBooleano":
		{
			ValorBooleano e = null;
			visitar(e, o);
			return e;
		}
		case "ExpressaoSoma":
		{
			ExpressaoSoma e = null;
			visitar(e, o);
			return e;
		}
		}
		System.out.println("Error");
		return null;
	}
	
	public void visitar(ValorInteiro exp, String f) {
		String str = f.split("\\(")[0];
		String str2 = f.split("\\)")[0];
		
		String s;
		
		if (str.length() < str2.length()) {
			s = str;
		} else {
			s = str2;
		}
		exp = new ValorInteiro(Integer.parseInt(s));
	}

	public void visitar(ValorBooleano exp, String f) {
		String str = f.split("\\(")[0];
		String str2 = f.split("\\)")[0];
		
		String s;
		
		if (str.length() < str2.length()) {
			s = str;
		} else {
			s = str2;
		}
		exp = new ValorBooleano(Boolean.parseBoolean(s));
	}
	
	public void visitar(ExpressaoSoma exp, String f) {
		String str = f.split("\\(")[0];
		String str2 = f.split("\\)")[0];
		
		String s;
		
		if (str.length() < str2.length()) {
			s = str;
		} else {
			s = str2;
		}

		String o = f.substring(s.length() + 1);
		
		System.out.println(s);
		System.out.println(o);
		
		Expressao a = choose(f);
		Expressao b = choose(o);
		 
		 exp = new ExpressaoSoma(a, b);
	}
	
/*	@Override
	public void visitar(ExpressaoSubtracao exp) {
		visitarBin(exp);
	}
	
	@Override
	public void visitar(ExpressaoDivisor exp) {
		visitarBin(exp);
	}

	@Override
	public void visitar(Multiplicacao exp) {
		visitarBin(exp);
	}

	@Override
	public void visitar(ExpressaoAnd exp) {
		visitarBin(exp);
	}

	@Override
	public void visitar(ExpressaoOr exp) {
		visitarBin(exp);
	}

	@Override
	public void visitar(ExpressaoEqual exp) {
		visitarBin(exp);
		
	}

	@Override
	public void visitar(ExpressaoGreaterThan exp) {
		visitarBin(exp);
		
	}

	@Override
	public void visitar(ExpressaoLessThan exp) {
		visitarBin(exp);
		
	}

	@Override
	public void visitar(ExpressaoGreaterOrEqual exp) {
		visitarBin(exp);
		
	}

	@Override
	public void visitar(ExpressaoLessOrEqual exp) {
		visitarBin(exp);
		
	}

	@Override
	public void visitar(IfThenElse exp) {
		exp.condicao.aceitar(this);
		exp.clausulaThen.aceitar(this);
		exp.clausulaElse.aceitar(this);
		tamanho += 1;
	}

	@Override
	public void visitar(AplicacaoFuncao exp) {
		exp.parametros.stream().forEach(p -> { p.aceitar(this); });
		tamanho += 1;
		
//		for(Expressao p: exp.parametros) {
//			p.aceitar(this);
//		}
	}

	@Override
	public void visitar(Identificador exp) {
		tamanho += 1;
	}

	@Override
	public void visitar(ExpressaoNot exp) {
		tamanho += 1;
		exp.exp.aceitar(this);
		
		
	}*/
}
