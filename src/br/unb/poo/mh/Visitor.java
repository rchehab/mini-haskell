package br.unb.poo.mh;

/**
 * Interface com a declaracao dos metodos que 
 * "visitam" aplicando alguma operacao sobre 
 * os elementos sintaticos de uma linguagem 
 * de programacao. 
 * @author rbonifacio
 *
 */
public interface Visitor {
	public void visitar(ValorInteiro exp);
	public void visitar(ValorBooleano exp);
	public void visitar(ExpressaoSoma exp);
	public void visitar(Multiplicacao exp);
	public void visitar(IfThenElse exp);
	public void visitar(AplicacaoFuncao exp);
	public void visitar(Identificador exp);
	public void visitar(ExpressaoAnd exp);
	public void visitar(ExpressaoOr exp);
	public void visitar(ExpressaoDivisor exp);
	public void visitar(ExpressaoSubtracao exp);
	public void visitar(ExpressaoEqual exp);
	public void visitar(ExpressaoGreaterThan exp);
	public void visitar(ExpressaoLessThan exp);
	public void visitar(ExpressaoGreaterOrEqual exp);
	public void visitar(ExpressaoLessOrEqual exp);
	public void visitar(ExpressaoNot exp);
	public void visitar(Parentesis exp);
	public void visitar(Guarda guarda);
	public void visitar(Guardas guarda);
}
