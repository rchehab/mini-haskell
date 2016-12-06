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
		RULE_start = 0, RULE_declaracao = 1, RULE_expressao = 2;
	public static final String[] ruleNames = {
		"start", "declaracao", "expressao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "','", null, "'<='", "'>='", "'<'", "'>'", 
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				match(T__1);
				setState(26);
				expressao(0);
				setState(27);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new IfThenElseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(IF);
				setState(30);
				expressao(0);
				setState(31);
				match(THEN);
				setState(32);
				expressao(0);
				setState(33);
				match(ELSE);
				setState(34);
				expressao(0);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(NOT);
				setState(37);
				expressao(5);
				}
				break;
			case 4:
				{
				_localctx = new AplicacaoFuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				((AplicacaoFuncaoContext)_localctx).funcname = match(ID);
				setState(39);
				match(T__1);
				setState(41);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << NOT) | (1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(40);
					expressao(0);
					}
				}

				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(43);
					match(T__3);
					setState(44);
					expressao(0);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new BooleanoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new IdentificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new EqualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(56);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(57);
						match(EQ);
						setState(58);
						expressao(18);
						}
						break;
					case 2:
						{
						_localctx = new LessThanContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(59);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(60);
						match(LT);
						setState(61);
						expressao(17);
						}
						break;
					case 3:
						{
						_localctx = new GreaterThanContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(62);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(63);
						match(GT);
						setState(64);
						expressao(16);
						}
						break;
					case 4:
						{
						_localctx = new LessOrEqualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(65);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(66);
						match(LE);
						setState(67);
						expressao(15);
						}
						break;
					case 5:
						{
						_localctx = new GreaterOrEqualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(68);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(69);
						match(GE);
						setState(70);
						expressao(14);
						}
						break;
					case 6:
						{
						_localctx = new MultiplicacaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(71);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(72);
						match(MUL);
						setState(73);
						expressao(12);
						}
						break;
					case 7:
						{
						_localctx = new DivisorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(74);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(75);
						match(DIV);
						setState(76);
						expressao(11);
						}
						break;
					case 8:
						{
						_localctx = new SomaContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(77);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(78);
						match(SOM);
						setState(79);
						expressao(10);
						}
						break;
					case 9:
						{
						_localctx = new SubtracaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(80);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(81);
						match(SUB);
						setState(82);
						expressao(9);
						}
						break;
					case 10:
						{
						_localctx = new AndContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(83);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(84);
						match(AND);
						setState(85);
						expressao(8);
						}
						break;
					case 11:
						{
						_localctx = new OrContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(86);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(87);
						match(OR);
						setState(88);
						expressao(7);
						}
						break;
					}
					} 
				}
				setState(93);
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
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\7\3\23\n\3\f\3\16"+
		"\3\26\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4\3\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\2\3\6\5\2\4\6\2\2r\2\16\3"+
		"\2\2\2\4\20\3\2\2\2\68\3\2\2\2\b\t\5\6\4\2\t\n\7\2\2\3\n\17\3\2\2\2\13"+
		"\f\5\4\3\2\f\r\7\2\2\3\r\17\3\2\2\2\16\b\3\2\2\2\16\13\3\2\2\2\17\3\3"+
		"\2\2\2\20\24\7\31\2\2\21\23\7\31\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\7\3\2\2\30\31"+
		"\5\6\4\2\31\5\3\2\2\2\32\33\b\4\1\2\33\34\7\4\2\2\34\35\5\6\4\2\35\36"+
		"\7\5\2\2\369\3\2\2\2\37 \7\r\2\2 !\5\6\4\2!\"\7\16\2\2\"#\5\6\4\2#$\7"+
		"\17\2\2$%\5\6\4\2%9\3\2\2\2&\'\7\20\2\2\'9\5\6\4\7()\7\31\2\2)+\7\4\2"+
		"\2*,\5\6\4\2+*\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-.\7\6\2\2.\60\5\6\4\2/-\3"+
		"\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2"+
		"\2\2\649\7\5\2\2\659\7\27\2\2\669\7\30\2\2\679\7\31\2\28\32\3\2\2\28\37"+
		"\3\2\2\28&\3\2\2\28(\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29]\3\2"+
		"\2\2:;\f\23\2\2;<\7\f\2\2<\\\5\6\4\24=>\f\22\2\2>?\7\n\2\2?\\\5\6\4\23"+
		"@A\f\21\2\2AB\7\13\2\2B\\\5\6\4\22CD\f\20\2\2DE\7\b\2\2E\\\5\6\4\21FG"+
		"\f\17\2\2GH\7\t\2\2H\\\5\6\4\20IJ\f\r\2\2JK\7\25\2\2K\\\5\6\4\16LM\f\f"+
		"\2\2MN\7\23\2\2N\\\5\6\4\rOP\f\13\2\2PQ\7\26\2\2Q\\\5\6\4\fRS\f\n\2\2"+
		"ST\7\24\2\2T\\\5\6\4\13UV\f\t\2\2VW\7\22\2\2W\\\5\6\4\nXY\f\b\2\2YZ\7"+
		"\21\2\2Z\\\5\6\4\t[:\3\2\2\2[=\3\2\2\2[@\3\2\2\2[C\3\2\2\2[F\3\2\2\2["+
		"I\3\2\2\2[L\3\2\2\2[O\3\2\2\2[R\3\2\2\2[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_]\3\2\2\2\t\16\24+\618[]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}