// Generated from C:/Users/Kira/Documents/GitHub/P4/Antlr4_AST3/src\CLUB.g4 by ANTLR 4.12.0
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
		T__0=1, T__1=2, T__2=3, AND=4, OR=5, EQ=6, NOTEQ=7, SMALLER=8, LARGER=9, 
		SMALLEREQ=10, BIGGEREQ=11, INCREM=12, DECREM=13, PLUS=14, MINUS=15, MULT=16, 
		DIVIDE=17, DOT=18, NOT=19, ASSIGN=20, COMMA=21, SEMI=22, LPAREN=23, RPAREN=24, 
		LCURLY=25, RCURLY=26, LSQUARE=27, RSQUARE=28, WS=29, SETUP=30, ROUND=31, 
		TURN=32, WHILE=33, FOR=34, IF=35, BOOL=36, INT=37, STRING=38, METHODID=39, 
		BOOLVAL=40, CLASSID=41, OBJID=42, INTVAL=43, VARID=44, FUNCID=45, STRINGVAL=46, 
		INTPARAM=47, BOOLPARAM=48, STRINGPARAM=49;
	public static final int
		RULE_program = 0, RULE_setup = 1, RULE_round = 2, RULE_turn = 3, RULE_func = 4, 
		RULE_stmt = 5, RULE_iterStmt = 6, RULE_selectStmt = 7, RULE_tParam = 8, 
		RULE_assignExpr = 9, RULE_logicOrExpr = 10, RULE_logicAndExpr = 11, RULE_equalExpr = 12, 
		RULE_relatExpr = 13, RULE_addExpr = 14, RULE_multExpr = 15, RULE_unaryExpr = 16, 
		RULE_postfExpr = 17, RULE_primaryExpr = 18, RULE_val = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "round", "turn", "func", "stmt", "iterStmt", "selectStmt", 
			"tParam", "assignExpr", "logicOrExpr", "logicAndExpr", "equalExpr", "relatExpr", 
			"addExpr", "multExpr", "unaryExpr", "postfExpr", "primaryExpr", "val"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Player'", "'player'", "'Player.getPlayer('", "'&&'", "'||'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'.'", "'!'", "'='", "','", "';'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", null, "'Setup'", "'Round'", "'Turn'", "'while'", 
			"'for'", "'if'", "'bool'", "'int'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "AND", "OR", "EQ", "NOTEQ", "SMALLER", "LARGER", 
			"SMALLEREQ", "BIGGEREQ", "INCREM", "DECREM", "PLUS", "MINUS", "MULT", 
			"DIVIDE", "DOT", "NOT", "ASSIGN", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LSQUARE", "RSQUARE", "WS", "SETUP", "ROUND", "TURN", 
			"WHILE", "FOR", "IF", "BOOL", "INT", "STRING", "METHODID", "BOOLVAL", 
			"CLASSID", "OBJID", "INTVAL", "VARID", "FUNCID", "STRINGVAL", "INTPARAM", 
			"BOOLPARAM", "STRINGPARAM"
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
		public TerminalNode EOF() { return getToken(CLUBParser.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			setup();
			setState(41);
			round();
			setState(42);
			turn();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCID) {
				{
				{
				setState(43);
				func();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(SETUP);
			setState(52);
			match(LCURLY);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18133351923712L) != 0)) {
				{
				{
				setState(53);
				stmt();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ROUND);
			setState(62);
			match(LCURLY);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18133351923712L) != 0)) {
				{
				{
				setState(63);
				stmt();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class TurnContext extends ParserRuleContext {
		public TerminalNode TURN() { return getToken(CLUBParser.TURN, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TURN) {
				{
				setState(71);
				match(TURN);
				setState(72);
				match(LPAREN);
				setState(73);
				match(T__0);
				setState(74);
				match(T__1);
				setState(75);
				match(RPAREN);
				setState(76);
				match(LCURLY);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18133351923712L) != 0)) {
					{
					{
					setState(77);
					stmt();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(RCURLY);
				}
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
	public static class FuncContext extends ParserRuleContext {
		public Token left;
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public TerminalNode FUNCID() { return getToken(CLUBParser.FUNCID, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
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
		enterRule(_localctx, 8, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((FuncContext)_localctx).left = match(FUNCID);
			setState(87);
			match(LCURLY);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18133351923712L) != 0)) {
				{
				{
				setState(88);
				stmt();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Stmt1Context extends StmtContext {
		public Token op;
		public TParamContext tParam() {
			return getRuleContext(TParamContext.class,0);
		}
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CLUBParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(CLUBParser.ASSIGN, 0); }
		public Stmt1Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterStmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitStmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitStmt1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Stmt2Context extends StmtContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CLUBParser.SEMI, 0); }
		public Stmt2Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterStmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitStmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitStmt2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Stmt3Context extends StmtContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public Stmt3Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterStmt3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitStmt3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitStmt3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Stmt4Context extends StmtContext {
		public IterStmtContext iterStmt() {
			return getRuleContext(IterStmtContext.class,0);
		}
		public Stmt4Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterStmt4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitStmt4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitStmt4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case STRING:
				_localctx = new Stmt1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				tParam();
				setState(97);
				((Stmt1Context)_localctx).op = match(ASSIGN);
				setState(98);
				logicOrExpr();
				setState(99);
				match(SEMI);
				}
				break;
			case VARID:
				_localctx = new Stmt2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				assignExpr();
				setState(102);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new Stmt3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				selectStmt();
				}
				break;
			case WHILE:
			case FOR:
				_localctx = new Stmt4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				iterStmt();
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
	public static class IterStmtContext extends ParserRuleContext {
		public IterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStmt; }
	 
		public IterStmtContext() { }
		public void copyFrom(IterStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends IterStmtContext {
		public Token op;
		public Token right;
		public Token rop;
		public TerminalNode FOR() { return getToken(CLUBParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public TParamContext tParam() {
			return getRuleContext(TParamContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CLUBParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CLUBParser.SEMI, i);
		}
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public TerminalNode ASSIGN() { return getToken(CLUBParser.ASSIGN, 0); }
		public TerminalNode VARID() { return getToken(CLUBParser.VARID, 0); }
		public TerminalNode INCREM() { return getToken(CLUBParser.INCREM, 0); }
		public TerminalNode DECREM() { return getToken(CLUBParser.DECREM, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ForContext(IterStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends IterStmtContext {
		public TerminalNode WHILE() { return getToken(CLUBParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhileContext(IterStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterStmtContext iterStmt() throws RecognitionException {
		IterStmtContext _localctx = new IterStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iterStmt);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(WHILE);
				setState(109);
				match(LPAREN);
				setState(110);
				logicOrExpr();
				setState(111);
				match(RPAREN);
				setState(112);
				match(LCURLY);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18133351923712L) != 0)) {
					{
					{
					setState(113);
					stmt();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(RCURLY);
				}
				break;
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(FOR);
				setState(122);
				match(LPAREN);
				setState(123);
				tParam();
				setState(124);
				((ForContext)_localctx).op = match(ASSIGN);
				setState(125);
				addExpr();
				setState(126);
				match(SEMI);
				setState(127);
				logicOrExpr();
				setState(128);
				match(SEMI);
				setState(129);
				((ForContext)_localctx).right = match(VARID);
				setState(130);
				((ForContext)_localctx).rop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREM || _la==DECREM) ) {
					((ForContext)_localctx).rop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				match(RPAREN);
				setState(132);
				match(LCURLY);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18133351923712L) != 0)) {
					{
					{
					setState(133);
					stmt();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
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
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IF);
			setState(144);
			match(LPAREN);
			setState(145);
			logicOrExpr();
			setState(146);
			match(RPAREN);
			setState(147);
			match(LCURLY);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18133351923712L) != 0)) {
				{
				{
				setState(148);
				stmt();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class TParamContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public TerminalNode VARID() { return getToken(CLUBParser.VARID, 0); }
		public TerminalNode BOOL() { return getToken(CLUBParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(CLUBParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CLUBParser.STRING, 0); }
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
		enterRule(_localctx, 16, RULE_tParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((TParamContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
				((TParamContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			((TParamContext)_localctx).right = match(VARID);
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
		public Token left;
		public Token op;
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public TerminalNode VARID() { return getToken(CLUBParser.VARID, 0); }
		public TerminalNode ASSIGN() { return getToken(CLUBParser.ASSIGN, 0); }
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
		enterRule(_localctx, 18, RULE_assignExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((AssignExprContext)_localctx).left = match(VARID);
			setState(160);
			((AssignExprContext)_localctx).op = match(ASSIGN);
			setState(161);
			logicOrExpr();
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
		public LogicOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOrExpr; }
	 
		public LogicOrExprContext() { }
		public void copyFrom(LogicOrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOr1Context extends LogicOrExprContext {
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public LogicOr1Context(LogicOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterLogicOr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitLogicOr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitLogicOr1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOr2Context extends LogicOrExprContext {
		public Token op;
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(CLUBParser.OR, 0); }
		public LogicOr2Context(LogicOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterLogicOr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitLogicOr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitLogicOr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOrExprContext logicOrExpr() throws RecognitionException {
		LogicOrExprContext _localctx = new LogicOrExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicOrExpr);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new LogicOr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				logicAndExpr();
				}
				break;
			case 2:
				_localctx = new LogicOr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				logicAndExpr();
				setState(165);
				((LogicOr2Context)_localctx).op = match(OR);
				setState(166);
				logicOrExpr();
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
	public static class LogicAndExprContext extends ParserRuleContext {
		public LogicAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAndExpr; }
	 
		public LogicAndExprContext() { }
		public void copyFrom(LogicAndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAnd1Context extends LogicAndExprContext {
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public LogicAnd1Context(LogicAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterLogicAnd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitLogicAnd1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitLogicAnd1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAnd2Context extends LogicAndExprContext {
		public Token op;
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(CLUBParser.AND, 0); }
		public LogicAnd2Context(LogicAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterLogicAnd2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitLogicAnd2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitLogicAnd2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicAndExprContext logicAndExpr() throws RecognitionException {
		LogicAndExprContext _localctx = new LogicAndExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicAndExpr);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LogicAnd1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				equalExpr();
				}
				break;
			case 2:
				_localctx = new LogicAnd2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				equalExpr();
				setState(172);
				((LogicAnd2Context)_localctx).op = match(AND);
				setState(173);
				logicAndExpr();
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
	public static class EqualExprContext extends ParserRuleContext {
		public EqualExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpr; }
	 
		public EqualExprContext() { }
		public void copyFrom(EqualExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Equal1Context extends EqualExprContext {
		public RelatExprContext relatExpr() {
			return getRuleContext(RelatExprContext.class,0);
		}
		public Equal1Context(EqualExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterEqual1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitEqual1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitEqual1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Equal2Context extends EqualExprContext {
		public Token op;
		public RelatExprContext relatExpr() {
			return getRuleContext(RelatExprContext.class,0);
		}
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CLUBParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(CLUBParser.NOTEQ, 0); }
		public Equal2Context(EqualExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterEqual2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitEqual2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitEqual2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExprContext equalExpr() throws RecognitionException {
		EqualExprContext _localctx = new EqualExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equalExpr);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Equal1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				relatExpr();
				}
				break;
			case 2:
				_localctx = new Equal2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				relatExpr();
				setState(179);
				((Equal2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NOTEQ) ) {
					((Equal2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				equalExpr();
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
	public static class RelatExprContext extends ParserRuleContext {
		public RelatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relatExpr; }
	 
		public RelatExprContext() { }
		public void copyFrom(RelatExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Relat2Context extends RelatExprContext {
		public Token op;
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
		public Relat2Context(RelatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterRelat2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitRelat2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitRelat2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Relat1Context extends RelatExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public Relat1Context(RelatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterRelat1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitRelat1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitRelat1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelatExprContext relatExpr() throws RecognitionException {
		RelatExprContext _localctx = new RelatExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relatExpr);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Relat1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				addExpr();
				}
				break;
			case 2:
				_localctx = new Relat2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				addExpr();
				setState(186);
				((Relat2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) ) {
					((Relat2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				relatExpr();
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
	public static class AddExprContext extends ParserRuleContext {
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	 
		public AddExprContext() { }
		public void copyFrom(AddExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add2Context extends AddExprContext {
		public Token op;
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CLUBParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CLUBParser.MINUS, 0); }
		public Add2Context(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterAdd2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitAdd2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitAdd2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add1Context extends AddExprContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public Add1Context(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterAdd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitAdd1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitAdd1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addExpr);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Add1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				multExpr();
				}
				break;
			case 2:
				_localctx = new Add2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				multExpr();
				setState(193);
				((Add2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Add2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				addExpr();
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
	public static class MultExprContext extends ParserRuleContext {
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	 
		public MultExprContext() { }
		public void copyFrom(MultExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mult2Context extends MultExprContext {
		public Token op;
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CLUBParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(CLUBParser.DIVIDE, 0); }
		public Mult2Context(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterMult2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitMult2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitMult2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mult1Context extends MultExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public Mult1Context(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterMult1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitMult1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitMult1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multExpr);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Mult1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				unaryExpr();
				}
				break;
			case 2:
				_localctx = new Mult2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				unaryExpr();
				setState(200);
				((Mult2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIVIDE) ) {
					((Mult2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				multExpr();
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
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary2Context extends UnaryExprContext {
		public Token op;
		public PostfExprContext postfExpr() {
			return getRuleContext(PostfExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CLUBParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CLUBParser.NOT, 0); }
		public Unary2Context(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterUnary2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitUnary2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitUnary2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary1Context extends UnaryExprContext {
		public PostfExprContext postfExpr() {
			return getRuleContext(PostfExprContext.class,0);
		}
		public Unary1Context(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterUnary1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitUnary1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitUnary1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unaryExpr);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TURN:
			case METHODID:
			case BOOLVAL:
			case INTVAL:
			case VARID:
			case FUNCID:
			case STRINGVAL:
				_localctx = new Unary1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				postfExpr();
				}
				break;
			case MINUS:
			case NOT:
				_localctx = new Unary2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				((Unary2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
					((Unary2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
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
		public PostfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfExpr; }
	 
		public PostfExprContext() { }
		public void copyFrom(PostfExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostF3Context extends PostfExprContext {
		public Token left;
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CLUBParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CLUBParser.RPAREN, i);
		}
		public TerminalNode TURN() { return getToken(CLUBParser.TURN, 0); }
		public PostF3Context(PostfExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPostF3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPostF3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPostF3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostF2Context extends PostfExprContext {
		public Token op;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode INCREM() { return getToken(CLUBParser.INCREM, 0); }
		public TerminalNode DECREM() { return getToken(CLUBParser.DECREM, 0); }
		public PostF2Context(PostfExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPostF2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPostF2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPostF2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostF5Context extends PostfExprContext {
		public Token left;
		public TerminalNode METHODID() { return getToken(CLUBParser.METHODID, 0); }
		public PostF5Context(PostfExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPostF5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPostF5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPostF5(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostF4Context extends PostfExprContext {
		public Token left;
		public TerminalNode FUNCID() { return getToken(CLUBParser.FUNCID, 0); }
		public PostF4Context(PostfExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPostF4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPostF4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPostF4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostF1Context extends PostfExprContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PostF1Context(PostfExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPostF1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPostF1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPostF1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfExprContext postfExpr() throws RecognitionException {
		PostfExprContext _localctx = new PostfExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_postfExpr);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new PostF1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				primaryExpr();
				}
				break;
			case 2:
				_localctx = new PostF2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				primaryExpr();
				setState(212);
				((PostF2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREM || _la==DECREM) ) {
					((PostF2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new PostF3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				((PostF3Context)_localctx).left = match(TURN);
				setState(215);
				match(LPAREN);
				setState(216);
				match(T__2);
				setState(217);
				primaryExpr();
				setState(218);
				match(RPAREN);
				setState(219);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new PostF4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				((PostF4Context)_localctx).left = match(FUNCID);
				}
				break;
			case 5:
				_localctx = new PostF5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				((PostF5Context)_localctx).left = match(METHODID);
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
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	 
		public PrimaryExprContext() { }
		public void copyFrom(PrimaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Primary1Context extends PrimaryExprContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Primary1Context(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPrimary1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPrimary1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPrimary1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Primary2Context extends PrimaryExprContext {
		public Token left;
		public TerminalNode VARID() { return getToken(CLUBParser.VARID, 0); }
		public Primary2Context(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).enterPrimary2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLUBListener ) ((CLUBListener)listener).exitPrimary2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLUBVisitor ) return ((CLUBVisitor<? extends T>)visitor).visitPrimary2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primaryExpr);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLVAL:
			case INTVAL:
			case STRINGVAL:
				_localctx = new Primary1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				val();
				}
				break;
			case VARID:
				_localctx = new Primary2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				((Primary2Context)_localctx).left = match(VARID);
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
		public Token left;
		public TerminalNode INTVAL() { return getToken(CLUBParser.INTVAL, 0); }
		public TerminalNode BOOLVAL() { return getToken(CLUBParser.BOOLVAL, 0); }
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
		enterRule(_localctx, 38, RULE_val);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				((ValContext)_localctx).left = match(INTVAL);
				}
				break;
			case BOOLVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				((ValContext)_localctx).left = match(BOOLVAL);
				}
				break;
			case STRINGVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				((ValContext)_localctx).left = match(STRINGVAL);
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

	public static final String _serializedATN =
		"\u0004\u00011\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001\f\u0001"+
		":\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001\u0003"+
		"\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"Z\b\u0004\n\u0004\f\u0004]\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005k\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"s\b\u0006\n\u0006\f\u0006v\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0087\b\u0006\n\u0006\f\u0006\u008a\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u008e\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0096\b\u0007\n\u0007\f\u0007"+
		"\u0099\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00a9\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00b0\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00b7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00be\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00c5\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00cc\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00d1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00e0\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00e4\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00e9\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\u0007\u0001\u0000\f\r\u0001\u0000$&\u0001\u0000\u0006\u0007\u0001\u0000"+
		"\b\u000b\u0001\u0000\u000e\u000f\u0001\u0000\u0010\u0011\u0002\u0000\u000f"+
		"\u000f\u0013\u0013\u00f1\u0000(\u0001\u0000\u0000\u0000\u00023\u0001\u0000"+
		"\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000"+
		"\bV\u0001\u0000\u0000\u0000\nj\u0001\u0000\u0000\u0000\f\u008d\u0001\u0000"+
		"\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000\u0010\u009c\u0001\u0000"+
		"\u0000\u0000\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00a8\u0001\u0000"+
		"\u0000\u0000\u0016\u00af\u0001\u0000\u0000\u0000\u0018\u00b6\u0001\u0000"+
		"\u0000\u0000\u001a\u00bd\u0001\u0000\u0000\u0000\u001c\u00c4\u0001\u0000"+
		"\u0000\u0000\u001e\u00cb\u0001\u0000\u0000\u0000 \u00d0\u0001\u0000\u0000"+
		"\u0000\"\u00df\u0001\u0000\u0000\u0000$\u00e3\u0001\u0000\u0000\u0000"+
		"&\u00e8\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0003\u0004"+
		"\u0002\u0000*.\u0003\u0006\u0003\u0000+-\u0003\b\u0004\u0000,+\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"12\u0005\u0000\u0000\u00012\u0001\u0001\u0000\u0000\u000034\u0005\u001e"+
		"\u0000\u000048\u0005\u0019\u0000\u000057\u0003\n\u0005\u000065\u0001\u0000"+
		"\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		";<\u0005\u001a\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0005\u001f"+
		"\u0000\u0000>B\u0005\u0019\u0000\u0000?A\u0003\n\u0005\u0000@?\u0001\u0000"+
		"\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"EF\u0005\u001a\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005 \u0000"+
		"\u0000HI\u0005\u0017\u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u0005\u0002"+
		"\u0000\u0000KL\u0005\u0018\u0000\u0000LP\u0005\u0019\u0000\u0000MO\u0003"+
		"\n\u0005\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000SU\u0005\u001a\u0000\u0000TG\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0005"+
		"-\u0000\u0000W[\u0005\u0019\u0000\u0000XZ\u0003\n\u0005\u0000YX\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^_\u0005\u001a\u0000\u0000_\t\u0001\u0000\u0000\u0000`a\u0003\u0010"+
		"\b\u0000ab\u0005\u0014\u0000\u0000bc\u0003\u0014\n\u0000cd\u0005\u0016"+
		"\u0000\u0000dk\u0001\u0000\u0000\u0000ef\u0003\u0012\t\u0000fg\u0005\u0016"+
		"\u0000\u0000gk\u0001\u0000\u0000\u0000hk\u0003\u000e\u0007\u0000ik\u0003"+
		"\f\u0006\u0000j`\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\u000b\u0001\u0000\u0000"+
		"\u0000lm\u0005!\u0000\u0000mn\u0005\u0017\u0000\u0000no\u0003\u0014\n"+
		"\u0000op\u0005\u0018\u0000\u0000pt\u0005\u0019\u0000\u0000qs\u0003\n\u0005"+
		"\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000wx\u0005\u001a\u0000\u0000x\u008e\u0001\u0000\u0000"+
		"\u0000yz\u0005\"\u0000\u0000z{\u0005\u0017\u0000\u0000{|\u0003\u0010\b"+
		"\u0000|}\u0005\u0014\u0000\u0000}~\u0003\u001c\u000e\u0000~\u007f\u0005"+
		"\u0016\u0000\u0000\u007f\u0080\u0003\u0014\n\u0000\u0080\u0081\u0005\u0016"+
		"\u0000\u0000\u0081\u0082\u0005,\u0000\u0000\u0082\u0083\u0007\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0018\u0000\u0000\u0084\u0088\u0005\u0019\u0000"+
		"\u0000\u0085\u0087\u0003\n\u0005\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001a\u0000\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008dl\u0001\u0000\u0000\u0000\u008d"+
		"y\u0001\u0000\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005#\u0000\u0000\u0090\u0091\u0005\u0017\u0000\u0000\u0091\u0092\u0003"+
		"\u0014\n\u0000\u0092\u0093\u0005\u0018\u0000\u0000\u0093\u0097\u0005\u0019"+
		"\u0000\u0000\u0094\u0096\u0003\n\u0005\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u001a\u0000"+
		"\u0000\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0001\u0000"+
		"\u0000\u009d\u009e\u0005,\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005,\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1"+
		"\u00a2\u0003\u0014\n\u0000\u00a2\u0013\u0001\u0000\u0000\u0000\u00a3\u00a9"+
		"\u0003\u0016\u000b\u0000\u00a4\u00a5\u0003\u0016\u000b\u0000\u00a5\u00a6"+
		"\u0005\u0005\u0000\u0000\u00a6\u00a7\u0003\u0014\n\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a9\u0015\u0001\u0000\u0000\u0000\u00aa\u00b0\u0003"+
		"\u0018\f\u0000\u00ab\u00ac\u0003\u0018\f\u0000\u00ac\u00ad\u0005\u0004"+
		"\u0000\u0000\u00ad\u00ae\u0003\u0016\u000b\u0000\u00ae\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00aa\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1\u00b7\u0003\u001a"+
		"\r\u0000\u00b2\u00b3\u0003\u001a\r\u0000\u00b3\u00b4\u0007\u0002\u0000"+
		"\u0000\u00b4\u00b5\u0003\u0018\f\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b7\u0019\u0001\u0000\u0000\u0000\u00b8\u00be\u0003\u001c\u000e\u0000"+
		"\u00b9\u00ba\u0003\u001c\u000e\u0000\u00ba\u00bb\u0007\u0003\u0000\u0000"+
		"\u00bb\u00bc\u0003\u001a\r\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000\u00be"+
		"\u001b\u0001\u0000\u0000\u0000\u00bf\u00c5\u0003\u001e\u000f\u0000\u00c0"+
		"\u00c1\u0003\u001e\u000f\u0000\u00c1\u00c2\u0007\u0004\u0000\u0000\u00c2"+
		"\u00c3\u0003\u001c\u000e\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c5"+
		"\u001d\u0001\u0000\u0000\u0000\u00c6\u00cc\u0003 \u0010\u0000\u00c7\u00c8"+
		"\u0003 \u0010\u0000\u00c8\u00c9\u0007\u0005\u0000\u0000\u00c9\u00ca\u0003"+
		"\u001e\u000f\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c6\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cc\u001f\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d1\u0003\"\u0011\u0000\u00ce\u00cf\u0007\u0006"+
		"\u0000\u0000\u00cf\u00d1\u0003\"\u0011\u0000\u00d0\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1!\u0001\u0000\u0000\u0000"+
		"\u00d2\u00e0\u0003$\u0012\u0000\u00d3\u00d4\u0003$\u0012\u0000\u00d4\u00d5"+
		"\u0007\u0000\u0000\u0000\u00d5\u00e0\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005 \u0000\u0000\u00d7\u00d8\u0005\u0017\u0000\u0000\u00d8\u00d9\u0005"+
		"\u0003\u0000\u0000\u00d9\u00da\u0003$\u0012\u0000\u00da\u00db\u0005\u0018"+
		"\u0000\u0000\u00db\u00dc\u0005\u0018\u0000\u0000\u00dc\u00e0\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0005-\u0000\u0000\u00de\u00e0\u0005\'\u0000"+
		"\u0000\u00df\u00d2\u0001\u0000\u0000\u0000\u00df\u00d3\u0001\u0000\u0000"+
		"\u0000\u00df\u00d6\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0#\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0003&\u0013\u0000\u00e2\u00e4\u0005,\u0000\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4%\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e9\u0005+\u0000\u0000\u00e6\u00e9\u0005(\u0000"+
		"\u0000\u00e7\u00e9\u0005.\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\'\u0001\u0000\u0000\u0000\u0015.8BPT[jt\u0088\u008d\u0097\u00a8"+
		"\u00af\u00b6\u00bd\u00c4\u00cb\u00d0\u00df\u00e3\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}