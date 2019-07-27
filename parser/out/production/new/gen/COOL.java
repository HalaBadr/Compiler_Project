// Generated from /home/nourhan/nourhan/projects/out/production/new/COOL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class COOL extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Digit=1, Digits=2, Num=3, Letter=4, Char=5, Relop=6, TRUE=7, FALSE=8, 
		Literal=9, BOOL_CONST=10, WS=11, SEMICOLON=12, DARROW=13, LPAREN=14, RPAREN=15, 
		COMMA=16, PLUS=17, MINUS=18, STAR=19, SLASH=20, TILDE=21, LBRACE=22, RBRACE=23, 
		DOT=24, ASSIGN=25, ATSYM=26, COLON=27, DoubleQout=28, CASE=29, ESAC=30, 
		IF=31, FI=32, WHILE=33, THEN=34, ELSE=35, LOOP=36, POOL=37, CLASS=38, 
		IN=39, INHERITS=40, OF=41, LET=42, NEW=43, VOID=44, NOT=45, STRING=46, 
		INT=47, ID=48, ERORR=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Digit", "Digits", "Num", "Letter", "Char", "Relop", "TRUE", "FALSE", 
			"Literal", "BOOL_CONST", "WS", "SEMICOLON", "DARROW", "LPAREN", "RPAREN", 
			"COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LBRACE", "RBRACE", 
			"DOT", "ASSIGN", "ATSYM", "COLON", "DoubleQout", "CASE", "ESAC", "IF", 
			"FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", 
			"OF", "LET", "NEW", "VOID", "NOT", "STRING", "INT", "ID", "ERORR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"';'", "'=>'", "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", 
			"'{'", "'}'", "'.'", "'<-'", "'@'", "':'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Digit", "Digits", "Num", "Letter", "Char", "Relop", "TRUE", "FALSE", 
			"Literal", "BOOL_CONST", "WS", "SEMICOLON", "DARROW", "LPAREN", "RPAREN", 
			"COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LBRACE", "RBRACE", 
			"DOT", "ASSIGN", "ATSYM", "COLON", "DoubleQout", "CASE", "ESAC", "IF", 
			"FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", 
			"OF", "LET", "NEW", "VOID", "NOT", "STRING", "INT", "ID", "ERORR"
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


	public COOL(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\6"+
		"\3i\n\3\r\3\16\3j\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\5\4t\n\4\3\4\5\4w\n\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\5\7\u0094\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00a4\n\n\f\n\16\n\u00a7"+
		"\13\n\3\n\3\n\3\13\3\13\5\13\u00ad\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\7\61\u0135\n\61\f\61\16\61\u0138\13\61\3\62\3\62\2\2\63\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\30\3\2\62;\4\2--//\4\2"+
		"C\\c|\4\2TTtt\4\2WWww\4\2GGgg\4\2CCcc\4\2NNnn\4\2UUuu\5\2\13\f\17\17\""+
		"\"\4\2EEee\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2VVvv\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2XXxx\4\2FFff\4\2IIii\2\u0158\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5h\3\2"+
		"\2\2\7l\3\2\2\2\tx\3\2\2\2\13\u008d\3\2\2\2\r\u0093\3\2\2\2\17\u0095\3"+
		"\2\2\2\21\u009a\3\2\2\2\23\u00a0\3\2\2\2\25\u00ac\3\2\2\2\27\u00ae\3\2"+
		"\2\2\31\u00b2\3\2\2\2\33\u00b4\3\2\2\2\35\u00b7\3\2\2\2\37\u00b9\3\2\2"+
		"\2!\u00bb\3\2\2\2#\u00bd\3\2\2\2%\u00bf\3\2\2\2\'\u00c1\3\2\2\2)\u00c3"+
		"\3\2\2\2+\u00c5\3\2\2\2-\u00c7\3\2\2\2/\u00c9\3\2\2\2\61\u00cb\3\2\2\2"+
		"\63\u00cd\3\2\2\2\65\u00d0\3\2\2\2\67\u00d2\3\2\2\29\u00d4\3\2\2\2;\u00d6"+
		"\3\2\2\2=\u00db\3\2\2\2?\u00e0\3\2\2\2A\u00e3\3\2\2\2C\u00e6\3\2\2\2E"+
		"\u00ec\3\2\2\2G\u00f1\3\2\2\2I\u00f6\3\2\2\2K\u00fb\3\2\2\2M\u0100\3\2"+
		"\2\2O\u0106\3\2\2\2Q\u0109\3\2\2\2S\u0111\3\2\2\2U\u0114\3\2\2\2W\u0118"+
		"\3\2\2\2Y\u011c\3\2\2\2[\u0121\3\2\2\2]\u0125\3\2\2\2_\u012c\3\2\2\2a"+
		"\u0130\3\2\2\2c\u0139\3\2\2\2ef\t\2\2\2f\4\3\2\2\2gi\5\3\2\2hg\3\2\2\2"+
		"ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\6\3\2\2\2lo\5\5\3\2mn\13\2\2\2np\5\5\3"+
		"\2om\3\2\2\2op\3\2\2\2pv\3\2\2\2qs\7g\2\2rt\t\3\2\2sr\3\2\2\2st\3\2\2"+
		"\2tu\3\2\2\2uw\5\5\3\2vq\3\2\2\2vw\3\2\2\2w\b\3\2\2\2xy\t\4\2\2y\n\3\2"+
		"\2\2z\u008e\5\t\5\2{\u008e\5\31\r\2|\u008e\5\33\16\2}\u008e\5\35\17\2"+
		"~\u008e\5\37\20\2\177\u008e\5!\21\2\u0080\u008e\5#\22\2\u0081\u008e\5"+
		"%\23\2\u0082\u008e\5\'\24\2\u0083\u008e\5+\26\2\u0084\u008e\5-\27\2\u0085"+
		"\u008e\5/\30\2\u0086\u008e\5\61\31\2\u0087\u008e\5\63\32\2\u0088\u008e"+
		"\5\65\33\2\u0089\u008e\5\67\34\2\u008a\u008e\59\35\2\u008b\u008e\5\3\2"+
		"\2\u008c\u008e\5\r\7\2\u008dz\3\2\2\2\u008d{\3\2\2\2\u008d|\3\2\2\2\u008d"+
		"}\3\2\2\2\u008d~\3\2\2\2\u008d\177\3\2\2\2\u008d\u0080\3\2\2\2\u008d\u0081"+
		"\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u0084\3\2\2\2\u008d"+
		"\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2"+
		"\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\f\3\2\2\2\u008f\u0094\7>\2\2\u0090\u0091\7>\2\2\u0091"+
		"\u0094\7?\2\2\u0092\u0094\7?\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\16\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097"+
		"\t\5\2\2\u0097\u0098\t\6\2\2\u0098\u0099\t\7\2\2\u0099\20\3\2\2\2\u009a"+
		"\u009b\7h\2\2\u009b\u009c\t\b\2\2\u009c\u009d\t\t\2\2\u009d\u009e\t\n"+
		"\2\2\u009e\u009f\t\7\2\2\u009f\22\3\2\2\2\u00a0\u00a5\59\35\2\u00a1\u00a4"+
		"\5\13\6\2\u00a2\u00a4\5\27\f\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\59\35\2\u00a9\24\3\2\2\2\u00aa"+
		"\u00ad\5\17\b\2\u00ab\u00ad\5\21\t\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\26\3\2\2\2\u00ae\u00af\t\13\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\b\f\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3\32\3\2\2\2\u00b4"+
		"\u00b5\7?\2\2\u00b5\u00b6\7@\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8"+
		"\36\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba \3\2\2\2\u00bb\u00bc\7.\2\2\u00bc"+
		"\"\3\2\2\2\u00bd\u00be\7-\2\2\u00be$\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0"+
		"&\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4"+
		"*\3\2\2\2\u00c5\u00c6\7\u0080\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7}\2\2\u00c8"+
		".\3\2\2\2\u00c9\u00ca\7\177\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7\60\2\2"+
		"\u00cc\62\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7/\2\2\u00cf\64\3\2\2"+
		"\2\u00d0\u00d1\7B\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7<\2\2\u00d38\3\2\2"+
		"\2\u00d4\u00d5\7$\2\2\u00d5:\3\2\2\2\u00d6\u00d7\t\f\2\2\u00d7\u00d8\t"+
		"\b\2\2\u00d8\u00d9\t\n\2\2\u00d9\u00da\t\7\2\2\u00da<\3\2\2\2\u00db\u00dc"+
		"\t\7\2\2\u00dc\u00dd\t\n\2\2\u00dd\u00de\t\b\2\2\u00de\u00df\t\f\2\2\u00df"+
		">\3\2\2\2\u00e0\u00e1\t\r\2\2\u00e1\u00e2\t\16\2\2\u00e2@\3\2\2\2\u00e3"+
		"\u00e4\t\16\2\2\u00e4\u00e5\t\r\2\2\u00e5B\3\2\2\2\u00e6\u00e7\t\17\2"+
		"\2\u00e7\u00e8\t\20\2\2\u00e8\u00e9\t\r\2\2\u00e9\u00ea\t\t\2\2\u00ea"+
		"\u00eb\t\7\2\2\u00ebD\3\2\2\2\u00ec\u00ed\t\21\2\2\u00ed\u00ee\t\20\2"+
		"\2\u00ee\u00ef\t\7\2\2\u00ef\u00f0\t\22\2\2\u00f0F\3\2\2\2\u00f1\u00f2"+
		"\t\7\2\2\u00f2\u00f3\t\t\2\2\u00f3\u00f4\t\n\2\2\u00f4\u00f5\t\7\2\2\u00f5"+
		"H\3\2\2\2\u00f6\u00f7\t\t\2\2\u00f7\u00f8\t\23\2\2\u00f8\u00f9\t\23\2"+
		"\2\u00f9\u00fa\t\24\2\2\u00faJ\3\2\2\2\u00fb\u00fc\t\24\2\2\u00fc\u00fd"+
		"\t\23\2\2\u00fd\u00fe\t\23\2\2\u00fe\u00ff\t\t\2\2\u00ffL\3\2\2\2\u0100"+
		"\u0101\t\f\2\2\u0101\u0102\t\t\2\2\u0102\u0103\t\b\2\2\u0103\u0104\t\n"+
		"\2\2\u0104\u0105\t\n\2\2\u0105N\3\2\2\2\u0106\u0107\t\r\2\2\u0107\u0108"+
		"\t\22\2\2\u0108P\3\2\2\2\u0109\u010a\t\r\2\2\u010a\u010b\t\20\2\2\u010b"+
		"\u010c\t\7\2\2\u010c\u010d\t\5\2\2\u010d\u010e\t\r\2\2\u010e\u010f\t\21"+
		"\2\2\u010f\u0110\t\n\2\2\u0110R\3\2\2\2\u0111\u0112\t\23\2\2\u0112\u0113"+
		"\t\16\2\2\u0113T\3\2\2\2\u0114\u0115\t\t\2\2\u0115\u0116\t\7\2\2\u0116"+
		"\u0117\t\21\2\2\u0117V\3\2\2\2\u0118\u0119\t\22\2\2\u0119\u011a\t\7\2"+
		"\2\u011a\u011b\t\17\2\2\u011bX\3\2\2\2\u011c\u011d\t\25\2\2\u011d\u011e"+
		"\t\23\2\2\u011e\u011f\t\r\2\2\u011f\u0120\t\26\2\2\u0120Z\3\2\2\2\u0121"+
		"\u0122\t\22\2\2\u0122\u0123\t\23\2\2\u0123\u0124\t\21\2\2\u0124\\\3\2"+
		"\2\2\u0125\u0126\t\n\2\2\u0126\u0127\t\21\2\2\u0127\u0128\t\5\2\2\u0128"+
		"\u0129\t\r\2\2\u0129\u012a\t\22\2\2\u012a\u012b\t\27\2\2\u012b^\3\2\2"+
		"\2\u012c\u012d\t\r\2\2\u012d\u012e\t\22\2\2\u012e\u012f\t\21\2\2\u012f"+
		"`\3\2\2\2\u0130\u0136\5\t\5\2\u0131\u0135\5\t\5\2\u0132\u0135\5\3\2\2"+
		"\u0133\u0135\7a\2\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"b\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\13\2\2\2\u013ad\3\2\2\2\16\2"+
		"josv\u008d\u0093\u00a3\u00a5\u00ac\u0134\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}