// Generated from c:\Users\night\Documents\GitHub\P4\Antlr4_AST3\src\VecMath.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VecMathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		INT=10, WS=11, VEC=12;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'print'", "'*'", "'.'", "'+'", "'['", "','", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "INT", "WS", 
			"VEC"
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
	public String getGrammarFileName() { return "VecMath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VecMathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==ID );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatPrintContext extends StatContext {
		public Token print;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatPrintContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatAssignContext extends StatContext {
		public Token assign;
		public TerminalNode ID() { return getToken(VecMathParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatAssignContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(ID);
				setState(12);
				((StatAssignContext)_localctx).assign = match(T__0);
				setState(13);
				expr(0);
				}
				break;
			case T__1:
				_localctx = new StatPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				((StatPrintContext)_localctx).print = match(T__1);
				setState(15);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprMultContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIntContext extends ExprContext {
		public TerminalNode INT() { return getToken(VecMathParser.INT, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVecContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprVecContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(VecMathParser.ID, 0); }
		public ExprIdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				_localctx = new ExprVecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(T__5);
				setState(20);
				expr(0);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(21);
					match(T__6);
					setState(22);
					expr(0);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				match(T__7);
				}
				break;
			case INT:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultContext(new ExprContext(_parentctx, _parentState));
						((ExprMultContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(35);
						((ExprMultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExprMultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(36);
						((ExprMultContext)_localctx).right = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddContext(new ExprContext(_parentctx, _parentState));
						((ExprAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(38);
						((ExprAddContext)_localctx).op = match(T__4);
						setState(39);
						((ExprAddContext)_localctx).right = expr(5);
						}
						break;
					}
					} 
				}
				setState(44);
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\5\3\23\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\4\3\4\3\4\3\4\5\4#"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\2\3\6\5\2\4\6"+
		"\2\3\3\2\5\6\2\63\2\t\3\2\2\2\4\22\3\2\2\2\6\"\3\2\2\2\b\n\5\4\3\2\t\b"+
		"\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\7\13"+
		"\2\2\16\17\7\3\2\2\17\23\5\6\4\2\20\21\7\4\2\2\21\23\5\6\4\2\22\r\3\2"+
		"\2\2\22\20\3\2\2\2\23\5\3\2\2\2\24\25\b\4\1\2\25\26\7\b\2\2\26\33\5\6"+
		"\4\2\27\30\7\t\2\2\30\32\5\6\4\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2"+
		"\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\n\2\2\37#\3\2\2"+
		"\2 #\7\f\2\2!#\7\13\2\2\"\24\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#,\3\2\2\2$"+
		"%\f\7\2\2%&\t\2\2\2&+\5\6\4\b\'(\f\6\2\2()\7\7\2\2)+\5\6\4\7*$\3\2\2\2"+
		"*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2\b\13\22"+
		"\33\"*,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}