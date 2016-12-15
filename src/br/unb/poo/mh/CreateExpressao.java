package br.unb.poo.mh;

import java.util.Vector;

public class CreateExpressao implements Visitor2 {
	
	private static Vector<String> divide(String f) {
		Vector<String> str = new Vector<String>();
		int par = 0;
		int min = 0;
		int i;
		for (i = 0; i < f.length(); i++) {
			if (f.charAt(i) == '(') {
				par++;
			}
			if (f.charAt(i) == ')') {
				par--;
			}
			if (par == 0 && f.charAt(i) == ',') {
				str.add(f.substring(min, i));
				//System.out.println("DIV");
				//System.out.println(f.substring(min, i));
				min = i + 2;
				i = min;
			}
		}
		if (par == 0) {
			str.add(f.substring(min, i));
			//System.out.println(f.substring(min, i));
			min = i + 2;
			i = min;
		}
		return str;
	}

	public static String getName(String f) {
		String str = f.split("\\(")[0];
		int min = str.length() + 1;
		int max = f.length() - 1;
		
		if (!str.contentEquals("Name"))
			return null;
		
		String a = f.substring(min, max);
		return a;
	}
	
	public Expressao choose(String s) {
		String str = s.split("\\(")[0];

		int min = str.length() + 1;
		int max = s.length() - 1;
		
		String f = s.substring(min, max);

		//System.out.println("CHO");
		//System.out.println(str);
		//System.out.println(f);
		
		switch (str) {
		case "ValorInteiro":
		{
			ValorInteiro e = null;
			e = visitar(e, f);
			return e;
		}
		case "ValorBooleano":
		{
			ValorBooleano e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoSoma":
		{
			ExpressaoSoma e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoSubtracao":
		{
			ExpressaoSubtracao e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoDivisor":
		{
			ExpressaoDivisor e = null;
			e = visitar(e, f);
			return e;
		}
		case "Multiplicacao":
		{
			Multiplicacao e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoAnd":
		{
			ExpressaoAnd e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoOr":
		{
			ExpressaoOr e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoEqual":
		{
			ExpressaoEqual e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoGreaterThan":
		{
			ExpressaoGreaterThan e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoLessThan":
		{
			ExpressaoLessThan e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoGreaterOrEqual":
		{
			ExpressaoGreaterOrEqual e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoLessOrEqual":
		{
			ExpressaoLessOrEqual e = null;
			e = visitar(e, f);
			return e;
		}
		case "IfThenElse":
		{
			IfThenElse e = null;
			e = visitar(e, f);
			return e;
		}
		case "Identificador":
		{
			Identificador e = null;
			e = visitar(e, f);
			return e;
		}
		case "ExpressaoNot":
		{
			ExpressaoNot e = null;
			e = visitar(e, f);
			return e;
		}
		case "AplicacaoFuncao":
		{
			AplicacaoFuncao e = null;
			e = visitar(e, f);
			return e;
		}
		case "Parentesis":
		{
			Parentesis e = null;
			e = visitar(e, f);
			return e;
		}
		case "Guarda":
		{
			Guarda e = null;
			e = visitar(e, f);
			return e;
		}
		case "Guardas":
		{
			Guardas e = null;
			e = visitar(e, f);
			return e;
		}
		}
		System.out.println("Error");
		return null;
	}
	
	
	public DeclaracaoFuncao choose2(String s) {
		String str = s.split("\\(")[0];

		int min = str.length() + 1;
		int max = s.length() - 1;
		
		String f = s.substring(min, max);
		
		Vector<String> a = divide(f);
		Vector<String> res = new Vector<String>();
		
		String nome = getName(a.get(0));
		
		for (int i = 1; i < a.size() - 1; i++) {
			String b = getName(a.get(i));
			res.add(b);
		}
		Expressao e = choose(a.get(a.size() - 1));
		
		return new DeclaracaoFuncao(nome, res, e);
	}
	
	/*Done*/
	public ValorInteiro visitar(ValorInteiro exp, String f) {
		exp = new ValorInteiro(Integer.parseInt(f));
		return exp;
	}

	/*Done*/
	public ValorBooleano visitar(ValorBooleano exp, String f) {
		exp = new ValorBooleano(Boolean.parseBoolean(f));
		return exp;
	}

	/*Done*/
	public ExpressaoSoma visitar(ExpressaoSoma exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoSoma(a, b);
		 return exp;
	}
	
	
	
	/*Done*/
	public ExpressaoSubtracao visitar(ExpressaoSubtracao exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoSubtracao(a, b);
		 return exp;
	}
	
	/*Done*/
	public ExpressaoDivisor visitar(ExpressaoDivisor exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoDivisor(a, b);
		 return exp;
	}
	
	public Multiplicacao visitar(Multiplicacao exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new Multiplicacao(a, b);
		 return exp;
	}
	
	public ExpressaoAnd visitar(ExpressaoAnd exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoAnd(a, b);
		 return exp;
	}
	
	public ExpressaoOr visitar(ExpressaoOr exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoOr(a, b);
		 return exp;
	}
	
	public ExpressaoEqual visitar(ExpressaoEqual exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoEqual(a, b);
		 return exp;
	}
	
	public ExpressaoGreaterThan visitar(ExpressaoGreaterThan exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoGreaterThan(a, b);
		 return exp;
	}
	
	public ExpressaoLessThan visitar(ExpressaoLessThan exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoLessThan(a, b);
		 return exp;
	}
	
	public ExpressaoGreaterOrEqual visitar(ExpressaoGreaterOrEqual exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoGreaterOrEqual(a, b);
		 return exp;
	}
	
	public ExpressaoLessOrEqual visitar(ExpressaoLessOrEqual exp, String f) {
		
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoLessOrEqual(a, b);
		 return exp;
	}
	
	public IfThenElse visitar(IfThenElse exp, String f) {
		Vector<String> str = divide(f);

		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		Expressao c = choose(str.get(2));
		 
		 exp = new IfThenElse(a, b, c);
		 return exp;
	}
	
	public Identificador visitar(Identificador exp, String f) {
		 
		 exp = new Identificador(f);
		 return exp;
	}
	
	public ExpressaoNot visitar(ExpressaoNot exp, String f) {
		
		Expressao a = choose(f);
		 
		 exp = new ExpressaoNot(a);
		 return exp;
	}
	
	public Parentesis visitar(Parentesis exp, String f) {
		
		Expressao a = choose(f);
		 
		 exp = new Parentesis(a);
		 return exp;
	}
	
	public AplicacaoFuncao visitar(AplicacaoFuncao exp, String f) {
		Vector<String> str = divide(f);
		Vector<Expressao> exp2 = new Vector<Expressao>();
		 
		for (int i = 1; i < str.size(); i++) {
			exp2.add(choose(str.get(i)));
		}
		
		 exp = new AplicacaoFuncao(getName(str.get(0)), exp2);
		 return exp;
	}
	
	public Guarda visitar(Guarda exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new Guarda(a, b);
		 return exp;
	}
	
	public Guardas visitar(Guardas exp, String f) {
		Vector<String> str = divide(f);
		Vector<Guarda> exp2 = new Vector<Guarda>();
		 
		for (int i = 0; i < str.size(); i++) {
			exp2.add((Guarda) choose(str.get(i)));
		}
		
		 exp = new Guardas(exp2);
		 return exp;
	}
}
