grammar CLUB;

program : setup round turn funcs EOF ;
setup : 'Setup' '{' stmts '}' ;
round : 'Round' '{' stmts '}' ;
turn : ('Turn' '(' CLASSID VARID ')' '{' stmts '}')?
        ;
funcs : (func funcs)?
        ;
stmts : (stmt stmts)? 
        ;
func : FUNCID '(' tParams? ')' '{' stmts '}'
         ;
tParams : tParam (',' tParams)?
        ;
stmt : decl ';'
        | exprStmt ';'
        | selectStmt
        | iterStmt 
        ;
iterStmt : 'while' '(' expr ')' '{' stmts '}'
        | 'for' '(' decl ';' expr ';' postfExpr ')' '{' stmts '}' 
        ;
selectStmt : 'if' '(' expr ')' '{' stmts '}' 
	;
exprStmt : expr 
	;
type : 'bool'
        | 'int'
        | 'string' 
        ;
tParam : type VARID 
	;
params : expr (',' params)? 
        ;
expr : assignExpr 
	;
assignExpr : logicOrExpr
        | primaryExpr '=' assignExpr 
        ;
logicOrExpr : logicAndExpr ('||' logicOrExpr)?
	;

logicAndExpr : equalExpr ('&&' logicAndExpr)?
	;

equalExpr : relatExpr (('=='|'!=') equalExpr)?
        ;
relatExpr : addExpr (('<'|'>'|'<='|'>=') relatExpr)?
        ;
addExpr : multExpr (('+'|'-') addExpr)?
        ;
multExpr : unaryExpr (('*'|'/') multExpr)?
        ;
unaryExpr : postfExpr
        | '-' postfExpr
        | '!' postfExpr ;
postfExpr : primaryExpr
        | primaryExpr '++'
        | primaryExpr '--'
        | primaryExpr '(' params? ')'
        | METHODID '(' params? ')'
        | primaryExpr '.' postfExpr ;
primaryExpr : val
        | VARID
        | OBJID
        | FUNCID
        | CLASSID ;
val : BOOLVAL
        | INTVAL
        | STRINGVAL  ;
decl : tParam '=' logicOrExpr ;

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

WS: ( '\t'|'\n'|'\r'|'\f')+ {$channel = HIDDEN;} ;

SETUP : 'Setup' ;
ROUND : 'Round' ;
TURN : 'Turn' ;
WHILE : 'while' ;
FOR : 'for' ;
IF : 'if' ;
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
OBJID : ('H'|'D'|'C'|'S')(('2'..'9')|'1'('0'..'3')?)
        |('J'('1'..'3'))
        |'player'('1'..'9')('0'..'9')*
        |'deck'
        |'table' ;
INTVAL : '0'
        | ('1'..'9')('0'..'9')* ;
VARID : ('a'..'z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
FUNCID : ('A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
STRINGVAL : '"' ~('"')* '"' ;

