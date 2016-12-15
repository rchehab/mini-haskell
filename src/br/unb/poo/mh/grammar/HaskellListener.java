// Generated from Haskell.g4 by ANTLR 4.5.3

package br.unb.poo.mh.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellParser}.
 */
public interface HaskellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaskellParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HaskellParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HaskellParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoOr}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoOr(HaskellParser.ExpressaoOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoOr}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoOr(HaskellParser.ExpressaoOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoAnd}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAnd(HaskellParser.ExpressaoAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoAnd}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAnd(HaskellParser.ExpressaoAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoNot}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoNot(HaskellParser.ExpressaoNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoNot}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoNot(HaskellParser.ExpressaoNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoEqual}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoEqual(HaskellParser.ExpressaoEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoEqual}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoEqual(HaskellParser.ExpressaoEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoLessThan}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLessThan(HaskellParser.ExpressaoLessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoLessThan}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLessThan(HaskellParser.ExpressaoLessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoGreaterThan}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoGreaterThan(HaskellParser.ExpressaoGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoGreaterThan}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoGreaterThan(HaskellParser.ExpressaoGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoLessOrEqual}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLessOrEqual(HaskellParser.ExpressaoLessOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoLessOrEqual}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLessOrEqual(HaskellParser.ExpressaoLessOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoGreaterOrEqual}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoGreaterOrEqual(HaskellParser.ExpressaoGreaterOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoGreaterOrEqual}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoGreaterOrEqual(HaskellParser.ExpressaoGreaterOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoSubtracao}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoSubtracao(HaskellParser.ExpressaoSubtracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoSubtracao}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoSubtracao(HaskellParser.ExpressaoSubtracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoSoma}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoSoma(HaskellParser.ExpressaoSomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoSoma}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoSoma(HaskellParser.ExpressaoSomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expressaoDivisor}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoDivisor(HaskellParser.ExpressaoDivisorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expressaoDivisor}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoDivisor(HaskellParser.ExpressaoDivisorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(HaskellParser.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(HaskellParser.MultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(HaskellParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(HaskellParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#aplicacaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterAplicacaoFuncao(HaskellParser.AplicacaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#aplicacaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitAplicacaoFuncao(HaskellParser.AplicacaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#parentesis}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(HaskellParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#parentesis}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(HaskellParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#valorInteiro}.
	 * @param ctx the parse tree
	 */
	void enterValorInteiro(HaskellParser.ValorInteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#valorInteiro}.
	 * @param ctx the parse tree
	 */
	void exitValorInteiro(HaskellParser.ValorInteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#valorBooleano}.
	 * @param ctx the parse tree
	 */
	void enterValorBooleano(HaskellParser.ValorBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#valorBooleano}.
	 * @param ctx the parse tree
	 */
	void exitValorBooleano(HaskellParser.ValorBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HaskellParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HaskellParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(HaskellParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(HaskellParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(HaskellParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(HaskellParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#testeGuarda}.
	 * @param ctx the parse tree
	 */
	void enterTesteGuarda(HaskellParser.TesteGuardaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#testeGuarda}.
	 * @param ctx the parse tree
	 */
	void exitTesteGuarda(HaskellParser.TesteGuardaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#guardaFalsa}.
	 * @param ctx the parse tree
	 */
	void enterGuardaFalsa(HaskellParser.GuardaFalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#guardaFalsa}.
	 * @param ctx the parse tree
	 */
	void exitGuardaFalsa(HaskellParser.GuardaFalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#guardas}.
	 * @param ctx the parse tree
	 */
	void enterGuardas(HaskellParser.GuardasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#guardas}.
	 * @param ctx the parse tree
	 */
	void exitGuardas(HaskellParser.GuardasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#guarda}.
	 * @param ctx the parse tree
	 */
	void enterGuarda(HaskellParser.GuardaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#guarda}.
	 * @param ctx the parse tree
	 */
	void exitGuarda(HaskellParser.GuardaContext ctx);
}