package br.unb.poo.mh;

public class CreateExpressao{

	public static Expressao choose(String s) {
		String str = s.split("\\(")[0];

		int min = str.length() + 1;
		int par = 1;
		int i;
		
		for (i = min; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				par++;
			}
			if (s.charAt(i) == ')') {
				par--;
			}
			if (par == 0)
				break;
		}
		int max = i;
		
		String f = s.substring(min, max);
		
		System.out.println(str);
		System.out.println(f);
		
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
		}
		System.out.println("Error");
		return null;
	}
	
	public static ValorInteiro visitar(ValorInteiro exp, String f) {
		exp = new ValorInteiro(Integer.parseInt(f));
		return exp;
	}

	public static ValorBooleano visitar(ValorBooleano exp, String f) {
		exp = new ValorBooleano(Boolean.parseBoolean(f));
		return exp;
	}
	
	public static ExpressaoSoma visitar(ExpressaoSoma exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoSoma(a, b);
		 return exp;
	}
	
	public static ExpressaoSubtracao visitar(ExpressaoSubtracao exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoSubtracao(a, b);
		 return exp;
	}
	
	public static ExpressaoDivisor visitar(ExpressaoDivisor exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoDivisor(a, b);
		 return exp;
	}
	
	//TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO
	public static Multiplicacao visitar(Multiplicacao exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new Multiplicacao(a, b);
		 return exp;
	}
	
	public static ExpressaoAnd visitar(ExpressaoAnd exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoAnd(a, b);
		 return exp;
	}
	
	public static ExpressaoOr visitar(ExpressaoOr exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoOr(a, b);
		 return exp;
	}
	
	public static ExpressaoEqual visitar(ExpressaoEqual exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoEqual(a, b);
		 return exp;
	}
	
	public static ExpressaoGreaterThan visitar(ExpressaoGreaterThan exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoGreaterThan(a, b);
		 return exp;
	}
	
	public static ExpressaoLessThan visitar(ExpressaoLessThan exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoLessThan(a, b);
		 return exp;
	}
	
	public static ExpressaoGreaterOrEqual visitar(ExpressaoGreaterOrEqual exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoGreaterOrEqual(a, b);
		 return exp;
	}
	
	public static ExpressaoLessOrEqual visitar(ExpressaoLessOrEqual exp, String f) {
		int i;
		int par = 0;
		System.out.println(10);
		
		String[] str = new String[2];
		int last = 0;
		int min = 0;
		
		for (i = 0; i < f.length(); i++) {
			if (f.charAt(i) == '(') {
				par++;
			}
			if (f.charAt(i) == ')') {
				par--;
			}
			if (par == 0 && f.charAt(i) == ',') {
				str[last] = f.substring(min, i);
				min = i + 2;
			}
		}
		System.out.println(str[0]);
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		 
		 exp = new ExpressaoLessOrEqual(a, b);
		 return exp;
	}
	
	//TODO TODO TODO TODO TODO TODO TODO TODO TODO
	public static IfThenElse visitar(IfThenElse exp, String f) {
		String str[] = f.split(",");
		
		Expressao a = choose(str[0]);
		Expressao b = choose(str[1].substring(1, str[1].length()));
		Expressao c = choose(str[2].substring(1, str[2].length()));
		 
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
/*

	@Override
	public void visitar(AplicacaoFuncao exp) {
		exp.parametros.stream().forEach(p -> { p.aceitar(this); });
		tamanho += 1;
		
//		for(Expressao p: exp.parametros) {
//			p.aceitar(this);
//		}
	}
	*/
}
