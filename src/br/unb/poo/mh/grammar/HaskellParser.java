// Generated from Haskell.g4 by ANTLR 4.5.3

package br.unb.poo.mh.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, LE=6, GE=7, LT=8, GT=9, EQ=10, IF=11, 
		THEN=12, ELSE=13, NOT=14, OR=15, AND=16, DIV=17, SUB=18, MUL=19, SOM=20, 
		INT=21, BOOL=22, ID=23;
	public static final int
		RULE_start = 0, RULE_expressaoOr = 1, RULE_expressaoAnd = 2, RULE_expressaoNot = 3, 
		RULE_expressaoEqual = 4, RULE_expressaoLessThan = 5, RULE_expressaoGreaterThan = 6, 
		RULE_expressaoLessOrEqual = 7, RULE_expressaoGreaterOrEqual = 8, RULE_expressaoSubtracao = 9, 
		RULE_expressaoSoma = 10, RULE_expressaoDivisor = 11, RULE_multiplicacao = 12, 
		RULE_ifThenElse = 13, RULE_aplicacaoFuncao = 14, RULE_parentesis = 15, 
		RULE_valorInteiro = 16, RULE_valorBooleano = 17, RULE_name = 18, RULE_identificador = 19, 
		RULE_declaracaoFuncao = 20, RULE_testeGuarda = 21, RULE_guardaFalsa = 22, 
		RULE_guardas = 23, RULE_guarda = 24;
	public static final String[] ruleNames = {
		"start", "expressaoOr", "expressaoAnd", "expressaoNot", "expressaoEqual", 
		"expressaoLessThan", "expressaoGreaterThan", "expressaoLessOrEqual", "expressaoGreaterOrEqual", 
		"expressaoSubtracao", "expressaoSoma", "expressaoDivisor", "multiplicacao", 
		"ifThenElse", "aplicacaoFuncao", "parentesis", "valorInteiro", "valorBooleano", 
		"name", "identificador", "declaracaoFuncao", "testeGuarda", "guardaFalsa", 
		"guardas", "guarda"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "'|'", null, "'<='", "'>='", "'<'", "'>'", 
		"'=='", "'if'", "'then'", "'else'", null, null, null, "'/'", "'-'", "'*'", 
		"'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "WS", "LE", "GE", "LT", "GT", "EQ", "IF", 
		"THEN", "ELSE", "NOT", "OR", "AND", "DIV", "SUB", "MUL", "SOM", "INT", 
		"BOOL", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Haskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExpressaoOrContext expressaoOr() {
			return getRuleContext(ExpressaoOrContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HaskellParser.EOF, 0); }
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				expressaoOr(0);
				setState(51);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				declaracaoFuncao();
				setState(54);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoOrContext extends ParserRuleContext {
		public ExpressaoAndContext expressaoAnd() {
			return getRuleContext(ExpressaoAndContext.class,0);
		}
		public List<ExpressaoOrContext> expressaoOr() {
			return getRuleContexts(ExpressaoOrContext.class);
		}
		public ExpressaoOrContext expressaoOr(int i) {
			return getRuleContext(ExpressaoOrContext.class,i);
		}
		public TerminalNode OR() { return getToken(HaskellParser.OR, 0); }
		public ExpressaoOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoOr(this);
		}
	}

	public final ExpressaoOrContext expressaoOr() throws RecognitionException {
		return expressaoOr(0);
	}

	private ExpressaoOrContext expressaoOr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoOrContext _localctx = new ExpressaoOrContext(_ctx, _parentState);
		ExpressaoOrContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expressaoOr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(59);
			expressaoAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoOrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoOr);
					setState(61);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(62);
					match(OR);
					setState(63);
					expressaoOr(3);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoAndContext extends ParserRuleContext {
		public ExpressaoNotContext expressaoNot() {
			return getRuleContext(ExpressaoNotContext.class,0);
		}
		public List<ExpressaoAndContext> expressaoAnd() {
			return getRuleContexts(ExpressaoAndContext.class);
		}
		public ExpressaoAndContext expressaoAnd(int i) {
			return getRuleContext(ExpressaoAndContext.class,i);
		}
		public TerminalNode AND() { return getToken(HaskellParser.AND, 0); }
		public ExpressaoAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoAnd(this);
		}
	}

	public final ExpressaoAndContext expressaoAnd() throws RecognitionException {
		return expressaoAnd(0);
	}

	private ExpressaoAndContext expressaoAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAndContext _localctx = new ExpressaoAndContext(_ctx, _parentState);
		ExpressaoAndContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expressaoAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(70);
			expressaoNot();
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoAndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoAnd);
					setState(72);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(73);
					match(AND);
					setState(74);
					expressaoAnd(3);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoNotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(HaskellParser.NOT, 0); }
		public ExpressaoNotContext expressaoNot() {
			return getRuleContext(ExpressaoNotContext.class,0);
		}
		public ExpressaoEqualContext expressaoEqual() {
			return getRuleContext(ExpressaoEqualContext.class,0);
		}
		public ExpressaoNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoNot(this);
		}
	}

	public final ExpressaoNotContext expressaoNot() throws RecognitionException {
		ExpressaoNotContext _localctx = new ExpressaoNotContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressaoNot);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(NOT);
				setState(81);
				expressaoNot();
				}
				break;
			case T__0:
			case IF:
			case INT:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				expressaoEqual(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoEqualContext extends ParserRuleContext {
		public ExpressaoLessThanContext expressaoLessThan() {
			return getRuleContext(ExpressaoLessThanContext.class,0);
		}
		public List<ExpressaoEqualContext> expressaoEqual() {
			return getRuleContexts(ExpressaoEqualContext.class);
		}
		public ExpressaoEqualContext expressaoEqual(int i) {
			return getRuleContext(ExpressaoEqualContext.class,i);
		}
		public TerminalNode EQ() { return getToken(HaskellParser.EQ, 0); }
		public ExpressaoEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoEqual(this);
		}
	}

	public final ExpressaoEqualContext expressaoEqual() throws RecognitionException {
		return expressaoEqual(0);
	}

	private ExpressaoEqualContext expressaoEqual(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoEqualContext _localctx = new ExpressaoEqualContext(_ctx, _parentState);
		ExpressaoEqualContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expressaoEqual, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			expressaoLessThan(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoEqualContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoEqual);
					setState(88);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(89);
					match(EQ);
					setState(90);
					expressaoEqual(3);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoLessThanContext extends ParserRuleContext {
		public ExpressaoGreaterThanContext expressaoGreaterThan() {
			return getRuleContext(ExpressaoGreaterThanContext.class,0);
		}
		public List<ExpressaoLessThanContext> expressaoLessThan() {
			return getRuleContexts(ExpressaoLessThanContext.class);
		}
		public ExpressaoLessThanContext expressaoLessThan(int i) {
			return getRuleContext(ExpressaoLessThanContext.class,i);
		}
		public TerminalNode LT() { return getToken(HaskellParser.LT, 0); }
		public ExpressaoLessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLessThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoLessThan(this);
		}
	}

	public final ExpressaoLessThanContext expressaoLessThan() throws RecognitionException {
		return expressaoLessThan(0);
	}

	private ExpressaoLessThanContext expressaoLessThan(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoLessThanContext _localctx = new ExpressaoLessThanContext(_ctx, _parentState);
		ExpressaoLessThanContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expressaoLessThan, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(97);
			expressaoGreaterThan(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoLessThanContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoLessThan);
					setState(99);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(100);
					match(LT);
					setState(101);
					expressaoLessThan(3);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoGreaterThanContext extends ParserRuleContext {
		public ExpressaoLessOrEqualContext expressaoLessOrEqual() {
			return getRuleContext(ExpressaoLessOrEqualContext.class,0);
		}
		public List<ExpressaoGreaterThanContext> expressaoGreaterThan() {
			return getRuleContexts(ExpressaoGreaterThanContext.class);
		}
		public ExpressaoGreaterThanContext expressaoGreaterThan(int i) {
			return getRuleContext(ExpressaoGreaterThanContext.class,i);
		}
		public TerminalNode GT() { return getToken(HaskellParser.GT, 0); }
		public ExpressaoGreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoGreaterThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoGreaterThan(this);
		}
	}

	public final ExpressaoGreaterThanContext expressaoGreaterThan() throws RecognitionException {
		return expressaoGreaterThan(0);
	}

	private ExpressaoGreaterThanContext expressaoGreaterThan(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoGreaterThanContext _localctx = new ExpressaoGreaterThanContext(_ctx, _parentState);
		ExpressaoGreaterThanContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expressaoGreaterThan, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			expressaoLessOrEqual(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoGreaterThanContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoGreaterThan);
					setState(110);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(111);
					match(GT);
					setState(112);
					expressaoGreaterThan(3);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoLessOrEqualContext extends ParserRuleContext {
		public ExpressaoGreaterOrEqualContext expressaoGreaterOrEqual() {
			return getRuleContext(ExpressaoGreaterOrEqualContext.class,0);
		}
		public List<ExpressaoLessOrEqualContext> expressaoLessOrEqual() {
			return getRuleContexts(ExpressaoLessOrEqualContext.class);
		}
		public ExpressaoLessOrEqualContext expressaoLessOrEqual(int i) {
			return getRuleContext(ExpressaoLessOrEqualContext.class,i);
		}
		public TerminalNode LE() { return getToken(HaskellParser.LE, 0); }
		public ExpressaoLessOrEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLessOrEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoLessOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoLessOrEqual(this);
		}
	}

	public final ExpressaoLessOrEqualContext expressaoLessOrEqual() throws RecognitionException {
		return expressaoLessOrEqual(0);
	}

	private ExpressaoLessOrEqualContext expressaoLessOrEqual(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoLessOrEqualContext _localctx = new ExpressaoLessOrEqualContext(_ctx, _parentState);
		ExpressaoLessOrEqualContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressaoLessOrEqual, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			expressaoGreaterOrEqual(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoLessOrEqualContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoLessOrEqual);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122);
					match(LE);
					setState(123);
					expressaoLessOrEqual(3);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoGreaterOrEqualContext extends ParserRuleContext {
		public ExpressaoSubtracaoContext expressaoSubtracao() {
			return getRuleContext(ExpressaoSubtracaoContext.class,0);
		}
		public List<ExpressaoGreaterOrEqualContext> expressaoGreaterOrEqual() {
			return getRuleContexts(ExpressaoGreaterOrEqualContext.class);
		}
		public ExpressaoGreaterOrEqualContext expressaoGreaterOrEqual(int i) {
			return getRuleContext(ExpressaoGreaterOrEqualContext.class,i);
		}
		public TerminalNode GE() { return getToken(HaskellParser.GE, 0); }
		public ExpressaoGreaterOrEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoGreaterOrEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoGreaterOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoGreaterOrEqual(this);
		}
	}

	public final ExpressaoGreaterOrEqualContext expressaoGreaterOrEqual() throws RecognitionException {
		return expressaoGreaterOrEqual(0);
	}

	private ExpressaoGreaterOrEqualContext expressaoGreaterOrEqual(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoGreaterOrEqualContext _localctx = new ExpressaoGreaterOrEqualContext(_ctx, _parentState);
		ExpressaoGreaterOrEqualContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expressaoGreaterOrEqual, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			expressaoSubtracao(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoGreaterOrEqualContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoGreaterOrEqual);
					setState(132);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(133);
					match(GE);
					setState(134);
					expressaoGreaterOrEqual(3);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoSubtracaoContext extends ParserRuleContext {
		public ExpressaoSomaContext expressaoSoma() {
			return getRuleContext(ExpressaoSomaContext.class,0);
		}
		public List<ExpressaoSubtracaoContext> expressaoSubtracao() {
			return getRuleContexts(ExpressaoSubtracaoContext.class);
		}
		public ExpressaoSubtracaoContext expressaoSubtracao(int i) {
			return getRuleContext(ExpressaoSubtracaoContext.class,i);
		}
		public TerminalNode SUB() { return getToken(HaskellParser.SUB, 0); }
		public ExpressaoSubtracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoSubtracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoSubtracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoSubtracao(this);
		}
	}

	public final ExpressaoSubtracaoContext expressaoSubtracao() throws RecognitionException {
		return expressaoSubtracao(0);
	}

	private ExpressaoSubtracaoContext expressaoSubtracao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoSubtracaoContext _localctx = new ExpressaoSubtracaoContext(_ctx, _parentState);
		ExpressaoSubtracaoContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expressaoSubtracao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			expressaoSoma(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoSubtracaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoSubtracao);
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
					match(SUB);
					setState(145);
					expressaoSubtracao(3);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoSomaContext extends ParserRuleContext {
		public ExpressaoDivisorContext expressaoDivisor() {
			return getRuleContext(ExpressaoDivisorContext.class,0);
		}
		public List<ExpressaoSomaContext> expressaoSoma() {
			return getRuleContexts(ExpressaoSomaContext.class);
		}
		public ExpressaoSomaContext expressaoSoma(int i) {
			return getRuleContext(ExpressaoSomaContext.class,i);
		}
		public TerminalNode SOM() { return getToken(HaskellParser.SOM, 0); }
		public ExpressaoSomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoSoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoSoma(this);
		}
	}

	public final ExpressaoSomaContext expressaoSoma() throws RecognitionException {
		return expressaoSoma(0);
	}

	private ExpressaoSomaContext expressaoSoma(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoSomaContext _localctx = new ExpressaoSomaContext(_ctx, _parentState);
		ExpressaoSomaContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressaoSoma, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			expressaoDivisor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoSomaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoSoma);
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					match(SOM);
					setState(156);
					expressaoSoma(3);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoDivisorContext extends ParserRuleContext {
		public MultiplicacaoContext multiplicacao() {
			return getRuleContext(MultiplicacaoContext.class,0);
		}
		public List<ExpressaoDivisorContext> expressaoDivisor() {
			return getRuleContexts(ExpressaoDivisorContext.class);
		}
		public ExpressaoDivisorContext expressaoDivisor(int i) {
			return getRuleContext(ExpressaoDivisorContext.class,i);
		}
		public TerminalNode DIV() { return getToken(HaskellParser.DIV, 0); }
		public ExpressaoDivisorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoDivisor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoDivisor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoDivisor(this);
		}
	}

	public final ExpressaoDivisorContext expressaoDivisor() throws RecognitionException {
		return expressaoDivisor(0);
	}

	private ExpressaoDivisorContext expressaoDivisor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoDivisorContext _localctx = new ExpressaoDivisorContext(_ctx, _parentState);
		ExpressaoDivisorContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expressaoDivisor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			multiplicacao(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoDivisorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoDivisor);
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					match(DIV);
					setState(167);
					expressaoDivisor(3);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicacaoContext extends ParserRuleContext {
		public IfThenElseContext ifThenElse() {
			return getRuleContext(IfThenElseContext.class,0);
		}
		public List<MultiplicacaoContext> multiplicacao() {
			return getRuleContexts(MultiplicacaoContext.class);
		}
		public MultiplicacaoContext multiplicacao(int i) {
			return getRuleContext(MultiplicacaoContext.class,i);
		}
		public TerminalNode MUL() { return getToken(HaskellParser.MUL, 0); }
		public MultiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMultiplicacao(this);
		}
	}

	public final MultiplicacaoContext multiplicacao() throws RecognitionException {
		return multiplicacao(0);
	}

	private MultiplicacaoContext multiplicacao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicacaoContext _localctx = new MultiplicacaoContext(_ctx, _parentState);
		MultiplicacaoContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_multiplicacao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(174);
			ifThenElse();
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicacaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicacao);
					setState(176);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(177);
					match(MUL);
					setState(178);
					multiplicacao(3);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfThenElseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public List<ExpressaoOrContext> expressaoOr() {
			return getRuleContexts(ExpressaoOrContext.class);
		}
		public ExpressaoOrContext expressaoOr(int i) {
			return getRuleContext(ExpressaoOrContext.class,i);
		}
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public IfThenElseContext ifThenElse() {
			return getRuleContext(IfThenElseContext.class,0);
		}
		public AplicacaoFuncaoContext aplicacaoFuncao() {
			return getRuleContext(AplicacaoFuncaoContext.class,0);
		}
		public IfThenElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitIfThenElse(this);
		}
	}

	public final IfThenElseContext ifThenElse() throws RecognitionException {
		IfThenElseContext _localctx = new IfThenElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifThenElse);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(IF);
				setState(185);
				expressaoOr(0);
				setState(186);
				match(THEN);
				setState(187);
				expressaoOr(0);
				setState(188);
				match(ELSE);
				setState(189);
				ifThenElse();
				}
				break;
			case T__0:
			case INT:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				aplicacaoFuncao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AplicacaoFuncaoContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExpressaoOrContext> expressaoOr() {
			return getRuleContexts(ExpressaoOrContext.class);
		}
		public ExpressaoOrContext expressaoOr(int i) {
			return getRuleContext(ExpressaoOrContext.class,i);
		}
		public ParentesisContext parentesis() {
			return getRuleContext(ParentesisContext.class,0);
		}
		public AplicacaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aplicacaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterAplicacaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitAplicacaoFuncao(this);
		}
	}

	public final AplicacaoFuncaoContext aplicacaoFuncao() throws RecognitionException {
		AplicacaoFuncaoContext _localctx = new AplicacaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aplicacaoFuncao);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				name();
				setState(195);
				match(T__0);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << NOT) | (1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(196);
					expressaoOr(0);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				parentesis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentesisContext extends ParserRuleContext {
		public ExpressaoOrContext expressaoOr() {
			return getRuleContext(ExpressaoOrContext.class,0);
		}
		public ValorInteiroContext valorInteiro() {
			return getRuleContext(ValorInteiroContext.class,0);
		}
		public ParentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitParentesis(this);
		}
	}

	public final ParentesisContext parentesis() throws RecognitionException {
		ParentesisContext _localctx = new ParentesisContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parentesis);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__0);
				setState(208);
				expressaoOr(0);
				setState(209);
				match(T__1);
				}
				break;
			case INT:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				valorInteiro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorInteiroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HaskellParser.INT, 0); }
		public ValorBooleanoContext valorBooleano() {
			return getRuleContext(ValorBooleanoContext.class,0);
		}
		public ValorInteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorInteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterValorInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitValorInteiro(this);
		}
	}

	public final ValorInteiroContext valorInteiro() throws RecognitionException {
		ValorInteiroContext _localctx = new ValorInteiroContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valorInteiro);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(INT);
				}
				break;
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				valorBooleano();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorBooleanoContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(HaskellParser.BOOL, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ValorBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterValorBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitValorBooleano(this);
		}
	}

	public final ValorBooleanoContext valorBooleano() throws RecognitionException {
		ValorBooleanoContext _localctx = new ValorBooleanoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valorBooleano);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				identificador();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TesteGuardaContext testeGuarda() {
			return getRuleContext(TesteGuardaContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDeclaracaoFuncao(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				name();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(231);
			testeGuarda();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TesteGuardaContext extends ParserRuleContext {
		public GuardaFalsaContext guardaFalsa() {
			return getRuleContext(GuardaFalsaContext.class,0);
		}
		public GuardasContext guardas() {
			return getRuleContext(GuardasContext.class,0);
		}
		public TesteGuardaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testeGuarda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTesteGuarda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTesteGuarda(this);
		}
	}

	public final TesteGuardaContext testeGuarda() throws RecognitionException {
		TesteGuardaContext _localctx = new TesteGuardaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_testeGuarda);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				guardaFalsa();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				guardas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardaFalsaContext extends ParserRuleContext {
		public ExpressaoOrContext expressaoOr() {
			return getRuleContext(ExpressaoOrContext.class,0);
		}
		public GuardaFalsaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardaFalsa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGuardaFalsa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGuardaFalsa(this);
		}
	}

	public final GuardaFalsaContext guardaFalsa() throws RecognitionException {
		GuardaFalsaContext _localctx = new GuardaFalsaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_guardaFalsa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__2);
			setState(238);
			expressaoOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardasContext extends ParserRuleContext {
		public List<GuardaContext> guarda() {
			return getRuleContexts(GuardaContext.class);
		}
		public GuardaContext guarda(int i) {
			return getRuleContext(GuardaContext.class,i);
		}
		public GuardasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGuardas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGuardas(this);
		}
	}

	public final GuardasContext guardas() throws RecognitionException {
		GuardasContext _localctx = new GuardasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_guardas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				guarda();
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardaContext extends ParserRuleContext {
		public List<ExpressaoOrContext> expressaoOr() {
			return getRuleContexts(ExpressaoOrContext.class);
		}
		public ExpressaoOrContext expressaoOr(int i) {
			return getRuleContext(ExpressaoOrContext.class,i);
		}
		public GuardaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGuarda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGuarda(this);
		}
	}

	public final GuardaContext guarda() throws RecognitionException {
		GuardaContext _localctx = new GuardaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_guarda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__3);
			setState(246);
			expressaoOr(0);
			setState(247);
			match(T__2);
			setState(248);
			expressaoOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expressaoOr_sempred((ExpressaoOrContext)_localctx, predIndex);
		case 2:
			return expressaoAnd_sempred((ExpressaoAndContext)_localctx, predIndex);
		case 4:
			return expressaoEqual_sempred((ExpressaoEqualContext)_localctx, predIndex);
		case 5:
			return expressaoLessThan_sempred((ExpressaoLessThanContext)_localctx, predIndex);
		case 6:
			return expressaoGreaterThan_sempred((ExpressaoGreaterThanContext)_localctx, predIndex);
		case 7:
			return expressaoLessOrEqual_sempred((ExpressaoLessOrEqualContext)_localctx, predIndex);
		case 8:
			return expressaoGreaterOrEqual_sempred((ExpressaoGreaterOrEqualContext)_localctx, predIndex);
		case 9:
			return expressaoSubtracao_sempred((ExpressaoSubtracaoContext)_localctx, predIndex);
		case 10:
			return expressaoSoma_sempred((ExpressaoSomaContext)_localctx, predIndex);
		case 11:
			return expressaoDivisor_sempred((ExpressaoDivisorContext)_localctx, predIndex);
		case 12:
			return multiplicacao_sempred((MultiplicacaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoOr_sempred(ExpressaoOrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoAnd_sempred(ExpressaoAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoEqual_sempred(ExpressaoEqualContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoLessThan_sempred(ExpressaoLessThanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoGreaterThan_sempred(ExpressaoGreaterThanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoLessOrEqual_sempred(ExpressaoLessOrEqualContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoGreaterOrEqual_sempred(ExpressaoGreaterOrEqualContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoSubtracao_sempred(ExpressaoSubtracaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoSoma_sempred(ExpressaoSomaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoDivisor_sempred(ExpressaoDivisorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicacao_sempred(MultiplicacaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00fd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3C\n\3\f\3\16\3F\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4"+
		"\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bt\n\b\f\b\16\bw\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16"+
		"\t\u0082\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a0\n\f\f\f\16\f\u00a3\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00ab\n\r\f\r\16\r\u00ae\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00b6\n\16\f\16\16\16\u00b9\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00c3\n\17\3\20\3\20\3\20\7\20\u00c8\n\20\f\20\16"+
		"\20\u00cb\13\20\3\20\3\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00d7\n\21\3\22\3\22\5\22\u00db\n\22\3\23\3\23\5\23\u00df\n\23\3"+
		"\24\3\24\3\25\3\25\3\26\6\26\u00e6\n\26\r\26\16\26\u00e7\3\26\3\26\3\27"+
		"\3\27\5\27\u00ee\n\27\3\30\3\30\3\30\3\31\6\31\u00f4\n\31\r\31\16\31\u00f5"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\2\r\4\6\n\f\16\20\22\24\26\30\32\33\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\u00f9\2:\3\2\2"+
		"\2\4<\3\2\2\2\6G\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fb\3\2\2\2\16m\3\2\2\2"+
		"\20x\3\2\2\2\22\u0083\3\2\2\2\24\u008e\3\2\2\2\26\u0099\3\2\2\2\30\u00a4"+
		"\3\2\2\2\32\u00af\3\2\2\2\34\u00c2\3\2\2\2\36\u00cf\3\2\2\2 \u00d6\3\2"+
		"\2\2\"\u00da\3\2\2\2$\u00de\3\2\2\2&\u00e0\3\2\2\2(\u00e2\3\2\2\2*\u00e5"+
		"\3\2\2\2,\u00ed\3\2\2\2.\u00ef\3\2\2\2\60\u00f3\3\2\2\2\62\u00f7\3\2\2"+
		"\2\64\65\5\4\3\2\65\66\7\2\2\3\66;\3\2\2\2\678\5*\26\289\7\2\2\39;\3\2"+
		"\2\2:\64\3\2\2\2:\67\3\2\2\2;\3\3\2\2\2<=\b\3\1\2=>\5\6\4\2>D\3\2\2\2"+
		"?@\f\4\2\2@A\7\21\2\2AC\5\4\3\5B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2"+
		"\2E\5\3\2\2\2FD\3\2\2\2GH\b\4\1\2HI\5\b\5\2IO\3\2\2\2JK\f\4\2\2KL\7\22"+
		"\2\2LN\5\6\4\5MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3"+
		"\2\2\2RS\7\20\2\2SV\5\b\5\2TV\5\n\6\2UR\3\2\2\2UT\3\2\2\2V\t\3\2\2\2W"+
		"X\b\6\1\2XY\5\f\7\2Y_\3\2\2\2Z[\f\4\2\2[\\\7\f\2\2\\^\5\n\6\5]Z\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2\2\2bc\b\7\1\2cd\5\16"+
		"\b\2dj\3\2\2\2ef\f\4\2\2fg\7\n\2\2gi\5\f\7\5he\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2k\r\3\2\2\2lj\3\2\2\2mn\b\b\1\2no\5\20\t\2ou\3\2\2\2pq\f"+
		"\4\2\2qr\7\13\2\2rt\5\16\b\5sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v"+
		"\17\3\2\2\2wu\3\2\2\2xy\b\t\1\2yz\5\22\n\2z\u0080\3\2\2\2{|\f\4\2\2|}"+
		"\7\b\2\2}\177\5\20\t\5~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\21\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\b\n\1"+
		"\2\u0084\u0085\5\24\13\2\u0085\u008b\3\2\2\2\u0086\u0087\f\4\2\2\u0087"+
		"\u0088\7\t\2\2\u0088\u008a\5\22\n\5\u0089\u0086\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\23\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\b\13\1\2\u008f\u0090\5\26\f\2\u0090\u0096\3"+
		"\2\2\2\u0091\u0092\f\4\2\2\u0092\u0093\7\24\2\2\u0093\u0095\5\24\13\5"+
		"\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\25\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\b\f\1\2\u009a"+
		"\u009b\5\30\r\2\u009b\u00a1\3\2\2\2\u009c\u009d\f\4\2\2\u009d\u009e\7"+
		"\26\2\2\u009e\u00a0\5\26\f\5\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a4\u00a5\b\r\1\2\u00a5\u00a6\5\32\16\2\u00a6\u00ac\3\2\2\2\u00a7"+
		"\u00a8\f\4\2\2\u00a8\u00a9\7\23\2\2\u00a9\u00ab\5\30\r\5\u00aa\u00a7\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\31\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\16\1\2\u00b0\u00b1\5\34"+
		"\17\2\u00b1\u00b7\3\2\2\2\u00b2\u00b3\f\4\2\2\u00b3\u00b4\7\25\2\2\u00b4"+
		"\u00b6\5\32\16\5\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\33\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\r\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\5"+
		"\4\3\2\u00be\u00bf\7\17\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c3\3\2\2\2"+
		"\u00c1\u00c3\5\36\20\2\u00c2\u00ba\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\35"+
		"\3\2\2\2\u00c4\u00c5\5&\24\2\u00c5\u00c9\7\3\2\2\u00c6\u00c8\5\4\3\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00d0\5 \21\2\u00cf\u00c4\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\37\3\2\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4"+
		"\7\4\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\5\"\22\2\u00d6\u00d1\3\2\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00db\7\27\2\2\u00d9\u00db\5"+
		"$\23\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db#\3\2\2\2\u00dc\u00df"+
		"\7\30\2\2\u00dd\u00df\5(\25\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2"+
		"\u00df%\3\2\2\2\u00e0\u00e1\7\31\2\2\u00e1\'\3\2\2\2\u00e2\u00e3\7\31"+
		"\2\2\u00e3)\3\2\2\2\u00e4\u00e6\5&\24\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\5,\27\2\u00ea+\3\2\2\2\u00eb\u00ee\5.\30\2\u00ec\u00ee\5\60\31"+
		"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee-\3\2\2\2\u00ef\u00f0"+
		"\7\5\2\2\u00f0\u00f1\5\4\3\2\u00f1/\3\2\2\2\u00f2\u00f4\5\62\32\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\61\3\2\2\2\u00f7\u00f8\7\6\2\2\u00f8\u00f9\5\4\3\2\u00f9\u00fa"+
		"\7\5\2\2\u00fa\u00fb\5\4\3\2\u00fb\63\3\2\2\2\30:DOU_ju\u0080\u008b\u0096"+
		"\u00a1\u00ac\u00b7\u00c2\u00c9\u00cf\u00d6\u00da\u00de\u00e7\u00ed\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}