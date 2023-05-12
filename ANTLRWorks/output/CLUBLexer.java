// $ANTLR null C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g 2023-05-11 18:40:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CLUBLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CLUBLexer() {} 
	public CLUBLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLUBLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:74:5: ( '&&' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:74:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:75:4: ( '||' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:75:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:76:4: ( '==' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:76:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NOTEQ"
	public final void mNOTEQ() throws RecognitionException {
		try {
			int _type = NOTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:77:7: ( '!=' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:77:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQ"

	// $ANTLR start "SMALLER"
	public final void mSMALLER() throws RecognitionException {
		try {
			int _type = SMALLER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:78:9: ( '<' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:78:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALLER"

	// $ANTLR start "LARGER"
	public final void mLARGER() throws RecognitionException {
		try {
			int _type = LARGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:79:8: ( '>' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:79:10: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LARGER"

	// $ANTLR start "SMALLEREQ"
	public final void mSMALLEREQ() throws RecognitionException {
		try {
			int _type = SMALLEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:80:11: ( '<=' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:80:13: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALLEREQ"

	// $ANTLR start "BIGGEREQ"
	public final void mBIGGEREQ() throws RecognitionException {
		try {
			int _type = BIGGEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:81:10: ( '>=' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:81:12: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIGGEREQ"

	// $ANTLR start "INCREM"
	public final void mINCREM() throws RecognitionException {
		try {
			int _type = INCREM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:82:8: ( '++' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:82:10: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCREM"

	// $ANTLR start "DECREM"
	public final void mDECREM() throws RecognitionException {
		try {
			int _type = DECREM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:83:8: ( '--' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:83:10: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECREM"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:84:6: ( '+' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:84:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:85:7: ( '-' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:85:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:86:6: ( '*' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:86:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:87:8: ( '/' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:87:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:88:5: ( '.' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:88:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:89:5: ( '!' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:89:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:90:8: ( '=' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:90:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:91:7: ( ',' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:91:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:92:6: ( ';' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:92:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:93:8: ( '(' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:93:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:94:8: ( ')' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:94:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:95:8: ( '{' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:95:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:96:8: ( '}' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:96:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:97:9: ( '[' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:97:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:98:9: ( ']' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:98:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:100:3: ( ( '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:100:5: ( '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:100:5: ( '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SETUP"
	public final void mSETUP() throws RecognitionException {
		try {
			int _type = SETUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:102:7: ( 'Setup' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:102:9: 'Setup'
			{
			match("Setup"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETUP"

	// $ANTLR start "ROUND"
	public final void mROUND() throws RecognitionException {
		try {
			int _type = ROUND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:103:7: ( 'Round' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:103:9: 'Round'
			{
			match("Round"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROUND"

	// $ANTLR start "TURN"
	public final void mTURN() throws RecognitionException {
		try {
			int _type = TURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:104:6: ( 'Turn' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:104:8: 'Turn'
			{
			match("Turn"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TURN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:105:7: ( 'while' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:105:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:106:5: ( 'for' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:106:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:107:4: ( 'if' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:107:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:108:6: ( 'bool' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:108:8: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:109:5: ( 'int' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:109:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:110:8: ( 'string' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:110:10: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "METHODID"
	public final void mMETHODID() throws RecognitionException {
		try {
			int _type = METHODID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:112:10: ( 'create' | 'getHand' | 'getHandPoints' | 'handSize' | 'printHand' | 'getTable' | 'getTablePoints' | 'printTable' | 'getDiscardPile' | 'draw' | 'discard' | 'takeCard' | 'layDown' | 'addJokers' | 'assignPoints' | 'shuffle' | 'getCard' | 'getCards' | 'print' | 'size' | 'returnCards' | 'returnDiscardPile' | 'flip' | 'getPoints' )
			int alt2=24;
			switch ( input.LA(1) ) {
			case 'c':
				{
				alt2=1;
				}
				break;
			case 'g':
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2=='e') ) {
					int LA2_12 = input.LA(3);
					if ( (LA2_12=='t') ) {
						switch ( input.LA(4) ) {
						case 'H':
							{
							int LA2_24 = input.LA(5);
							if ( (LA2_24=='a') ) {
								int LA2_31 = input.LA(6);
								if ( (LA2_31=='n') ) {
									int LA2_36 = input.LA(7);
									if ( (LA2_36=='d') ) {
										int LA2_43 = input.LA(8);
										if ( (LA2_43=='P') ) {
											alt2=3;
										}

										else {
											alt2=2;
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 2, 36, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 31, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 24, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 'T':
							{
							int LA2_25 = input.LA(5);
							if ( (LA2_25=='a') ) {
								int LA2_32 = input.LA(6);
								if ( (LA2_32=='b') ) {
									int LA2_37 = input.LA(7);
									if ( (LA2_37=='l') ) {
										int LA2_44 = input.LA(8);
										if ( (LA2_44=='e') ) {
											int LA2_50 = input.LA(9);
											if ( (LA2_50=='P') ) {
												alt2=7;
											}

											else {
												alt2=6;
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 2, 44, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 2, 37, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 32, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 25, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 'D':
							{
							alt2=9;
							}
							break;
						case 'C':
							{
							int LA2_27 = input.LA(5);
							if ( (LA2_27=='a') ) {
								int LA2_33 = input.LA(6);
								if ( (LA2_33=='r') ) {
									int LA2_38 = input.LA(7);
									if ( (LA2_38=='d') ) {
										int LA2_45 = input.LA(8);
										if ( (LA2_45=='s') ) {
											alt2=18;
										}

										else {
											alt2=17;
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 2, 38, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 33, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 27, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 'P':
							{
							alt2=24;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 21, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'h':
				{
				alt2=4;
				}
				break;
			case 'p':
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4=='r') ) {
					int LA2_13 = input.LA(3);
					if ( (LA2_13=='i') ) {
						int LA2_22 = input.LA(4);
						if ( (LA2_22=='n') ) {
							int LA2_29 = input.LA(5);
							if ( (LA2_29=='t') ) {
								switch ( input.LA(6) ) {
								case 'H':
									{
									alt2=5;
									}
									break;
								case 'T':
									{
									alt2=8;
									}
									break;
								default:
									alt2=19;
								}
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 29, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 22, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				int LA2_5 = input.LA(2);
				if ( (LA2_5=='r') ) {
					alt2=10;
				}
				else if ( (LA2_5=='i') ) {
					alt2=11;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 't':
				{
				alt2=12;
				}
				break;
			case 'l':
				{
				alt2=13;
				}
				break;
			case 'a':
				{
				int LA2_8 = input.LA(2);
				if ( (LA2_8=='d') ) {
					alt2=14;
				}
				else if ( (LA2_8=='s') ) {
					alt2=15;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				int LA2_9 = input.LA(2);
				if ( (LA2_9=='h') ) {
					alt2=16;
				}
				else if ( (LA2_9=='i') ) {
					alt2=20;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'r':
				{
				int LA2_10 = input.LA(2);
				if ( (LA2_10=='e') ) {
					int LA2_20 = input.LA(3);
					if ( (LA2_20=='t') ) {
						int LA2_23 = input.LA(4);
						if ( (LA2_23=='u') ) {
							int LA2_30 = input.LA(5);
							if ( (LA2_30=='r') ) {
								int LA2_35 = input.LA(6);
								if ( (LA2_35=='n') ) {
									int LA2_42 = input.LA(7);
									if ( (LA2_42=='C') ) {
										alt2=21;
									}
									else if ( (LA2_42=='D') ) {
										alt2=22;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 2, 42, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 35, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 30, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 23, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt2=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:112:12: 'create'
					{
					match("create"); 

					}
					break;
				case 2 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:113:10: 'getHand'
					{
					match("getHand"); 

					}
					break;
				case 3 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:114:10: 'getHandPoints'
					{
					match("getHandPoints"); 

					}
					break;
				case 4 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:115:10: 'handSize'
					{
					match("handSize"); 

					}
					break;
				case 5 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:116:10: 'printHand'
					{
					match("printHand"); 

					}
					break;
				case 6 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:117:10: 'getTable'
					{
					match("getTable"); 

					}
					break;
				case 7 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:118:10: 'getTablePoints'
					{
					match("getTablePoints"); 

					}
					break;
				case 8 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:119:10: 'printTable'
					{
					match("printTable"); 

					}
					break;
				case 9 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:120:10: 'getDiscardPile'
					{
					match("getDiscardPile"); 

					}
					break;
				case 10 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:121:10: 'draw'
					{
					match("draw"); 

					}
					break;
				case 11 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:122:10: 'discard'
					{
					match("discard"); 

					}
					break;
				case 12 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:123:10: 'takeCard'
					{
					match("takeCard"); 

					}
					break;
				case 13 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:124:10: 'layDown'
					{
					match("layDown"); 

					}
					break;
				case 14 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:125:10: 'addJokers'
					{
					match("addJokers"); 

					}
					break;
				case 15 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:126:10: 'assignPoints'
					{
					match("assignPoints"); 

					}
					break;
				case 16 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:127:10: 'shuffle'
					{
					match("shuffle"); 

					}
					break;
				case 17 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:128:10: 'getCard'
					{
					match("getCard"); 

					}
					break;
				case 18 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:129:10: 'getCards'
					{
					match("getCards"); 

					}
					break;
				case 19 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:130:10: 'print'
					{
					match("print"); 

					}
					break;
				case 20 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:131:10: 'size'
					{
					match("size"); 

					}
					break;
				case 21 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:132:10: 'returnCards'
					{
					match("returnCards"); 

					}
					break;
				case 22 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:133:10: 'returnDiscardPile'
					{
					match("returnDiscardPile"); 

					}
					break;
				case 23 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:134:10: 'flip'
					{
					match("flip"); 

					}
					break;
				case 24 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:135:10: 'getPoints'
					{
					match("getPoints"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "METHODID"

	// $ANTLR start "BOOLVAL"
	public final void mBOOLVAL() throws RecognitionException {
		try {
			int _type = BOOLVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:136:9: ( 'true' | 'false' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='t') ) {
				alt3=1;
			}
			else if ( (LA3_0=='f') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:136:11: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:137:11: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLVAL"

	// $ANTLR start "CLASSID"
	public final void mCLASSID() throws RecognitionException {
		try {
			int _type = CLASSID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:138:9: ( 'Player' | 'Deck' | 'Card' | 'Table' )
			int alt4=4;
			switch ( input.LA(1) ) {
			case 'P':
				{
				alt4=1;
				}
				break;
			case 'D':
				{
				alt4=2;
				}
				break;
			case 'C':
				{
				alt4=3;
				}
				break;
			case 'T':
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:138:11: 'Player'
					{
					match("Player"); 

					}
					break;
				case 2 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:139:11: 'Deck'
					{
					match("Deck"); 

					}
					break;
				case 3 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:140:11: 'Card'
					{
					match("Card"); 

					}
					break;
				case 4 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:141:11: 'Table'
					{
					match("Table"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASSID"

	// $ANTLR start "OBJID"
	public final void mOBJID() throws RecognitionException {
		try {
			int _type = OBJID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:142:7: ( ( 'H' | 'D' | 'C' | 'S' ) ( ( '2' .. '9' ) | '1' ( '0' .. '3' )? ) | ( 'J' ( '1' .. '3' ) ) | 'player' ( '1' .. '9' ) ( '0' .. '9' )* | 'deck' | 'table' )
			int alt8=5;
			switch ( input.LA(1) ) {
			case 'C':
			case 'D':
			case 'H':
			case 'S':
				{
				alt8=1;
				}
				break;
			case 'J':
				{
				alt8=2;
				}
				break;
			case 'p':
				{
				alt8=3;
				}
				break;
			case 'd':
				{
				alt8=4;
				}
				break;
			case 't':
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:142:9: ( 'H' | 'D' | 'C' | 'S' ) ( ( '2' .. '9' ) | '1' ( '0' .. '3' )? )
					{
					if ( (input.LA(1) >= 'C' && input.LA(1) <= 'D')||input.LA(1)=='H'||input.LA(1)=='S' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:142:26: ( ( '2' .. '9' ) | '1' ( '0' .. '3' )? )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '2' && LA6_0 <= '9')) ) {
						alt6=1;
					}
					else if ( (LA6_0=='1') ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:142:27: ( '2' .. '9' )
							{
							if ( (input.LA(1) >= '2' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:142:38: '1' ( '0' .. '3' )?
							{
							match('1'); 
							// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:142:41: ( '0' .. '3' )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( ((LA5_0 >= '0' && LA5_0 <= '3')) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:143:10: ( 'J' ( '1' .. '3' ) )
					{
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:143:10: ( 'J' ( '1' .. '3' ) )
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:143:11: 'J' ( '1' .. '3' )
					{
					match('J'); 
					if ( (input.LA(1) >= '1' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:144:10: 'player' ( '1' .. '9' ) ( '0' .. '9' )*
					{
					match("player"); 

					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:144:28: ( '0' .. '9' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;
				case 4 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:145:10: 'deck'
					{
					match("deck"); 

					}
					break;
				case 5 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:146:10: 'table'
					{
					match("table"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBJID"

	// $ANTLR start "INTVAL"
	public final void mINTVAL() throws RecognitionException {
		try {
			int _type = INTVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:147:8: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='0') ) {
				alt10=1;
			}
			else if ( ((LA10_0 >= '1' && LA10_0 <= '9')) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:147:10: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:148:11: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:148:21: ( '0' .. '9' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTVAL"

	// $ANTLR start "VARID"
	public final void mVARID() throws RecognitionException {
		try {
			int _type = VARID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:149:7: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:149:9: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:149:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||LA11_0=='_'||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARID"

	// $ANTLR start "FUNCID"
	public final void mFUNCID() throws RecognitionException {
		try {
			int _type = FUNCID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:150:8: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:150:10: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:150:20: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCID"

	// $ANTLR start "STRINGVAL"
	public final void mSTRINGVAL() throws RecognitionException {
		try {
			int _type = STRINGVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:151:11: ( '\"' (~ ( '\"' ) )* '\"' )
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:151:13: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:151:17: (~ ( '\"' ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGVAL"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:8: ( AND | OR | EQ | NOTEQ | SMALLER | LARGER | SMALLEREQ | BIGGEREQ | INCREM | DECREM | PLUS | MINUS | MULT | DIVIDE | DOT | NOT | ASSIGN | COMMA | SEMI | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | WS | SETUP | ROUND | TURN | WHILE | FOR | IF | BOOL | INT | STRING | METHODID | BOOLVAL | CLASSID | OBJID | INTVAL | VARID | FUNCID | STRINGVAL )
		int alt14=43;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:14: OR
				{
				mOR(); 

				}
				break;
			case 3 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:17: EQ
				{
				mEQ(); 

				}
				break;
			case 4 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:20: NOTEQ
				{
				mNOTEQ(); 

				}
				break;
			case 5 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:26: SMALLER
				{
				mSMALLER(); 

				}
				break;
			case 6 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:34: LARGER
				{
				mLARGER(); 

				}
				break;
			case 7 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:41: SMALLEREQ
				{
				mSMALLEREQ(); 

				}
				break;
			case 8 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:51: BIGGEREQ
				{
				mBIGGEREQ(); 

				}
				break;
			case 9 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:60: INCREM
				{
				mINCREM(); 

				}
				break;
			case 10 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:67: DECREM
				{
				mDECREM(); 

				}
				break;
			case 11 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:74: PLUS
				{
				mPLUS(); 

				}
				break;
			case 12 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:79: MINUS
				{
				mMINUS(); 

				}
				break;
			case 13 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:85: MULT
				{
				mMULT(); 

				}
				break;
			case 14 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:90: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:97: DOT
				{
				mDOT(); 

				}
				break;
			case 16 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:101: NOT
				{
				mNOT(); 

				}
				break;
			case 17 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:105: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 18 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:112: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 19 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:118: SEMI
				{
				mSEMI(); 

				}
				break;
			case 20 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:123: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 21 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:130: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 22 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:137: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 23 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:144: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 24 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:151: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 25 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:159: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 26 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:167: WS
				{
				mWS(); 

				}
				break;
			case 27 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:170: SETUP
				{
				mSETUP(); 

				}
				break;
			case 28 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:176: ROUND
				{
				mROUND(); 

				}
				break;
			case 29 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:182: TURN
				{
				mTURN(); 

				}
				break;
			case 30 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:187: WHILE
				{
				mWHILE(); 

				}
				break;
			case 31 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:193: FOR
				{
				mFOR(); 

				}
				break;
			case 32 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:197: IF
				{
				mIF(); 

				}
				break;
			case 33 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:200: BOOL
				{
				mBOOL(); 

				}
				break;
			case 34 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:205: INT
				{
				mINT(); 

				}
				break;
			case 35 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:209: STRING
				{
				mSTRING(); 

				}
				break;
			case 36 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:216: METHODID
				{
				mMETHODID(); 

				}
				break;
			case 37 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:225: BOOLVAL
				{
				mBOOLVAL(); 

				}
				break;
			case 38 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:233: CLASSID
				{
				mCLASSID(); 

				}
				break;
			case 39 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:241: OBJID
				{
				mOBJID(); 

				}
				break;
			case 40 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:247: INTVAL
				{
				mINTVAL(); 

				}
				break;
			case 41 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:254: VARID
				{
				mVARID(); 

				}
				break;
			case 42 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:260: FUNCID
				{
				mFUNCID(); 

				}
				break;
			case 43 :
				// C:\\Users\\Kira\\Documents\\GitHub\\P4\\ANTLRWorks\\CLUB.g:1:267: STRINGVAL
				{
				mSTRINGVAL(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\3\uffff\1\60\1\62\1\64\1\66\1\70\1\72\14\uffff\3\55\16\54\5\55\20\uffff"+
		"\1\55\2\136\3\55\4\54\1\147\23\54\3\55\1\136\1\55\1\uffff\1\136\3\55\1"+
		"\54\1\u0084\2\54\1\uffff\1\u0087\23\54\5\55\1\u00a4\1\55\1\54\1\uffff"+
		"\1\u00a7\1\54\1\uffff\1\u00a9\2\54\1\u00a7\11\54\1\u00a7\1\54\1\136\2"+
		"\54\1\u00b8\4\54\1\55\2\u00be\1\u00bf\1\u00c0\1\uffff\1\u00be\1\u00c1"+
		"\1\uffff\1\u00b8\1\uffff\11\54\1\u00a7\3\54\1\136\1\uffff\4\54\1\55\4"+
		"\uffff\1\u00d5\1\54\1\u00a7\17\54\1\u00be\1\uffff\2\u00a7\2\54\1\u00a7"+
		"\4\54\1\136\1\u00a7\1\54\1\u00a7\5\54\1\u00a7\1\54\1\u00a7\1\54\1\u00a7"+
		"\2\54\1\136\1\u00a7\7\54\2\u00a7\1\54\1\u00a7\6\54\1\u00a7\7\54\1\u00a7"+
		"\4\54\1\u00a7\1\54\1\u00a7\3\54\2\u00a7\3\54\1\u00a7";
	static final String DFA14_eofS =
		"\u011b\uffff";
	static final String DFA14_minS =
		"\1\11\2\uffff\4\75\1\53\1\55\14\uffff\1\61\1\157\1\141\1\150\1\141\1\146"+
		"\1\157\1\150\1\162\1\145\1\141\1\154\1\145\2\141\1\144\1\145\1\154\4\61"+
		"\20\uffff\1\164\2\60\1\165\1\162\1\142\1\151\1\162\1\151\1\154\1\60\1"+
		"\164\1\157\1\162\1\165\1\172\1\145\1\164\1\156\1\151\2\141\1\163\1\143"+
		"\1\142\1\165\1\171\1\144\1\163\1\164\1\141\1\143\1\162\1\60\1\165\1\uffff"+
		"\1\60\2\156\2\154\1\60\1\160\1\163\1\uffff\1\60\1\154\1\151\1\146\1\145"+
		"\1\141\1\103\1\144\1\156\1\171\1\167\1\143\1\153\1\145\1\154\1\145\1\104"+
		"\1\112\1\151\1\165\1\171\1\153\1\144\1\160\1\144\1\60\2\145\1\uffff\1"+
		"\60\1\145\1\uffff\1\60\1\156\1\146\1\60\1\164\2\141\1\151\1\141\1\157"+
		"\1\123\1\164\1\145\1\60\1\141\1\60\1\103\1\145\1\60\2\157\1\147\1\162"+
		"\1\145\4\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\147\1\154\1\145\1\156"+
		"\1\142\1\163\1\162\2\151\1\60\2\162\1\141\1\60\1\uffff\1\167\1\153\2\156"+
		"\1\162\4\uffff\1\60\1\145\1\60\1\144\1\154\1\143\1\144\1\156\1\172\2\141"+
		"\1\61\1\144\1\162\1\156\1\145\1\120\1\103\1\60\1\uffff\2\60\1\145\1\141"+
		"\1\60\1\164\1\145\1\156\1\142\2\60\1\144\1\60\1\162\1\157\1\141\1\151"+
		"\1\157\1\60\1\162\1\60\1\163\1\60\1\144\1\154\2\60\1\163\1\151\1\162\1"+
		"\163\1\151\1\157\1\144\2\60\1\145\1\60\1\156\1\144\1\143\1\156\1\151\1"+
		"\120\1\60\1\164\1\163\1\141\1\164\1\156\1\151\1\163\1\60\1\162\1\163\1"+
		"\164\1\154\1\60\1\144\1\60\1\163\1\145\1\120\2\60\1\151\1\154\1\145\1"+
		"\60";
	static final String DFA14_maxS =
		"\1\175\2\uffff\4\75\1\53\1\55\14\uffff\1\145\1\157\1\165\1\150\1\157\1"+
		"\156\1\157\1\164\1\162\1\145\1\141\3\162\1\141\1\163\1\145\1\154\1\145"+
		"\1\141\1\71\1\63\20\uffff\1\164\2\172\1\165\1\162\1\142\1\151\1\162\1"+
		"\151\1\154\1\172\1\164\1\157\1\162\1\165\1\172\1\145\1\164\1\156\1\151"+
		"\2\141\1\163\1\143\1\153\1\165\1\171\1\144\1\163\1\164\1\141\1\143\1\162"+
		"\1\172\1\165\1\uffff\1\172\2\156\2\154\1\172\1\160\1\163\1\uffff\1\172"+
		"\1\154\1\151\1\146\1\145\1\141\1\124\1\144\1\156\1\171\1\167\1\143\1\153"+
		"\1\145\1\154\1\145\1\104\1\112\1\151\1\165\1\171\1\153\1\144\1\160\1\144"+
		"\1\172\2\145\1\uffff\1\172\1\145\1\uffff\1\172\1\156\1\146\1\172\1\164"+
		"\2\141\1\151\1\141\1\157\1\123\1\164\1\145\1\172\1\141\1\172\1\103\1\145"+
		"\1\172\2\157\1\147\1\162\1\145\4\172\1\uffff\2\172\1\uffff\1\172\1\uffff"+
		"\1\147\1\154\1\145\1\156\1\142\1\163\1\162\2\151\1\172\2\162\1\141\1\172"+
		"\1\uffff\1\167\1\153\2\156\1\162\4\uffff\1\172\1\145\1\172\1\144\1\154"+
		"\1\143\1\144\1\156\1\172\2\141\1\71\1\144\1\162\1\156\1\145\1\120\1\104"+
		"\1\172\1\uffff\2\172\1\145\1\141\1\172\1\164\1\145\1\156\1\142\2\172\1"+
		"\144\1\172\1\162\1\157\1\141\1\151\1\157\1\172\1\162\1\172\1\163\1\172"+
		"\1\144\1\154\2\172\1\163\1\151\1\162\1\163\1\151\1\157\1\144\2\172\1\145"+
		"\1\172\1\156\1\144\1\143\1\156\1\151\1\120\1\172\1\164\1\163\1\141\1\164"+
		"\1\156\1\151\1\163\1\172\1\162\1\163\1\164\1\154\1\172\1\144\1\172\1\163"+
		"\1\145\1\120\2\172\1\151\1\154\1\145\1\172";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\1\2\6\uffff\1\15\1\16\1\17\1\22\1\23\1\24\1\25\1\26\1\27"+
		"\1\30\1\31\1\32\26\uffff\1\50\1\51\1\52\1\53\1\3\1\21\1\4\1\20\1\7\1\5"+
		"\1\10\1\6\1\11\1\13\1\12\1\14\43\uffff\1\47\10\uffff\1\40\34\uffff\1\37"+
		"\2\uffff\1\42\34\uffff\1\35\2\uffff\1\44\1\uffff\1\41\16\uffff\1\45\5"+
		"\uffff\1\46\1\33\1\34\1\36\23\uffff\1\43\105\uffff";
	static final String DFA14_specialS =
		"\u011b\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\24\1\uffff\2\24\23\uffff\1\4\1\56\3\uffff\1\1\1\uffff\1\16\1\17\1"+
			"\11\1\7\1\14\1\10\1\13\1\12\12\53\1\uffff\1\15\1\5\1\3\1\6\2\uffff\2"+
			"\55\1\50\1\47\3\55\1\51\1\55\1\52\5\55\1\46\1\55\1\26\1\25\1\27\6\55"+
			"\1\22\1\uffff\1\23\3\uffff\1\44\1\33\1\35\1\41\1\54\1\31\1\36\1\37\1"+
			"\32\2\54\1\43\3\54\1\40\1\54\1\45\1\34\1\42\2\54\1\30\3\54\1\20\1\2\1"+
			"\21",
			"",
			"",
			"\1\57",
			"\1\61",
			"\1\63",
			"\1\65",
			"\1\67",
			"\1\71",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\75\10\74\53\uffff\1\73",
			"\1\76",
			"\1\100\23\uffff\1\77",
			"\1\101",
			"\1\104\12\uffff\1\103\2\uffff\1\102",
			"\1\105\7\uffff\1\106",
			"\1\107",
			"\1\111\1\112\12\uffff\1\110",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\117\5\uffff\1\116",
			"\1\122\3\uffff\1\121\10\uffff\1\120",
			"\1\123\20\uffff\1\124",
			"\1\125",
			"\1\126\16\uffff\1\127",
			"\1\130",
			"\1\131",
			"\1\75\10\74\53\uffff\1\132",
			"\1\75\10\74\47\uffff\1\133",
			"\1\75\10\74",
			"\3\134",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\135",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\4\137\6\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\166\10\uffff\1\165",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\177",
			"",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0085",
			"\1\u0086",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u0090\1\u008f\3\uffff\1\u008d\7\uffff\1\u0091\3\uffff\1\u008e",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00a5",
			"\1\u00a6",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00a8",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00aa",
			"\1\u00ab",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00b5",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00b6",
			"\1\u00b7",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\12\54\7\uffff\7\54\1\u00cb\13\54\1\u00cc\6\54\4\uffff\1\54\1\uffff"+
			"\32\54",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"",
			"",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00d6",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\11\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5\1\u00e6",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\17\54\1\u00e7\12\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00e8",
			"\1\u00e9",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u00ea\7\54",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\12\u00ef\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00f0",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\12\54\7\uffff\17\54\1\u00f6\12\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00f7",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00f8",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00f9",
			"\1\u00fa",
			"\12\u00ef\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0102",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0114",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54"
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | OR | EQ | NOTEQ | SMALLER | LARGER | SMALLEREQ | BIGGEREQ | INCREM | DECREM | PLUS | MINUS | MULT | DIVIDE | DOT | NOT | ASSIGN | COMMA | SEMI | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | WS | SETUP | ROUND | TURN | WHILE | FOR | IF | BOOL | INT | STRING | METHODID | BOOLVAL | CLASSID | OBJID | INTVAL | VARID | FUNCID | STRINGVAL );";
		}
	}

}
