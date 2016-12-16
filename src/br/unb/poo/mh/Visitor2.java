package br.unb.poo.mh;


public interface Visitor2 {
	public Expressao visitar(ValorInteiro exp, String f);
	public Expressao visitar(ValorBooleano exp, String f);
	public Expressao visitar(ExpressaoSoma exp, String f);
	public Expressao visitar(Multiplicacao exp, String f);
	public Expressao visitar(IfThenElse exp, String f);
	public Expressao visitar(AplicacaoFuncao exp, String f);
	public Expressao visitar(Identificador exp, String f);
	public Expressao visitar(ExpressaoAnd exp, String f);
	public Expressao visitar(ExpressaoOr exp, String f);
	public Expressao visitar(ExpressaoDivisor exp, String f);
	public Expressao visitar(ExpressaoSubtracao exp, String f);
	public Expressao visitar(ExpressaoEqual exp, String f);
	public Expressao visitar(ExpressaoGreaterThan exp, String f);
	public Expressao visitar(ExpressaoLessThan exp, String f);
	public Expressao visitar(ExpressaoGreaterOrEqual exp, String f);
	public Expressao visitar(ExpressaoLessOrEqual exp, String f);
	public Expressao visitar(ExpressaoNot exp, String f);
	public Expressao visitar(Parentesis exp, String f);
	public Expressao visitar(Guarda guarda, String f);
	public Expressao visitar(Guardas guarda, String f);
	public Expressao visitar(ListaComValor listaComValor, String f);
	public Expressao visitar(ListaVazia listaVazia, String f);
	public Expressao visitar(ValorLista valorLista, String f);
	public Expressao visitar(Concatenar concatenar, String f);
}
