// Generated from java-escape by ANTLR 4.11.1
package edu.westminstercollege.cmpt355.minijava;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, RESERVED_WORD=27, WHITESPACE=28, INT=29, DOUBLE=30, 
		BOOLEAN=31, NAME=32, STRING=33, LINE_COMMENT=34, BLOCK_COMMENT=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "RESERVED_WORD", "WHITESPACE", "DIGITS", "FIXED_POINT", "INT", 
			"DOUBLE", "BOOLEAN", "NAME", "STRING", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'.'", "';'", "'*;'", "'='", "'('", "','", "')'", "'{'", 
			"'}'", "'void'", "'main()'", "'return'", "'_print'", "'this'", "'new'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'double'", 
			"'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "RESERVED_WORD", "WHITESPACE", "INT", "DOUBLE", "BOOLEAN", 
			"NAME", "STRING", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000#\u023f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01ce\b\u001a"+
		"\u0001\u001b\u0004\u001b\u01d1\b\u001b\u000b\u001b\f\u001b\u01d2\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u01d8\b\u001c\u000b\u001c\f"+
		"\u001c\u01d9\u0001\u001d\u0004\u001d\u01dd\b\u001d\u000b\u001d\f\u001d"+
		"\u01de\u0001\u001d\u0001\u001d\u0005\u001d\u01e3\b\u001d\n\u001d\f\u001d"+
		"\u01e6\t\u001d\u0001\u001d\u0005\u001d\u01e9\b\u001d\n\u001d\f\u001d\u01ec"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u01f0\b\u001d\u000b\u001d"+
		"\f\u001d\u01f1\u0003\u001d\u01f4\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01fc\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0203"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0207\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0212\b \u0001"+
		"!\u0001!\u0005!\u0216\b!\n!\f!\u0219\t!\u0001\"\u0001\"\u0005\"\u021d"+
		"\b\"\n\"\f\"\u0220\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u0228\b#\n#\f#\u022b\t#\u0001#\u0003#\u022e\b#\u0001#\u0001#\u0001$"+
		"\u0001$\u0001$\u0001$\u0005$\u0236\b$\n$\f$\u0239\t$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003\u021e\u0229\u0237\u0000%\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u0000;\u0000=\u001d?\u001eA\u001fC E!G\"I#\u0001\u0000\u0007"+
		"\u0003\u0000\t\n\r\r  \u0001\u000009\u0002\u0000EEee\u0002\u0000++--\u0004"+
		"\u0000$$AZ__az\u0005\u0000$$09AZ__az\u0001\u0001\n\n\u027e\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u0000=\u0001"+
		"\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000"+
		"\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000"+
		"G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0001K\u0001"+
		"\u0000\u0000\u0000\u0003R\u0001\u0000\u0000\u0000\u0005T\u0001\u0000\u0000"+
		"\u0000\u0007V\u0001\u0000\u0000\u0000\tY\u0001\u0000\u0000\u0000\u000b"+
		"[\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000\u0000\u000f_\u0001\u0000"+
		"\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013c\u0001\u0000\u0000\u0000"+
		"\u0015e\u0001\u0000\u0000\u0000\u0017j\u0001\u0000\u0000\u0000\u0019q"+
		"\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000\u001d\u007f\u0001"+
		"\u0000\u0000\u0000\u001f\u0084\u0001\u0000\u0000\u0000!\u0088\u0001\u0000"+
		"\u0000\u0000#\u008b\u0001\u0000\u0000\u0000%\u008e\u0001\u0000\u0000\u0000"+
		"\'\u0090\u0001\u0000\u0000\u0000)\u0092\u0001\u0000\u0000\u0000+\u0094"+
		"\u0001\u0000\u0000\u0000-\u0096\u0001\u0000\u0000\u0000/\u0098\u0001\u0000"+
		"\u0000\u00001\u009c\u0001\u0000\u0000\u00003\u00a3\u0001\u0000\u0000\u0000"+
		"5\u01cd\u0001\u0000\u0000\u00007\u01d0\u0001\u0000\u0000\u00009\u01d7"+
		"\u0001\u0000\u0000\u0000;\u01f3\u0001\u0000\u0000\u0000=\u01f5\u0001\u0000"+
		"\u0000\u0000?\u0206\u0001\u0000\u0000\u0000A\u0211\u0001\u0000\u0000\u0000"+
		"C\u0213\u0001\u0000\u0000\u0000E\u021a\u0001\u0000\u0000\u0000G\u0223"+
		"\u0001\u0000\u0000\u0000I\u0231\u0001\u0000\u0000\u0000KL\u0005i\u0000"+
		"\u0000LM\u0005m\u0000\u0000MN\u0005p\u0000\u0000NO\u0005o\u0000\u0000"+
		"OP\u0005r\u0000\u0000PQ\u0005t\u0000\u0000Q\u0002\u0001\u0000\u0000\u0000"+
		"RS\u0005.\u0000\u0000S\u0004\u0001\u0000\u0000\u0000TU\u0005;\u0000\u0000"+
		"U\u0006\u0001\u0000\u0000\u0000VW\u0005*\u0000\u0000WX\u0005;\u0000\u0000"+
		"X\b\u0001\u0000\u0000\u0000YZ\u0005=\u0000\u0000Z\n\u0001\u0000\u0000"+
		"\u0000[\\\u0005(\u0000\u0000\\\f\u0001\u0000\u0000\u0000]^\u0005,\u0000"+
		"\u0000^\u000e\u0001\u0000\u0000\u0000_`\u0005)\u0000\u0000`\u0010\u0001"+
		"\u0000\u0000\u0000ab\u0005{\u0000\u0000b\u0012\u0001\u0000\u0000\u0000"+
		"cd\u0005}\u0000\u0000d\u0014\u0001\u0000\u0000\u0000ef\u0005v\u0000\u0000"+
		"fg\u0005o\u0000\u0000gh\u0005i\u0000\u0000hi\u0005d\u0000\u0000i\u0016"+
		"\u0001\u0000\u0000\u0000jk\u0005m\u0000\u0000kl\u0005a\u0000\u0000lm\u0005"+
		"i\u0000\u0000mn\u0005n\u0000\u0000no\u0005(\u0000\u0000op\u0005)\u0000"+
		"\u0000p\u0018\u0001\u0000\u0000\u0000qr\u0005r\u0000\u0000rs\u0005e\u0000"+
		"\u0000st\u0005t\u0000\u0000tu\u0005u\u0000\u0000uv\u0005r\u0000\u0000"+
		"vw\u0005n\u0000\u0000w\u001a\u0001\u0000\u0000\u0000xy\u0005_\u0000\u0000"+
		"yz\u0005p\u0000\u0000z{\u0005r\u0000\u0000{|\u0005i\u0000\u0000|}\u0005"+
		"n\u0000\u0000}~\u0005t\u0000\u0000~\u001c\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005t\u0000\u0000\u0080\u0081\u0005h\u0000\u0000\u0081\u0082\u0005"+
		"i\u0000\u0000\u0082\u0083\u0005s\u0000\u0000\u0083\u001e\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005n\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086"+
		"\u0087\u0005w\u0000\u0000\u0087 \u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"+\u0000\u0000\u0089\u008a\u0005+\u0000\u0000\u008a\"\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005-\u0000\u0000\u008c\u008d\u0005-\u0000\u0000\u008d"+
		"$\u0001\u0000\u0000\u0000\u008e\u008f\u0005+\u0000\u0000\u008f&\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005-\u0000\u0000\u0091(\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005*\u0000\u0000\u0093*\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005/\u0000\u0000\u0095,\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"%\u0000\u0000\u0097.\u0001\u0000\u0000\u0000\u0098\u0099\u0005i\u0000"+
		"\u0000\u0099\u009a\u0005n\u0000\u0000\u009a\u009b\u0005t\u0000\u0000\u009b"+
		"0\u0001\u0000\u0000\u0000\u009c\u009d\u0005d\u0000\u0000\u009d\u009e\u0005"+
		"o\u0000\u0000\u009e\u009f\u0005u\u0000\u0000\u009f\u00a0\u0005b\u0000"+
		"\u0000\u00a0\u00a1\u0005l\u0000\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2"+
		"2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005b\u0000\u0000\u00a4\u00a5\u0005"+
		"o\u0000\u0000\u00a5\u00a6\u0005o\u0000\u0000\u00a6\u00a7\u0005l\u0000"+
		"\u0000\u00a7\u00a8\u0005e\u0000\u0000\u00a8\u00a9\u0005a\u0000\u0000\u00a9"+
		"\u00aa\u0005n\u0000\u0000\u00aa4\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"a\u0000\u0000\u00ac\u00ad\u0005b\u0000\u0000\u00ad\u00ae\u0005s\u0000"+
		"\u0000\u00ae\u00af\u0005t\u0000\u0000\u00af\u00b0\u0005r\u0000\u0000\u00b0"+
		"\u00b1\u0005a\u0000\u0000\u00b1\u00b2\u0005c\u0000\u0000\u00b2\u01ce\u0005"+
		"t\u0000\u0000\u00b3\u00b4\u0005c\u0000\u0000\u00b4\u00b5\u0005o\u0000"+
		"\u0000\u00b5\u00b6\u0005n\u0000\u0000\u00b6\u00b7\u0005t\u0000\u0000\u00b7"+
		"\u00b8\u0005i\u0000\u0000\u00b8\u00b9\u0005n\u0000\u0000\u00b9\u00ba\u0005"+
		"u\u0000\u0000\u00ba\u01ce\u0005e\u0000\u0000\u00bb\u00bc\u0005f\u0000"+
		"\u0000\u00bc\u00bd\u0005o\u0000\u0000\u00bd\u01ce\u0005r\u0000\u0000\u00be"+
		"\u00bf\u0005n\u0000\u0000\u00bf\u00c0\u0005e\u0000\u0000\u00c0\u01ce\u0005"+
		"w\u0000\u0000\u00c1\u00c2\u0005s\u0000\u0000\u00c2\u00c3\u0005w\u0000"+
		"\u0000\u00c3\u00c4\u0005i\u0000\u0000\u00c4\u00c5\u0005t\u0000\u0000\u00c5"+
		"\u00c6\u0005c\u0000\u0000\u00c6\u01ce\u0005h\u0000\u0000\u00c7\u00c8\u0005"+
		"a\u0000\u0000\u00c8\u00c9\u0005s\u0000\u0000\u00c9\u00ca\u0005s\u0000"+
		"\u0000\u00ca\u00cb\u0005e\u0000\u0000\u00cb\u00cc\u0005r\u0000\u0000\u00cc"+
		"\u01ce\u0005t\u0000\u0000\u00cd\u00ce\u0005d\u0000\u0000\u00ce\u00cf\u0005"+
		"e\u0000\u0000\u00cf\u00d0\u0005f\u0000\u0000\u00d0\u00d1\u0005a\u0000"+
		"\u0000\u00d1\u00d2\u0005u\u0000\u0000\u00d2\u00d3\u0005l\u0000\u0000\u00d3"+
		"\u01ce\u0005t\u0000\u0000\u00d4\u00d5\u0005i\u0000\u0000\u00d5\u01ce\u0005"+
		"f\u0000\u0000\u00d6\u00d7\u0005p\u0000\u0000\u00d7\u00d8\u0005a\u0000"+
		"\u0000\u00d8\u00d9\u0005c\u0000\u0000\u00d9\u00da\u0005k\u0000\u0000\u00da"+
		"\u00db\u0005a\u0000\u0000\u00db\u00dc\u0005g\u0000\u0000\u00dc\u01ce\u0005"+
		"e\u0000\u0000\u00dd\u00de\u0005s\u0000\u0000\u00de\u00df\u0005y\u0000"+
		"\u0000\u00df\u00e0\u0005n\u0000\u0000\u00e0\u00e1\u0005c\u0000\u0000\u00e1"+
		"\u00e2\u0005h\u0000\u0000\u00e2\u00e3\u0005r\u0000\u0000\u00e3\u00e4\u0005"+
		"o\u0000\u0000\u00e4\u00e5\u0005n\u0000\u0000\u00e5\u00e6\u0005i\u0000"+
		"\u0000\u00e6\u00e7\u0005z\u0000\u0000\u00e7\u00e8\u0005e\u0000\u0000\u00e8"+
		"\u01ce\u0005d\u0000\u0000\u00e9\u00ea\u0005b\u0000\u0000\u00ea\u00eb\u0005"+
		"o\u0000\u0000\u00eb\u00ec\u0005o\u0000\u0000\u00ec\u00ed\u0005l\u0000"+
		"\u0000\u00ed\u00ee\u0005e\u0000\u0000\u00ee\u00ef\u0005a\u0000\u0000\u00ef"+
		"\u01ce\u0005n\u0000\u0000\u00f0\u00f1\u0005d\u0000\u0000\u00f1\u01ce\u0005"+
		"o\u0000\u0000\u00f2\u00f3\u0005g\u0000\u0000\u00f3\u00f4\u0005o\u0000"+
		"\u0000\u00f4\u00f5\u0005t\u0000\u0000\u00f5\u01ce\u0005o\u0000\u0000\u00f6"+
		"\u00f7\u0005p\u0000\u0000\u00f7\u00f8\u0005r\u0000\u0000\u00f8\u00f9\u0005"+
		"i\u0000\u0000\u00f9\u00fa\u0005v\u0000\u0000\u00fa\u00fb\u0005a\u0000"+
		"\u0000\u00fb\u00fc\u0005t\u0000\u0000\u00fc\u01ce\u0005e\u0000\u0000\u00fd"+
		"\u00fe\u0005t\u0000\u0000\u00fe\u00ff\u0005h\u0000\u0000\u00ff\u0100\u0005"+
		"i\u0000\u0000\u0100\u01ce\u0005s\u0000\u0000\u0101\u0102\u0005b\u0000"+
		"\u0000\u0102\u0103\u0005r\u0000\u0000\u0103\u0104\u0005e\u0000\u0000\u0104"+
		"\u0105\u0005a\u0000\u0000\u0105\u01ce\u0005k\u0000\u0000\u0106\u0107\u0005"+
		"d\u0000\u0000\u0107\u0108\u0005o\u0000\u0000\u0108\u0109\u0005u\u0000"+
		"\u0000\u0109\u010a\u0005b\u0000\u0000\u010a\u010b\u0005l\u0000\u0000\u010b"+
		"\u01ce\u0005e\u0000\u0000\u010c\u010d\u0005i\u0000\u0000\u010d\u010e\u0005"+
		"m\u0000\u0000\u010e\u010f\u0005p\u0000\u0000\u010f\u0110\u0005l\u0000"+
		"\u0000\u0110\u0111\u0005e\u0000\u0000\u0111\u0112\u0005m\u0000\u0000\u0112"+
		"\u0113\u0005e\u0000\u0000\u0113\u0114\u0005n\u0000\u0000\u0114\u0115\u0005"+
		"t\u0000\u0000\u0115\u01ce\u0005s\u0000\u0000\u0116\u0117\u0005p\u0000"+
		"\u0000\u0117\u0118\u0005r\u0000\u0000\u0118\u0119\u0005o\u0000\u0000\u0119"+
		"\u011a\u0005t\u0000\u0000\u011a\u011b\u0005e\u0000\u0000\u011b\u011c\u0005"+
		"c\u0000\u0000\u011c\u011d\u0005t\u0000\u0000\u011d\u011e\u0005e\u0000"+
		"\u0000\u011e\u01ce\u0005d\u0000\u0000\u011f\u0120\u0005t\u0000\u0000\u0120"+
		"\u0121\u0005h\u0000\u0000\u0121\u0122\u0005r\u0000\u0000\u0122\u0123\u0005"+
		"o\u0000\u0000\u0123\u01ce\u0005w\u0000\u0000\u0124\u0125\u0005b\u0000"+
		"\u0000\u0125\u0126\u0005y\u0000\u0000\u0126\u0127\u0005t\u0000\u0000\u0127"+
		"\u01ce\u0005e\u0000\u0000\u0128\u0129\u0005e\u0000\u0000\u0129\u012a\u0005"+
		"l\u0000\u0000\u012a\u012b\u0005s\u0000\u0000\u012b\u01ce\u0005e\u0000"+
		"\u0000\u012c\u012d\u0005i\u0000\u0000\u012d\u012e\u0005m\u0000\u0000\u012e"+
		"\u012f\u0005p\u0000\u0000\u012f\u0130\u0005o\u0000\u0000\u0130\u0131\u0005"+
		"r\u0000\u0000\u0131\u01ce\u0005t\u0000\u0000\u0132\u0133\u0005p\u0000"+
		"\u0000\u0133\u0134\u0005u\u0000\u0000\u0134\u0135\u0005b\u0000\u0000\u0135"+
		"\u0136\u0005l\u0000\u0000\u0136\u0137\u0005i\u0000\u0000\u0137\u01ce\u0005"+
		"c\u0000\u0000\u0138\u0139\u0005t\u0000\u0000\u0139\u013a\u0005h\u0000"+
		"\u0000\u013a\u013b\u0005r\u0000\u0000\u013b\u013c\u0005o\u0000\u0000\u013c"+
		"\u013d\u0005w\u0000\u0000\u013d\u01ce\u0005s\u0000\u0000\u013e\u013f\u0005"+
		"c\u0000\u0000\u013f\u0140\u0005a\u0000\u0000\u0140\u0141\u0005s\u0000"+
		"\u0000\u0141\u01ce\u0005e\u0000\u0000\u0142\u0143\u0005e\u0000\u0000\u0143"+
		"\u0144\u0005n\u0000\u0000\u0144\u0145\u0005u\u0000\u0000\u0145\u01ce\u0005"+
		"m\u0000\u0000\u0146\u0147\u0005i\u0000\u0000\u0147\u0148\u0005n\u0000"+
		"\u0000\u0148\u0149\u0005s\u0000\u0000\u0149\u014a\u0005t\u0000\u0000\u014a"+
		"\u014b\u0005a\u0000\u0000\u014b\u014c\u0005n\u0000\u0000\u014c\u014d\u0005"+
		"c\u0000\u0000\u014d\u014e\u0005e\u0000\u0000\u014e\u014f\u0005o\u0000"+
		"\u0000\u014f\u01ce\u0005f\u0000\u0000\u0150\u0151\u0005r\u0000\u0000\u0151"+
		"\u0152\u0005e\u0000\u0000\u0152\u0153\u0005t\u0000\u0000\u0153\u0154\u0005"+
		"u\u0000\u0000\u0154\u0155\u0005r\u0000\u0000\u0155\u01ce\u0005n\u0000"+
		"\u0000\u0156\u0157\u0005t\u0000\u0000\u0157\u0158\u0005r\u0000\u0000\u0158"+
		"\u0159\u0005a\u0000\u0000\u0159\u015a\u0005n\u0000\u0000\u015a\u015b\u0005"+
		"s\u0000\u0000\u015b\u015c\u0005i\u0000\u0000\u015c\u015d\u0005e\u0000"+
		"\u0000\u015d\u015e\u0005n\u0000\u0000\u015e\u01ce\u0005t\u0000\u0000\u015f"+
		"\u0160\u0005c\u0000\u0000\u0160\u0161\u0005a\u0000\u0000\u0161\u0162\u0005"+
		"t\u0000\u0000\u0162\u0163\u0005c\u0000\u0000\u0163\u01ce\u0005h\u0000"+
		"\u0000\u0164\u0165\u0005e\u0000\u0000\u0165\u0166\u0005x\u0000\u0000\u0166"+
		"\u0167\u0005t\u0000\u0000\u0167\u0168\u0005e\u0000\u0000\u0168\u0169\u0005"+
		"n\u0000\u0000\u0169\u016a\u0005d\u0000\u0000\u016a\u01ce\u0005s\u0000"+
		"\u0000\u016b\u016c\u0005i\u0000\u0000\u016c\u016d\u0005n\u0000\u0000\u016d"+
		"\u01ce\u0005t\u0000\u0000\u016e\u016f\u0005s\u0000\u0000\u016f\u0170\u0005"+
		"h\u0000\u0000\u0170\u0171\u0005o\u0000\u0000\u0171\u0172\u0005r\u0000"+
		"\u0000\u0172\u01ce\u0005t\u0000\u0000\u0173\u0174\u0005t\u0000\u0000\u0174"+
		"\u0175\u0005r\u0000\u0000\u0175\u01ce\u0005y\u0000\u0000\u0176\u0177\u0005"+
		"c\u0000\u0000\u0177\u0178\u0005h\u0000\u0000\u0178\u0179\u0005a\u0000"+
		"\u0000\u0179\u01ce\u0005r\u0000\u0000\u017a\u017b\u0005f\u0000\u0000\u017b"+
		"\u017c\u0005i\u0000\u0000\u017c\u017d\u0005n\u0000\u0000\u017d\u017e\u0005"+
		"a\u0000\u0000\u017e\u01ce\u0005l\u0000\u0000\u017f\u0180\u0005i\u0000"+
		"\u0000\u0180\u0181\u0005n\u0000\u0000\u0181\u0182\u0005t\u0000\u0000\u0182"+
		"\u0183\u0005e\u0000\u0000\u0183\u0184\u0005r\u0000\u0000\u0184\u0185\u0005"+
		"f\u0000\u0000\u0185\u0186\u0005a\u0000\u0000\u0186\u0187\u0005c\u0000"+
		"\u0000\u0187\u01ce\u0005e\u0000\u0000\u0188\u0189\u0005s\u0000\u0000\u0189"+
		"\u018a\u0005t\u0000\u0000\u018a\u018b\u0005a\u0000\u0000\u018b\u018c\u0005"+
		"t\u0000\u0000\u018c\u018d\u0005i\u0000\u0000\u018d\u01ce\u0005c\u0000"+
		"\u0000\u018e\u018f\u0005v\u0000\u0000\u018f\u0190\u0005o\u0000\u0000\u0190"+
		"\u0191\u0005i\u0000\u0000\u0191\u01ce\u0005d\u0000\u0000\u0192\u0193\u0005"+
		"c\u0000\u0000\u0193\u0194\u0005l\u0000\u0000\u0194\u0195\u0005a\u0000"+
		"\u0000\u0195\u0196\u0005s\u0000\u0000\u0196\u01ce\u0005s\u0000\u0000\u0197"+
		"\u0198\u0005f\u0000\u0000\u0198\u0199\u0005i\u0000\u0000\u0199\u019a\u0005"+
		"n\u0000\u0000\u019a\u019b\u0005a\u0000\u0000\u019b\u019c\u0005l\u0000"+
		"\u0000\u019c\u019d\u0005l\u0000\u0000\u019d\u01ce\u0005y\u0000\u0000\u019e"+
		"\u019f\u0005l\u0000\u0000\u019f\u01a0\u0005o\u0000\u0000\u01a0\u01a1\u0005"+
		"n\u0000\u0000\u01a1\u01ce\u0005g\u0000\u0000\u01a2\u01a3\u0005s\u0000"+
		"\u0000\u01a3\u01a4\u0005t\u0000\u0000\u01a4\u01a5\u0005r\u0000\u0000\u01a5"+
		"\u01a6\u0005i\u0000\u0000\u01a6\u01a7\u0005c\u0000\u0000\u01a7\u01a8\u0005"+
		"t\u0000\u0000\u01a8\u01a9\u0005f\u0000\u0000\u01a9\u01ce\u0005p\u0000"+
		"\u0000\u01aa\u01ab\u0005v\u0000\u0000\u01ab\u01ac\u0005o\u0000\u0000\u01ac"+
		"\u01ad\u0005l\u0000\u0000\u01ad\u01ae\u0005a\u0000\u0000\u01ae\u01af\u0005"+
		"t\u0000\u0000\u01af\u01b0\u0005i\u0000\u0000\u01b0\u01b1\u0005l\u0000"+
		"\u0000\u01b1\u01ce\u0005e\u0000\u0000\u01b2\u01b3\u0005c\u0000\u0000\u01b3"+
		"\u01b4\u0005o\u0000\u0000\u01b4\u01b5\u0005n\u0000\u0000\u01b5\u01b6\u0005"+
		"s\u0000\u0000\u01b6\u01ce\u0005t\u0000\u0000\u01b7\u01b8\u0005f\u0000"+
		"\u0000\u01b8\u01b9\u0005l\u0000\u0000\u01b9\u01ba\u0005o\u0000\u0000\u01ba"+
		"\u01bb\u0005a\u0000\u0000\u01bb\u01ce\u0005t\u0000\u0000\u01bc\u01bd\u0005"+
		"n\u0000\u0000\u01bd\u01be\u0005a\u0000\u0000\u01be\u01bf\u0005t\u0000"+
		"\u0000\u01bf\u01c0\u0005i\u0000\u0000\u01c0\u01c1\u0005v\u0000\u0000\u01c1"+
		"\u01ce\u0005e\u0000\u0000\u01c2\u01c3\u0005s\u0000\u0000\u01c3\u01c4\u0005"+
		"u\u0000\u0000\u01c4\u01c5\u0005p\u0000\u0000\u01c5\u01c6\u0005e\u0000"+
		"\u0000\u01c6\u01ce\u0005r\u0000\u0000\u01c7\u01c8\u0005w\u0000\u0000\u01c8"+
		"\u01c9\u0005h\u0000\u0000\u01c9\u01ca\u0005i\u0000\u0000\u01ca\u01cb\u0005"+
		"l\u0000\u0000\u01cb\u01ce\u0005e\u0000\u0000\u01cc\u01ce\u0005_\u0000"+
		"\u0000\u01cd\u00ab\u0001\u0000\u0000\u0000\u01cd\u00b3\u0001\u0000\u0000"+
		"\u0000\u01cd\u00bb\u0001\u0000\u0000\u0000\u01cd\u00be\u0001\u0000\u0000"+
		"\u0000\u01cd\u00c1\u0001\u0000\u0000\u0000\u01cd\u00c7\u0001\u0000\u0000"+
		"\u0000\u01cd\u00cd\u0001\u0000\u0000\u0000\u01cd\u00d4\u0001\u0000\u0000"+
		"\u0000\u01cd\u00d6\u0001\u0000\u0000\u0000\u01cd\u00dd\u0001\u0000\u0000"+
		"\u0000\u01cd\u00e9\u0001\u0000\u0000\u0000\u01cd\u00f0\u0001\u0000\u0000"+
		"\u0000\u01cd\u00f2\u0001\u0000\u0000\u0000\u01cd\u00f6\u0001\u0000\u0000"+
		"\u0000\u01cd\u00fd\u0001\u0000\u0000\u0000\u01cd\u0101\u0001\u0000\u0000"+
		"\u0000\u01cd\u0106\u0001\u0000\u0000\u0000\u01cd\u010c\u0001\u0000\u0000"+
		"\u0000\u01cd\u0116\u0001\u0000\u0000\u0000\u01cd\u011f\u0001\u0000\u0000"+
		"\u0000\u01cd\u0124\u0001\u0000\u0000\u0000\u01cd\u0128\u0001\u0000\u0000"+
		"\u0000\u01cd\u012c\u0001\u0000\u0000\u0000\u01cd\u0132\u0001\u0000\u0000"+
		"\u0000\u01cd\u0138\u0001\u0000\u0000\u0000\u01cd\u013e\u0001\u0000\u0000"+
		"\u0000\u01cd\u0142\u0001\u0000\u0000\u0000\u01cd\u0146\u0001\u0000\u0000"+
		"\u0000\u01cd\u0150\u0001\u0000\u0000\u0000\u01cd\u0156\u0001\u0000\u0000"+
		"\u0000\u01cd\u015f\u0001\u0000\u0000\u0000\u01cd\u0164\u0001\u0000\u0000"+
		"\u0000\u01cd\u016b\u0001\u0000\u0000\u0000\u01cd\u016e\u0001\u0000\u0000"+
		"\u0000\u01cd\u0173\u0001\u0000\u0000\u0000\u01cd\u0176\u0001\u0000\u0000"+
		"\u0000\u01cd\u017a\u0001\u0000\u0000\u0000\u01cd\u017f\u0001\u0000\u0000"+
		"\u0000\u01cd\u0188\u0001\u0000\u0000\u0000\u01cd\u018e\u0001\u0000\u0000"+
		"\u0000\u01cd\u0192\u0001\u0000\u0000\u0000\u01cd\u0197\u0001\u0000\u0000"+
		"\u0000\u01cd\u019e\u0001\u0000\u0000\u0000\u01cd\u01a2\u0001\u0000\u0000"+
		"\u0000\u01cd\u01aa\u0001\u0000\u0000\u0000\u01cd\u01b2\u0001\u0000\u0000"+
		"\u0000\u01cd\u01b7\u0001\u0000\u0000\u0000\u01cd\u01bc\u0001\u0000\u0000"+
		"\u0000\u01cd\u01c2\u0001\u0000\u0000\u0000\u01cd\u01c7\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce6\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d1\u0007\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0006\u001b\u0000\u0000\u01d58\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d8\u0007\u0001\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da:\u0001\u0000\u0000\u0000\u01db\u01dd"+
		"\u0007\u0001\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e4"+
		"\u0005.\u0000\u0000\u01e1\u01e3\u0007\u0001\u0000\u0000\u01e2\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01f4\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e9\u0007"+
		"\u0001\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ef\u0005.\u0000\u0000\u01ee\u01f0\u0007\u0001"+
		"\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01dc\u0001\u0000"+
		"\u0000\u0000\u01f3\u01ea\u0001\u0000\u0000\u0000\u01f4<\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u00039\u001c\u0000\u01f6>\u0001\u0000\u0000\u0000\u01f7"+
		"\u0207\u0003;\u001d\u0000\u01f8\u01f9\u0003;\u001d\u0000\u01f9\u01fb\u0007"+
		"\u0002\u0000\u0000\u01fa\u01fc\u0007\u0003\u0000\u0000\u01fb\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0003=\u001e\u0000\u01fe\u0207\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u00039\u001c\u0000\u0200\u0202\u0007\u0002\u0000"+
		"\u0000\u0201\u0203\u0007\u0003\u0000\u0000\u0202\u0201\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u00039\u001c\u0000\u0205\u0207\u0001\u0000\u0000\u0000"+
		"\u0206\u01f7\u0001\u0000\u0000\u0000\u0206\u01f8\u0001\u0000\u0000\u0000"+
		"\u0206\u01ff\u0001\u0000\u0000\u0000\u0207@\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0005t\u0000\u0000\u0209\u020a\u0005r\u0000\u0000\u020a\u020b\u0005"+
		"u\u0000\u0000\u020b\u0212\u0005e\u0000\u0000\u020c\u020d\u0005f\u0000"+
		"\u0000\u020d\u020e\u0005a\u0000\u0000\u020e\u020f\u0005l\u0000\u0000\u020f"+
		"\u0210\u0005s\u0000\u0000\u0210\u0212\u0005e\u0000\u0000\u0211\u0208\u0001"+
		"\u0000\u0000\u0000\u0211\u020c\u0001\u0000\u0000\u0000\u0212B\u0001\u0000"+
		"\u0000\u0000\u0213\u0217\u0007\u0004\u0000\u0000\u0214\u0216\u0007\u0005"+
		"\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000"+
		"\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000"+
		"\u0000\u0000\u0218D\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000"+
		"\u0000\u021a\u021e\u0005\"\u0000\u0000\u021b\u021d\t\u0000\u0000\u0000"+
		"\u021c\u021b\u0001\u0000\u0000\u0000\u021d\u0220\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0005\"\u0000\u0000\u0222F\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0005/\u0000\u0000\u0224\u0225\u0005/\u0000\u0000\u0225\u0229\u0001"+
		"\u0000\u0000\u0000\u0226\u0228\t\u0000\u0000\u0000\u0227\u0226\u0001\u0000"+
		"\u0000\u0000\u0228\u022b\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000"+
		"\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022c\u022e\u0007\u0006"+
		"\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000"+
		"\u0000\u0000\u022f\u0230\u0006#\u0000\u0000\u0230H\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0005/\u0000\u0000\u0232\u0233\u0005*\u0000\u0000\u0233\u0237"+
		"\u0001\u0000\u0000\u0000\u0234\u0236\t\u0000\u0000\u0000\u0235\u0234\u0001"+
		"\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0238\u0001"+
		"\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u023a\u0001"+
		"\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023b\u0005"+
		"*\u0000\u0000\u023b\u023c\u0005/\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d\u023e\u0006$\u0000\u0000\u023eJ\u0001\u0000\u0000\u0000\u0012"+
		"\u0000\u01cd\u01d2\u01d9\u01de\u01e4\u01ea\u01f1\u01f3\u01fb\u0202\u0206"+
		"\u0211\u0217\u021e\u0229\u022d\u0237\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}