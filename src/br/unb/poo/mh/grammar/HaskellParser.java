// Generated from Haskell.g4 by ANTLR 4.5.3

//package br.unb.poo.mh.grammar;

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
		RULE_start = 0, RULE_declaracao = 1, RULE_expressao = 2;
	public static final String[] ruleNames = {
		"start", "declaracao", "expressao"
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HaskellParser.EOF, 0); }
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
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
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				expressao(0);
				setState(7);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				declaracao();
				setState(10);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracaoFuncaoContext extends DeclaracaoContext {
		public Token funcname;
		public Token ID;
		public List<Token> param = new ArrayList<Token>();
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(HaskellParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HaskellParser.ID, i);
		}
		public DeclaracaoFuncaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDeclaracaoFuncao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		int _la;
		try {
			_localctx = new DeclaracaoFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((DeclaracaoFuncaoContext)_localctx).funcname = match(ID);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(15);
				((DeclaracaoFuncaoContext)_localctx).ID = match(ID);
				((DeclaracaoFuncaoContext)_localctx).param.add(((DeclaracaoFuncaoContext)_localctx).ID);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(T__0);
			setState(22);
			expressao(0);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicacaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode MUL() { return getToken(HaskellParser.MUL, 0); }
		public MultiplicacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMultiplicacao(this);
		}
	}
	public static class LessOrEqualContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode LE() { return getToken(HaskellParser.LE, 0); }
		public LessOrEqualContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLessOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLessOrEqual(this);
		}
	}
	public static class AplicacaoFuncaoContext extends ExpressaoContext {
		public Token funcname;
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public AplicacaoFuncaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterAplicacaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitAplicacaoFuncao(this);
		}
	}
	public static class OrContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OR() { return getToken(HaskellParser.OR, 0); }
		public OrContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitOr(this);
		}
	}
	public static class ParentesisContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ParentesisContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitParentesis(this);
		}
	}
	public static class GreaterOrEqualContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode GE() { return getToken(HaskellParser.GE, 0); }
		public GreaterOrEqualContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGreaterOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGreaterOrEqual(this);
		}
	}
	public static class BooleanoContext extends ExpressaoContext {
		public TerminalNode BOOL() { return getToken(HaskellParser.BOOL, 0); }
		public BooleanoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitBooleano(this);
		}
	}
	public static class SubtracaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode SUB() { return getToken(HaskellParser.SUB, 0); }
		public SubtracaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterSubtracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitSubtracao(this);
		}
	}
	public static class NotContext extends ExpressaoContext {
		public TerminalNode NOT() { return getToken(HaskellParser.NOT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NotContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitNot(this);
		}
	}
	public static class LessThanContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode LT() { return getToken(HaskellParser.LT, 0); }
		public LessThanContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLessThan(this);
		}
	}
	public static class EqualContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode EQ() { return getToken(HaskellParser.EQ, 0); }
		public EqualContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitEqual(this);
		}
	}
	public static class GreaterThanContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode GT() { return getToken(HaskellParser.GT, 0); }
		public GreaterThanContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGreaterThan(this);
		}
	}
	public static class AndContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode AND() { return getToken(HaskellParser.AND, 0); }
		public AndContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitAnd(this);
		}
	}
	public static class SomaContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode SOM() { return getToken(HaskellParser.SOM, 0); }
		public SomaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitSoma(this);
		}
	}
	public static class DivisorContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode DIV() { return getToken(HaskellParser.DIV, 0); }
		public DivisorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDivisor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDivisor(this);
		}
	}
	public static class IfThenElseContext extends ExpressaoContext {
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public IfThenElseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitIfThenElse(this);
		}
	}
	public static class IdentificadorContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public IdentificadorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitIdentificador(this);
		}
	}
	public static class InteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(HaskellParser.INT, 0); }
		public InteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitInteiro(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new IfThenElseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				match(IF);
				setState(26);
				expressao(0);
				setState(27);
				match(THEN);
				setState(28);
				expressao(0);
				setState(29);
				match(ELSE);
				setState(30);
				expressao(0);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(NOT);
				setState(33);
				expressao(6);
				}
				break;
			case 3:
				{
				_localctx = new AplicacaoFuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				((AplicacaoFuncaoContext)_localctx).funcname = match(ID);
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(35);
						expressao(0);
						}
						} 
					}
					setState(40);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case 4:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__1);
				setState(42);
				expressao(0);
				setState(43);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new BooleanoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new IdentificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new EqualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(50);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(51);
						match(EQ);
						setState(52);
						expressao(18);
						}
						break;
					case 2:
						{
						_localctx = new LessOrEqualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(53);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(54);
						match(LE);
						setState(55);
						expressao(17);
						}
						break;
					case 3:
						{
						_localctx = new GreaterOrEqualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(56);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(57);
						match(GE);
						setState(58);
						expressao(16);
						}
						break;
					case 4:
						{
						_localctx = new LessThanContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(59);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(60);
						match(LT);
						setState(61);
						expressao(15);
						}
						break;
					case 5:
						{
						_localctx = new GreaterThanContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(62);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(63);
						match(GT);
						setState(64);
						expressao(14);
						}
						break;
					case 6:
						{
						_localctx = new MultiplicacaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(65);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(66);
						match(MUL);
						setState(67);
						expressao(13);
						}
						break;
					case 7:
						{
						_localctx = new DivisorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(68);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(69);
						match(DIV);
						setState(70);
						expressao(12);
						}
						break;
					case 8:
						{
						_localctx = new SomaContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(71);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(72);
						match(SOM);
						setState(73);
						expressao(11);
						}
						break;
					case 9:
						{
						_localctx = new SubtracaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(74);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(75);
						match(SUB);
						setState(76);
						expressao(10);
						}
						break;
					case 10:
						{
						_localctx = new AndContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(77);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(78);
						match(AND);
						setState(79);
						expressao(9);
						}
						break;
					case 11:
						{
						_localctx = new OrContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(80);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(81);
						match(OR);
						setState(82);
						expressao(8);
						}
						break;
					}
					} 
				}
				setState(87);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\7\3\23\n\3\f\3\16"+
		"\3\26\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\'\n\4\f\4\16\4*\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4V\n\4\f\4"+
		"\16\4Y\13\4\3\4\2\3\6\5\2\4\6\2\2k\2\16\3\2\2\2\4\20\3\2\2\2\6\62\3\2"+
		"\2\2\b\t\5\6\4\2\t\n\7\2\2\3\n\17\3\2\2\2\13\f\5\4\3\2\f\r\7\2\2\3\r\17"+
		"\3\2\2\2\16\b\3\2\2\2\16\13\3\2\2\2\17\3\3\2\2\2\20\24\7\30\2\2\21\23"+
		"\7\30\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27"+
		"\3\2\2\2\26\24\3\2\2\2\27\30\7\3\2\2\30\31\5\6\4\2\31\5\3\2\2\2\32\33"+
		"\b\4\1\2\33\34\7\f\2\2\34\35\5\6\4\2\35\36\7\r\2\2\36\37\5\6\4\2\37 \7"+
		"\16\2\2 !\5\6\4\2!\63\3\2\2\2\"#\7\17\2\2#\63\5\6\4\b$(\7\30\2\2%\'\5"+
		"\6\4\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\63\3\2\2\2*(\3\2\2\2"+
		"+,\7\4\2\2,-\5\6\4\2-.\7\5\2\2.\63\3\2\2\2/\63\7\26\2\2\60\63\7\27\2\2"+
		"\61\63\7\30\2\2\62\32\3\2\2\2\62\"\3\2\2\2\62$\3\2\2\2\62+\3\2\2\2\62"+
		"/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63W\3\2\2\2\64\65\f\23\2\2\65\66"+
		"\7\13\2\2\66V\5\6\4\24\678\f\22\2\289\7\7\2\29V\5\6\4\23:;\f\21\2\2;<"+
		"\7\b\2\2<V\5\6\4\22=>\f\20\2\2>?\7\t\2\2?V\5\6\4\21@A\f\17\2\2AB\7\n\2"+
		"\2BV\5\6\4\20CD\f\16\2\2DE\7\24\2\2EV\5\6\4\17FG\f\r\2\2GH\7\22\2\2HV"+
		"\5\6\4\16IJ\f\f\2\2JK\7\25\2\2KV\5\6\4\rLM\f\13\2\2MN\7\23\2\2NV\5\6\4"+
		"\fOP\f\n\2\2PQ\7\21\2\2QV\5\6\4\13RS\f\t\2\2ST\7\20\2\2TV\5\6\4\nU\64"+
		"\3\2\2\2U\67\3\2\2\2U:\3\2\2\2U=\3\2\2\2U@\3\2\2\2UC\3\2\2\2UF\3\2\2\2"+
		"UI\3\2\2\2UL\3\2\2\2UO\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"X\7\3\2\2\2YW\3\2\2\2\b\16\24(\62UW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}