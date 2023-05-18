// Generated from c:\Users\night\Documents\GitHub\P4\Antlr4_AST3\src\CLUB.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLUBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AND=3, OR=4, EQ=5, NOTEQ=6, SMALLER=7, LARGER=8, SMALLEREQ=9, 
		BIGGEREQ=10, INCREM=11, DECREM=12, PLUS=13, MINUS=14, MULT=15, DIVIDE=16, 
		DOT=17, NOT=18, ASSIGN=19, COMMA=20, SEMI=21, LPAREN=22, RPAREN=23, LCURLY=24, 
		RCURLY=25, LSQUARE=26, RSQUARE=27, WS=28, SETUP=29, ROUND=30, TURN=31, 
		WHILE=32, FOR=33, IF=34, BOOL=35, INT=36, STRING=37, METHODID=38, BOOLVAL=39, 
		CLASSID=40, OBJID=41, INTVAL=42, VARID=43, FUNCID=44, STRINGVAL=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "AND", "OR", "EQ", "NOTEQ", "SMALLER", "LARGER", "SMALLEREQ", 
			"BIGGEREQ", "INCREM", "DECREM", "PLUS", "MINUS", "MULT", "DIVIDE", "DOT", 
			"NOT", "ASSIGN", "COMMA", "SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY", 
			"LSQUARE", "RSQUARE", "WS", "SETUP", "ROUND", "TURN", "WHILE", "FOR", 
			"IF", "BOOL", "INT", "STRING", "METHODID", "BOOLVAL", "CLASSID", "OBJID", 
			"INTVAL", "VARID", "FUNCID", "STRINGVAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Player'", "'player'", "'&&'", "'||'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'.'", 
			"'!'", "'='", "','", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			null, "'Setup'", "'Round'", "'Turn'", "'while'", "'for'", "'if'", "'bool'", 
			"'int'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AND", "OR", "EQ", "NOTEQ", "SMALLER", "LARGER", "SMALLEREQ", 
			"BIGGEREQ", "INCREM", "DECREM", "PLUS", "MINUS", "MULT", "DIVIDE", "DOT", 
			"NOT", "ASSIGN", "COMMA", "SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY", 
			"LSQUARE", "RSQUARE", "WS", "SETUP", "ROUND", "TURN", "WHILE", "FOR", 
			"IF", "BOOL", "INT", "STRING", "METHODID", "BOOLVAL", "CLASSID", "OBJID", 
			"INTVAL", "VARID", "FUNCID", "STRINGVAL"
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


	public CLUBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CLUB.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u020f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00a7"+
		"\n\35\r\35\16\35\u00a8\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ab\n\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01b6\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01cb\n)\3*\3*\3*\3*\3*\5*\u01d2\n*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u01df\n*\f*\16*\u01e2\13*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u01ed\n*\3+\3+\3+\7+\u01f2\n+\f+\16+\u01f5\13+\5+\u01f7"+
		"\n+\3,\3,\7,\u01fb\n,\f,\16,\u01fe\13,\3-\3-\7-\u0202\n-\f-\16-\u0205"+
		"\13-\3.\3.\7.\u0209\n.\f.\16.\u020c\13.\3.\3.\2\2/\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/\3\2\16\5\2\13\f\16\17\"\"\5\2EFJJUU\3\2\64;\3\2\62\65"+
		"\3\2\63\65\3\2\63;\3\2\62;\3\2\62\62\3\2c|\6\2\62;C\\aac|\3\2C\\\4\2$"+
		"$\61\61\2\u0236\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5"+
		"d\3\2\2\2\7k\3\2\2\2\tn\3\2\2\2\13q\3\2\2\2\rt\3\2\2\2\17w\3\2\2\2\21"+
		"y\3\2\2\2\23{\3\2\2\2\25~\3\2\2\2\27\u0081\3\2\2\2\31\u0084\3\2\2\2\33"+
		"\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u008f"+
		"\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2"+
		"-\u0099\3\2\2\2/\u009b\3\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2\2\65\u00a1"+
		"\3\2\2\2\67\u00a3\3\2\2\29\u00a6\3\2\2\2;\u00ac\3\2\2\2=\u00b2\3\2\2\2"+
		"?\u00b8\3\2\2\2A\u00bd\3\2\2\2C\u00c3\3\2\2\2E\u00c7\3\2\2\2G\u00ca\3"+
		"\2\2\2I\u00cf\3\2\2\2K\u00d3\3\2\2\2M\u01aa\3\2\2\2O\u01b5\3\2\2\2Q\u01ca"+
		"\3\2\2\2S\u01ec\3\2\2\2U\u01f6\3\2\2\2W\u01f8\3\2\2\2Y\u01ff\3\2\2\2["+
		"\u0206\3\2\2\2]^\7R\2\2^_\7n\2\2_`\7c\2\2`a\7{\2\2ab\7g\2\2bc\7t\2\2c"+
		"\4\3\2\2\2de\7r\2\2ef\7n\2\2fg\7c\2\2gh\7{\2\2hi\7g\2\2ij\7t\2\2j\6\3"+
		"\2\2\2kl\7(\2\2lm\7(\2\2m\b\3\2\2\2no\7~\2\2op\7~\2\2p\n\3\2\2\2qr\7?"+
		"\2\2rs\7?\2\2s\f\3\2\2\2tu\7#\2\2uv\7?\2\2v\16\3\2\2\2wx\7>\2\2x\20\3"+
		"\2\2\2yz\7@\2\2z\22\3\2\2\2{|\7>\2\2|}\7?\2\2}\24\3\2\2\2~\177\7@\2\2"+
		"\177\u0080\7?\2\2\u0080\26\3\2\2\2\u0081\u0082\7-\2\2\u0082\u0083\7-\2"+
		"\2\u0083\30\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0086\7/\2\2\u0086\32\3\2"+
		"\2\2\u0087\u0088\7-\2\2\u0088\34\3\2\2\2\u0089\u008a\7/\2\2\u008a\36\3"+
		"\2\2\2\u008b\u008c\7,\2\2\u008c \3\2\2\2\u008d\u008e\7\61\2\2\u008e\""+
		"\3\2\2\2\u008f\u0090\7\60\2\2\u0090$\3\2\2\2\u0091\u0092\7#\2\2\u0092"+
		"&\3\2\2\2\u0093\u0094\7?\2\2\u0094(\3\2\2\2\u0095\u0096\7.\2\2\u0096*"+
		"\3\2\2\2\u0097\u0098\7=\2\2\u0098,\3\2\2\2\u0099\u009a\7*\2\2\u009a.\3"+
		"\2\2\2\u009b\u009c\7+\2\2\u009c\60\3\2\2\2\u009d\u009e\7}\2\2\u009e\62"+
		"\3\2\2\2\u009f\u00a0\7\177\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7]\2\2\u00a2"+
		"\66\3\2\2\2\u00a3\u00a4\7_\2\2\u00a48\3\2\2\2\u00a5\u00a7\t\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\35\2\2\u00ab:\3\2\2\2\u00ac\u00ad"+
		"\7U\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7w\2\2\u00b0"+
		"\u00b1\7r\2\2\u00b1<\3\2\2\2\u00b2\u00b3\7T\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\u00b5\7w\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7f\2\2\u00b7>\3\2\2\2\u00b8"+
		"\u00b9\7V\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2"+
		"\u00bc@\3\2\2\2\u00bd\u00be\7y\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7k\2"+
		"\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7g\2\2\u00c2B\3\2\2\2\u00c3\u00c4\7"+
		"h\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7t\2\2\u00c6D\3\2\2\2\u00c7\u00c8"+
		"\7k\2\2\u00c8\u00c9\7h\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7n\2\2\u00ceH\3\2\2\2\u00cf\u00d0"+
		"\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2J\3\2\2\2\u00d3\u00d4"+
		"\7u\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7p\2\2\u00d8\u00d9\7i\2\2\u00d9L\3\2\2\2\u00da\u00db\7e\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7v\2\2"+
		"\u00df\u01ab\7g\2\2\u00e0\u00e1\7i\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7J\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7p\2\2\u00e6"+
		"\u01ab\7f\2\2\u00e7\u00e8\7i\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7v\2\2"+
		"\u00ea\u00eb\7J\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee"+
		"\7f\2\2\u00ee\u00ef\7R\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7k\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2\u00f3\7v\2\2\u00f3\u01ab\7u\2\2\u00f4\u00f5\7j\2\2"+
		"\u00f5\u00f6\7c\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9"+
		"\7U\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7|\2\2\u00fb\u01ab\7g\2\2\u00fc"+
		"\u00fd\7r\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7p\2\2"+
		"\u0100\u0101\7v\2\2\u0101\u0102\7J\2\2\u0102\u0103\7c\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u01ab\7f\2\2\u0105\u0106\7i\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7v\2\2\u0108\u0109\7V\2\2\u0109\u010a\7c\2\2\u010a\u010b\7d\2\2"+
		"\u010b\u010c\7n\2\2\u010c\u01ab\7g\2\2\u010d\u010e\7i\2\2\u010e\u010f"+
		"\7g\2\2\u010f\u0110\7v\2\2\u0110\u0111\7V\2\2\u0111\u0112\7c\2\2\u0112"+
		"\u0113\7d\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2\u0115\u0116\7R\2\2"+
		"\u0116\u0117\7q\2\2\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119\u011a"+
		"\7v\2\2\u011a\u01ab\7u\2\2\u011b\u011c\7r\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7v\2\2\u0120\u0121\7V\2\2"+
		"\u0121\u0122\7c\2\2\u0122\u0123\7d\2\2\u0123\u0124\7n\2\2\u0124\u01ab"+
		"\7g\2\2\u0125\u0126\7i\2\2\u0126\u0127\7g\2\2\u0127\u0128\7v\2\2\u0128"+
		"\u0129\7F\2\2\u0129\u012a\7k\2\2\u012a\u012b\7u\2\2\u012b\u012c\7e\2\2"+
		"\u012c\u012d\7c\2\2\u012d\u012e\7t\2\2\u012e\u012f\7f\2\2\u012f\u0130"+
		"\7R\2\2\u0130\u0131\7k\2\2\u0131\u0132\7n\2\2\u0132\u01ab\7g\2\2\u0133"+
		"\u0134\7f\2\2\u0134\u0135\7t\2\2\u0135\u0136\7c\2\2\u0136\u01ab\7y\2\2"+
		"\u0137\u0138\7f\2\2\u0138\u0139\7k\2\2\u0139\u013a\7u\2\2\u013a\u013b"+
		"\7e\2\2\u013b\u013c\7c\2\2\u013c\u013d\7t\2\2\u013d\u01ab\7f\2\2\u013e"+
		"\u013f\7v\2\2\u013f\u0140\7c\2\2\u0140\u0141\7m\2\2\u0141\u0142\7g\2\2"+
		"\u0142\u0143\7E\2\2\u0143\u0144\7c\2\2\u0144\u0145\7t\2\2\u0145\u01ab"+
		"\7f\2\2\u0146\u0147\7n\2\2\u0147\u0148\7c\2\2\u0148\u0149\7{\2\2\u0149"+
		"\u014a\7F\2\2\u014a\u014b\7q\2\2\u014b\u014c\7y\2\2\u014c\u01ab\7p\2\2"+
		"\u014d\u014e\7c\2\2\u014e\u014f\7f\2\2\u014f\u0150\7f\2\2\u0150\u0151"+
		"\7L\2\2\u0151\u0152\7q\2\2\u0152\u0153\7m\2\2\u0153\u0154\7g\2\2\u0154"+
		"\u0155\7t\2\2\u0155\u01ab\7u\2\2\u0156\u0157\7c\2\2\u0157\u0158\7u\2\2"+
		"\u0158\u0159\7u\2\2\u0159\u015a\7k\2\2\u015a\u015b\7i\2\2\u015b\u015c"+
		"\7p\2\2\u015c\u015d\7R\2\2\u015d\u015e\7q\2\2\u015e\u015f\7k\2\2\u015f"+
		"\u0160\7p\2\2\u0160\u0161\7v\2\2\u0161\u01ab\7u\2\2\u0162\u0163\7u\2\2"+
		"\u0163\u0164\7j\2\2\u0164\u0165\7w\2\2\u0165\u0166\7h\2\2\u0166\u0167"+
		"\7h\2\2\u0167\u0168\7n\2\2\u0168\u01ab\7g\2\2\u0169\u016a\7i\2\2\u016a"+
		"\u016b\7g\2\2\u016b\u016c\7v\2\2\u016c\u016d\7E\2\2\u016d\u016e\7c\2\2"+
		"\u016e\u016f\7t\2\2\u016f\u01ab\7f\2\2\u0170\u0171\7i\2\2\u0171\u0172"+
		"\7g\2\2\u0172\u0173\7v\2\2\u0173\u0174\7E\2\2\u0174\u0175\7c\2\2\u0175"+
		"\u0176\7t\2\2\u0176\u0177\7f\2\2\u0177\u01ab\7u\2\2\u0178\u0179\7r\2\2"+
		"\u0179\u017a\7t\2\2\u017a\u017b\7k\2\2\u017b\u017c\7p\2\2\u017c\u01ab"+
		"\7v\2\2\u017d\u017e\7u\2\2\u017e\u017f\7k\2\2\u017f\u0180\7|\2\2\u0180"+
		"\u01ab\7g\2\2\u0181\u0182\7t\2\2\u0182\u0183\7g\2\2\u0183\u0184\7v\2\2"+
		"\u0184\u0185\7w\2\2\u0185\u0186\7t\2\2\u0186\u0187\7p\2\2\u0187\u0188"+
		"\7E\2\2\u0188\u0189\7c\2\2\u0189\u018a\7t\2\2\u018a\u018b\7f\2\2\u018b"+
		"\u01ab\7u\2\2\u018c\u018d\7t\2\2\u018d\u018e\7g\2\2\u018e\u018f\7v\2\2"+
		"\u018f\u0190\7w\2\2\u0190\u0191\7t\2\2\u0191\u0192\7p\2\2\u0192\u0193"+
		"\7F\2\2\u0193\u0194\7k\2\2\u0194\u0195\7u\2\2\u0195\u0196\7e\2\2\u0196"+
		"\u0197\7c\2\2\u0197\u0198\7t\2\2\u0198\u0199\7f\2\2\u0199\u019a\7R\2\2"+
		"\u019a\u019b\7k\2\2\u019b\u019c\7n\2\2\u019c\u01ab\7g\2\2\u019d\u019e"+
		"\7h\2\2\u019e\u019f\7n\2\2\u019f\u01a0\7k\2\2\u01a0\u01ab\7r\2\2\u01a1"+
		"\u01a2\7i\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7R\2\2"+
		"\u01a5\u01a6\7q\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9"+
		"\7v\2\2\u01a9\u01ab\7u\2\2\u01aa\u00da\3\2\2\2\u01aa\u00e0\3\2\2\2\u01aa"+
		"\u00e7\3\2\2\2\u01aa\u00f4\3\2\2\2\u01aa\u00fc\3\2\2\2\u01aa\u0105\3\2"+
		"\2\2\u01aa\u010d\3\2\2\2\u01aa\u011b\3\2\2\2\u01aa\u0125\3\2\2\2\u01aa"+
		"\u0133\3\2\2\2\u01aa\u0137\3\2\2\2\u01aa\u013e\3\2\2\2\u01aa\u0146\3\2"+
		"\2\2\u01aa\u014d\3\2\2\2\u01aa\u0156\3\2\2\2\u01aa\u0162\3\2\2\2\u01aa"+
		"\u0169\3\2\2\2\u01aa\u0170\3\2\2\2\u01aa\u0178\3\2\2\2\u01aa\u017d\3\2"+
		"\2\2\u01aa\u0181\3\2\2\2\u01aa\u018c\3\2\2\2\u01aa\u019d\3\2\2\2\u01aa"+
		"\u01a1\3\2\2\2\u01abN\3\2\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7t\2\2\u01ae"+
		"\u01af\7w\2\2\u01af\u01b6\7g\2\2\u01b0\u01b1\7h\2\2\u01b1\u01b2\7c\2\2"+
		"\u01b2\u01b3\7n\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b6\7g\2\2\u01b5\u01ac"+
		"\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b6P\3\2\2\2\u01b7\u01b8\7R\2\2\u01b8\u01b9"+
		"\7n\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7{\2\2\u01bb\u01bc\7g\2\2\u01bc"+
		"\u01cb\7t\2\2\u01bd\u01be\7F\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7e\2\2"+
		"\u01c0\u01cb\7m\2\2\u01c1\u01c2\7E\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4"+
		"\7t\2\2\u01c4\u01cb\7f\2\2\u01c5\u01c6\7V\2\2\u01c6\u01c7\7c\2\2\u01c7"+
		"\u01c8\7d\2\2\u01c8\u01c9\7n\2\2\u01c9\u01cb\7g\2\2\u01ca\u01b7\3\2\2"+
		"\2\u01ca\u01bd\3\2\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c5\3\2\2\2\u01cbR"+
		"\3\2\2\2\u01cc\u01cd\t\3\2\2\u01cd\u01ed\t\4\2\2\u01ce\u01cf\t\3\2\2\u01cf"+
		"\u01d1\7\63\2\2\u01d0\u01d2\t\5\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3"+
		"\2\2\2\u01d2\u01ed\3\2\2\2\u01d3\u01d4\7L\2\2\u01d4\u01ed\t\6\2\2\u01d5"+
		"\u01d6\7r\2\2\u01d6\u01d7\7n\2\2\u01d7\u01d8\7c\2\2\u01d8\u01d9\7{\2\2"+
		"\u01d9\u01da\7g\2\2\u01da\u01db\7t\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e0"+
		"\t\7\2\2\u01dd\u01df\t\b\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01ed\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e3\u01e4\7f\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7e\2\2\u01e6\u01ed"+
		"\7m\2\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7d\2\2\u01ea"+
		"\u01eb\7n\2\2\u01eb\u01ed\7g\2\2\u01ec\u01cc\3\2\2\2\u01ec\u01ce\3\2\2"+
		"\2\u01ec\u01d3\3\2\2\2\u01ec\u01d5\3\2\2\2\u01ec\u01e3\3\2\2\2\u01ec\u01e7"+
		"\3\2\2\2\u01edT\3\2\2\2\u01ee\u01f7\t\t\2\2\u01ef\u01f3\t\7\2\2\u01f0"+
		"\u01f2\t\b\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6"+
		"\u01ee\3\2\2\2\u01f6\u01ef\3\2\2\2\u01f7V\3\2\2\2\u01f8\u01fc\t\n\2\2"+
		"\u01f9\u01fb\t\13\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fdX\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff"+
		"\u0203\t\f\2\2\u0200\u0202\t\13\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3"+
		"\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204Z\3\2\2\2\u0205\u0203"+
		"\3\2\2\2\u0206\u020a\7$\2\2\u0207\u0209\n\r\2\2\u0208\u0207\3\2\2\2\u0209"+
		"\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7$\2\2\u020e\\\3\2\2\2\17\2\u00a8"+
		"\u01aa\u01b5\u01ca\u01d1\u01e0\u01ec\u01f3\u01f6\u01fc\u0203\u020a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}