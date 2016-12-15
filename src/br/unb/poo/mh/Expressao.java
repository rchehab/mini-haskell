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
	//A funcao retorna Tipo e nao bool, porque em expressoes com retorno generico (if then else)
	//o resultado pode ser usado para instanciar outros identificadores
	
	//Essa diferenca possui vantagens na analise de DECLARACOES de funcao, porem nao possui nenhuma
	//vantagem em tempo de execucao.
	//OBS: A VERIFICACAO DE TIPO NO MOMENTO DA DECLARACAO DE FUNCAO AINDA NAO FOI IMPLEMENTADA,
	//JA QUE REQUER DIVERSAS ALTERACOES NA ESTRUTURA DADA PELO PROFESSOR
	public Tipo tipo(Tipo padrao);
	
	//tipo() = tipo(Tipo.Indefinido);

	public void aceitar(Visitor v);
	public void aceitar(Visitor2 v, String f);
}
