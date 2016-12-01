package br.unb.poo.mh;

/**
 * Tipo base que define as operacoes sobre 
 * expressoes. A partir desse tipo, a AST 
 * (abstract syntax tree) da linguagem eh 
 * definida. Para manipular a arvore, 
 * duas estrategias podem ser seguidas:
 * 
 *  (a) Interpreter: as operacoes que manipulam 
 *  sao definidas na propria AST (ex.: operacao 
 *  avaliar() segue o padrao de projeto interpreter).
 *  
 *  (b) Visitor: as operacoes que manipulam sao 
 *  definidas em uma hierarquia de classes externa 
 *  a AST. 
 * 
 * @author rbonifacio
 */
public interface Expressao {
	public Valor avaliar();
	
	//Apesar do codigo similar, ha uma diferença conceitual importante
	//entre a verificacao de tipos que decidiu-se implementar e a implementada pelo
	//professor
	
	//A verificacao de tipos busca casar o resultado com o padrao dado
	public Tipo tipo(Tipo padrao);
	//Se nenhum parametro e dado, entao o tipo eh Indefinido
	//ou seja nao pode ser erro porem nao ha nenhuma outra restricao
	public Tipo tipo();

	public void aceitar(Visitor v);
}
