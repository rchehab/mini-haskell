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
		T__0=1, T__1=2, T__2=3, WS=4, LE=5, GE=6, LT=7, GT=8, EQ=9, IF=10, THEN=11, 
		ELSE=12, NOT=13, OR=14, AND=15, DIV=16, SUB=17, MUL=18, SOM=19, INT=20, 
		BOOL=21, ID=22;
	public static final int
		RULE_start = 0, RULE_declaracaoFuncao = 1, RULE_expressaoNot = 2, RULE_expressaoOr = 3, 
		RULE_expressaoAnd = 4, RULE_expressaoEqual = 5, RULE_expressaoLessThan = 6, 
		RULE_expressaoGreaterThan = 7, RULE_expressaoLessOrEqual = 8, RULE_expressaoGreaterOrEqual = 9, 
		RULE_expressaoSubtracao = 10, RULE_expressaoSoma = 11, RULE_expressaoDivisor = 12, 
		RULE_expressaoMultiplicacao = 13, RULE_expressaoIfThenElse = 14, RULE_aplicacoDeFuncao = 15, 
		RULE_parentesis = 16, RULE_valorInteiro = 17, RULE_valorBooleano = 18, 
		RULE_identificador = 19;
	public static final String[] ruleNames = {
		"start", "declaracaoFuncao", "expressaoNot", "expressaoOr", "expressaoAnd", 
		"expressaoEqual", "expressaoLessThan", "expressaoGreaterThan", "expressaoLessOrEqual", 
		"expressaoGreaterOrEqual", "expressaoSubtracao", "expressaoSoma", "expressaoDivisor", 
		"expressaoMultiplicacao", "expressaoIfThenElse", "aplicacoDeFuncao", "parentesis", 
		"valorInteiro", "valorBooleano", "identificador"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", null, "'<='", "'>='", "'<'", "'>'", "'=='", 
		"'if'", "'then'", "'else'", null, null, null, "'/'", "'-'", "'*'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WS", "LE", "GE", "LT", "GT", "EQ", "IF", "THEN", 
		"ELSE", "NOT", "OR", "AND", "DIV", "SUB", "MUL", "SOM", "INT", "BOOL", 
		"ID"
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
		public ExpressaoNotContext expressaoNot() {
			return getRuleContext(ExpressaoNotContext.class,0);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				expressaoNot();
				setState(41);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				declaracaoFuncao();
				setState(44);
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

	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public Token funcname;
		public Token ID;
		public List<Token> param = new ArrayList<Token>();
		public ExpressaoNotContext expressaoNot() {
			return getRuleContext(ExpressaoNotContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(HaskellParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HaskellParser.ID, i);
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
		enterRule(_localctx, 2, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((DeclaracaoFuncaoContext)_localctx).funcname = match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(49);
				((DeclaracaoFuncaoContext)_localctx).ID = match(ID);
				((DeclaracaoFuncaoContext)_localctx).param.add(((DeclaracaoFuncaoContext)_localctx).ID);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__0);
			setState(56);
			expressaoNot();
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

	public static class ExpressaoNotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(HaskellParser.NOT, 0); }
		public ExpressaoNotContext expressaoNot() {
			return getRuleContext(ExpressaoNotContext.class,0);
		}
		public ExpressaoOrContext expressaoOr() {
			return getRuleContext(ExpressaoOrContext.class,0);
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
		enterRule(_localctx, 4, RULE_expressaoNot);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(NOT);
				setState(59);
				expressaoNot();
				}
				break;
			case T__1:
			case IF:
			case INT:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				expressaoOr(0);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressaoOr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			expressaoAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoOrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoOr);
					setState(66);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(67);
					match(OR);
					setState(68);
					expressaoOr(3);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public ExpressaoEqualContext expressaoEqual() {
			return getRuleContext(ExpressaoEqualContext.class,0);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expressaoAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(75);
			expressaoEqual(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoAndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoAnd);
					setState(77);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(78);
					match(AND);
					setState(79);
					expressaoAnd(3);
					}
					} 
				}
				setState(84);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expressaoEqual, _p);
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
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expressaoLessThan, _p);
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
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressaoGreaterThan, _p);
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
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expressaoLessOrEqual, _p);
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
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expressaoGreaterOrEqual, _p);
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
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressaoSubtracao, _p);
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
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expressaoSoma, _p);
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
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ExpressaoDivisorContext extends ParserRuleContext {
		public ExpressaoMultiplicacaoContext expressaoMultiplicacao() {
			return getRuleContext(ExpressaoMultiplicacaoContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expressaoDivisor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			expressaoMultiplicacao(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ExpressaoMultiplicacaoContext extends ParserRuleContext {
		public ExpressaoIfThenElseContext expressaoIfThenElse() {
			return getRuleContext(ExpressaoIfThenElseContext.class,0);
		}
		public List<ExpressaoMultiplicacaoContext> expressaoMultiplicacao() {
			return getRuleContexts(ExpressaoMultiplicacaoContext.class);
		}
		public ExpressaoMultiplicacaoContext expressaoMultiplicacao(int i) {
			return getRuleContext(ExpressaoMultiplicacaoContext.class,i);
		}
		public TerminalNode MUL() { return getToken(HaskellParser.MUL, 0); }
		public ExpressaoMultiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoMultiplicacao(this);
		}
	}

	public final ExpressaoMultiplicacaoContext expressaoMultiplicacao() throws RecognitionException {
		return expressaoMultiplicacao(0);
	}

	private ExpressaoMultiplicacaoContext expressaoMultiplicacao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoMultiplicacaoContext _localctx = new ExpressaoMultiplicacaoContext(_ctx, _parentState);
		ExpressaoMultiplicacaoContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expressaoMultiplicacao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(174);
			expressaoIfThenElse();
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoMultiplicacaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicacao);
					setState(176);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(177);
					match(MUL);
					setState(178);
					expressaoMultiplicacao(3);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExpressaoIfThenElseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public List<ExpressaoNotContext> expressaoNot() {
			return getRuleContexts(ExpressaoNotContext.class);
		}
		public ExpressaoNotContext expressaoNot(int i) {
			return getRuleContext(ExpressaoNotContext.class,i);
		}
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public ExpressaoIfThenElseContext expressaoIfThenElse() {
			return getRuleContext(ExpressaoIfThenElseContext.class,0);
		}
		public AplicacoDeFuncaoContext aplicacoDeFuncao() {
			return getRuleContext(AplicacoDeFuncaoContext.class,0);
		}
		public ExpressaoIfThenElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoIfThenElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpressaoIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpressaoIfThenElse(this);
		}
	}

	public final ExpressaoIfThenElseContext expressaoIfThenElse() throws RecognitionException {
		ExpressaoIfThenElseContext _localctx = new ExpressaoIfThenElseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressaoIfThenElse);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(IF);
				setState(185);
				expressaoNot();
				setState(186);
				match(THEN);
				setState(187);
				expressaoNot();
				setState(188);
				match(ELSE);
				setState(189);
				expressaoIfThenElse();
				}
				break;
			case T__1:
			case INT:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				aplicacoDeFuncao();
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

	public static class AplicacoDeFuncaoContext extends ParserRuleContext {
		public Token funcname;
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public List<ExpressaoNotContext> expressaoNot() {
			return getRuleContexts(ExpressaoNotContext.class);
		}
		public ExpressaoNotContext expressaoNot(int i) {
			return getRuleContext(ExpressaoNotContext.class,i);
		}
		public ParentesisContext parentesis() {
			return getRuleContext(ParentesisContext.class,0);
		}
		public AplicacoDeFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aplicacoDeFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterAplicacoDeFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitAplicacoDeFuncao(this);
		}
	}

	public final AplicacoDeFuncaoContext aplicacoDeFuncao() throws RecognitionException {
		AplicacoDeFuncaoContext _localctx = new AplicacoDeFuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_aplicacoDeFuncao);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((AplicacoDeFuncaoContext)_localctx).funcname = match(ID);
				setState(195);
				match(T__1);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << NOT) | (1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(196);
					expressaoNot();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
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
		public ExpressaoNotContext expressaoNot() {
			return getRuleContext(ExpressaoNotContext.class,0);
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
		enterRule(_localctx, 32, RULE_parentesis);
		try {
			setState(211);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__1);
				setState(207);
				expressaoNot();
				setState(208);
				match(T__2);
				}
				break;
			case INT:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
		enterRule(_localctx, 34, RULE_valorInteiro);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(INT);
				}
				break;
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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
		enterRule(_localctx, 36, RULE_valorBooleano);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
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
			setState(221);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expressaoOr_sempred((ExpressaoOrContext)_localctx, predIndex);
		case 4:
			return expressaoAnd_sempred((ExpressaoAndContext)_localctx, predIndex);
		case 5:
			return expressaoEqual_sempred((ExpressaoEqualContext)_localctx, predIndex);
		case 6:
			return expressaoLessThan_sempred((ExpressaoLessThanContext)_localctx, predIndex);
		case 7:
			return expressaoGreaterThan_sempred((ExpressaoGreaterThanContext)_localctx, predIndex);
		case 8:
			return expressaoLessOrEqual_sempred((ExpressaoLessOrEqualContext)_localctx, predIndex);
		case 9:
			return expressaoGreaterOrEqual_sempred((ExpressaoGreaterOrEqualContext)_localctx, predIndex);
		case 10:
			return expressaoSubtracao_sempred((ExpressaoSubtracaoContext)_localctx, predIndex);
		case 11:
			return expressaoSoma_sempred((ExpressaoSomaContext)_localctx, predIndex);
		case 12:
			return expressaoDivisor_sempred((ExpressaoDivisorContext)_localctx, predIndex);
		case 13:
			return expressaoMultiplicacao_sempred((ExpressaoMultiplicacaoContext)_localctx, predIndex);
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
	private boolean expressaoMultiplicacao_sempred(ExpressaoMultiplicacaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00e2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4@\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"S\n\6\f\6\16\6V\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\tt\n\t\f\t\16\tw\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n"+
		"\u0082\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00ab\n\16\f\16\16\16\u00ae\13\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u00b6\n\17\f\17\16\17\u00b9\13\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00c3\n\20\3\21\3\21\3\21\7\21\u00c8\n\21"+
		"\f\21\16\21\u00cb\13\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00d6\n\22\3\23\3\23\5\23\u00da\n\23\3\24\3\24\5\24\u00de\n"+
		"\24\3\25\3\25\3\25\2\r\b\n\f\16\20\22\24\26\30\32\34\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\2\u00e1\2\60\3\2\2\2\4\62\3\2\2\2\6?"+
		"\3\2\2\2\bA\3\2\2\2\nL\3\2\2\2\fW\3\2\2\2\16b\3\2\2\2\20m\3\2\2\2\22x"+
		"\3\2\2\2\24\u0083\3\2\2\2\26\u008e\3\2\2\2\30\u0099\3\2\2\2\32\u00a4\3"+
		"\2\2\2\34\u00af\3\2\2\2\36\u00c2\3\2\2\2 \u00ce\3\2\2\2\"\u00d5\3\2\2"+
		"\2$\u00d9\3\2\2\2&\u00dd\3\2\2\2(\u00df\3\2\2\2*+\5\6\4\2+,\7\2\2\3,\61"+
		"\3\2\2\2-.\5\4\3\2./\7\2\2\3/\61\3\2\2\2\60*\3\2\2\2\60-\3\2\2\2\61\3"+
		"\3\2\2\2\62\66\7\30\2\2\63\65\7\30\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\3\2\2:;\5\6\4\2;\5"+
		"\3\2\2\2<=\7\17\2\2=@\5\6\4\2>@\5\b\5\2?<\3\2\2\2?>\3\2\2\2@\7\3\2\2\2"+
		"AB\b\5\1\2BC\5\n\6\2CI\3\2\2\2DE\f\4\2\2EF\7\20\2\2FH\5\b\5\5GD\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KI\3\2\2\2LM\b\6\1\2MN\5\f"+
		"\7\2NT\3\2\2\2OP\f\4\2\2PQ\7\21\2\2QS\5\n\6\5RO\3\2\2\2SV\3\2\2\2TR\3"+
		"\2\2\2TU\3\2\2\2U\13\3\2\2\2VT\3\2\2\2WX\b\7\1\2XY\5\16\b\2Y_\3\2\2\2"+
		"Z[\f\4\2\2[\\\7\13\2\2\\^\5\f\7\5]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`\r\3\2\2\2a_\3\2\2\2bc\b\b\1\2cd\5\20\t\2dj\3\2\2\2ef\f\4\2\2fg\7"+
		"\t\2\2gi\5\16\b\5he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2\2"+
		"lj\3\2\2\2mn\b\t\1\2no\5\22\n\2ou\3\2\2\2pq\f\4\2\2qr\7\n\2\2rt\5\20\t"+
		"\5sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\21\3\2\2\2wu\3\2\2\2xy\b\n"+
		"\1\2yz\5\24\13\2z\u0080\3\2\2\2{|\f\4\2\2|}\7\7\2\2}\177\5\22\n\5~{\3"+
		"\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\23\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\b\13\1\2\u0084\u0085\5\26\f\2\u0085"+
		"\u008b\3\2\2\2\u0086\u0087\f\4\2\2\u0087\u0088\7\b\2\2\u0088\u008a\5\24"+
		"\13\5\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\f\1"+
		"\2\u008f\u0090\5\30\r\2\u0090\u0096\3\2\2\2\u0091\u0092\f\4\2\2\u0092"+
		"\u0093\7\23\2\2\u0093\u0095\5\26\f\5\u0094\u0091\3\2\2\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\b\r\1\2\u009a\u009b\5\32\16\2\u009b\u00a1\3"+
		"\2\2\2\u009c\u009d\f\4\2\2\u009d\u009e\7\25\2\2\u009e\u00a0\5\30\r\5\u009f"+
		"\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\31\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\16\1\2\u00a5\u00a6"+
		"\5\34\17\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\f\4\2\2\u00a8\u00a9\7\22\2"+
		"\2\u00a9\u00ab\5\32\16\5\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\b\17\1\2\u00b0\u00b1\5\36\20\2\u00b1\u00b7\3\2\2\2\u00b2"+
		"\u00b3\f\4\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00b6\5\34\17\5\u00b5\u00b2"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\35\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\5\6\4"+
		"\2\u00bc\u00bd\7\r\2\2\u00bd\u00be\5\6\4\2\u00be\u00bf\7\16\2\2\u00bf"+
		"\u00c0\5\36\20\2\u00c0\u00c3\3\2\2\2\u00c1\u00c3\5 \21\2\u00c2\u00ba\3"+
		"\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\30\2\2\u00c5"+
		"\u00c9\7\4\2\2\u00c6\u00c8\5\6\4\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cf\7\5\2\2\u00cd\u00cf\5\"\22\2\u00ce\u00c4\3"+
		"\2\2\2\u00ce\u00cd\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2"+
		"\5\6\4\2\u00d2\u00d3\7\5\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\5$\23\2\u00d5"+
		"\u00d0\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6#\3\2\2\2\u00d7\u00da\7\26\2\2"+
		"\u00d8\u00da\5&\24\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da%\3"+
		"\2\2\2\u00db\u00de\7\27\2\2\u00dc\u00de\5(\25\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\'\3\2\2\2\u00df\u00e0\7\30\2\2\u00e0)\3\2\2\2\26"+
		"\60\66?IT_ju\u0080\u008b\u0096\u00a1\u00ac\u00b7\u00c2\u00c9\u00ce\u00d5"+
		"\u00d9\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}