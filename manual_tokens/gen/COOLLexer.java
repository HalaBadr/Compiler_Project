// Generated from E:/study/year4/term2/compiler/ArrayInit2/src\COOL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class COOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Digit=2, Digits=3, Num=4, Letter=5, Relop=6, TRUE=7, FALSE=8, 
		BOOL_CONST=9, SEMICOLON=10, DARROW=11, LPAREN=12, RPAREN=13, COMMA=14, 
		PLUS=15, MINUS=16, STAR=17, SLASH=18, TILDE=19, LBRACE=20, RBRACE=21, 
		DOT=22, ASSIGN=23, ATSYM=24, COLON=25, CASE=26, ESAC=27, IF=28, FI=29, 
		WHILE=30, THEN=31, ELSE=32, LOOP=33, POOL=34, CLASS=35, IN=36, INHERITS=37, 
		OF=38, LET=39, NEW=40, VOID=41, NOT=42, STRING=43, INT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Digit", "Digits", "Num", "Letter", "Relop", "TRUE", "FALSE", 
			"BOOL_CONST", "SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", 
			"MINUS", "STAR", "SLASH", "TILDE", "LBRACE", "RBRACE", "DOT", "ASSIGN", 
			"ATSYM", "COLON", "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", 
			"LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", "LET", "NEW", "VOID", 
			"NOT", "STRING", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_'", null, null, null, null, null, null, null, null, "';'", "'=>'", 
			"'('", "')'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'{'", "'}'", 
			"'.'", "'<-'", "'@'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Digit", "Digits", "Num", "Letter", "Relop", "TRUE", "FALSE", 
			"BOOL_CONST", "SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", 
			"MINUS", "STAR", "SLASH", "TILDE", "LBRACE", "RBRACE", "DOT", "ASSIGN", 
			"ATSYM", "COLON", "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", 
			"LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", "LET", "NEW", "VOID", 
			"NOT", "STRING", "INT"
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


	public COOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "COOL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0103\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\6\4a\n\4\r\4\16\4b\3\5\3\5\3\5\5\5h\n\5"+
		"\3\5\3\5\5\5l\n\5\3\5\5\5o\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7w\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0086\n\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\2\2.\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\27\3\2\62;\4\2--//\4\2C\\c|\4\2TTtt\4"+
		"\2WWww\4\2GGgg\4\2CCcc\4\2NNnn\4\2UUuu\4\2EEee\4\2KKkk\4\2HHhh\4\2YYy"+
		"y\4\2JJjj\4\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2XXxx\4\2FFff\4\2IIii\2\u0109"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7`\3\2\2\2\td\3"+
		"\2\2\2\13p\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21}\3\2\2\2\23\u0085\3\2\2\2"+
		"\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008c\3\2\2\2\33\u008e\3\2\2\2\35"+
		"\u0090\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u0098\3"+
		"\2\2\2\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2-\u00a0\3\2\2\2/\u00a2"+
		"\3\2\2\2\61\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00ae\3"+
		"\2\2\29\u00b3\3\2\2\2;\u00b6\3\2\2\2=\u00b9\3\2\2\2?\u00bf\3\2\2\2A\u00c4"+
		"\3\2\2\2C\u00c9\3\2\2\2E\u00ce\3\2\2\2G\u00d3\3\2\2\2I\u00d9\3\2\2\2K"+
		"\u00dc\3\2\2\2M\u00e4\3\2\2\2O\u00e7\3\2\2\2Q\u00eb\3\2\2\2S\u00ef\3\2"+
		"\2\2U\u00f4\3\2\2\2W\u00f8\3\2\2\2Y\u00ff\3\2\2\2[\\\7a\2\2\\\4\3\2\2"+
		"\2]^\t\2\2\2^\6\3\2\2\2_a\5\5\3\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2"+
		"\2\2c\b\3\2\2\2dg\5\7\4\2ef\13\2\2\2fh\5\7\4\2ge\3\2\2\2gh\3\2\2\2hn\3"+
		"\2\2\2ik\7g\2\2jl\t\3\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\5\7\4\2ni\3"+
		"\2\2\2no\3\2\2\2o\n\3\2\2\2pq\t\4\2\2q\f\3\2\2\2rw\7>\2\2st\7>\2\2tw\7"+
		"?\2\2uw\7?\2\2vr\3\2\2\2vs\3\2\2\2vu\3\2\2\2w\16\3\2\2\2xy\7v\2\2yz\t"+
		"\5\2\2z{\t\6\2\2{|\t\7\2\2|\20\3\2\2\2}~\7h\2\2~\177\t\b\2\2\177\u0080"+
		"\t\t\2\2\u0080\u0081\t\n\2\2\u0081\u0082\t\7\2\2\u0082\22\3\2\2\2\u0083"+
		"\u0086\5\17\b\2\u0084\u0086\5\21\t\2\u0085\u0083\3\2\2\2\u0085\u0084\3"+
		"\2\2\2\u0086\24\3\2\2\2\u0087\u0088\7=\2\2\u0088\26\3\2\2\2\u0089\u008a"+
		"\7?\2\2\u008a\u008b\7@\2\2\u008b\30\3\2\2\2\u008c\u008d\7*\2\2\u008d\32"+
		"\3\2\2\2\u008e\u008f\7+\2\2\u008f\34\3\2\2\2\u0090\u0091\7.\2\2\u0091"+
		"\36\3\2\2\2\u0092\u0093\7-\2\2\u0093 \3\2\2\2\u0094\u0095\7/\2\2\u0095"+
		"\"\3\2\2\2\u0096\u0097\7,\2\2\u0097$\3\2\2\2\u0098\u0099\7\61\2\2\u0099"+
		"&\3\2\2\2\u009a\u009b\7\u0080\2\2\u009b(\3\2\2\2\u009c\u009d\7}\2\2\u009d"+
		"*\3\2\2\2\u009e\u009f\7\177\2\2\u009f,\3\2\2\2\u00a0\u00a1\7\60\2\2\u00a1"+
		".\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7/\2\2\u00a4\60\3\2\2\2\u00a5"+
		"\u00a6\7B\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7<\2\2\u00a8\64\3\2\2\2\u00a9"+
		"\u00aa\t\13\2\2\u00aa\u00ab\t\b\2\2\u00ab\u00ac\t\n\2\2\u00ac\u00ad\t"+
		"\7\2\2\u00ad\66\3\2\2\2\u00ae\u00af\t\7\2\2\u00af\u00b0\t\n\2\2\u00b0"+
		"\u00b1\t\b\2\2\u00b1\u00b2\t\13\2\2\u00b28\3\2\2\2\u00b3\u00b4\t\f\2\2"+
		"\u00b4\u00b5\t\r\2\2\u00b5:\3\2\2\2\u00b6\u00b7\t\r\2\2\u00b7\u00b8\t"+
		"\f\2\2\u00b8<\3\2\2\2\u00b9\u00ba\t\16\2\2\u00ba\u00bb\t\17\2\2\u00bb"+
		"\u00bc\t\f\2\2\u00bc\u00bd\t\t\2\2\u00bd\u00be\t\7\2\2\u00be>\3\2\2\2"+
		"\u00bf\u00c0\t\20\2\2\u00c0\u00c1\t\17\2\2\u00c1\u00c2\t\7\2\2\u00c2\u00c3"+
		"\t\21\2\2\u00c3@\3\2\2\2\u00c4\u00c5\t\7\2\2\u00c5\u00c6\t\t\2\2\u00c6"+
		"\u00c7\t\n\2\2\u00c7\u00c8\t\7\2\2\u00c8B\3\2\2\2\u00c9\u00ca\t\t\2\2"+
		"\u00ca\u00cb\t\22\2\2\u00cb\u00cc\t\22\2\2\u00cc\u00cd\t\23\2\2\u00cd"+
		"D\3\2\2\2\u00ce\u00cf\t\23\2\2\u00cf\u00d0\t\22\2\2\u00d0\u00d1\t\22\2"+
		"\2\u00d1\u00d2\t\t\2\2\u00d2F\3\2\2\2\u00d3\u00d4\t\13\2\2\u00d4\u00d5"+
		"\t\t\2\2\u00d5\u00d6\t\b\2\2\u00d6\u00d7\t\n\2\2\u00d7\u00d8\t\n\2\2\u00d8"+
		"H\3\2\2\2\u00d9\u00da\t\f\2\2\u00da\u00db\t\21\2\2\u00dbJ\3\2\2\2\u00dc"+
		"\u00dd\t\f\2\2\u00dd\u00de\t\17\2\2\u00de\u00df\t\7\2\2\u00df\u00e0\t"+
		"\5\2\2\u00e0\u00e1\t\f\2\2\u00e1\u00e2\t\20\2\2\u00e2\u00e3\t\n\2\2\u00e3"+
		"L\3\2\2\2\u00e4\u00e5\t\22\2\2\u00e5\u00e6\t\r\2\2\u00e6N\3\2\2\2\u00e7"+
		"\u00e8\t\t\2\2\u00e8\u00e9\t\7\2\2\u00e9\u00ea\t\20\2\2\u00eaP\3\2\2\2"+
		"\u00eb\u00ec\t\21\2\2\u00ec\u00ed\t\7\2\2\u00ed\u00ee\t\16\2\2\u00eeR"+
		"\3\2\2\2\u00ef\u00f0\t\24\2\2\u00f0\u00f1\t\22\2\2\u00f1\u00f2\t\f\2\2"+
		"\u00f2\u00f3\t\25\2\2\u00f3T\3\2\2\2\u00f4\u00f5\t\21\2\2\u00f5\u00f6"+
		"\t\22\2\2\u00f6\u00f7\t\20\2\2\u00f7V\3\2\2\2\u00f8\u00f9\t\n\2\2\u00f9"+
		"\u00fa\t\20\2\2\u00fa\u00fb\t\5\2\2\u00fb\u00fc\t\f\2\2\u00fc\u00fd\t"+
		"\21\2\2\u00fd\u00fe\t\26\2\2\u00feX\3\2\2\2\u00ff\u0100\t\f\2\2\u0100"+
		"\u0101\t\21\2\2\u0101\u0102\t\20\2\2\u0102Z\3\2\2\2\t\2bgknv\u0085\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}