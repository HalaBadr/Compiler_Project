// Generated from E:/study/year4/term2/compiler/ArrayInit2/src\COOL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class COOLParser extends Parser {
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
	public static final int
		RULE_id = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"id"
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

	@Override
	public String getGrammarFileName() { return "COOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public COOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(COOLParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(COOLParser.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(COOLParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(COOLParser.Digit, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLListener ) ((COOLListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLVisitor ) return ((COOLVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(Letter);
			setState(6);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Digit) | (1L << Letter))) != 0)) {
				{
				{
				setState(3);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Digit) | (1L << Letter))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(8);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\f\4\2\t\2\3\2\3"+
		"\2\7\2\7\n\2\f\2\16\2\n\13\2\3\2\2\2\3\2\2\3\4\2\3\4\7\7\2\13\2\4\3\2"+
		"\2\2\4\b\7\7\2\2\5\7\t\2\2\2\6\5\3\2\2\2\7\n\3\2\2\2\b\6\3\2\2\2\b\t\3"+
		"\2\2\2\t\3\3\2\2\2\n\b\3\2\2\2\3\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}