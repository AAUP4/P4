grammar CLUB;

program : setup round turn func* EOF ;
setup : 'Setup' '{' stmt* '}' ;
round : 'Round' '{' stmt* '}' ;
turn : ('Turn' '(' 'Player' 'player' ')' '{' stmt* '}')?
        ;

func : left=FUNCID '{' stmt* '}'
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
postfExpr : primaryExpr                                                 #PostF1
        | primaryExpr op=('++'|'--')                                    #PostF2
        | left='Turn' '(' 'Player.getPlayer(' primaryExpr ')' ')'       #PostF3
        | left=FUNCID                                                   #PostF4
        | left=VMETHODID                                                #PostF5
        | left=BMETHODID                                                #PostF6
        | left=IMETHODID                                                #PostF7
        | left=SMETHODID                                                #PostF8
        ;
primaryExpr : val                                       #Primary1
        | left=VARID                                    #Primary2
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


VMETHODID : 'Game.exit()'
        | 'Game.exit(Player.getPlayer('INTPARAM'))'
        | 'Game.print('STRINGPARAM')'
        | 'table.discard('STRINGPARAM',Game.discardPile)'
        | 'table.discard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'table.discard(table.getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'table.discard(table.getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'table.discardAll(Game.discardPile)'
        | 'table.discardAll(Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'table.draw('INTPARAM',deck)'
        | 'table.getCardIndex('INTPARAM').flip()'
        | 'table.print()'
        | 'Player.getPlayer('INTPARAM').discard('STRINGPARAM',Game.discardPile)'
        | 'Player.getPlayer('INTPARAM').discard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer('INTPARAM').discard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Game.discardPile)'
        | 'Player.getPlayer('INTPARAM').discard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer('INTPARAM').discardAll(discardPile)'
        | 'Player.getPlayer('INTPARAM').discardAll(Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer('INTPARAM').draw('INTPARAM',deck)'
        | 'Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').flip()'
        | 'Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').flip()'
        | 'Player.getPlayer('INTPARAM').getTable().discard('STRINGPARAM',Game.discardPile)'
        | 'Player.getPlayer('INTPARAM').getTable().discard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer('INTPARAM').getTable().discard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'Player.getPlayer('INTPARAM').getTable().discard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer('INTPARAM').getTable().discardAll(discardPile)'
        | 'Player.getPlayer('INTPARAM').getTable().discardAll(Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer('INTPARAM').getTable().draw('INTPARAM',deck)'
        | 'Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').flip()'
        | 'Player.getPlayer('INTPARAM').getTable().print()'
        | 'Player.getPlayer('INTPARAM').layDown('STRINGPARAM',Player.getPlayer('INTPARAM').getTable(),BOOLPARAM)'
        | 'Player.getPlayer('INTPARAM').layDown('STRINGPARAM',table,'BOOLPARAM')'
        | 'Player.getPlayer('INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),BOOLPARAM)'
        | 'Player.getPlayer('INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),table,BOOLPARAM)'
        | 'Player.getPlayer('INTPARAM').layDown('STRINGPARAM',Player.getPlayer('INTPARAM').getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer('INTPARAM').layDown('STRINGPARAM',table,Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUpL)'
        | 'Player.getPlayer('INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer('INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),table,Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer('INTPARAM').takeCard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer('INTPARAM').takeCard('STRINGPARAM',Game.discardPile)'
        | 'Player.getPlayer('INTPARAM').takeCard(Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer('INTPARAM').takeCard(Game.getDiscardPileIndex('INTPARAM').id,Game.discardPile)'
        | 'Player.getPlayer('INTPARAM').takeCard('STRINGPARAM',Player.getPlayer('INTPARAM').getTable())'
        | 'Player.getPlayer('INTPARAM').takeCard('STRINGPARAM',table)'
        | 'Player.getPlayer('INTPARAM').takeCard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getTable())'
        | 'Player.getPlayer('INTPARAM').takeCard(table.getCardIndex('INTPARAM').id,table)'
        | 'Player.getPlayer('INTPARAM').takeCard('STRINGPARAM',Player.getPlayer('INTPARAM'))'
        | 'Player.getPlayer('INTPARAM').takeCard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM'))'
        | 'Player.getPlayer('INTPARAM').printHand()'
        | 'Player.create('INTPARAM')'
        | 'deck.addJokers('INTPARAM')'
        | 'deck.assignPoints('INTPARAM',' STRINGPARAM (',' STRINGPARAM)*')'
        | 'deck.shuffle()'
        | 'deck.deal('INTPARAM')'
        | 'deck.getCard('INTPARAM').flip()'
        | 'deck.print()'
        | 'deck.size()'
        | 'deck.returnDiscardPile()'
        | 'deck.returnDiscardPile(Player.getPlayer('INTPARAM'))'
        ;

