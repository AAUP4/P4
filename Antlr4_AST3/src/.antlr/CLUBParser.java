// Generated from c:\Users\night\Documents\GitHub\P4\Antlr4_AST3\src\CLUB.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLUBParser extends Parser {
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
		CLASSID=40, OBJID=41, INTVAL=42, VARID=43, FUNCID=44, STRINGVAL=45, VEC=46;
	public static final int
		RULE_program = 0, RULE_setup = 1, RULE_round = 2, RULE_turn = 3, RULE_funcs = 4, 
		RULE_func = 5, RULE_tParams = 6, RULE_stmt = 7, RULE_iterStmt = 8, RULE_selectStmt = 9, 
		RULE_tParam = 10, RULE_params = 11, RULE_assignExpr = 12, RULE_logicOrExpr = 13, 
		RULE_logicAndExpr = 14, RULE_equalExpr = 15, RULE_relatExpr = 16, RULE_addExpr = 17, 
		RULE_multExpr = 18, RULE_unaryExpr = 19, RULE_postfExpr = 20, RULE_primaryExpr = 21, 
		RULE_val = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "round", "turn", "funcs", "func", "tParams", "stmt", 
			"iterStmt", "selectStmt", "tParam", "params", "assignExpr", "logicOrExpr", 
			"logicAndExpr", "equalExpr", "relatExpr", "addExpr", "multExpr", "unaryExpr", 
			"postfExpr", "primaryExpr", "val"
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
			"INTVAL", "VARID", "FUNCID", "STRINGVAL", "VEC"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			setup();
			setState(47);
			round();
			setState(48);
			turn();
			setState(49);
			funcs();
			setState(50);
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
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(SETUP);
			setState(53);
			match(LCURLY);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VARID))) != 0)) {
				{
				{
				setState(54);
				stmt();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
	}

	public final RoundContext round() throws RecognitionException {
		RoundContext _localctx = new RoundContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_round);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ROUND);
			setState(63);
			match(LCURLY);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VARID))) != 0)) {
				{
				{
				setState(64);
				stmt();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TURN) {
				{
				setState(72);
				match(TURN);
				setState(73);
				match(LPAREN);
				setState(74);
				match(T__0);
				setState(75);
				match(T__1);
				setState(76);
				match(RPAREN);
				setState(77);
				match(LCURLY);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VARID))) != 0)) {
					{
					{
					setState(78);
					stmt();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
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
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCID) {
				{
				{
				setState(87);
				func();
				}
				}
				setState(92);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNCID() { return getToken(CLUBParser.FUNCID, 0); }
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(CLUBParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CLUBParser.RCURLY, 0); }
		public TParamsContext tParams() {
			return getRuleContext(TParamsContext.class,0);
		}
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
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(FUNCID);
			setState(94);
			match(LPAREN);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(95);
				tParams();
				}
			}

			setState(98);
			match(RPAREN);
			setState(99);
			match(LCURLY);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VARID))) != 0)) {
				{
				{
				setState(100);
				stmt();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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

	public static class TParamsContext extends ParserRuleContext {
		public List<TParamContext> tParam() {
			return getRuleContexts(TParamContext.class);
		}
		public TParamContext tParam(int i) {
			return getRuleContext(TParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CLUBParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CLUBParser.COMMA, i);
		}
		public TParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tParams; }
	}

	public final TParamsContext tParams() throws RecognitionException {
		TParamsContext _localctx = new TParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			tParam();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				tParam();
				}
				}
				setState(115);
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
	}
	public static class Stmt2Context extends StmtContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CLUBParser.SEMI, 0); }
		public Stmt2Context(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class Stmt3Context extends StmtContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public Stmt3Context(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class Stmt4Context extends StmtContext {
		public IterStmtContext iterStmt() {
			return getRuleContext(IterStmtContext.class,0);
		}
		public Stmt4Context(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case STRING:
				_localctx = new Stmt1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				tParam();
				setState(117);
				((Stmt1Context)_localctx).op = match(ASSIGN);
				setState(118);
				logicOrExpr();
				setState(119);
				match(SEMI);
				}
				break;
			case VARID:
				_localctx = new Stmt2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				assignExpr();
				setState(122);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new Stmt3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				selectStmt();
				}
				break;
			case WHILE:
			case FOR:
				_localctx = new Stmt4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
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
	}
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
	}

	public final IterStmtContext iterStmt() throws RecognitionException {
		IterStmtContext _localctx = new IterStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iterStmt);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(WHILE);
				setState(129);
				match(LPAREN);
				setState(130);
				logicOrExpr();
				setState(131);
				match(RPAREN);
				setState(132);
				match(LCURLY);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VARID))) != 0)) {
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
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(FOR);
				setState(142);
				match(LPAREN);
				setState(143);
				tParam();
				setState(144);
				((ForContext)_localctx).op = match(ASSIGN);
				setState(145);
				addExpr();
				setState(146);
				match(SEMI);
				setState(147);
				logicOrExpr();
				setState(148);
				match(SEMI);
				setState(149);
				((ForContext)_localctx).right = match(VARID);
				setState(150);
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
				setState(151);
				match(RPAREN);
				setState(152);
				match(LCURLY);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VARID))) != 0)) {
					{
					{
					setState(153);
					stmt();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
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
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IF);
			setState(164);
			match(LPAREN);
			setState(165);
			logicOrExpr();
			setState(166);
			match(RPAREN);
			setState(167);
			match(LCURLY);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VARID))) != 0)) {
				{
				{
				setState(168);
				stmt();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
	}

	public final TParamContext tParam() throws RecognitionException {
		TParamContext _localctx = new TParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((TParamContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING))) != 0)) ) {
				((TParamContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(177);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<LogicOrExprContext> logicOrExpr() {
			return getRuleContexts(LogicOrExprContext.class);
		}
		public LogicOrExprContext logicOrExpr(int i) {
			return getRuleContext(LogicOrExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CLUBParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CLUBParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			logicOrExpr();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(180);
				match(COMMA);
				setState(181);
				logicOrExpr();
				}
				}
				setState(186);
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
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((AssignExprContext)_localctx).left = match(VARID);
			setState(188);
			((AssignExprContext)_localctx).op = match(ASSIGN);
			setState(189);
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
	public static class LogicOr1Context extends LogicOrExprContext {
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public LogicOr1Context(LogicOrExprContext ctx) { copyFrom(ctx); }
	}
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
	}

	public final LogicOrExprContext logicOrExpr() throws RecognitionException {
		LogicOrExprContext _localctx = new LogicOrExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicOrExpr);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new LogicOr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				logicAndExpr();
				}
				break;
			case 2:
				_localctx = new LogicOr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				logicAndExpr();
				setState(193);
				((LogicOr2Context)_localctx).op = match(OR);
				setState(194);
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
	public static class LogicAnd1Context extends LogicAndExprContext {
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public LogicAnd1Context(LogicAndExprContext ctx) { copyFrom(ctx); }
	}
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
	}

	public final LogicAndExprContext logicAndExpr() throws RecognitionException {
		LogicAndExprContext _localctx = new LogicAndExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicAndExpr);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new LogicAnd1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				equalExpr();
				}
				break;
			case 2:
				_localctx = new LogicAnd2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				equalExpr();
				setState(200);
				((LogicAnd2Context)_localctx).op = match(AND);
				setState(201);
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
	public static class Equal1Context extends EqualExprContext {
		public RelatExprContext relatExpr() {
			return getRuleContext(RelatExprContext.class,0);
		}
		public Equal1Context(EqualExprContext ctx) { copyFrom(ctx); }
	}
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
	}

	public final EqualExprContext equalExpr() throws RecognitionException {
		EqualExprContext _localctx = new EqualExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalExpr);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Equal1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				relatExpr();
				}
				break;
			case 2:
				_localctx = new Equal2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				relatExpr();
				setState(207);
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
				setState(208);
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
	}
	public static class Relat1Context extends RelatExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public Relat1Context(RelatExprContext ctx) { copyFrom(ctx); }
	}

	public final RelatExprContext relatExpr() throws RecognitionException {
		RelatExprContext _localctx = new RelatExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relatExpr);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Relat1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				addExpr();
				}
				break;
			case 2:
				_localctx = new Relat2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				addExpr();
				setState(214);
				((Relat2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMALLER) | (1L << LARGER) | (1L << SMALLEREQ) | (1L << BIGGEREQ))) != 0)) ) {
					((Relat2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
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
	}
	public static class Add1Context extends AddExprContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public Add1Context(AddExprContext ctx) { copyFrom(ctx); }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addExpr);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Add1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				multExpr();
				}
				break;
			case 2:
				_localctx = new Add2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				multExpr();
				setState(221);
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
				setState(222);
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
	}
	public static class Mult1Context extends MultExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public Mult1Context(MultExprContext ctx) { copyFrom(ctx); }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multExpr);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Mult1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				unaryExpr();
				}
				break;
			case 2:
				_localctx = new Mult2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				unaryExpr();
				setState(228);
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
				setState(229);
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
	public static class Unary2Context extends UnaryExprContext {
		public Token op;
		public PostfExprContext postfExpr() {
			return getRuleContext(PostfExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CLUBParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CLUBParser.NOT, 0); }
		public Unary2Context(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class Unary1Context extends UnaryExprContext {
		public PostfExprContext postfExpr() {
			return getRuleContext(PostfExprContext.class,0);
		}
		public Unary1Context(UnaryExprContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpr);
		int _la;
		try {
			setState(236);
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
				_localctx = new Unary1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				postfExpr();
				}
				break;
			case MINUS:
			case NOT:
				_localctx = new Unary2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
				setState(235);
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
	public static class PostF7Context extends PostfExprContext {
		public Token left;
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode METHODID() { return getToken(CLUBParser.METHODID, 0); }
		public PostF7Context(PostfExprContext ctx) { copyFrom(ctx); }
	}
	public static class PostF6Context extends PostfExprContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public PostF6Context(PostfExprContext ctx) { copyFrom(ctx); }
	}
	public static class PostF3Context extends PostfExprContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public PostF3Context(PostfExprContext ctx) { copyFrom(ctx); }
	}
	public static class PostF2Context extends PostfExprContext {
		public Token op;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode INCREM() { return getToken(CLUBParser.INCREM, 0); }
		public TerminalNode DECREM() { return getToken(CLUBParser.DECREM, 0); }
		public PostF2Context(PostfExprContext ctx) { copyFrom(ctx); }
	}
	public static class PostF5Context extends PostfExprContext {
		public Token left;
		public TerminalNode LPAREN() { return getToken(CLUBParser.LPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CLUBParser.RPAREN, 0); }
		public TerminalNode METHODID() { return getToken(CLUBParser.METHODID, 0); }
		public PostF5Context(PostfExprContext ctx) { copyFrom(ctx); }
	}
	public static class PostF4Context extends PostfExprContext {
		public Token op;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PostfExprContext postfExpr() {
			return getRuleContext(PostfExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CLUBParser.DOT, 0); }
		public PostF4Context(PostfExprContext ctx) { copyFrom(ctx); }
	}
	public static class PostF1Context extends PostfExprContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PostF1Context(PostfExprContext ctx) { copyFrom(ctx); }
	}

	public final PostfExprContext postfExpr() throws RecognitionException {
		PostfExprContext _localctx = new PostfExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_postfExpr);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new PostF1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				primaryExpr();
				}
				break;
			case 2:
				_localctx = new PostF2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				primaryExpr();
				setState(240);
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
				setState(242);
				primaryExpr();
				setState(243);
				match(LPAREN);
				setState(244);
				params();
				setState(245);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new PostF4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				primaryExpr();
				setState(248);
				((PostF4Context)_localctx).op = match(DOT);
				setState(249);
				postfExpr();
				}
				break;
			case 5:
				_localctx = new PostF5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				((PostF5Context)_localctx).left = match(METHODID);
				setState(252);
				match(LPAREN);
				setState(253);
				params();
				setState(254);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new PostF6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				primaryExpr();
				setState(257);
				match(LPAREN);
				setState(258);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new PostF7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				((PostF7Context)_localctx).left = match(METHODID);
				setState(261);
				match(LPAREN);
				setState(262);
				match(RPAREN);
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
	public static class Primary1Context extends PrimaryExprContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Primary1Context(PrimaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class Primary2Context extends PrimaryExprContext {
		public Token left;
		public TerminalNode VARID() { return getToken(CLUBParser.VARID, 0); }
		public TerminalNode OBJID() { return getToken(CLUBParser.OBJID, 0); }
		public TerminalNode FUNCID() { return getToken(CLUBParser.FUNCID, 0); }
		public TerminalNode CLASSID() { return getToken(CLUBParser.CLASSID, 0); }
		public Primary2Context(PrimaryExprContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primaryExpr);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLVAL:
			case INTVAL:
			case STRINGVAL:
				_localctx = new Primary1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				val();
				}
				break;
			case CLASSID:
			case OBJID:
			case VARID:
			case FUNCID:
				_localctx = new Primary2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				((Primary2Context)_localctx).left = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSID) | (1L << OBJID) | (1L << VARID) | (1L << FUNCID))) != 0)) ) {
					((Primary2Context)_localctx).left = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ValContext extends ParserRuleContext {
		public Token left;
		public TerminalNode INTVAL() { return getToken(CLUBParser.INTVAL, 0); }
		public TerminalNode BOOLVAL() { return getToken(CLUBParser.BOOLVAL, 0); }
		public TerminalNode STRINGVAL() { return getToken(CLUBParser.STRINGVAL, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_val);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((ValContext)_localctx).left = match(INTVAL);
				}
				break;
			case BOOLVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				((ValContext)_localctx).left = match(BOOLVAL);
				}
				break;
			case STRINGVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0115\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5R\n\5"+
		"\f\5\16\5U\13\5\3\5\5\5X\n\5\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3\7\3\7\5"+
		"\7c\n\7\3\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\3\7\3\b\3\b\3\b\7\br\n"+
		"\b\f\b\16\bu\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009d\n\n\f\n\16"+
		"\n\u00a0\13\n\3\n\3\n\5\n\u00a4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00ac\n\13\f\13\16\13\u00af\13\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\7"+
		"\r\u00b9\n\r\f\r\16\r\u00bc\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00c7\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00ce\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00d5\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00dc"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00e3\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00ea\n\24\3\25\3\25\3\25\5\25\u00ef\n\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010a\n\26\3\27\3\27\5\27\u010e"+
		"\n\27\3\30\3\30\3\30\5\30\u0113\n\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\2\n\3\2\r\16\3\2%\'\3\2\7\b\3\2\t\f\3\2\17"+
		"\20\3\2\21\22\4\2\20\20\24\24\4\2*+-.\2\u011d\2\60\3\2\2\2\4\66\3\2\2"+
		"\2\6@\3\2\2\2\bW\3\2\2\2\n\\\3\2\2\2\f_\3\2\2\2\16n\3\2\2\2\20\u0080\3"+
		"\2\2\2\22\u00a3\3\2\2\2\24\u00a5\3\2\2\2\26\u00b2\3\2\2\2\30\u00b5\3\2"+
		"\2\2\32\u00bd\3\2\2\2\34\u00c6\3\2\2\2\36\u00cd\3\2\2\2 \u00d4\3\2\2\2"+
		"\"\u00db\3\2\2\2$\u00e2\3\2\2\2&\u00e9\3\2\2\2(\u00ee\3\2\2\2*\u0109\3"+
		"\2\2\2,\u010d\3\2\2\2.\u0112\3\2\2\2\60\61\5\4\3\2\61\62\5\6\4\2\62\63"+
		"\5\b\5\2\63\64\5\n\6\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\37\2\2\67;\7"+
		"\32\2\28:\5\20\t\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2="+
		";\3\2\2\2>?\7\33\2\2?\5\3\2\2\2@A\7 \2\2AE\7\32\2\2BD\5\20\t\2CB\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\33\2\2I\7\3\2"+
		"\2\2JK\7!\2\2KL\7\30\2\2LM\7\3\2\2MN\7\4\2\2NO\7\31\2\2OS\7\32\2\2PR\5"+
		"\20\t\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VX"+
		"\7\33\2\2WJ\3\2\2\2WX\3\2\2\2X\t\3\2\2\2Y[\5\f\7\2ZY\3\2\2\2[^\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3\2\2\2_`\7.\2\2`b\7\30\2\2ac\5"+
		"\16\b\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\31\2\2ei\7\32\2\2fh\5\20\t\2"+
		"gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\33\2"+
		"\2m\r\3\2\2\2ns\5\26\f\2op\7\26\2\2pr\5\26\f\2qo\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2t\17\3\2\2\2us\3\2\2\2vw\5\26\f\2wx\7\25\2\2xy\5\34\17"+
		"\2yz\7\27\2\2z\u0081\3\2\2\2{|\5\32\16\2|}\7\27\2\2}\u0081\3\2\2\2~\u0081"+
		"\5\24\13\2\177\u0081\5\22\n\2\u0080v\3\2\2\2\u0080{\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\177\3\2\2\2\u0081\21\3\2\2\2\u0082\u0083\7\"\2\2\u0083\u0084"+
		"\7\30\2\2\u0084\u0085\5\34\17\2\u0085\u0086\7\31\2\2\u0086\u008a\7\32"+
		"\2\2\u0087\u0089\5\20\t\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\33\2\2\u008e\u00a4\3\2\2\2\u008f\u0090\7#\2\2\u0090"+
		"\u0091\7\30\2\2\u0091\u0092\5\26\f\2\u0092\u0093\7\25\2\2\u0093\u0094"+
		"\5$\23\2\u0094\u0095\7\27\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7\27\2"+
		"\2\u0097\u0098\7-\2\2\u0098\u0099\t\2\2\2\u0099\u009a\7\31\2\2\u009a\u009e"+
		"\7\32\2\2\u009b\u009d\5\20\t\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0082\3\2\2\2"+
		"\u00a3\u008f\3\2\2\2\u00a4\23\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6\u00a7\7"+
		"\30\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00a9\7\31\2\2\u00a9\u00ad\7\32\2"+
		"\2\u00aa\u00ac\5\20\t\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b1\7\33\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3\u00b4"+
		"\7-\2\2\u00b4\27\3\2\2\2\u00b5\u00ba\5\34\17\2\u00b6\u00b7\7\26\2\2\u00b7"+
		"\u00b9\5\34\17\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\7-\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\5\34\17\2\u00c0\33\3\2"+
		"\2\2\u00c1\u00c7\5\36\20\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\7\6\2\2\u00c4"+
		"\u00c5\5\34\17\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3"+
		"\2\2\2\u00c7\35\3\2\2\2\u00c8\u00ce\5 \21\2\u00c9\u00ca\5 \21\2\u00ca"+
		"\u00cb\7\5\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00ce\3\2\2\2\u00cd\u00c8\3"+
		"\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\37\3\2\2\2\u00cf\u00d5\5\"\22\2\u00d0"+
		"\u00d1\5\"\22\2\u00d1\u00d2\t\4\2\2\u00d2\u00d3\5 \21\2\u00d3\u00d5\3"+
		"\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5!\3\2\2\2\u00d6\u00dc"+
		"\5$\23\2\u00d7\u00d8\5$\23\2\u00d8\u00d9\t\5\2\2\u00d9\u00da\5\"\22\2"+
		"\u00da\u00dc\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc#\3"+
		"\2\2\2\u00dd\u00e3\5&\24\2\u00de\u00df\5&\24\2\u00df\u00e0\t\6\2\2\u00e0"+
		"\u00e1\5$\23\2\u00e1\u00e3\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2"+
		"\2\2\u00e3%\3\2\2\2\u00e4\u00ea\5(\25\2\u00e5\u00e6\5(\25\2\u00e6\u00e7"+
		"\t\7\2\2\u00e7\u00e8\5&\24\2\u00e8\u00ea\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00ea\'\3\2\2\2\u00eb\u00ef\5*\26\2\u00ec\u00ed\t\b\2\2"+
		"\u00ed\u00ef\5*\26\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef)\3"+
		"\2\2\2\u00f0\u010a\5,\27\2\u00f1\u00f2\5,\27\2\u00f2\u00f3\t\2\2\2\u00f3"+
		"\u010a\3\2\2\2\u00f4\u00f5\5,\27\2\u00f5\u00f6\7\30\2\2\u00f6\u00f7\5"+
		"\30\r\2\u00f7\u00f8\7\31\2\2\u00f8\u010a\3\2\2\2\u00f9\u00fa\5,\27\2\u00fa"+
		"\u00fb\7\23\2\2\u00fb\u00fc\5*\26\2\u00fc\u010a\3\2\2\2\u00fd\u00fe\7"+
		"(\2\2\u00fe\u00ff\7\30\2\2\u00ff\u0100\5\30\r\2\u0100\u0101\7\31\2\2\u0101"+
		"\u010a\3\2\2\2\u0102\u0103\5,\27\2\u0103\u0104\7\30\2\2\u0104\u0105\7"+
		"\31\2\2\u0105\u010a\3\2\2\2\u0106\u0107\7(\2\2\u0107\u0108\7\30\2\2\u0108"+
		"\u010a\7\31\2\2\u0109\u00f0\3\2\2\2\u0109\u00f1\3\2\2\2\u0109\u00f4\3"+
		"\2\2\2\u0109\u00f9\3\2\2\2\u0109\u00fd\3\2\2\2\u0109\u0102\3\2\2\2\u0109"+
		"\u0106\3\2\2\2\u010a+\3\2\2\2\u010b\u010e\5.\30\2\u010c\u010e\t\t\2\2"+
		"\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e-\3\2\2\2\u010f\u0113\7"+
		",\2\2\u0110\u0113\7)\2\2\u0111\u0113\7/\2\2\u0112\u010f\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113/\3\2\2\2\32;ESW\\bis\u0080\u008a"+
		"\u009e\u00a3\u00ad\u00ba\u00c6\u00cd\u00d4\u00db\u00e2\u00e9\u00ee\u0109"+
		"\u010d\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}