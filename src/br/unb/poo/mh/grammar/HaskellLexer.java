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
		T__0=1, T__1=2, T__2=3, WS=4, LE=5, GE=6, LT=7, GT=8, EQ=9, IF=10, THEN=11, 
		ELSE=12, NOT=13, OR=14, AND=15, DIV=16, SUB=17, MUL=18, SOM=19, INT=20, 
		BOOL=21, ID=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "WS", "LE", "GE", "LT", "GT", "EQ", "IF", "THEN", 
		"ELSE", "NOT", "OR", "AND", "DIV", "SUB", "MUL", "SOM", "INT", "BOOL", 
		"ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\6\5\67\n\5\r\5\16\58\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16]\n\16\3\17\3\17\3\17\3"+
		"\17\5\17c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20k\n\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\6\25v\n\25\r\25\16\25w\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u008c\n\26\3\27\5\27\u008f\n\27\3\27\7\27\u0092\n\27\f\27\16"+
		"\27\u0095\13\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\5\2\13\f"+
		"\17\17\"\"\3\2\62;\4\2C\\c|\5\2\62;C\\c|\u009e\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2"+
		"\2\2\t\66\3\2\2\2\13<\3\2\2\2\r?\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3"+
		"\2\2\2\25I\3\2\2\2\27L\3\2\2\2\31Q\3\2\2\2\33\\\3\2\2\2\35b\3\2\2\2\37"+
		"j\3\2\2\2!l\3\2\2\2#n\3\2\2\2%p\3\2\2\2\'r\3\2\2\2)u\3\2\2\2+\u008b\3"+
		"\2\2\2-\u008e\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61\62\7*\2\2\62\6\3\2\2"+
		"\2\63\64\7+\2\2\64\b\3\2\2\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\5\2\2;\n\3\2\2\2<=\7>\2\2=>\7?\2\2"+
		">\f\3\2\2\2?@\7@\2\2@A\7?\2\2A\16\3\2\2\2BC\7>\2\2C\20\3\2\2\2DE\7@\2"+
		"\2E\22\3\2\2\2FG\7?\2\2GH\7?\2\2H\24\3\2\2\2IJ\7k\2\2JK\7h\2\2K\26\3\2"+
		"\2\2LM\7v\2\2MN\7j\2\2NO\7g\2\2OP\7p\2\2P\30\3\2\2\2QR\7g\2\2RS\7n\2\2"+
		"ST\7u\2\2TU\7g\2\2U\32\3\2\2\2VW\7p\2\2WX\7q\2\2X]\7v\2\2YZ\7P\2\2Z[\7"+
		"Q\2\2[]\7V\2\2\\V\3\2\2\2\\Y\3\2\2\2]\34\3\2\2\2^_\7q\2\2_c\7t\2\2`a\7"+
		"Q\2\2ac\7T\2\2b^\3\2\2\2b`\3\2\2\2c\36\3\2\2\2de\7c\2\2ef\7p\2\2fk\7f"+
		"\2\2gh\7C\2\2hi\7P\2\2ik\7F\2\2jd\3\2\2\2jg\3\2\2\2k \3\2\2\2lm\7\61\2"+
		"\2m\"\3\2\2\2no\7/\2\2o$\3\2\2\2pq\7,\2\2q&\3\2\2\2rs\7-\2\2s(\3\2\2\2"+
		"tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x*\3\2\2\2yz\7v\2\2"+
		"z{\7t\2\2{|\7w\2\2|\u008c\7g\2\2}~\7V\2\2~\177\7T\2\2\177\u0080\7W\2\2"+
		"\u0080\u008c\7G\2\2\u0081\u0082\7h\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7n\2\2\u0084\u0085\7u\2\2\u0085\u008c\7g\2\2\u0086\u0087\7H\2\2\u0087"+
		"\u0088\7C\2\2\u0088\u0089\7N\2\2\u0089\u008a\7U\2\2\u008a\u008c\7G\2\2"+
		"\u008by\3\2\2\2\u008b}\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0086\3\2\2\2"+
		"\u008c,\3\2\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f\u0093\3"+
		"\2\2\2\u0090\u0092\t\5\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094.\3\2\2\2\u0095\u0093\3\2\2\2"+
		"\f\28\\bjw\u008b\u008e\u0091\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}