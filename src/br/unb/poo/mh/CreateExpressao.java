package br.unb.poo.mh;

import java.util.Vector;

public class CreateExpressao{
	
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
	
	public static Expressao choose(String s) {
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
		}
		System.out.println("Error");
		return null;
	}
	
	
	public static DeclaracaoFuncao choose2(String s) {
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
	public static ValorInteiro visitar(ValorInteiro exp, String f) {
		exp = new ValorInteiro(Integer.parseInt(f));
		return exp;
	}

	/*Done*/
	public static ValorBooleano visitar(ValorBooleano exp, String f) {
		exp = new ValorBooleano(Boolean.parseBoolean(f));
		return exp;
	}

	/*Done*/
	public static ExpressaoSoma visitar(ExpressaoSoma exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoSoma(a, b);
		 return exp;
	}
	
	
	
	/*Done*/
	public static ExpressaoSubtracao visitar(ExpressaoSubtracao exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoSubtracao(a, b);
		 return exp;
	}
	
	/*Done*/
	public static ExpressaoDivisor visitar(ExpressaoDivisor exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoDivisor(a, b);
		 return exp;
	}
	
	public static Multiplicacao visitar(Multiplicacao exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new Multiplicacao(a, b);
		 return exp;
	}
	
	public static ExpressaoAnd visitar(ExpressaoAnd exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoAnd(a, b);
		 return exp;
	}
	
	public static ExpressaoOr visitar(ExpressaoOr exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoOr(a, b);
		 return exp;
	}
	
	public static ExpressaoEqual visitar(ExpressaoEqual exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoEqual(a, b);
		 return exp;
	}
	
	public static ExpressaoGreaterThan visitar(ExpressaoGreaterThan exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoGreaterThan(a, b);
		 return exp;
	}
	
	public static ExpressaoLessThan visitar(ExpressaoLessThan exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoLessThan(a, b);
		 return exp;
	}
	
	public static ExpressaoGreaterOrEqual visitar(ExpressaoGreaterOrEqual exp, String f) {
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoGreaterOrEqual(a, b);
		 return exp;
	}
	
	public static ExpressaoLessOrEqual visitar(ExpressaoLessOrEqual exp, String f) {
		
		Vector<String> str = divide(f);
		
		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		 
		 exp = new ExpressaoLessOrEqual(a, b);
		 return exp;
	}
	
	public static IfThenElse visitar(IfThenElse exp, String f) {
		Vector<String> str = divide(f);

		Expressao a = choose(str.get(0));
		Expressao b = choose(str.get(1));
		Expressao c = choose(str.get(2));
		 
		 exp = new IfThenElse(a, b, c);
		 return exp;
	}
	
	public static Identificador visitar(Identificador exp, String f) {
		 
		 exp = new Identificador(f);
		 return exp;
	}
	
	public static ExpressaoNot visitar(ExpressaoNot exp, String f) {
		
		Expressao a = choose(f);
		 
		 exp = new ExpressaoNot(a);
		 return exp;
	}
	
	public static Parentesis visitar(Parentesis exp, String f) {
		
		Expressao a = choose(f);
		 
		 exp = new Parentesis(a);
		 return exp;
	}
	
	public static AplicacaoFuncao visitar(AplicacaoFuncao exp, String f) {
		Vector<String> str = divide(f);
		Vector<Expressao> exp2 = new Vector<Expressao>();
		 
		for (int i = 1; i < str.size(); i++) {
			exp2.add(choose(str.get(i)));
		}
		
		 exp = new AplicacaoFuncao(getName(str.get(0)), exp2);
		 return exp;
	}
}
