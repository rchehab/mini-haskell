// Generated from Haskell.g4 by ANTLR 4.5.3

	package br.unb.poo.mh.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, LE=3, GE=4, LT=5, GT=6, EQ=7, IF=8, THEN=9, ELSE=10, NOT=11, 
		OR=12, AND=13, DIV=14, SUB=15, MUL=16, SOM=17, INT=18, BOOL=19, ID=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "WS", "LE", "GE", "LT", "GT", "EQ", "IF", "THEN", "ELSE", "NOT", 
		"OR", "AND", "DIV", "SUB", "MUL", "SOM", "INT", "BOOL", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, "'<='", "'>='", "'<'", "'>'", "'=='", "'if'", "'then'", 
		"'else'", null, null, null, "'/'", "'-'", "'*'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "LE", "GE", "LT", "GT", "EQ", "IF", "THEN", "ELSE", 
		"NOT", "OR", "AND", "DIV", "SUB", "MUL", "SOM", "INT", "BOOL", "ID"
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


	public HaskellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Haskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\6\3/\n\3\r\3\16\3\60\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fU\n\f\3\r\3\r\3\r\3\r\5\r[\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"c\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23n\n\23\r\23\16"+
		"\23o\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0084\n\24\3\25\5\25\u0087\n\25\3\25\7"+
		"\25\u008a\n\25\f\25\16\25\u008d\13\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"\3\2\6\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\5\2\62;C\\c|\u0096\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2\2\7\64\3\2\2\2\t\67"+
		"\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21A\3\2\2\2\23D\3\2\2\2\25"+
		"I\3\2\2\2\27T\3\2\2\2\31Z\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2"+
		"!h\3\2\2\2#j\3\2\2\2%m\3\2\2\2\'\u0083\3\2\2\2)\u0086\3\2\2\2+,\7?\2\2"+
		",\4\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2"+
		"\61\62\3\2\2\2\62\63\b\3\2\2\63\6\3\2\2\2\64\65\7>\2\2\65\66\7?\2\2\66"+
		"\b\3\2\2\2\678\7@\2\289\7?\2\29\n\3\2\2\2:;\7>\2\2;\f\3\2\2\2<=\7@\2\2"+
		"=\16\3\2\2\2>?\7?\2\2?@\7?\2\2@\20\3\2\2\2AB\7k\2\2BC\7h\2\2C\22\3\2\2"+
		"\2DE\7v\2\2EF\7j\2\2FG\7g\2\2GH\7p\2\2H\24\3\2\2\2IJ\7g\2\2JK\7n\2\2K"+
		"L\7u\2\2LM\7g\2\2M\26\3\2\2\2NO\7p\2\2OP\7q\2\2PU\7v\2\2QR\7P\2\2RS\7"+
		"Q\2\2SU\7V\2\2TN\3\2\2\2TQ\3\2\2\2U\30\3\2\2\2VW\7q\2\2W[\7t\2\2XY\7Q"+
		"\2\2Y[\7T\2\2ZV\3\2\2\2ZX\3\2\2\2[\32\3\2\2\2\\]\7c\2\2]^\7p\2\2^c\7f"+
		"\2\2_`\7C\2\2`a\7P\2\2ac\7F\2\2b\\\3\2\2\2b_\3\2\2\2c\34\3\2\2\2de\7\61"+
		"\2\2e\36\3\2\2\2fg\7/\2\2g \3\2\2\2hi\7,\2\2i\"\3\2\2\2jk\7-\2\2k$\3\2"+
		"\2\2ln\t\3\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p&\3\2\2\2qr\7v"+
		"\2\2rs\7t\2\2st\7w\2\2t\u0084\7g\2\2uv\7V\2\2vw\7T\2\2wx\7W\2\2x\u0084"+
		"\7G\2\2yz\7h\2\2z{\7c\2\2{|\7n\2\2|}\7u\2\2}\u0084\7g\2\2~\177\7H\2\2"+
		"\177\u0080\7C\2\2\u0080\u0081\7N\2\2\u0081\u0082\7U\2\2\u0082\u0084\7"+
		"G\2\2\u0083q\3\2\2\2\u0083u\3\2\2\2\u0083y\3\2\2\2\u0083~\3\2\2\2\u0084"+
		"(\3\2\2\2\u0085\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0087\u008b\3\2\2\2"+
		"\u0088\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c*\3\2\2\2\u008d\u008b\3\2\2\2\f\2\60"+
		"TZbo\u0083\u0086\u0089\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}