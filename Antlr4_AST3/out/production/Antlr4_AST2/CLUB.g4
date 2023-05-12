grammar CLUB;

tokens { VEC }       // define imaginary token for vector literal


program : setup round turn funcs EOF ;
setup : 'Setup' '{' stmt* '}' ;
round : 'Round' '{' stmt* '}' ;
turn : ('Turn' '(' CLASSID VARID ')' '{' stmt* '}')?
        ;
funcs : func*
        ;
func : FUNCID '(' tParams? ')' '{' stmt* '}'
         ;
tParams : tParam (',' tParam)*
        ;
stmt : tParam op='=' right=logicOrExpr ';'
        | assignExpr  ';'
//        | selectStmt
//        | iterStmt
        ;
iterStmt : WHILE '(' logicOrExpr ')' '{' stmt* '}'
        | FOR '(' left1=INT left2=VARID op='=' right=addExpr ';' logicOrExpr ';' postfExpr ')' '{' stmt* '}'
        ;
selectStmt : IF '(' logicOrExpr ')' '{' stmt* '}'
	;

tParam : left=TYPE right=VARID
	;
params : logicOrExpr (',' logicOrExpr)*
        ;

assignExpr : logicOrExpr                 #Assign1
        | left=VARID op='=' logicOrExpr  #Assign2
        ;
logicOrExpr : logicAndExpr               #LogicOr1
        | logicAndExpr op='||' logicOrExpr  #LogicOr2
	    ;

logicAndExpr : left=INTVAL
//equalExpr ('&&' logicAndExpr)?
	    ;

equalExpr : relatExpr (('=='|'!=') equalExpr)?
        ;
relatExpr : addExpr (('<'|'>'|'<='|'>=') relatExpr)?
        ;
addExpr : multExpr (('+'|'-') addExpr)?
        ;
multExpr : unaryExpr (('*'|'/') multExpr)?
        ;
unaryExpr :('-'|'!')? postfExpr
        ;
postfExpr : primaryExpr ('++'|'--'|'('params?')'|'.'postfExpr)|METHODID'('params?')'
        ;
primaryExpr : val
        | VARID
        | OBJID
        | FUNCID
        | CLASSID
        ;
val : BOOLVAL
        | INTVAL
        | STRINGVAL
        ;


AND : '&&' ;
OR : '||' ;
EQ : '==' ;
NOTEQ : '!=' ;
SMALLER : '<' ;
LARGER : '>' ;
SMALLEREQ : '<=' ;
BIGGEREQ : '>=' ;
INCREM : '++' ;
DECREM : '--' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIVIDE : '/' ;
DOT : '.' ;
NOT : '!' ;
ASSIGN : '=' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
LSQUARE : '[' ;
RSQUARE : ']' ;

WS: [ \t\n\r\f]+ -> skip ;


SETUP : 'Setup' ;
ROUND : 'Round' ;
TURN : 'Turn' ;
WHILE : 'while' ;
FOR : 'for' ;
IF : 'if' ;
TYPE : BOOL | INT | STRING;
BOOL : 'bool' ;
INT : 'int' ;
STRING : 'string' ;


METHODID : 'create'
        |'getHand'
        |'getHandPoints'
        |'handSize'
        |'printHand'
        |'getTable'
        |'getTablePoints'
        |'printTable'
        |'getDiscardPile'
        |'draw'
        |'discard'
        |'takeCard'
        |'layDown'
        |'addJokers'
        |'assignPoints'
        |'shuffle'
        |'getCard'
        |'getCards'
        |'print'
        |'size'
        |'returnCards'
        |'returnDiscardPile'
        |'flip'
        |'getPoints' ;
BOOLVAL : 'true'
        | 'false' ;
CLASSID : 'Player'
        | 'Deck'
        | 'Card'
        | 'Table' ;
OBJID : [HDCS][2-9]
        |[HDCS]'1'[0-3]?
        |'J'[1-3]
        |'player'[1-9][0-9]*
        |'deck'
        |'table' ;
INTVAL : '0'
        | [1-9][0-9]* ;
VARID : [a-z][a-zA-Z_0-9]* ;
FUNCID : [A-Z][a-zA-Z_0-9]* ;
STRINGVAL : '"'~["]*'"' ;