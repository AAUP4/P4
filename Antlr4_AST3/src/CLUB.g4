grammar CLUB;

tokens { VEC }       // define imaginary token for vector literal


program : setup round turn funcs EOF ;
setup : 'Setup' '{' stmt* '}' ;
round : 'Round' '{' stmt* '}' ;
turn : ('Turn' '(' 'Player' 'player' ')' '{' stmt* '}')?
        ;
funcs : func*
        ;
func : FUNCID '(' tParams? ')' '{' stmt* '}'
         ;
tParams : tParam (',' tParam)*
        ;
stmt : tParam op='=' logicOrExpr ';'   #Stmt1
        | assignExpr  ';'              #Stmt2
        | selectStmt                   #Stmt3
        | iterStmt                     #Stmt4
        ;
iterStmt : WHILE '(' logicOrExpr ')' '{' stmt* '}'                                                       #While
        | FOR '(' tParam op='=' addExpr ';' logicOrExpr ';' right=VARID rop=('++'|'--')')' '{' stmt* '}' #For
        ;
selectStmt : IF '(' logicOrExpr ')' '{' stmt* '}'
	;

tParam : left=(BOOL|INT|STRING) right=VARID
	;
params : logicOrExpr (',' logicOrExpr)*
        ;

assignExpr : left=VARID op='=' logicOrExpr
        ;
logicOrExpr : logicAndExpr               #LogicOr1
        | logicAndExpr op='||' logicOrExpr  #LogicOr2
	    ;

logicAndExpr : equalExpr                #LogicAnd1
        | equalExpr op='&&' logicAndExpr #LogicAnd2
	    ;

equalExpr : relatExpr                       #Equal1
        | relatExpr op=('=='|'!=') equalExpr #Equal2
        ;
relatExpr : addExpr                                 #Relat1
        | addExpr op=('<'|'>'|'<='|'>=') relatExpr  #Relat2
        ;
addExpr : multExpr                          #Add1
        | multExpr op=('+'|'-') addExpr      #Add2
        ;
multExpr : unaryExpr                        #Mult1
        | unaryExpr op=('*'|'/') multExpr   #Mult2
        ;
unaryExpr : postfExpr                       #Unary1
        | op=('-'|'!') postfExpr            #Unary2
        ;
postfExpr : primaryExpr                                 #PostF1
        | primaryExpr op=('++'|'--')                    #PostF2
        | primaryExpr '('params')'                      #PostF3
        | primaryExpr op='.' postfExpr                  #PostF4
        | left=METHODID'('params ')'                    #PostF5
        | primaryExpr '(' ')'                           #PostF6
        | left=METHODID'('')'                           #PostF7
        ;
primaryExpr : val                                       #Primary1
        | left=(VARID | OBJID| FUNCID| CLASSID)         #Primary2
        ;
val : left=INTVAL
        | left=BOOLVAL
        | left=STRINGVAL
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
        |'getPoints'
        ;
BOOLVAL : 'true'
        | 'false'
        ;
CLASSID : 'Player'
        | 'Deck'
        | 'Card'
        | 'Table'
        ;
OBJID : ('H'|'D'|'C'|'S')[2-9]
        |('H'|'D'|'C'|'S')'1'[0-3]?
        |'J'[1-3]
        |'player'[1-9][0-9]*
        |'deck'
        |'table'
        ;
INTVAL : [0]
        | [1-9][0-9]*
        ;
VARID : [a-z][a-zA-Z_0-9]*
        ;
FUNCID : [A-Z][a-zA-Z_0-9]*
        ;
STRINGVAL : '"'~[/"]*'"' ;