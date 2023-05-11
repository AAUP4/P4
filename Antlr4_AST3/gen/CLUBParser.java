// Generated from C:/Users/night/Documents/GitHub/P4/Antlr4_AST3/src\CLUB.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CLUBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, EQ=3, NOTEQ=4, SMALLER=5, LARGER=6, SMALLEREQ=7, BIGGEREQ=8, 
		INCREM=9, DECREM=10, PLUS=11, MINUS=12, MULT=13, DIVIDE=14, DOT=15, NOT=16, 
		ASSIGN=17, COMMA=18, SEMI=19, LPAREN=20, RPAREN=21, LCURLY=22, RCURLY=23, 
		LSQUARE=24, RSQUARE=25, WS=26, SETUP=27, ROUND=28, TURN=29, WHILE=30, 
		FOR=31, IF=32, BOOL=33, INT=34, STRING=35, METHODID=36, BOOLVAL=37, CLASSID=38, 
		OBJID=39, INTVAL=40, VARID=41, FUNCID=42, STRINGVAL=43;
	public static final int
		RULE_program = 0, RULE_setup = 1, RULE_round = 2, RULE_turn = 3, RULE_funcs = 4, 
		RULE_stmts = 5, RULE_func = 6, RULE_tParams = 7, RULE_stmt = 8, RULE_iterStmt = 9, 
		RULE_selectStmt = 10, RULE_exprStmt = 11, RULE_type = 12, RULE_tParam = 13, 
		RULE_params = 14, RULE_list = 15, RULE_param = 16, RULE_expr = 17, RULE_assignExpr = 18, 
		RULE_logicOrExpr = 19, RULE_logicAndExpr = 20, RULE_equalExpr = 21, RULE_relatExpr = 22, 
		RULE_addExpr = 23, RULE_multExpr = 24, RULE_unaryExpr = 25, RULE_postfExpr = 26, 
		RULE_primaryExpr = 27, RULE_val = 28, RULE_decl = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "round", "turn", "funcs", "stmts", "func", "tParams", 
			"stmt", "iterStmt", "selectStmt", "exprStmt", "type", "tParam", "params", 
			"list", "param", "expr", "assignExpr", "logicOrExpr", "logicAndExpr", 
			"equalExpr", "relatExpr", "addExpr", "multExpr", "unaryExpr", "postfExpr", 
			"primaryExpr", "val", "decl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'++'", 
			"'--'", "'+'", "'-'", "'*'", "'/'", "'.'", "'!'", "'='", "','", "';'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", null, "'Setup'", "'Round'", 
			"'Turn'", "'while'", "'for'", "'if'", "'bool'", "'int'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "EQ", "NOTEQ", "SMALLER", "LARGER", "SMALLEREQ", "BIGGEREQ", 
			"INCREM", "DECREM", "PLUS", "MINUS", "MULT", "DIVIDE", "DOT", "NOT", 
			"ASSIGN", "COMMA", "SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LSQUARE", 
			"RSQUARE", "WS", "SETUP", "ROUND", "TURN", "WHILE", "FOR", "IF", "BOOL", 
			"INT", "STRING", "METHODID", "BOOLVAL", "CLASSID", "OBJID", "INTVAL", 
			"VARID", "FUNCID", "STRINGVAL"
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
	public String getGrammarFileName() { return "CLUB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLUBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public RoundContext round() {
			return getRuleContext(RoundContext.class,0);
		}
		public TurnContext turn() {
			return getRuleContext(TurnContext.class,0);
		}
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CLUBParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			setup();
			setState(61);
			round();
			setState(62);
			turn();
			setState(63);
			funcs();
			setState(64);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetupContext extends ParserRuleContext {
		public TerminalNode SETUP() { return getToken(CLUBParser.SETUP, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitSetup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitSetup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(SETUP);
			setState(67);
			match(LCURLY);
			setState(68);
			stmts();
			setState(69);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoundContext extends ParserRuleContext {
		public TerminalNode ROUND() { return getToken(CLUBParser.ROUND, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public RoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterRound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitRound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitRound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoundContext round() throws RecognitionException {
		RoundContext _localctx = new RoundContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_round);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ROUND);
			setState(72);
			match(LCURLY);
			setState(73);
			stmts();
			setState(74);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TurnContext extends ParserRuleContext {
		public TerminalNode TURN() { return getToken(CLUBParser.TURN, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public TerminalNode CLASSID() { return getToken(CLUBParser.CLASSID, 0); }
		public TerminalNode VARID() { return getToken(CLUBParser.VARID, 0); }
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public TurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterTurn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitTurn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitTurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_turn);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(TURN);
				setState(77);
				match(LPAREN);
				setState(78);
				match(CLASSID);
				setState(79);
				match(VARID);
				setState(80);
				match(RPAREN);
				setState(81);
				match(LCURLY);
				setState(82);
				stmts();
				setState(83);
				match(RCURLY);
				}
				break;
			case EOF:
			case FUNCID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncsContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitFuncs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitFuncs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcs);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCID:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					func();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FUNCID );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmts);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				stmt();
				setState(97);
				stmts();
				}
				break;
			case RCURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNCID() { return getToken(CLUBParser.FUNCID, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public TParamsContext tParams() {
			return getRuleContext(TParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(FUNCID);
				setState(103);
				match(LPAREN);
				setState(104);
				tParams();
				setState(105);
				match(RPAREN);
				setState(106);
				match(LCURLY);
				setState(107);
				stmts();
				setState(108);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(FUNCID);
				setState(111);
				match(LPAREN);
				setState(112);
				match(RPAREN);
				setState(113);
				match(LCURLY);
				setState(114);
				stmts();
				setState(115);
				match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TParamsContext extends ParserRuleContext {
		public TParamContext tParam() {
			return getRuleContext(TParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CLUBParser.COMMA, 0); }
		public TParamsContext tParams() {
			return getRuleContext(TParamsContext.class,0);
		}
		public TParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterTParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitTParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitTParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TParamsContext tParams() throws RecognitionException {
		TParamsContext _localctx = new TParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			tParam();
			setState(120);
			match(COMMA);
			setState(121);
			tParams();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public TerminalNode INTVAL() { return getToken(CLUBParser.INTVAL, 0); }
		public TerminalNode SEMI() { return getToken(CLUBParser.SEMI, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(INTVAL);
			setState(124);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CLUBParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public TerminalNode FOR() { return getToken(CLUBParser.FOR, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CLUBParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CLUBParser.SEMI, i);
		}
		public PostfExprContext postfExpr() {
			return getRuleContext(PostfExprContext.class,0);
		}
		public IterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterIterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitIterStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitIterStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterStmtContext iterStmt() throws RecognitionException {
		IterStmtContext _localctx = new IterStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_iterStmt);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(WHILE);
				setState(127);
				match(LPAREN);
				setState(128);
				expr();
				setState(129);
				match(RPAREN);
				setState(130);
				match(LCURLY);
				setState(131);
				stmts();
				setState(132);
				match(RCURLY);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(FOR);
				setState(135);
				match(LPAREN);
				setState(136);
				decl();
				setState(137);
				match(SEMI);
				setState(138);
				expr();
				setState(139);
				match(SEMI);
				setState(140);
				postfExpr();
				setState(141);
				match(RPAREN);
				setState(142);
				match(LCURLY);
				setState(143);
				stmts();
				setState(144);
				match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CLUBParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IF);
			setState(149);
			match(LPAREN);
			setState(150);
			expr();
			setState(151);
			match(RPAREN);
			setState(152);
			match(LCURLY);
			setState(153);
			stmts();
			setState(154);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CLUBParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(CLUBParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CLUBParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARID() { return getToken(CLUBParser.VARID, 0); }
		public TParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterTParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitTParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitTParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TParamContext tParam() throws RecognitionException {
		TParamContext _localctx = new TParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			type();
			setState(161);
			match(VARID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CLUBParser.COMMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(CLUBParser.LSQUARE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CLUBParser.RSQUARE, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				param();
				setState(164);
				match(COMMA);
				setState(165);
				params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(LSQUARE);
				setState(168);
				list();
				setState(169);
				match(RSQUARE);
				setState(170);
				match(COMMA);
				setState(171);
				param();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				param();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OBJID() { return getToken(CLUBParser.OBJID, 0); }
		public TerminalNode COMMA() { return getToken(CLUBParser.COMMA, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(OBJID);
				setState(177);
				match(COMMA);
				setState(178);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(OBJID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			assignExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			assignExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ParserRuleContext {
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CLUBParser.ASSIGN, 0); }
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignExpr);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				logicOrExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				primaryExpr();
				setState(188);
				match(ASSIGN);
				setState(189);
				assignExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicOrExprContext extends ParserRuleContext {
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(CLUBParser.OR, 0); }
		public LogicOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterLogicOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitLogicOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitLogicOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOrExprContext logicOrExpr() throws RecognitionException {
		return logicOrExpr(0);
	}

	private LogicOrExprContext logicOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicOrExprContext _localctx = new LogicOrExprContext(_ctx, _parentState);
		LogicOrExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logicOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			logicAndExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicOrExpr);
					setState(196);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(197);
					match(OR);
					setState(198);
					logicAndExpr(0);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndExprContext extends ParserRuleContext {
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(CLUBParser.AND, 0); }
		public LogicAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterLogicAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitLogicAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitLogicAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicAndExprContext logicAndExpr() throws RecognitionException {
		return logicAndExpr(0);
	}

	private LogicAndExprContext logicAndExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicAndExprContext _localctx = new LogicAndExprContext(_ctx, _parentState);
		LogicAndExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logicAndExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			equalExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicAndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicAndExpr);
					setState(207);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(208);
					match(AND);
					setState(209);
					equalExpr(0);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualExprContext extends ParserRuleContext {
		public RelatExprContext relatExpr() {
			return getRuleContext(RelatExprContext.class,0);
		}
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CLUBParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(CLUBParser.NOTEQ, 0); }
		public EqualExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExprContext equalExpr() throws RecognitionException {
		return equalExpr(0);
	}

	private EqualExprContext equalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualExprContext _localctx = new EqualExprContext(_ctx, _parentState);
		EqualExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_equalExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			relatExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalExpr);
						setState(218);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(219);
						match(EQ);
						setState(220);
						relatExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalExpr);
						setState(221);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(222);
						match(NOTEQ);
						setState(223);
						relatExpr(0);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelatExprContext extends ParserRuleContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public RelatExprContext relatExpr() {
			return getRuleContext(RelatExprContext.class,0);
		}
		public TerminalNode SMALLER() { return getToken(CLUBParser.SMALLER, 0); }
		public TerminalNode LARGER() { return getToken(CLUBParser.LARGER, 0); }
		public TerminalNode SMALLEREQ() { return getToken(CLUBParser.SMALLEREQ, 0); }
		public TerminalNode BIGGEREQ() { return getToken(CLUBParser.BIGGEREQ, 0); }
		public RelatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterRelatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitRelatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitRelatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelatExprContext relatExpr() throws RecognitionException {
		return relatExpr(0);
	}

	private RelatExprContext relatExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelatExprContext _localctx = new RelatExprContext(_ctx, _parentState);
		RelatExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_relatExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(230);
			addExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new RelatExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relatExpr);
						setState(232);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(233);
						match(SMALLER);
						setState(234);
						addExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new RelatExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relatExpr);
						setState(235);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(236);
						match(LARGER);
						setState(237);
						addExpr(0);
						}
						break;
					case 3:
						{
						_localctx = new RelatExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relatExpr);
						setState(238);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(239);
						match(SMALLEREQ);
						setState(240);
						addExpr(0);
						}
						break;
					case 4:
						{
						_localctx = new RelatExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relatExpr);
						setState(241);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(242);
						match(BIGGEREQ);
						setState(243);
						addExpr(0);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ParserRuleContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CLUBParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CLUBParser.MINUS, 0); }
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		return addExpr(0);
	}

	private AddExprContext addExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
		AddExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_addExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			multExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(252);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(253);
						match(PLUS);
						setState(254);
						multExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(255);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(256);
						match(MINUS);
						setState(257);
						multExpr(0);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CLUBParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(CLUBParser.DIVIDE, 0); }
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		return multExpr(0);
	}

	private MultExprContext multExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultExprContext _localctx = new MultExprContext(_ctx, _parentState);
		MultExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_multExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multExpr);
						setState(266);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(267);
						match(MULT);
						setState(268);
						unaryExpr();
						}
						break;
					case 2:
						{
						_localctx = new MultExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multExpr);
						setState(269);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(270);
						match(DIVIDE);
						setState(271);
						unaryExpr();
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public PostfExprContext postfExpr() {
			return getRuleContext(PostfExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CLUBParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CLUBParser.NOT, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryExpr);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METHODID:
			case BOOLVAL:
			case CLASSID:
			case OBJID:
			case INTVAL:
			case VARID:
			case FUNCID:
			case STRINGVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				postfExpr();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(MINUS);
				setState(279);
				postfExpr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(NOT);
				setState(281);
				postfExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode INCREM() { return getToken(CLUBParser.INCREM, 0); }
		public TerminalNode DECREM() { return getToken(CLUBParser.DECREM, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode METHODID() { return getToken(CLUBParser.METHODID, 0); }
		public TerminalNode DOT() { return getToken(CLUBParser.DOT, 0); }
		public PostfExprContext postfExpr() {
			return getRuleContext(PostfExprContext.class,0);
		}
		public PostfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPostfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPostfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPostfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfExprContext postfExpr() throws RecognitionException {
		PostfExprContext _localctx = new PostfExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_postfExpr);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				primaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				primaryExpr();
				setState(286);
				match(INCREM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				primaryExpr();
				setState(289);
				match(DECREM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				primaryExpr();
				setState(292);
				match(LPAREN);
				setState(293);
				params();
				setState(294);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				primaryExpr();
				setState(297);
				match(LPAREN);
				setState(298);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				match(METHODID);
				setState(301);
				match(LPAREN);
				setState(302);
				params();
				setState(303);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(305);
				match(METHODID);
				setState(306);
				match(LPAREN);
				setState(307);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(308);
				primaryExpr();
				setState(309);
				match(DOT);
				setState(310);
				postfExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode VARID() { return getToken(CLUBParser.VARID, 0); }
		public TerminalNode OBJID() { return getToken(CLUBParser.OBJID, 0); }
		public TerminalNode FUNCID() { return getToken(CLUBParser.FUNCID, 0); }
		public TerminalNode CLASSID() { return getToken(CLUBParser.CLASSID, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primaryExpr);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLVAL:
			case INTVAL:
			case STRINGVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				val();
				}
				break;
			case VARID:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(VARID);
				}
				break;
			case OBJID:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(OBJID);
				}
				break;
			case FUNCID:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(FUNCID);
				}
				break;
			case CLASSID:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(CLASSID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public TerminalNode BOOLVAL() { return getToken(CLUBParser.BOOLVAL, 0); }
		public TerminalNode INTVAL() { return getToken(CLUBParser.INTVAL, 0); }
		public TerminalNode STRINGVAL() { return getToken(CLUBParser.STRINGVAL, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 10033043603456L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TParamContext tParam() {
			return getRuleContext(TParamContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CLUBParser.ASSIGN, 0); }
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			tParam();
			setState(324);
			match(ASSIGN);
			setState(325);
			logicOrExpr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return logicOrExpr_sempred((LogicOrExprContext)_localctx, predIndex);
		case 20:
			return logicAndExpr_sempred((LogicAndExprContext)_localctx, predIndex);
		case 21:
			return equalExpr_sempred((EqualExprContext)_localctx, predIndex);
		case 22:
			return relatExpr_sempred((RelatExprContext)_localctx, predIndex);
		case 23:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 24:
			return multExpr_sempred((MultExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicOrExpr_sempred(LogicOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicAndExpr_sempred(LogicAndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalExpr_sempred(EqualExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relatExpr_sempred(RelatExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multExpr_sempred(MultExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0148\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003W\b\u0003\u0001\u0004\u0004\u0004Z\b\u0004\u000b\u0004\f\u0004"+
		"[\u0001\u0004\u0003\u0004_\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006v\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0093\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00af\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b5\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00c0\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00c8\b\u0013\n"+
		"\u0013\f\u0013\u00cb\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00d3\b\u0014\n\u0014\f\u0014"+
		"\u00d6\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00e1\b\u0015"+
		"\n\u0015\f\u0015\u00e4\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00f5\b\u0016\n\u0016\f\u0016\u00f8\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0103\b\u0017\n\u0017\f\u0017\u0106\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0111\b\u0018\n\u0018\f\u0018"+
		"\u0114\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u011b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0139\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0140\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0006&(*,.0\u001e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:\u0000\u0002\u0001\u0000!#\u0003\u0000%%(("+
		"++\u014c\u0000<\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000"+
		"\u0004G\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\b^\u0001"+
		"\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000"+
		"\u000ew\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0092"+
		"\u0001\u0000\u0000\u0000\u0014\u0094\u0001\u0000\u0000\u0000\u0016\u009c"+
		"\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a\u00a0"+
		"\u0001\u0000\u0000\u0000\u001c\u00ae\u0001\u0000\u0000\u0000\u001e\u00b4"+
		"\u0001\u0000\u0000\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00b8\u0001"+
		"\u0000\u0000\u0000$\u00bf\u0001\u0000\u0000\u0000&\u00c1\u0001\u0000\u0000"+
		"\u0000(\u00cc\u0001\u0000\u0000\u0000*\u00d7\u0001\u0000\u0000\u0000,"+
		"\u00e5\u0001\u0000\u0000\u0000.\u00f9\u0001\u0000\u0000\u00000\u0107\u0001"+
		"\u0000\u0000\u00002\u011a\u0001\u0000\u0000\u00004\u0138\u0001\u0000\u0000"+
		"\u00006\u013f\u0001\u0000\u0000\u00008\u0141\u0001\u0000\u0000\u0000:"+
		"\u0143\u0001\u0000\u0000\u0000<=\u0003\u0002\u0001\u0000=>\u0003\u0004"+
		"\u0002\u0000>?\u0003\u0006\u0003\u0000?@\u0003\b\u0004\u0000@A\u0005\u0000"+
		"\u0000\u0001A\u0001\u0001\u0000\u0000\u0000BC\u0005\u001b\u0000\u0000"+
		"CD\u0005\u0016\u0000\u0000DE\u0003\n\u0005\u0000EF\u0005\u0017\u0000\u0000"+
		"F\u0003\u0001\u0000\u0000\u0000GH\u0005\u001c\u0000\u0000HI\u0005\u0016"+
		"\u0000\u0000IJ\u0003\n\u0005\u0000JK\u0005\u0017\u0000\u0000K\u0005\u0001"+
		"\u0000\u0000\u0000LM\u0005\u001d\u0000\u0000MN\u0005\u0014\u0000\u0000"+
		"NO\u0005&\u0000\u0000OP\u0005)\u0000\u0000PQ\u0005\u0015\u0000\u0000Q"+
		"R\u0005\u0016\u0000\u0000RS\u0003\n\u0005\u0000ST\u0005\u0017\u0000\u0000"+
		"TW\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VL\u0001\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XZ\u0003"+
		"\f\u0006\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"]_\u0001\u0000\u0000\u0000^Y\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_\t\u0001\u0000\u0000\u0000`a\u0003\u0010\b\u0000ab\u0003\n\u0005"+
		"\u0000be\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000d`\u0001\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000"+
		"fg\u0005*\u0000\u0000gh\u0005\u0014\u0000\u0000hi\u0003\u000e\u0007\u0000"+
		"ij\u0005\u0015\u0000\u0000jk\u0005\u0016\u0000\u0000kl\u0003\n\u0005\u0000"+
		"lm\u0005\u0017\u0000\u0000mv\u0001\u0000\u0000\u0000no\u0005*\u0000\u0000"+
		"op\u0005\u0014\u0000\u0000pq\u0005\u0015\u0000\u0000qr\u0005\u0016\u0000"+
		"\u0000rs\u0003\n\u0005\u0000st\u0005\u0017\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000uf\u0001\u0000\u0000\u0000un\u0001\u0000\u0000\u0000v\r\u0001\u0000"+
		"\u0000\u0000wx\u0003\u001a\r\u0000xy\u0005\u0012\u0000\u0000yz\u0003\u000e"+
		"\u0007\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005(\u0000\u0000|}\u0005"+
		"\u0013\u0000\u0000}\u0011\u0001\u0000\u0000\u0000~\u007f\u0005\u001e\u0000"+
		"\u0000\u007f\u0080\u0005\u0014\u0000\u0000\u0080\u0081\u0003\"\u0011\u0000"+
		"\u0081\u0082\u0005\u0015\u0000\u0000\u0082\u0083\u0005\u0016\u0000\u0000"+
		"\u0083\u0084\u0003\n\u0005\u0000\u0084\u0085\u0005\u0017\u0000\u0000\u0085"+
		"\u0093\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u001f\u0000\u0000\u0087"+
		"\u0088\u0005\u0014\u0000\u0000\u0088\u0089\u0003:\u001d\u0000\u0089\u008a"+
		"\u0005\u0013\u0000\u0000\u008a\u008b\u0003\"\u0011\u0000\u008b\u008c\u0005"+
		"\u0013\u0000\u0000\u008c\u008d\u00034\u001a\u0000\u008d\u008e\u0005\u0015"+
		"\u0000\u0000\u008e\u008f\u0005\u0016\u0000\u0000\u008f\u0090\u0003\n\u0005"+
		"\u0000\u0090\u0091\u0005\u0017\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092~\u0001\u0000\u0000\u0000\u0092\u0086\u0001\u0000\u0000\u0000"+
		"\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u0095\u0005 \u0000\u0000\u0095"+
		"\u0096\u0005\u0014\u0000\u0000\u0096\u0097\u0003\"\u0011\u0000\u0097\u0098"+
		"\u0005\u0015\u0000\u0000\u0098\u0099\u0005\u0016\u0000\u0000\u0099\u009a"+
		"\u0003\n\u0005\u0000\u009a\u009b\u0005\u0017\u0000\u0000\u009b\u0015\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0003\"\u0011\u0000\u009d\u0017\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0007\u0000\u0000\u0000\u009f\u0019\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0003\u0018\f\u0000\u00a1\u00a2\u0005)\u0000"+
		"\u0000\u00a2\u001b\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003 \u0010\u0000"+
		"\u00a4\u00a5\u0005\u0012\u0000\u0000\u00a5\u00a6\u0003\u001c\u000e\u0000"+
		"\u00a6\u00af\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0018\u0000\u0000"+
		"\u00a8\u00a9\u0003\u001e\u000f\u0000\u00a9\u00aa\u0005\u0019\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0012\u0000\u0000\u00ab\u00ac\u0003 \u0010\u0000\u00ac"+
		"\u00af\u0001\u0000\u0000\u0000\u00ad\u00af\u0003 \u0010\u0000\u00ae\u00a3"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a7\u0001\u0000\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u001d\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\'\u0000\u0000\u00b1\u00b2\u0005\u0012\u0000\u0000\u00b2\u00b5\u0003"+
		"\u001e\u000f\u0000\u00b3\u00b5\u0005\'\u0000\u0000\u00b4\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u001f\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0003$\u0012\u0000\u00b7!\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0003$\u0012\u0000\u00b9#\u0001\u0000\u0000\u0000\u00ba\u00c0"+
		"\u0003&\u0013\u0000\u00bb\u00bc\u00036\u001b\u0000\u00bc\u00bd\u0005\u0011"+
		"\u0000\u0000\u00bd\u00be\u0003$\u0012\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u00ba\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c0%\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u0013\uffff\uffff"+
		"\u0000\u00c2\u00c3\u0003(\u0014\u0000\u00c3\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\n\u0001\u0000\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6"+
		"\u00c8\u0003(\u0014\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u00cb"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\'\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0006\u0014\uffff\uffff\u0000\u00cd\u00ce"+
		"\u0003*\u0015\u0000\u00ce\u00d4\u0001\u0000\u0000\u0000\u00cf\u00d0\n"+
		"\u0001\u0000\u0000\u00d0\u00d1\u0005\u0001\u0000\u0000\u00d1\u00d3\u0003"+
		"*\u0015\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5)\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0006\u0015\uffff\uffff\u0000\u00d8\u00d9\u0003,\u0016"+
		"\u0000\u00d9\u00e2\u0001\u0000\u0000\u0000\u00da\u00db\n\u0002\u0000\u0000"+
		"\u00db\u00dc\u0005\u0003\u0000\u0000\u00dc\u00e1\u0003,\u0016\u0000\u00dd"+
		"\u00de\n\u0001\u0000\u0000\u00de\u00df\u0005\u0004\u0000\u0000\u00df\u00e1"+
		"\u0003,\u0016\u0000\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3+\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0006\u0016"+
		"\uffff\uffff\u0000\u00e6\u00e7\u0003.\u0017\u0000\u00e7\u00f6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\n\u0004\u0000\u0000\u00e9\u00ea\u0005\u0005\u0000"+
		"\u0000\u00ea\u00f5\u0003.\u0017\u0000\u00eb\u00ec\n\u0003\u0000\u0000"+
		"\u00ec\u00ed\u0005\u0006\u0000\u0000\u00ed\u00f5\u0003.\u0017\u0000\u00ee"+
		"\u00ef\n\u0002\u0000\u0000\u00ef\u00f0\u0005\u0007\u0000\u0000\u00f0\u00f5"+
		"\u0003.\u0017\u0000\u00f1\u00f2\n\u0001\u0000\u0000\u00f2\u00f3\u0005"+
		"\b\u0000\u0000\u00f3\u00f5\u0003.\u0017\u0000\u00f4\u00e8\u0001\u0000"+
		"\u0000\u0000\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f4\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7-\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0006\u0017\uffff\uffff\u0000\u00fa\u00fb\u00030\u0018"+
		"\u0000\u00fb\u0104\u0001\u0000\u0000\u0000\u00fc\u00fd\n\u0002\u0000\u0000"+
		"\u00fd\u00fe\u0005\u000b\u0000\u0000\u00fe\u0103\u00030\u0018\u0000\u00ff"+
		"\u0100\n\u0001\u0000\u0000\u0100\u0101\u0005\f\u0000\u0000\u0101\u0103"+
		"\u00030\u0018\u0000\u0102\u00fc\u0001\u0000\u0000\u0000\u0102\u00ff\u0001"+
		"\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105/\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0006\u0018"+
		"\uffff\uffff\u0000\u0108\u0109\u00032\u0019\u0000\u0109\u0112\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\n\u0002\u0000\u0000\u010b\u010c\u0005\r\u0000"+
		"\u0000\u010c\u0111\u00032\u0019\u0000\u010d\u010e\n\u0001\u0000\u0000"+
		"\u010e\u010f\u0005\u000e\u0000\u0000\u010f\u0111\u00032\u0019\u0000\u0110"+
		"\u010a\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0111"+
		"\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u01131\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0115\u011b\u00034\u001a\u0000\u0116\u0117\u0005"+
		"\f\u0000\u0000\u0117\u011b\u00034\u001a\u0000\u0118\u0119\u0005\u0010"+
		"\u0000\u0000\u0119\u011b\u00034\u001a\u0000\u011a\u0115\u0001\u0000\u0000"+
		"\u0000\u011a\u0116\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b3\u0001\u0000\u0000\u0000\u011c\u0139\u00036\u001b\u0000\u011d"+
		"\u011e\u00036\u001b\u0000\u011e\u011f\u0005\t\u0000\u0000\u011f\u0139"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u00036\u001b\u0000\u0121\u0122\u0005"+
		"\n\u0000\u0000\u0122\u0139\u0001\u0000\u0000\u0000\u0123\u0124\u00036"+
		"\u001b\u0000\u0124\u0125\u0005\u0014\u0000\u0000\u0125\u0126\u0003\u001c"+
		"\u000e\u0000\u0126\u0127\u0005\u0015\u0000\u0000\u0127\u0139\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u00036\u001b\u0000\u0129\u012a\u0005\u0014\u0000"+
		"\u0000\u012a\u012b\u0005\u0015\u0000\u0000\u012b\u0139\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005$\u0000\u0000\u012d\u012e\u0005\u0014\u0000\u0000"+
		"\u012e\u012f\u0003\u001c\u000e\u0000\u012f\u0130\u0005\u0015\u0000\u0000"+
		"\u0130\u0139\u0001\u0000\u0000\u0000\u0131\u0132\u0005$\u0000\u0000\u0132"+
		"\u0133\u0005\u0014\u0000\u0000\u0133\u0139\u0005\u0015\u0000\u0000\u0134"+
		"\u0135\u00036\u001b\u0000\u0135\u0136\u0005\u000f\u0000\u0000\u0136\u0137"+
		"\u00034\u001a\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u011c\u0001"+
		"\u0000\u0000\u0000\u0138\u011d\u0001\u0000\u0000\u0000\u0138\u0120\u0001"+
		"\u0000\u0000\u0000\u0138\u0123\u0001\u0000\u0000\u0000\u0138\u0128\u0001"+
		"\u0000\u0000\u0000\u0138\u012c\u0001\u0000\u0000\u0000\u0138\u0131\u0001"+
		"\u0000\u0000\u0000\u0138\u0134\u0001\u0000\u0000\u0000\u01395\u0001\u0000"+
		"\u0000\u0000\u013a\u0140\u00038\u001c\u0000\u013b\u0140\u0005)\u0000\u0000"+
		"\u013c\u0140\u0005\'\u0000\u0000\u013d\u0140\u0005*\u0000\u0000\u013e"+
		"\u0140\u0005&\u0000\u0000\u013f\u013a\u0001\u0000\u0000\u0000\u013f\u013b"+
		"\u0001\u0000\u0000\u0000\u013f\u013c\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u01407\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0007\u0001\u0000\u0000\u01429\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0003\u001a\r\u0000\u0144\u0145\u0005\u0011\u0000"+
		"\u0000\u0145\u0146\u0003&\u0013\u0000\u0146;\u0001\u0000\u0000\u0000\u0016"+
		"V[^du\u0092\u00ae\u00b4\u00bf\u00c9\u00d4\u00e0\u00e2\u00f4\u00f6\u0102"+
		"\u0104\u0110\u0112\u011a\u0138\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}