// $ANTLR null C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g 2023-05-11 18:40:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class CLUBParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BIGGEREQ", "BOOL", 
		"BOOLVAL", "CLASSID", "COMMA", "DECREM", "DIVIDE", "DOT", "EQ", "FOR", 
		"FUNCID", "IF", "INCREM", "INT", "INTVAL", "LARGER", "LCURLY", "LPAREN", 
		"LSQUARE", "METHODID", "MINUS", "MULT", "NOT", "NOTEQ", "OBJID", "OR", 
		"PLUS", "RCURLY", "ROUND", "RPAREN", "RSQUARE", "SEMI", "SETUP", "SMALLER", 
		"SMALLEREQ", "STRING", "STRINGVAL", "TURN", "VARID", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BIGGEREQ=6;
	public static final int BOOL=7;
	public static final int BOOLVAL=8;
	public static final int CLASSID=9;
	public static final int COMMA=10;
	public static final int DECREM=11;
	public static final int DIVIDE=12;
	public static final int DOT=13;
	public static final int EQ=14;
	public static final int FOR=15;
	public static final int FUNCID=16;
	public static final int IF=17;
	public static final int INCREM=18;
	public static final int INT=19;
	public static final int INTVAL=20;
	public static final int LARGER=21;
	public static final int LCURLY=22;
	public static final int LPAREN=23;
	public static final int LSQUARE=24;
	public static final int METHODID=25;
	public static final int MINUS=26;
	public static final int MULT=27;
	public static final int NOT=28;
	public static final int NOTEQ=29;
	public static final int OBJID=30;
	public static final int OR=31;
	public static final int PLUS=32;
	public static final int RCURLY=33;
	public static final int ROUND=34;
	public static final int RPAREN=35;
	public static final int RSQUARE=36;
	public static final int SEMI=37;
	public static final int SETUP=38;
	public static final int SMALLER=39;
	public static final int SMALLEREQ=40;
	public static final int STRING=41;
	public static final int STRINGVAL=42;
	public static final int TURN=43;
	public static final int VARID=44;
	public static final int WHILE=45;
	public static final int WS=46;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "tParams", "params", "exprStmt", "tParam", "iterStmt", 
		"logicOrExpr", "round", "val", "turn", "multExpr", "postfExpr", "stmt", 
		"setup", "unaryExpr", "decl", "program", "funcs", "relatExpr", "assignExpr", 
		"primaryExpr", "type", "func", "stmts", "addExpr", "equalExpr", "expr", 
		"logicAndExpr", "selectStmt"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public CLUBParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public CLUBParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public CLUBParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return CLUBParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g"; }



	// $ANTLR start "program"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:3:1: program : setup round turn funcs EOF ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:3:9: ( setup round turn funcs EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:3:11: setup round turn funcs EOF
			{
			dbg.location(3,11);
			pushFollow(FOLLOW_setup_in_program10);
			setup();
			state._fsp--;
			dbg.location(3,17);
			pushFollow(FOLLOW_round_in_program12);
			round();
			state._fsp--;
			dbg.location(3,23);
			pushFollow(FOLLOW_turn_in_program14);
			turn();
			state._fsp--;
			dbg.location(3,28);
			pushFollow(FOLLOW_funcs_in_program16);
			funcs();
			state._fsp--;
			dbg.location(3,34);
			match(input,EOF,FOLLOW_EOF_in_program18); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(3, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "setup"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:4:1: setup : 'Setup' '{' stmts '}' ;
	public final void setup() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "setup");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(4, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:4:7: ( 'Setup' '{' stmts '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:4:9: 'Setup' '{' stmts '}'
			{
			dbg.location(4,9);
			match(input,SETUP,FOLLOW_SETUP_in_setup26); dbg.location(4,17);
			match(input,LCURLY,FOLLOW_LCURLY_in_setup28); dbg.location(4,21);
			pushFollow(FOLLOW_stmts_in_setup30);
			stmts();
			state._fsp--;
			dbg.location(4,27);
			match(input,RCURLY,FOLLOW_RCURLY_in_setup32); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(4, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "setup");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "setup"



	// $ANTLR start "round"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:5:1: round : 'Round' '{' stmts '}' ;
	public final void round() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "round");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(5, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:5:7: ( 'Round' '{' stmts '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:5:9: 'Round' '{' stmts '}'
			{
			dbg.location(5,9);
			match(input,ROUND,FOLLOW_ROUND_in_round40); dbg.location(5,17);
			match(input,LCURLY,FOLLOW_LCURLY_in_round42); dbg.location(5,21);
			pushFollow(FOLLOW_stmts_in_round44);
			stmts();
			state._fsp--;
			dbg.location(5,27);
			match(input,RCURLY,FOLLOW_RCURLY_in_round46); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(5, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "round");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "round"



	// $ANTLR start "turn"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:6:1: turn : ( 'Turn' '(' CLASSID VARID ')' '{' stmts '}' )? ;
	public final void turn() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "turn");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:6:6: ( ( 'Turn' '(' CLASSID VARID ')' '{' stmts '}' )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:6:8: ( 'Turn' '(' CLASSID VARID ')' '{' stmts '}' )?
			{
			dbg.location(6,8);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:6:8: ( 'Turn' '(' CLASSID VARID ')' '{' stmts '}' )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==TURN) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:6:9: 'Turn' '(' CLASSID VARID ')' '{' stmts '}'
					{
					dbg.location(6,9);
					match(input,TURN,FOLLOW_TURN_in_turn55); dbg.location(6,16);
					match(input,LPAREN,FOLLOW_LPAREN_in_turn57); dbg.location(6,20);
					match(input,CLASSID,FOLLOW_CLASSID_in_turn59); dbg.location(6,28);
					match(input,VARID,FOLLOW_VARID_in_turn61); dbg.location(6,34);
					match(input,RPAREN,FOLLOW_RPAREN_in_turn63); dbg.location(6,38);
					match(input,LCURLY,FOLLOW_LCURLY_in_turn65); dbg.location(6,42);
					pushFollow(FOLLOW_stmts_in_turn67);
					stmts();
					state._fsp--;
					dbg.location(6,48);
					match(input,RCURLY,FOLLOW_RCURLY_in_turn69); 
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(7, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "turn");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "turn"



	// $ANTLR start "funcs"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:8:1: funcs : ( func funcs )? ;
	public final void funcs() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "funcs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:8:7: ( ( func funcs )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:8:9: ( func funcs )?
			{
			dbg.location(8,9);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:8:9: ( func funcs )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==FUNCID) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:8:10: func funcs
					{
					dbg.location(8,10);
					pushFollow(FOLLOW_func_in_funcs88);
					func();
					state._fsp--;
					dbg.location(8,15);
					pushFollow(FOLLOW_funcs_in_funcs90);
					funcs();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(9, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funcs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funcs"



	// $ANTLR start "stmts"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:10:1: stmts : ( stmt stmts )? ;
	public final void stmts() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stmts");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:10:7: ( ( stmt stmts )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:10:9: ( stmt stmts )?
			{
			dbg.location(10,9);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:10:9: ( stmt stmts )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= BOOL && LA3_0 <= CLASSID)||(LA3_0 >= FOR && LA3_0 <= IF)||(LA3_0 >= INT && LA3_0 <= INTVAL)||(LA3_0 >= METHODID && LA3_0 <= MINUS)||LA3_0==NOT||LA3_0==OBJID||(LA3_0 >= STRING && LA3_0 <= STRINGVAL)||(LA3_0 >= VARID && LA3_0 <= WHILE)) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:10:10: stmt stmts
					{
					dbg.location(10,10);
					pushFollow(FOLLOW_stmt_in_stmts109);
					stmt();
					state._fsp--;
					dbg.location(10,15);
					pushFollow(FOLLOW_stmts_in_stmts111);
					stmts();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(11, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmts");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stmts"



	// $ANTLR start "func"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:12:1: func : FUNCID '(' ( tParams )? ')' '{' stmts '}' ;
	public final void func() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "func");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:12:6: ( FUNCID '(' ( tParams )? ')' '{' stmts '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:12:8: FUNCID '(' ( tParams )? ')' '{' stmts '}'
			{
			dbg.location(12,8);
			match(input,FUNCID,FOLLOW_FUNCID_in_func130); dbg.location(12,15);
			match(input,LPAREN,FOLLOW_LPAREN_in_func132); dbg.location(12,19);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:12:19: ( tParams )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==BOOL||LA4_0==INT||LA4_0==STRING) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:12:19: tParams
					{
					dbg.location(12,19);
					pushFollow(FOLLOW_tParams_in_func134);
					tParams();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(12,28);
			match(input,RPAREN,FOLLOW_RPAREN_in_func137); dbg.location(12,32);
			match(input,LCURLY,FOLLOW_LCURLY_in_func139); dbg.location(12,36);
			pushFollow(FOLLOW_stmts_in_func141);
			stmts();
			state._fsp--;
			dbg.location(12,42);
			match(input,RCURLY,FOLLOW_RCURLY_in_func143); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(13, 9);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "func");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "func"



	// $ANTLR start "tParams"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:14:1: tParams : tParam ( ',' tParams )? ;
	public final void tParams() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "tParams");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:14:9: ( tParam ( ',' tParams )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:14:11: tParam ( ',' tParams )?
			{
			dbg.location(14,11);
			pushFollow(FOLLOW_tParam_in_tParams160);
			tParam();
			state._fsp--;
			dbg.location(14,18);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:14:18: ( ',' tParams )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==COMMA) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:14:19: ',' tParams
					{
					dbg.location(14,19);
					match(input,COMMA,FOLLOW_COMMA_in_tParams163); dbg.location(14,23);
					pushFollow(FOLLOW_tParams_in_tParams165);
					tParams();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(15, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "tParams");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "tParams"



	// $ANTLR start "stmt"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:16:1: stmt : ( decl ';' | exprStmt ';' | selectStmt | iterStmt );
	public final void stmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:16:6: ( decl ';' | exprStmt ';' | selectStmt | iterStmt )
			int alt6=4;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case BOOL:
			case INT:
			case STRING:
				{
				alt6=1;
				}
				break;
			case BOOLVAL:
			case CLASSID:
			case FUNCID:
			case INTVAL:
			case METHODID:
			case MINUS:
			case NOT:
			case OBJID:
			case STRINGVAL:
			case VARID:
				{
				alt6=2;
				}
				break;
			case IF:
				{
				alt6=3;
				}
				break;
			case FOR:
			case WHILE:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:16:8: decl ';'
					{
					dbg.location(16,8);
					pushFollow(FOLLOW_decl_in_stmt183);
					decl();
					state._fsp--;
					dbg.location(16,13);
					match(input,SEMI,FOLLOW_SEMI_in_stmt185); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:17:11: exprStmt ';'
					{
					dbg.location(17,11);
					pushFollow(FOLLOW_exprStmt_in_stmt197);
					exprStmt();
					state._fsp--;
					dbg.location(17,20);
					match(input,SEMI,FOLLOW_SEMI_in_stmt199); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:18:11: selectStmt
					{
					dbg.location(18,11);
					pushFollow(FOLLOW_selectStmt_in_stmt211);
					selectStmt();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:19:11: iterStmt
					{
					dbg.location(19,11);
					pushFollow(FOLLOW_iterStmt_in_stmt223);
					iterStmt();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stmt"



	// $ANTLR start "iterStmt"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:21:1: iterStmt : ( 'while' '(' expr ')' '{' stmts '}' | 'for' '(' decl ';' expr ';' postfExpr ')' '{' stmts '}' );
	public final void iterStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iterStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:21:10: ( 'while' '(' expr ')' '{' stmts '}' | 'for' '(' decl ';' expr ';' postfExpr ')' '{' stmts '}' )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==WHILE) ) {
				alt7=1;
			}
			else if ( (LA7_0==FOR) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:21:12: 'while' '(' expr ')' '{' stmts '}'
					{
					dbg.location(21,12);
					match(input,WHILE,FOLLOW_WHILE_in_iterStmt240); dbg.location(21,20);
					match(input,LPAREN,FOLLOW_LPAREN_in_iterStmt242); dbg.location(21,24);
					pushFollow(FOLLOW_expr_in_iterStmt244);
					expr();
					state._fsp--;
					dbg.location(21,29);
					match(input,RPAREN,FOLLOW_RPAREN_in_iterStmt246); dbg.location(21,33);
					match(input,LCURLY,FOLLOW_LCURLY_in_iterStmt248); dbg.location(21,37);
					pushFollow(FOLLOW_stmts_in_iterStmt250);
					stmts();
					state._fsp--;
					dbg.location(21,43);
					match(input,RCURLY,FOLLOW_RCURLY_in_iterStmt252); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:22:11: 'for' '(' decl ';' expr ';' postfExpr ')' '{' stmts '}'
					{
					dbg.location(22,11);
					match(input,FOR,FOLLOW_FOR_in_iterStmt264); dbg.location(22,17);
					match(input,LPAREN,FOLLOW_LPAREN_in_iterStmt266); dbg.location(22,21);
					pushFollow(FOLLOW_decl_in_iterStmt268);
					decl();
					state._fsp--;
					dbg.location(22,26);
					match(input,SEMI,FOLLOW_SEMI_in_iterStmt270); dbg.location(22,30);
					pushFollow(FOLLOW_expr_in_iterStmt272);
					expr();
					state._fsp--;
					dbg.location(22,35);
					match(input,SEMI,FOLLOW_SEMI_in_iterStmt274); dbg.location(22,39);
					pushFollow(FOLLOW_postfExpr_in_iterStmt276);
					postfExpr();
					state._fsp--;
					dbg.location(22,49);
					match(input,RPAREN,FOLLOW_RPAREN_in_iterStmt278); dbg.location(22,53);
					match(input,LCURLY,FOLLOW_LCURLY_in_iterStmt280); dbg.location(22,57);
					pushFollow(FOLLOW_stmts_in_iterStmt282);
					stmts();
					state._fsp--;
					dbg.location(22,63);
					match(input,RCURLY,FOLLOW_RCURLY_in_iterStmt284); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iterStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iterStmt"



	// $ANTLR start "selectStmt"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:24:1: selectStmt : 'if' '(' expr ')' '{' stmts '}' ;
	public final void selectStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "selectStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:24:12: ( 'if' '(' expr ')' '{' stmts '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:24:14: 'if' '(' expr ')' '{' stmts '}'
			{
			dbg.location(24,14);
			match(input,IF,FOLLOW_IF_in_selectStmt301); dbg.location(24,19);
			match(input,LPAREN,FOLLOW_LPAREN_in_selectStmt303); dbg.location(24,23);
			pushFollow(FOLLOW_expr_in_selectStmt305);
			expr();
			state._fsp--;
			dbg.location(24,28);
			match(input,RPAREN,FOLLOW_RPAREN_in_selectStmt307); dbg.location(24,32);
			match(input,LCURLY,FOLLOW_LCURLY_in_selectStmt309); dbg.location(24,36);
			pushFollow(FOLLOW_stmts_in_selectStmt311);
			stmts();
			state._fsp--;
			dbg.location(24,42);
			match(input,RCURLY,FOLLOW_RCURLY_in_selectStmt313); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(25, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selectStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "selectStmt"



	// $ANTLR start "exprStmt"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:26:1: exprStmt : expr ;
	public final void exprStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:26:10: ( expr )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:26:12: expr
			{
			dbg.location(26,12);
			pushFollow(FOLLOW_expr_in_exprStmt323);
			expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprStmt"



	// $ANTLR start "type"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:28:1: type : ( 'bool' | 'int' | 'string' );
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:28:6: ( 'bool' | 'int' | 'string' )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
			{
			dbg.location(28,6);
			if ( input.LA(1)==BOOL||input.LA(1)==INT||input.LA(1)==STRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "tParam"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:32:1: tParam : type VARID ;
	public final void tParam() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "tParam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:32:8: ( type VARID )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:32:10: type VARID
			{
			dbg.location(32,10);
			pushFollow(FOLLOW_type_in_tParam374);
			type();
			state._fsp--;
			dbg.location(32,15);
			match(input,VARID,FOLLOW_VARID_in_tParam376); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(33, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "tParam");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "tParam"



	// $ANTLR start "params"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:34:1: params : expr ( ',' params )? ;
	public final void params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:34:8: ( expr ( ',' params )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:34:10: expr ( ',' params )?
			{
			dbg.location(34,10);
			pushFollow(FOLLOW_expr_in_params386);
			expr();
			state._fsp--;
			dbg.location(34,15);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:34:15: ( ',' params )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==COMMA) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:34:16: ',' params
					{
					dbg.location(34,16);
					match(input,COMMA,FOLLOW_COMMA_in_params389); dbg.location(34,20);
					pushFollow(FOLLOW_params_in_params391);
					params();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "params"



	// $ANTLR start "expr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:36:1: expr : assignExpr ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:36:6: ( assignExpr )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:36:8: assignExpr
			{
			dbg.location(36,8);
			pushFollow(FOLLOW_assignExpr_in_expr410);
			assignExpr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "assignExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:38:1: assignExpr : ( logicOrExpr | primaryExpr '=' assignExpr );
	public final void assignExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assignExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:38:12: ( logicOrExpr | primaryExpr '=' assignExpr )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case BOOLVAL:
			case INTVAL:
			case STRINGVAL:
				{
				int LA9_1 = input.LA(2);
				if ( (LA9_1==AND||LA9_1==BIGGEREQ||(LA9_1 >= COMMA && LA9_1 <= EQ)||LA9_1==INCREM||LA9_1==LARGER||LA9_1==LPAREN||(LA9_1 >= MINUS && LA9_1 <= MULT)||LA9_1==NOTEQ||(LA9_1 >= OR && LA9_1 <= PLUS)||LA9_1==RPAREN||LA9_1==SEMI||(LA9_1 >= SMALLER && LA9_1 <= SMALLEREQ)) ) {
					alt9=1;
				}
				else if ( (LA9_1==ASSIGN) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARID:
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2==AND||LA9_2==BIGGEREQ||(LA9_2 >= COMMA && LA9_2 <= EQ)||LA9_2==INCREM||LA9_2==LARGER||LA9_2==LPAREN||(LA9_2 >= MINUS && LA9_2 <= MULT)||LA9_2==NOTEQ||(LA9_2 >= OR && LA9_2 <= PLUS)||LA9_2==RPAREN||LA9_2==SEMI||(LA9_2 >= SMALLER && LA9_2 <= SMALLEREQ)) ) {
					alt9=1;
				}
				else if ( (LA9_2==ASSIGN) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OBJID:
				{
				int LA9_3 = input.LA(2);
				if ( (LA9_3==AND||LA9_3==BIGGEREQ||(LA9_3 >= COMMA && LA9_3 <= EQ)||LA9_3==INCREM||LA9_3==LARGER||LA9_3==LPAREN||(LA9_3 >= MINUS && LA9_3 <= MULT)||LA9_3==NOTEQ||(LA9_3 >= OR && LA9_3 <= PLUS)||LA9_3==RPAREN||LA9_3==SEMI||(LA9_3 >= SMALLER && LA9_3 <= SMALLEREQ)) ) {
					alt9=1;
				}
				else if ( (LA9_3==ASSIGN) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FUNCID:
				{
				int LA9_4 = input.LA(2);
				if ( (LA9_4==AND||LA9_4==BIGGEREQ||(LA9_4 >= COMMA && LA9_4 <= EQ)||LA9_4==INCREM||LA9_4==LARGER||LA9_4==LPAREN||(LA9_4 >= MINUS && LA9_4 <= MULT)||LA9_4==NOTEQ||(LA9_4 >= OR && LA9_4 <= PLUS)||LA9_4==RPAREN||LA9_4==SEMI||(LA9_4 >= SMALLER && LA9_4 <= SMALLEREQ)) ) {
					alt9=1;
				}
				else if ( (LA9_4==ASSIGN) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CLASSID:
				{
				int LA9_5 = input.LA(2);
				if ( (LA9_5==AND||LA9_5==BIGGEREQ||(LA9_5 >= COMMA && LA9_5 <= EQ)||LA9_5==INCREM||LA9_5==LARGER||LA9_5==LPAREN||(LA9_5 >= MINUS && LA9_5 <= MULT)||LA9_5==NOTEQ||(LA9_5 >= OR && LA9_5 <= PLUS)||LA9_5==RPAREN||LA9_5==SEMI||(LA9_5 >= SMALLER && LA9_5 <= SMALLEREQ)) ) {
					alt9=1;
				}
				else if ( (LA9_5==ASSIGN) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 5, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case METHODID:
			case MINUS:
			case NOT:
				{
				alt9=1;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:38:14: logicOrExpr
					{
					dbg.location(38,14);
					pushFollow(FOLLOW_logicOrExpr_in_assignExpr420);
					logicOrExpr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:39:11: primaryExpr '=' assignExpr
					{
					dbg.location(39,11);
					pushFollow(FOLLOW_primaryExpr_in_assignExpr432);
					primaryExpr();
					state._fsp--;
					dbg.location(39,23);
					match(input,ASSIGN,FOLLOW_ASSIGN_in_assignExpr434); dbg.location(39,27);
					pushFollow(FOLLOW_assignExpr_in_assignExpr436);
					assignExpr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(40, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assignExpr"



	// $ANTLR start "logicOrExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:41:1: logicOrExpr : logicAndExpr ( '||' logicOrExpr )? ;
	public final void logicOrExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "logicOrExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:41:13: ( logicAndExpr ( '||' logicOrExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:41:15: logicAndExpr ( '||' logicOrExpr )?
			{
			dbg.location(41,15);
			pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr453);
			logicAndExpr();
			state._fsp--;
			dbg.location(41,28);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:41:28: ( '||' logicOrExpr )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==OR) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:41:29: '||' logicOrExpr
					{
					dbg.location(41,29);
					match(input,OR,FOLLOW_OR_in_logicOrExpr456); dbg.location(41,34);
					pushFollow(FOLLOW_logicOrExpr_in_logicOrExpr458);
					logicOrExpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logicOrExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "logicOrExpr"



	// $ANTLR start "logicAndExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:44:1: logicAndExpr : equalExpr ( '&&' logicAndExpr )? ;
	public final void logicAndExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "logicAndExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:44:14: ( equalExpr ( '&&' logicAndExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:44:16: equalExpr ( '&&' logicAndExpr )?
			{
			dbg.location(44,16);
			pushFollow(FOLLOW_equalExpr_in_logicAndExpr470);
			equalExpr();
			state._fsp--;
			dbg.location(44,26);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:44:26: ( '&&' logicAndExpr )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==AND) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:44:27: '&&' logicAndExpr
					{
					dbg.location(44,27);
					match(input,AND,FOLLOW_AND_in_logicAndExpr473); dbg.location(44,32);
					pushFollow(FOLLOW_logicAndExpr_in_logicAndExpr475);
					logicAndExpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(45, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logicAndExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "logicAndExpr"



	// $ANTLR start "equalExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:47:1: equalExpr : relatExpr ( ( '==' | '!=' ) equalExpr )? ;
	public final void equalExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "equalExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:47:11: ( relatExpr ( ( '==' | '!=' ) equalExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:47:13: relatExpr ( ( '==' | '!=' ) equalExpr )?
			{
			dbg.location(47,13);
			pushFollow(FOLLOW_relatExpr_in_equalExpr487);
			relatExpr();
			state._fsp--;
			dbg.location(47,23);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:47:23: ( ( '==' | '!=' ) equalExpr )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==EQ||LA12_0==NOTEQ) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:47:24: ( '==' | '!=' ) equalExpr
					{
					dbg.location(47,24);
					if ( input.LA(1)==EQ||input.LA(1)==NOTEQ ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(47,36);
					pushFollow(FOLLOW_equalExpr_in_equalExpr496);
					equalExpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(48, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "equalExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "equalExpr"



	// $ANTLR start "relatExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:49:1: relatExpr : addExpr ( ( '<' | '>' | '<=' | '>=' ) relatExpr )? ;
	public final void relatExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "relatExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:49:11: ( addExpr ( ( '<' | '>' | '<=' | '>=' ) relatExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:49:13: addExpr ( ( '<' | '>' | '<=' | '>=' ) relatExpr )?
			{
			dbg.location(49,13);
			pushFollow(FOLLOW_addExpr_in_relatExpr514);
			addExpr();
			state._fsp--;
			dbg.location(49,21);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:49:21: ( ( '<' | '>' | '<=' | '>=' ) relatExpr )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==BIGGEREQ||LA13_0==LARGER||(LA13_0 >= SMALLER && LA13_0 <= SMALLEREQ)) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:49:22: ( '<' | '>' | '<=' | '>=' ) relatExpr
					{
					dbg.location(49,22);
					if ( input.LA(1)==BIGGEREQ||input.LA(1)==LARGER||(input.LA(1) >= SMALLER && input.LA(1) <= SMALLEREQ) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(49,42);
					pushFollow(FOLLOW_relatExpr_in_relatExpr527);
					relatExpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(50, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relatExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "relatExpr"



	// $ANTLR start "addExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:51:1: addExpr : multExpr ( ( '+' | '-' ) addExpr )? ;
	public final void addExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "addExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:51:9: ( multExpr ( ( '+' | '-' ) addExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:51:11: multExpr ( ( '+' | '-' ) addExpr )?
			{
			dbg.location(51,11);
			pushFollow(FOLLOW_multExpr_in_addExpr545);
			multExpr();
			state._fsp--;
			dbg.location(51,20);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:51:20: ( ( '+' | '-' ) addExpr )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:51:21: ( '+' | '-' ) addExpr
					{
					dbg.location(51,21);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(51,31);
					pushFollow(FOLLOW_addExpr_in_addExpr554);
					addExpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "addExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "addExpr"



	// $ANTLR start "multExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:53:1: multExpr : unaryExpr ( ( '*' | '/' ) multExpr )? ;
	public final void multExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:53:10: ( unaryExpr ( ( '*' | '/' ) multExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:53:12: unaryExpr ( ( '*' | '/' ) multExpr )?
			{
			dbg.location(53,12);
			pushFollow(FOLLOW_unaryExpr_in_multExpr572);
			unaryExpr();
			state._fsp--;
			dbg.location(53,22);
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:53:22: ( ( '*' | '/' ) multExpr )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==DIVIDE||LA15_0==MULT) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:53:23: ( '*' | '/' ) multExpr
					{
					dbg.location(53,23);
					if ( input.LA(1)==DIVIDE||input.LA(1)==MULT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(53,33);
					pushFollow(FOLLOW_multExpr_in_multExpr581);
					multExpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multExpr"



	// $ANTLR start "unaryExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:55:1: unaryExpr : ( postfExpr | '-' postfExpr | '!' postfExpr );
	public final void unaryExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "unaryExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:55:11: ( postfExpr | '-' postfExpr | '!' postfExpr )
			int alt16=3;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			switch ( input.LA(1) ) {
			case BOOLVAL:
			case CLASSID:
			case FUNCID:
			case INTVAL:
			case METHODID:
			case OBJID:
			case STRINGVAL:
			case VARID:
				{
				alt16=1;
				}
				break;
			case MINUS:
				{
				alt16=2;
				}
				break;
			case NOT:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:55:13: postfExpr
					{
					dbg.location(55,13);
					pushFollow(FOLLOW_postfExpr_in_unaryExpr599);
					postfExpr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:56:11: '-' postfExpr
					{
					dbg.location(56,11);
					match(input,MINUS,FOLLOW_MINUS_in_unaryExpr611); dbg.location(56,15);
					pushFollow(FOLLOW_postfExpr_in_unaryExpr613);
					postfExpr();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:57:11: '!' postfExpr
					{
					dbg.location(57,11);
					match(input,NOT,FOLLOW_NOT_in_unaryExpr625); dbg.location(57,15);
					pushFollow(FOLLOW_postfExpr_in_unaryExpr627);
					postfExpr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(57, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unaryExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unaryExpr"



	// $ANTLR start "postfExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:58:1: postfExpr : ( primaryExpr | primaryExpr '++' | primaryExpr '--' | primaryExpr '(' ( params )? ')' | METHODID '(' ( params )? ')' | primaryExpr '.' postfExpr );
	public final void postfExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "postfExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:58:11: ( primaryExpr | primaryExpr '++' | primaryExpr '--' | primaryExpr '(' ( params )? ')' | METHODID '(' ( params )? ')' | primaryExpr '.' postfExpr )
			int alt19=6;
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			switch ( input.LA(1) ) {
			case BOOLVAL:
			case INTVAL:
			case STRINGVAL:
				{
				switch ( input.LA(2) ) {
				case AND:
				case BIGGEREQ:
				case COMMA:
				case DIVIDE:
				case EQ:
				case LARGER:
				case MINUS:
				case MULT:
				case NOTEQ:
				case OR:
				case PLUS:
				case RPAREN:
				case SEMI:
				case SMALLER:
				case SMALLEREQ:
					{
					alt19=1;
					}
					break;
				case INCREM:
					{
					alt19=2;
					}
					break;
				case DECREM:
					{
					alt19=3;
					}
					break;
				case LPAREN:
					{
					alt19=4;
					}
					break;
				case DOT:
					{
					alt19=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VARID:
				{
				switch ( input.LA(2) ) {
				case AND:
				case BIGGEREQ:
				case COMMA:
				case DIVIDE:
				case EQ:
				case LARGER:
				case MINUS:
				case MULT:
				case NOTEQ:
				case OR:
				case PLUS:
				case RPAREN:
				case SEMI:
				case SMALLER:
				case SMALLEREQ:
					{
					alt19=1;
					}
					break;
				case INCREM:
					{
					alt19=2;
					}
					break;
				case DECREM:
					{
					alt19=3;
					}
					break;
				case LPAREN:
					{
					alt19=4;
					}
					break;
				case DOT:
					{
					alt19=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case OBJID:
				{
				switch ( input.LA(2) ) {
				case AND:
				case BIGGEREQ:
				case COMMA:
				case DIVIDE:
				case EQ:
				case LARGER:
				case MINUS:
				case MULT:
				case NOTEQ:
				case OR:
				case PLUS:
				case RPAREN:
				case SEMI:
				case SMALLER:
				case SMALLEREQ:
					{
					alt19=1;
					}
					break;
				case INCREM:
					{
					alt19=2;
					}
					break;
				case DECREM:
					{
					alt19=3;
					}
					break;
				case LPAREN:
					{
					alt19=4;
					}
					break;
				case DOT:
					{
					alt19=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case FUNCID:
				{
				switch ( input.LA(2) ) {
				case AND:
				case BIGGEREQ:
				case COMMA:
				case DIVIDE:
				case EQ:
				case LARGER:
				case MINUS:
				case MULT:
				case NOTEQ:
				case OR:
				case PLUS:
				case RPAREN:
				case SEMI:
				case SMALLER:
				case SMALLEREQ:
					{
					alt19=1;
					}
					break;
				case INCREM:
					{
					alt19=2;
					}
					break;
				case DECREM:
					{
					alt19=3;
					}
					break;
				case LPAREN:
					{
					alt19=4;
					}
					break;
				case DOT:
					{
					alt19=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case CLASSID:
				{
				switch ( input.LA(2) ) {
				case AND:
				case BIGGEREQ:
				case COMMA:
				case DIVIDE:
				case EQ:
				case LARGER:
				case MINUS:
				case MULT:
				case NOTEQ:
				case OR:
				case PLUS:
				case RPAREN:
				case SEMI:
				case SMALLER:
				case SMALLEREQ:
					{
					alt19=1;
					}
					break;
				case INCREM:
					{
					alt19=2;
					}
					break;
				case DECREM:
					{
					alt19=3;
					}
					break;
				case LPAREN:
					{
					alt19=4;
					}
					break;
				case DOT:
					{
					alt19=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 5, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case METHODID:
				{
				alt19=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:58:13: primaryExpr
					{
					dbg.location(58,13);
					pushFollow(FOLLOW_primaryExpr_in_postfExpr635);
					primaryExpr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:59:11: primaryExpr '++'
					{
					dbg.location(59,11);
					pushFollow(FOLLOW_primaryExpr_in_postfExpr647);
					primaryExpr();
					state._fsp--;
					dbg.location(59,23);
					match(input,INCREM,FOLLOW_INCREM_in_postfExpr649); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:60:11: primaryExpr '--'
					{
					dbg.location(60,11);
					pushFollow(FOLLOW_primaryExpr_in_postfExpr661);
					primaryExpr();
					state._fsp--;
					dbg.location(60,23);
					match(input,DECREM,FOLLOW_DECREM_in_postfExpr663); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:61:11: primaryExpr '(' ( params )? ')'
					{
					dbg.location(61,11);
					pushFollow(FOLLOW_primaryExpr_in_postfExpr675);
					primaryExpr();
					state._fsp--;
					dbg.location(61,23);
					match(input,LPAREN,FOLLOW_LPAREN_in_postfExpr677); dbg.location(61,27);
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:61:27: ( params )?
					int alt17=2;
					try { dbg.enterSubRule(17);
					try { dbg.enterDecision(17, decisionCanBacktrack[17]);

					int LA17_0 = input.LA(1);
					if ( ((LA17_0 >= BOOLVAL && LA17_0 <= CLASSID)||LA17_0==FUNCID||LA17_0==INTVAL||(LA17_0 >= METHODID && LA17_0 <= MINUS)||LA17_0==NOT||LA17_0==OBJID||LA17_0==STRINGVAL||LA17_0==VARID) ) {
						alt17=1;
					}
					} finally {dbg.exitDecision(17);}

					switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:61:27: params
							{
							dbg.location(61,27);
							pushFollow(FOLLOW_params_in_postfExpr679);
							params();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(61,35);
					match(input,RPAREN,FOLLOW_RPAREN_in_postfExpr682); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:62:11: METHODID '(' ( params )? ')'
					{
					dbg.location(62,11);
					match(input,METHODID,FOLLOW_METHODID_in_postfExpr694); dbg.location(62,20);
					match(input,LPAREN,FOLLOW_LPAREN_in_postfExpr696); dbg.location(62,24);
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:62:24: ( params )?
					int alt18=2;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					int LA18_0 = input.LA(1);
					if ( ((LA18_0 >= BOOLVAL && LA18_0 <= CLASSID)||LA18_0==FUNCID||LA18_0==INTVAL||(LA18_0 >= METHODID && LA18_0 <= MINUS)||LA18_0==NOT||LA18_0==OBJID||LA18_0==STRINGVAL||LA18_0==VARID) ) {
						alt18=1;
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:62:24: params
							{
							dbg.location(62,24);
							pushFollow(FOLLOW_params_in_postfExpr698);
							params();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(18);}
					dbg.location(62,32);
					match(input,RPAREN,FOLLOW_RPAREN_in_postfExpr701); 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:63:11: primaryExpr '.' postfExpr
					{
					dbg.location(63,11);
					pushFollow(FOLLOW_primaryExpr_in_postfExpr713);
					primaryExpr();
					state._fsp--;
					dbg.location(63,23);
					match(input,DOT,FOLLOW_DOT_in_postfExpr715); dbg.location(63,27);
					pushFollow(FOLLOW_postfExpr_in_postfExpr717);
					postfExpr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(63, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "postfExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "postfExpr"



	// $ANTLR start "primaryExpr"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:64:1: primaryExpr : ( val | VARID | OBJID | FUNCID | CLASSID );
	public final void primaryExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "primaryExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:64:13: ( val | VARID | OBJID | FUNCID | CLASSID )
			int alt20=5;
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			switch ( input.LA(1) ) {
			case BOOLVAL:
			case INTVAL:
			case STRINGVAL:
				{
				alt20=1;
				}
				break;
			case VARID:
				{
				alt20=2;
				}
				break;
			case OBJID:
				{
				alt20=3;
				}
				break;
			case FUNCID:
				{
				alt20=4;
				}
				break;
			case CLASSID:
				{
				alt20=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:64:15: val
					{
					dbg.location(64,15);
					pushFollow(FOLLOW_val_in_primaryExpr725);
					val();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:65:11: VARID
					{
					dbg.location(65,11);
					match(input,VARID,FOLLOW_VARID_in_primaryExpr737); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:66:11: OBJID
					{
					dbg.location(66,11);
					match(input,OBJID,FOLLOW_OBJID_in_primaryExpr749); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:67:11: FUNCID
					{
					dbg.location(67,11);
					match(input,FUNCID,FOLLOW_FUNCID_in_primaryExpr761); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:68:11: CLASSID
					{
					dbg.location(68,11);
					match(input,CLASSID,FOLLOW_CLASSID_in_primaryExpr773); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(68, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "primaryExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "val"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:69:1: val : ( BOOLVAL | INTVAL | STRINGVAL );
	public final void val() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "val");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:69:5: ( BOOLVAL | INTVAL | STRINGVAL )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
			{
			dbg.location(69,5);
			if ( input.LA(1)==BOOLVAL||input.LA(1)==INTVAL||input.LA(1)==STRINGVAL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(71, 21);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "val");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "val"



	// $ANTLR start "decl"
	// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:72:1: decl : tParam '=' logicOrExpr ;
	public final void decl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:72:6: ( tParam '=' logicOrExpr )
			dbg.enterAlt(1);

			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:72:8: tParam '=' logicOrExpr
			{
			dbg.location(72,8);
			pushFollow(FOLLOW_tParam_in_decl814);
			tParam();
			state._fsp--;
			dbg.location(72,15);
			match(input,ASSIGN,FOLLOW_ASSIGN_in_decl816); dbg.location(72,19);
			pushFollow(FOLLOW_logicOrExpr_in_decl818);
			logicOrExpr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "decl"

	// Delegated rules



	public static final BitSet FOLLOW_setup_in_program10 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_round_in_program12 = new BitSet(new long[]{0x0000080000010000L});
	public static final BitSet FOLLOW_turn_in_program14 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_funcs_in_program16 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program18 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETUP_in_setup26 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCURLY_in_setup28 = new BitSet(new long[]{0x00003602561B8380L});
	public static final BitSet FOLLOW_stmts_in_setup30 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RCURLY_in_setup32 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROUND_in_round40 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCURLY_in_round42 = new BitSet(new long[]{0x00003602561B8380L});
	public static final BitSet FOLLOW_stmts_in_round44 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RCURLY_in_round46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TURN_in_turn55 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_turn57 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CLASSID_in_turn59 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_VARID_in_turn61 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_turn63 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCURLY_in_turn65 = new BitSet(new long[]{0x00003602561B8380L});
	public static final BitSet FOLLOW_stmts_in_turn67 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RCURLY_in_turn69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_in_funcs88 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_funcs_in_funcs90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stmt_in_stmts109 = new BitSet(new long[]{0x00003600561B8380L});
	public static final BitSet FOLLOW_stmts_in_stmts111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCID_in_func130 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_func132 = new BitSet(new long[]{0x0000020800080080L});
	public static final BitSet FOLLOW_tParams_in_func134 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_func137 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCURLY_in_func139 = new BitSet(new long[]{0x00003602561B8380L});
	public static final BitSet FOLLOW_stmts_in_func141 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RCURLY_in_func143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tParam_in_tParams160 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_tParams163 = new BitSet(new long[]{0x0000020000080080L});
	public static final BitSet FOLLOW_tParams_in_tParams165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_stmt183 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMI_in_stmt185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprStmt_in_stmt197 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMI_in_stmt199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectStmt_in_stmt211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterStmt_in_stmt223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iterStmt240 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_iterStmt242 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_expr_in_iterStmt244 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterStmt246 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCURLY_in_iterStmt248 = new BitSet(new long[]{0x00003602561B8380L});
	public static final BitSet FOLLOW_stmts_in_iterStmt250 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RCURLY_in_iterStmt252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_iterStmt264 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_iterStmt266 = new BitSet(new long[]{0x0000020000080080L});
	public static final BitSet FOLLOW_decl_in_iterStmt268 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterStmt270 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_expr_in_iterStmt272 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterStmt274 = new BitSet(new long[]{0x0000140042110300L});
	public static final BitSet FOLLOW_postfExpr_in_iterStmt276 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterStmt278 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCURLY_in_iterStmt280 = new BitSet(new long[]{0x00003602561B8380L});
	public static final BitSet FOLLOW_stmts_in_iterStmt282 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RCURLY_in_iterStmt284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_selectStmt301 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_selectStmt303 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_expr_in_selectStmt305 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectStmt307 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCURLY_in_selectStmt309 = new BitSet(new long[]{0x00003602561B8380L});
	public static final BitSet FOLLOW_stmts_in_selectStmt311 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RCURLY_in_selectStmt313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprStmt323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_tParam374 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_VARID_in_tParam376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_params386 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_params389 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_params_in_params391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExpr_in_expr410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrExpr_in_assignExpr420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_assignExpr432 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assignExpr434 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_assignExpr_in_assignExpr436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr453 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_OR_in_logicOrExpr456 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_logicOrExpr_in_logicOrExpr458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equalExpr_in_logicAndExpr470 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_logicAndExpr473 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_logicAndExpr_in_logicAndExpr475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relatExpr_in_equalExpr487 = new BitSet(new long[]{0x0000000020004002L});
	public static final BitSet FOLLOW_set_in_equalExpr490 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_equalExpr_in_equalExpr496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addExpr_in_relatExpr514 = new BitSet(new long[]{0x0000018000200042L});
	public static final BitSet FOLLOW_set_in_relatExpr517 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_relatExpr_in_relatExpr527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_addExpr545 = new BitSet(new long[]{0x0000000104000002L});
	public static final BitSet FOLLOW_set_in_addExpr548 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_addExpr_in_addExpr554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpr_in_multExpr572 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_set_in_multExpr575 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_multExpr_in_multExpr581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfExpr_in_unaryExpr599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpr611 = new BitSet(new long[]{0x0000140042110300L});
	public static final BitSet FOLLOW_postfExpr_in_unaryExpr613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpr625 = new BitSet(new long[]{0x0000140042110300L});
	public static final BitSet FOLLOW_postfExpr_in_unaryExpr627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_postfExpr635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_postfExpr647 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_INCREM_in_postfExpr649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_postfExpr661 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DECREM_in_postfExpr663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_postfExpr675 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_postfExpr677 = new BitSet(new long[]{0x0000140856110300L});
	public static final BitSet FOLLOW_params_in_postfExpr679 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_postfExpr682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHODID_in_postfExpr694 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_postfExpr696 = new BitSet(new long[]{0x0000140856110300L});
	public static final BitSet FOLLOW_params_in_postfExpr698 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_postfExpr701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_postfExpr713 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOT_in_postfExpr715 = new BitSet(new long[]{0x0000140042110300L});
	public static final BitSet FOLLOW_postfExpr_in_postfExpr717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_val_in_primaryExpr725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARID_in_primaryExpr737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBJID_in_primaryExpr749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCID_in_primaryExpr761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASSID_in_primaryExpr773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tParam_in_decl814 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_decl816 = new BitSet(new long[]{0x0000140056110300L});
	public static final BitSet FOLLOW_logicOrExpr_in_decl818 = new BitSet(new long[]{0x0000000000000002L});
}
