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
	 * Enter a parse tree produced by the {@code DeclaracaoFuncao}
	 * labeled alternative in {@link HaskellParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(HaskellParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoFuncao}
	 * labeled alternative in {@link HaskellParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(HaskellParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(HaskellParser.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(HaskellParser.MultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqual(HaskellParser.LessOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqual(HaskellParser.LessOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AplicacaoFuncao}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterAplicacaoFuncao(HaskellParser.AplicacaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AplicacaoFuncao}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitAplicacaoFuncao(HaskellParser.AplicacaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterOr(HaskellParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitOr(HaskellParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqual(HaskellParser.GreaterOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqual(HaskellParser.GreaterOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Booleano}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(HaskellParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Booleano}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(HaskellParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtracao}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterSubtracao(HaskellParser.SubtracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtracao}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitSubtracao(HaskellParser.SubtracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterNot(HaskellParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitNot(HaskellParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(HaskellParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(HaskellParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(HaskellParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(HaskellParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterEqual(HaskellParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitEqual(HaskellParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterAnd(HaskellParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitAnd(HaskellParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterSoma(HaskellParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitSoma(HaskellParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divisor}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterDivisor(HaskellParser.DivisorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divisor}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitDivisor(HaskellParser.DivisorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfThenElse}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(HaskellParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfThenElse}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(HaskellParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identificador}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(HaskellParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identificador}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(HaskellParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inteiro}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(HaskellParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inteiro}
	 * labeled alternative in {@link HaskellParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(HaskellParser.InteiroContext ctx);
}