BMETHODID : 'table.getCardIndex('INTPARAM').isFaceUp'
        | 'Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp'
        | 'Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').isFaceUp'
        | 'Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').isFaceUp'
        | 'deck.getCard('INTPARAM').isFaceUp'
        ;
        
IMETHODID : 'table.getCardIndex('INTPARAM').getPoints()'
        | 'table.size()'
        | 'Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').getPoints()'
        | 'Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').getPoints()'
        | 'Player.getPlayer('INTPARAM').getHandPoints()'
        | 'Player.getPlayer('INTPARAM').handSize()'
        | 'Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').getPoints()'
        | 'Player.getPlayer('INTPARAM').getTable().size()'
        | 'Player.getPlayer('INTPARAM').getTablePoints()'
        | 'Player.getPlayersAmount()'
        | 'deck.getCard('INTPARAM').getPoints()'
        | 'Player.getPlayer('INTPARAM').score'
        ;

SMETHODID : 'Game.input()'
        | 'Game.input('STRINGPARAM')'
        | 'Game.getDiscardPileIndex('INTPARAM').id'
        | 'Game.getDiscardPileIndex('INTPARAM').rank'
        | 'Game.getDiscardPileIndex('INTPARAM').suit'
        | 'table.getCardIndex('INTPARAM').id'
        | 'table.getCardIndex('INTPARAM').rank'
        | 'table.getCardIndex('INTPARAM').suit'
        | 'Player.getPlayer('INTPARAM').name'
        | 'Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id'
        | 'Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').rank'
        | 'Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').suit'
        | 'Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').id'
        | 'Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').rank'
        | 'Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').suit'
        | 'Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id'
        | 'Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').rank'
        | 'Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').suit'
        | 'deck.getCard('INTPARAM').id'
        | 'deck.getCard('INTPARAM').rank'
        | 'deck.getCard('INTPARAM').suit'
        ;

BOOLVAL : 'true'
        | 'false'
        ;

INTVAL : [0]
        | [1-9][0-9]*
        ;
VARID : [a-z][a-zA-Z]*
        ;
FUNCID : [A-Z][a-zA-Z]*
        ;
STRINGVAL : '"'~[/"]*'"' 
        ;
INTPARAM : (('(')*('-')? INTVAL|VARID ) (('('|')')*('+'|'-'|'*'|'/') INTVAL|VARID ('('|')')*)*
        ;
BOOLPARAM : ('('?('!')?'('?(BOOLVAL|VARID)|('('?(INTPARAM|VARID)('<'|'>'|'>='|'<=')(INTPARAM|VARID)')'?)')'?)(('&&'|'||'|'=='|'!=') ('('?('!')?'('?(BOOLVAL|VARID)|('('?(INTPARAM|VARID)('<'|'>'|'>='|'<=')(INTPARAM|VARID)')'?))')'?)*')'?
        ;
STRINGPARAM : (INTVAL|STRINGVAL|BOOLVAL|VARID) ('+' INTVAL|STRINGVAL|BOOLVAL|VARID)*
        ;