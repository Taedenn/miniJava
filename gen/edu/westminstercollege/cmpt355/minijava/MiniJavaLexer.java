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
		T__17=18, T__18=19, T__19=20, RESERVED_WORD=21, WHITESPACE=22, INT=23, 
		DOUBLE=24, BOOLEAN=25, NAME=26, STRING=27, LINE_COMMENT=28, BLOCK_COMMENT=29;
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
			"T__17", "T__18", "T__19", "RESERVED_WORD", "WHITESPACE", "DIGITS", "FIXED_POINT", 
			"INT", "DOUBLE", "BOOLEAN", "NAME", "STRING", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "','", "'='", "'_print'", "'('", "')'", "'.'", 
			"'new'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'int'", 
			"'double'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "RESERVED_WORD", 
			"WHITESPACE", "INT", "DOUBLE", "BOOLEAN", "NAME", "STRING", "LINE_COMMENT", 
			"BLOCK_COMMENT"
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
		"\u0004\u0000\u001d\u0211\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01a0\b\u0014\u0001\u0015\u0004\u0015\u01a3"+
		"\b\u0015\u000b\u0015\f\u0015\u01a4\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0004\u0016\u01aa\b\u0016\u000b\u0016\f\u0016\u01ab\u0001\u0017\u0004"+
		"\u0017\u01af\b\u0017\u000b\u0017\f\u0017\u01b0\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u01b5\b\u0017\n\u0017\f\u0017\u01b8\t\u0017\u0001\u0017\u0005"+
		"\u0017\u01bb\b\u0017\n\u0017\f\u0017\u01be\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0004\u0017\u01c2\b\u0017\u000b\u0017\f\u0017\u01c3\u0003\u0017\u01c6"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01ce\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01d5\b\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01d9\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01e4"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u01e8\b\u001b\n\u001b\f\u001b"+
		"\u01eb\t\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u01ef\b\u001c\n\u001c"+
		"\f\u001c\u01f2\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u01fa\b\u001d\n\u001d\f\u001d\u01fd"+
		"\t\u001d\u0001\u001d\u0003\u001d\u0200\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0208\b\u001e"+
		"\n\u001e\f\u001e\u020b\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u01f0\u01fb\u0209\u0000\u001f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0000/\u00001\u00173\u0018"+
		"5\u00197\u001a9\u001b;\u001c=\u001d\u0001\u0000\u0007\u0003\u0000\t\n"+
		"\r\r  \u0001\u000009\u0002\u0000EEee\u0002\u0000++--\u0004\u0000$$AZ_"+
		"_az\u0005\u0000$$09AZ__az\u0001\u0001\n\n\u0250\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0001?\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005"+
		"C\u0001\u0000\u0000\u0000\u0007E\u0001\u0000\u0000\u0000\tG\u0001\u0000"+
		"\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\rP\u0001\u0000\u0000\u0000"+
		"\u000fR\u0001\u0000\u0000\u0000\u0011T\u0001\u0000\u0000\u0000\u0013V"+
		"\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017]\u0001\u0000"+
		"\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bb\u0001\u0000\u0000\u0000"+
		"\u001dd\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000\u0000!h\u0001"+
		"\u0000\u0000\u0000#j\u0001\u0000\u0000\u0000%n\u0001\u0000\u0000\u0000"+
		"\'u\u0001\u0000\u0000\u0000)\u019f\u0001\u0000\u0000\u0000+\u01a2\u0001"+
		"\u0000\u0000\u0000-\u01a9\u0001\u0000\u0000\u0000/\u01c5\u0001\u0000\u0000"+
		"\u00001\u01c7\u0001\u0000\u0000\u00003\u01d8\u0001\u0000\u0000\u00005"+
		"\u01e3\u0001\u0000\u0000\u00007\u01e5\u0001\u0000\u0000\u00009\u01ec\u0001"+
		"\u0000\u0000\u0000;\u01f5\u0001\u0000\u0000\u0000=\u0203\u0001\u0000\u0000"+
		"\u0000?@\u0005;\u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005{\u0000"+
		"\u0000B\u0004\u0001\u0000\u0000\u0000CD\u0005}\u0000\u0000D\u0006\u0001"+
		"\u0000\u0000\u0000EF\u0005,\u0000\u0000F\b\u0001\u0000\u0000\u0000GH\u0005"+
		"=\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0005_\u0000\u0000JK\u0005"+
		"p\u0000\u0000KL\u0005r\u0000\u0000LM\u0005i\u0000\u0000MN\u0005n\u0000"+
		"\u0000NO\u0005t\u0000\u0000O\f\u0001\u0000\u0000\u0000PQ\u0005(\u0000"+
		"\u0000Q\u000e\u0001\u0000\u0000\u0000RS\u0005)\u0000\u0000S\u0010\u0001"+
		"\u0000\u0000\u0000TU\u0005.\u0000\u0000U\u0012\u0001\u0000\u0000\u0000"+
		"VW\u0005n\u0000\u0000WX\u0005e\u0000\u0000XY\u0005w\u0000\u0000Y\u0014"+
		"\u0001\u0000\u0000\u0000Z[\u0005+\u0000\u0000[\\\u0005+\u0000\u0000\\"+
		"\u0016\u0001\u0000\u0000\u0000]^\u0005-\u0000\u0000^_\u0005-\u0000\u0000"+
		"_\u0018\u0001\u0000\u0000\u0000`a\u0005+\u0000\u0000a\u001a\u0001\u0000"+
		"\u0000\u0000bc\u0005-\u0000\u0000c\u001c\u0001\u0000\u0000\u0000de\u0005"+
		"*\u0000\u0000e\u001e\u0001\u0000\u0000\u0000fg\u0005/\u0000\u0000g \u0001"+
		"\u0000\u0000\u0000hi\u0005%\u0000\u0000i\"\u0001\u0000\u0000\u0000jk\u0005"+
		"i\u0000\u0000kl\u0005n\u0000\u0000lm\u0005t\u0000\u0000m$\u0001\u0000"+
		"\u0000\u0000no\u0005d\u0000\u0000op\u0005o\u0000\u0000pq\u0005u\u0000"+
		"\u0000qr\u0005b\u0000\u0000rs\u0005l\u0000\u0000st\u0005e\u0000\u0000"+
		"t&\u0001\u0000\u0000\u0000uv\u0005b\u0000\u0000vw\u0005o\u0000\u0000w"+
		"x\u0005o\u0000\u0000xy\u0005l\u0000\u0000yz\u0005e\u0000\u0000z{\u0005"+
		"a\u0000\u0000{|\u0005n\u0000\u0000|(\u0001\u0000\u0000\u0000}~\u0005a"+
		"\u0000\u0000~\u007f\u0005b\u0000\u0000\u007f\u0080\u0005s\u0000\u0000"+
		"\u0080\u0081\u0005t\u0000\u0000\u0081\u0082\u0005r\u0000\u0000\u0082\u0083"+
		"\u0005a\u0000\u0000\u0083\u0084\u0005c\u0000\u0000\u0084\u01a0\u0005t"+
		"\u0000\u0000\u0085\u0086\u0005c\u0000\u0000\u0086\u0087\u0005o\u0000\u0000"+
		"\u0087\u0088\u0005n\u0000\u0000\u0088\u0089\u0005t\u0000\u0000\u0089\u008a"+
		"\u0005i\u0000\u0000\u008a\u008b\u0005n\u0000\u0000\u008b\u008c\u0005u"+
		"\u0000\u0000\u008c\u01a0\u0005e\u0000\u0000\u008d\u008e\u0005f\u0000\u0000"+
		"\u008e\u008f\u0005o\u0000\u0000\u008f\u01a0\u0005r\u0000\u0000\u0090\u0091"+
		"\u0005n\u0000\u0000\u0091\u0092\u0005e\u0000\u0000\u0092\u01a0\u0005w"+
		"\u0000\u0000\u0093\u0094\u0005s\u0000\u0000\u0094\u0095\u0005w\u0000\u0000"+
		"\u0095\u0096\u0005i\u0000\u0000\u0096\u0097\u0005t\u0000\u0000\u0097\u0098"+
		"\u0005c\u0000\u0000\u0098\u01a0\u0005h\u0000\u0000\u0099\u009a\u0005a"+
		"\u0000\u0000\u009a\u009b\u0005s\u0000\u0000\u009b\u009c\u0005s\u0000\u0000"+
		"\u009c\u009d\u0005e\u0000\u0000\u009d\u009e\u0005r\u0000\u0000\u009e\u01a0"+
		"\u0005t\u0000\u0000\u009f\u00a0\u0005d\u0000\u0000\u00a0\u00a1\u0005e"+
		"\u0000\u0000\u00a1\u00a2\u0005f\u0000\u0000\u00a2\u00a3\u0005a\u0000\u0000"+
		"\u00a3\u00a4\u0005u\u0000\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u01a0"+
		"\u0005t\u0000\u0000\u00a6\u00a7\u0005i\u0000\u0000\u00a7\u01a0\u0005f"+
		"\u0000\u0000\u00a8\u00a9\u0005p\u0000\u0000\u00a9\u00aa\u0005a\u0000\u0000"+
		"\u00aa\u00ab\u0005c\u0000\u0000\u00ab\u00ac\u0005k\u0000\u0000\u00ac\u00ad"+
		"\u0005a\u0000\u0000\u00ad\u00ae\u0005g\u0000\u0000\u00ae\u01a0\u0005e"+
		"\u0000\u0000\u00af\u00b0\u0005s\u0000\u0000\u00b0\u00b1\u0005y\u0000\u0000"+
		"\u00b1\u00b2\u0005n\u0000\u0000\u00b2\u00b3\u0005c\u0000\u0000\u00b3\u00b4"+
		"\u0005h\u0000\u0000\u00b4\u00b5\u0005r\u0000\u0000\u00b5\u00b6\u0005o"+
		"\u0000\u0000\u00b6\u00b7\u0005n\u0000\u0000\u00b7\u00b8\u0005i\u0000\u0000"+
		"\u00b8\u00b9\u0005z\u0000\u0000\u00b9\u00ba\u0005e\u0000\u0000\u00ba\u01a0"+
		"\u0005d\u0000\u0000\u00bb\u00bc\u0005b\u0000\u0000\u00bc\u00bd\u0005o"+
		"\u0000\u0000\u00bd\u00be\u0005o\u0000\u0000\u00be\u00bf\u0005l\u0000\u0000"+
		"\u00bf\u00c0\u0005e\u0000\u0000\u00c0\u00c1\u0005a\u0000\u0000\u00c1\u01a0"+
		"\u0005n\u0000\u0000\u00c2\u00c3\u0005d\u0000\u0000\u00c3\u01a0\u0005o"+
		"\u0000\u0000\u00c4\u00c5\u0005g\u0000\u0000\u00c5\u00c6\u0005o\u0000\u0000"+
		"\u00c6\u00c7\u0005t\u0000\u0000\u00c7\u01a0\u0005o\u0000\u0000\u00c8\u00c9"+
		"\u0005p\u0000\u0000\u00c9\u00ca\u0005r\u0000\u0000\u00ca\u00cb\u0005i"+
		"\u0000\u0000\u00cb\u00cc\u0005v\u0000\u0000\u00cc\u00cd\u0005a\u0000\u0000"+
		"\u00cd\u00ce\u0005t\u0000\u0000\u00ce\u01a0\u0005e\u0000\u0000\u00cf\u00d0"+
		"\u0005t\u0000\u0000\u00d0\u00d1\u0005h\u0000\u0000\u00d1\u00d2\u0005i"+
		"\u0000\u0000\u00d2\u01a0\u0005s\u0000\u0000\u00d3\u00d4\u0005b\u0000\u0000"+
		"\u00d4\u00d5\u0005r\u0000\u0000\u00d5\u00d6\u0005e\u0000\u0000\u00d6\u00d7"+
		"\u0005a\u0000\u0000\u00d7\u01a0\u0005k\u0000\u0000\u00d8\u00d9\u0005d"+
		"\u0000\u0000\u00d9\u00da\u0005o\u0000\u0000\u00da\u00db\u0005u\u0000\u0000"+
		"\u00db\u00dc\u0005b\u0000\u0000\u00dc\u00dd\u0005l\u0000\u0000\u00dd\u01a0"+
		"\u0005e\u0000\u0000\u00de\u00df\u0005i\u0000\u0000\u00df\u00e0\u0005m"+
		"\u0000\u0000\u00e0\u00e1\u0005p\u0000\u0000\u00e1\u00e2\u0005l\u0000\u0000"+
		"\u00e2\u00e3\u0005e\u0000\u0000\u00e3\u00e4\u0005m\u0000\u0000\u00e4\u00e5"+
		"\u0005e\u0000\u0000\u00e5\u00e6\u0005n\u0000\u0000\u00e6\u00e7\u0005t"+
		"\u0000\u0000\u00e7\u01a0\u0005s\u0000\u0000\u00e8\u00e9\u0005p\u0000\u0000"+
		"\u00e9\u00ea\u0005r\u0000\u0000\u00ea\u00eb\u0005o\u0000\u0000\u00eb\u00ec"+
		"\u0005t\u0000\u0000\u00ec\u00ed\u0005e\u0000\u0000\u00ed\u00ee\u0005c"+
		"\u0000\u0000\u00ee\u00ef\u0005t\u0000\u0000\u00ef\u00f0\u0005e\u0000\u0000"+
		"\u00f0\u01a0\u0005d\u0000\u0000\u00f1\u00f2\u0005t\u0000\u0000\u00f2\u00f3"+
		"\u0005h\u0000\u0000\u00f3\u00f4\u0005r\u0000\u0000\u00f4\u00f5\u0005o"+
		"\u0000\u0000\u00f5\u01a0\u0005w\u0000\u0000\u00f6\u00f7\u0005b\u0000\u0000"+
		"\u00f7\u00f8\u0005y\u0000\u0000\u00f8\u00f9\u0005t\u0000\u0000\u00f9\u01a0"+
		"\u0005e\u0000\u0000\u00fa\u00fb\u0005e\u0000\u0000\u00fb\u00fc\u0005l"+
		"\u0000\u0000\u00fc\u00fd\u0005s\u0000\u0000\u00fd\u01a0\u0005e\u0000\u0000"+
		"\u00fe\u00ff\u0005i\u0000\u0000\u00ff\u0100\u0005m\u0000\u0000\u0100\u0101"+
		"\u0005p\u0000\u0000\u0101\u0102\u0005o\u0000\u0000\u0102\u0103\u0005r"+
		"\u0000\u0000\u0103\u01a0\u0005t\u0000\u0000\u0104\u0105\u0005p\u0000\u0000"+
		"\u0105\u0106\u0005u\u0000\u0000\u0106\u0107\u0005b\u0000\u0000\u0107\u0108"+
		"\u0005l\u0000\u0000\u0108\u0109\u0005i\u0000\u0000\u0109\u01a0\u0005c"+
		"\u0000\u0000\u010a\u010b\u0005t\u0000\u0000\u010b\u010c\u0005h\u0000\u0000"+
		"\u010c\u010d\u0005r\u0000\u0000\u010d\u010e\u0005o\u0000\u0000\u010e\u010f"+
		"\u0005w\u0000\u0000\u010f\u01a0\u0005s\u0000\u0000\u0110\u0111\u0005c"+
		"\u0000\u0000\u0111\u0112\u0005a\u0000\u0000\u0112\u0113\u0005s\u0000\u0000"+
		"\u0113\u01a0\u0005e\u0000\u0000\u0114\u0115\u0005e\u0000\u0000\u0115\u0116"+
		"\u0005n\u0000\u0000\u0116\u0117\u0005u\u0000\u0000\u0117\u01a0\u0005m"+
		"\u0000\u0000\u0118\u0119\u0005i\u0000\u0000\u0119\u011a\u0005n\u0000\u0000"+
		"\u011a\u011b\u0005s\u0000\u0000\u011b\u011c\u0005t\u0000\u0000\u011c\u011d"+
		"\u0005a\u0000\u0000\u011d\u011e\u0005n\u0000\u0000\u011e\u011f\u0005c"+
		"\u0000\u0000\u011f\u0120\u0005e\u0000\u0000\u0120\u0121\u0005o\u0000\u0000"+
		"\u0121\u01a0\u0005f\u0000\u0000\u0122\u0123\u0005r\u0000\u0000\u0123\u0124"+
		"\u0005e\u0000\u0000\u0124\u0125\u0005t\u0000\u0000\u0125\u0126\u0005u"+
		"\u0000\u0000\u0126\u0127\u0005r\u0000\u0000\u0127\u01a0\u0005n\u0000\u0000"+
		"\u0128\u0129\u0005t\u0000\u0000\u0129\u012a\u0005r\u0000\u0000\u012a\u012b"+
		"\u0005a\u0000\u0000\u012b\u012c\u0005n\u0000\u0000\u012c\u012d\u0005s"+
		"\u0000\u0000\u012d\u012e\u0005i\u0000\u0000\u012e\u012f\u0005e\u0000\u0000"+
		"\u012f\u0130\u0005n\u0000\u0000\u0130\u01a0\u0005t\u0000\u0000\u0131\u0132"+
		"\u0005c\u0000\u0000\u0132\u0133\u0005a\u0000\u0000\u0133\u0134\u0005t"+
		"\u0000\u0000\u0134\u0135\u0005c\u0000\u0000\u0135\u01a0\u0005h\u0000\u0000"+
		"\u0136\u0137\u0005e\u0000\u0000\u0137\u0138\u0005x\u0000\u0000\u0138\u0139"+
		"\u0005t\u0000\u0000\u0139\u013a\u0005e\u0000\u0000\u013a\u013b\u0005n"+
		"\u0000\u0000\u013b\u013c\u0005d\u0000\u0000\u013c\u01a0\u0005s\u0000\u0000"+
		"\u013d\u013e\u0005i\u0000\u0000\u013e\u013f\u0005n\u0000\u0000\u013f\u01a0"+
		"\u0005t\u0000\u0000\u0140\u0141\u0005s\u0000\u0000\u0141\u0142\u0005h"+
		"\u0000\u0000\u0142\u0143\u0005o\u0000\u0000\u0143\u0144\u0005r\u0000\u0000"+
		"\u0144\u01a0\u0005t\u0000\u0000\u0145\u0146\u0005t\u0000\u0000\u0146\u0147"+
		"\u0005r\u0000\u0000\u0147\u01a0\u0005y\u0000\u0000\u0148\u0149\u0005c"+
		"\u0000\u0000\u0149\u014a\u0005h\u0000\u0000\u014a\u014b\u0005a\u0000\u0000"+
		"\u014b\u01a0\u0005r\u0000\u0000\u014c\u014d\u0005f\u0000\u0000\u014d\u014e"+
		"\u0005i\u0000\u0000\u014e\u014f\u0005n\u0000\u0000\u014f\u0150\u0005a"+
		"\u0000\u0000\u0150\u01a0\u0005l\u0000\u0000\u0151\u0152\u0005i\u0000\u0000"+
		"\u0152\u0153\u0005n\u0000\u0000\u0153\u0154\u0005t\u0000\u0000\u0154\u0155"+
		"\u0005e\u0000\u0000\u0155\u0156\u0005r\u0000\u0000\u0156\u0157\u0005f"+
		"\u0000\u0000\u0157\u0158\u0005a\u0000\u0000\u0158\u0159\u0005c\u0000\u0000"+
		"\u0159\u01a0\u0005e\u0000\u0000\u015a\u015b\u0005s\u0000\u0000\u015b\u015c"+
		"\u0005t\u0000\u0000\u015c\u015d\u0005a\u0000\u0000\u015d\u015e\u0005t"+
		"\u0000\u0000\u015e\u015f\u0005i\u0000\u0000\u015f\u01a0\u0005c\u0000\u0000"+
		"\u0160\u0161\u0005v\u0000\u0000\u0161\u0162\u0005o\u0000\u0000\u0162\u0163"+
		"\u0005i\u0000\u0000\u0163\u01a0\u0005d\u0000\u0000\u0164\u0165\u0005c"+
		"\u0000\u0000\u0165\u0166\u0005l\u0000\u0000\u0166\u0167\u0005a\u0000\u0000"+
		"\u0167\u0168\u0005s\u0000\u0000\u0168\u01a0\u0005s\u0000\u0000\u0169\u016a"+
		"\u0005f\u0000\u0000\u016a\u016b\u0005i\u0000\u0000\u016b\u016c\u0005n"+
		"\u0000\u0000\u016c\u016d\u0005a\u0000\u0000\u016d\u016e\u0005l\u0000\u0000"+
		"\u016e\u016f\u0005l\u0000\u0000\u016f\u01a0\u0005y\u0000\u0000\u0170\u0171"+
		"\u0005l\u0000\u0000\u0171\u0172\u0005o\u0000\u0000\u0172\u0173\u0005n"+
		"\u0000\u0000\u0173\u01a0\u0005g\u0000\u0000\u0174\u0175\u0005s\u0000\u0000"+
		"\u0175\u0176\u0005t\u0000\u0000\u0176\u0177\u0005r\u0000\u0000\u0177\u0178"+
		"\u0005i\u0000\u0000\u0178\u0179\u0005c\u0000\u0000\u0179\u017a\u0005t"+
		"\u0000\u0000\u017a\u017b\u0005f\u0000\u0000\u017b\u01a0\u0005p\u0000\u0000"+
		"\u017c\u017d\u0005v\u0000\u0000\u017d\u017e\u0005o\u0000\u0000\u017e\u017f"+
		"\u0005l\u0000\u0000\u017f\u0180\u0005a\u0000\u0000\u0180\u0181\u0005t"+
		"\u0000\u0000\u0181\u0182\u0005i\u0000\u0000\u0182\u0183\u0005l\u0000\u0000"+
		"\u0183\u01a0\u0005e\u0000\u0000\u0184\u0185\u0005c\u0000\u0000\u0185\u0186"+
		"\u0005o\u0000\u0000\u0186\u0187\u0005n\u0000\u0000\u0187\u0188\u0005s"+
		"\u0000\u0000\u0188\u01a0\u0005t\u0000\u0000\u0189\u018a\u0005f\u0000\u0000"+
		"\u018a\u018b\u0005l\u0000\u0000\u018b\u018c\u0005o\u0000\u0000\u018c\u018d"+
		"\u0005a\u0000\u0000\u018d\u01a0\u0005t\u0000\u0000\u018e\u018f\u0005n"+
		"\u0000\u0000\u018f\u0190\u0005a\u0000\u0000\u0190\u0191\u0005t\u0000\u0000"+
		"\u0191\u0192\u0005i\u0000\u0000\u0192\u0193\u0005v\u0000\u0000\u0193\u01a0"+
		"\u0005e\u0000\u0000\u0194\u0195\u0005s\u0000\u0000\u0195\u0196\u0005u"+
		"\u0000\u0000\u0196\u0197\u0005p\u0000\u0000\u0197\u0198\u0005e\u0000\u0000"+
		"\u0198\u01a0\u0005r\u0000\u0000\u0199\u019a\u0005w\u0000\u0000\u019a\u019b"+
		"\u0005h\u0000\u0000\u019b\u019c\u0005i\u0000\u0000\u019c\u019d\u0005l"+
		"\u0000\u0000\u019d\u01a0\u0005e\u0000\u0000\u019e\u01a0\u0005_\u0000\u0000"+
		"\u019f}\u0001\u0000\u0000\u0000\u019f\u0085\u0001\u0000\u0000\u0000\u019f"+
		"\u008d\u0001\u0000\u0000\u0000\u019f\u0090\u0001\u0000\u0000\u0000\u019f"+
		"\u0093\u0001\u0000\u0000\u0000\u019f\u0099\u0001\u0000\u0000\u0000\u019f"+
		"\u009f\u0001\u0000\u0000\u0000\u019f\u00a6\u0001\u0000\u0000\u0000\u019f"+
		"\u00a8\u0001\u0000\u0000\u0000\u019f\u00af\u0001\u0000\u0000\u0000\u019f"+
		"\u00bb\u0001\u0000\u0000\u0000\u019f\u00c2\u0001\u0000\u0000\u0000\u019f"+
		"\u00c4\u0001\u0000\u0000\u0000\u019f\u00c8\u0001\u0000\u0000\u0000\u019f"+
		"\u00cf\u0001\u0000\u0000\u0000\u019f\u00d3\u0001\u0000\u0000\u0000\u019f"+
		"\u00d8\u0001\u0000\u0000\u0000\u019f\u00de\u0001\u0000\u0000\u0000\u019f"+
		"\u00e8\u0001\u0000\u0000\u0000\u019f\u00f1\u0001\u0000\u0000\u0000\u019f"+
		"\u00f6\u0001\u0000\u0000\u0000\u019f\u00fa\u0001\u0000\u0000\u0000\u019f"+
		"\u00fe\u0001\u0000\u0000\u0000\u019f\u0104\u0001\u0000\u0000\u0000\u019f"+
		"\u010a\u0001\u0000\u0000\u0000\u019f\u0110\u0001\u0000\u0000\u0000\u019f"+
		"\u0114\u0001\u0000\u0000\u0000\u019f\u0118\u0001\u0000\u0000\u0000\u019f"+
		"\u0122\u0001\u0000\u0000\u0000\u019f\u0128\u0001\u0000\u0000\u0000\u019f"+
		"\u0131\u0001\u0000\u0000\u0000\u019f\u0136\u0001\u0000\u0000\u0000\u019f"+
		"\u013d\u0001\u0000\u0000\u0000\u019f\u0140\u0001\u0000\u0000\u0000\u019f"+
		"\u0145\u0001\u0000\u0000\u0000\u019f\u0148\u0001\u0000\u0000\u0000\u019f"+
		"\u014c\u0001\u0000\u0000\u0000\u019f\u0151\u0001\u0000\u0000\u0000\u019f"+
		"\u015a\u0001\u0000\u0000\u0000\u019f\u0160\u0001\u0000\u0000\u0000\u019f"+
		"\u0164\u0001\u0000\u0000\u0000\u019f\u0169\u0001\u0000\u0000\u0000\u019f"+
		"\u0170\u0001\u0000\u0000\u0000\u019f\u0174\u0001\u0000\u0000\u0000\u019f"+
		"\u017c\u0001\u0000\u0000\u0000\u019f\u0184\u0001\u0000\u0000\u0000\u019f"+
		"\u0189\u0001\u0000\u0000\u0000\u019f\u018e\u0001\u0000\u0000\u0000\u019f"+
		"\u0194\u0001\u0000\u0000\u0000\u019f\u0199\u0001\u0000\u0000\u0000\u019f"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0*\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0007\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0006\u0015\u0000\u0000\u01a7,\u0001\u0000\u0000\u0000\u01a8\u01aa\u0007"+
		"\u0001\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac.\u0001\u0000\u0000\u0000\u01ad\u01af\u0007\u0001"+
		"\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b6\u0005.\u0000"+
		"\u0000\u01b3\u01b5\u0007\u0001\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01c6\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb\u0007\u0001\u0000"+
		"\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000"+
		"\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c1\u0005.\u0000\u0000\u01c0\u01c2\u0007\u0001\u0000\u0000"+
		"\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01ae\u0001\u0000\u0000\u0000"+
		"\u01c5\u01bc\u0001\u0000\u0000\u0000\u01c60\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0003-\u0016\u0000\u01c82\u0001\u0000\u0000\u0000\u01c9\u01d9\u0003"+
		"/\u0017\u0000\u01ca\u01cb\u0003/\u0017\u0000\u01cb\u01cd\u0007\u0002\u0000"+
		"\u0000\u01cc\u01ce\u0007\u0003\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u00031\u0018\u0000\u01d0\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0003-\u0016\u0000\u01d2\u01d4\u0007\u0002\u0000\u0000\u01d3"+
		"\u01d5\u0007\u0003\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0003-\u0016\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01d8\u01ca\u0001\u0000\u0000\u0000\u01d8\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d94\u0001\u0000\u0000\u0000\u01da\u01db\u0005"+
		"t\u0000\u0000\u01db\u01dc\u0005r\u0000\u0000\u01dc\u01dd\u0005u\u0000"+
		"\u0000\u01dd\u01e4\u0005e\u0000\u0000\u01de\u01df\u0005f\u0000\u0000\u01df"+
		"\u01e0\u0005a\u0000\u0000\u01e0\u01e1\u0005l\u0000\u0000\u01e1\u01e2\u0005"+
		"s\u0000\u0000\u01e2\u01e4\u0005e\u0000\u0000\u01e3\u01da\u0001\u0000\u0000"+
		"\u0000\u01e3\u01de\u0001\u0000\u0000\u0000\u01e46\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e9\u0007\u0004\u0000\u0000\u01e6\u01e8\u0007\u0005\u0000\u0000"+
		"\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000"+
		"\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ea8\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec"+
		"\u01f0\u0005\"\u0000\u0000\u01ed\u01ef\t\u0000\u0000\u0000\u01ee\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0005\"\u0000\u0000\u01f4:\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005"+
		"/\u0000\u0000\u01f6\u01f7\u0005/\u0000\u0000\u01f7\u01fb\u0001\u0000\u0000"+
		"\u0000\u01f8\u01fa\t\u0000\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0200\u0007\u0006\u0000\u0000"+
		"\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000"+
		"\u0201\u0202\u0006\u001d\u0000\u0000\u0202<\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0005/\u0000\u0000\u0204\u0205\u0005*\u0000\u0000\u0205\u0209\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\t\u0000\u0000\u0000\u0207\u0206\u0001\u0000"+
		"\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020c\u0001\u0000"+
		"\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0005*\u0000"+
		"\u0000\u020d\u020e\u0005/\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0006\u001e\u0000\u0000\u0210>\u0001\u0000\u0000\u0000\u0012"+
		"\u0000\u019f\u01a4\u01ab\u01b0\u01b6\u01bc\u01c3\u01c5\u01cd\u01d4\u01d8"+
		"\u01e3\u01e9\u01f0\u01fb\u01ff\u0209\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}