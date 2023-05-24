grammar CLUB;

program : setup round turn func* EOF ;
setup : 'Setup' '{' stmt* '}' ;
round : 'Round' '{' stmt* '}' ;
turn : 'Turn' '(' PLAYER2 ')' '{' stmt* '}' #Turn1
      |                                     #Turn2
      ;

func : left=FUNCID '{' stmt* '}'
         ;
stmt : tParam op='=' logicOrExpr ';'   #Stmt1
        | assignExpr  ';'              #Stmt2
        | selectStmt                   #Stmt3
        | iterStmt                     #Stmt4
        | left=VMETHODID ';'           #Stmt5
        | left=FUNCID'('')' ';'        #Stmt6
        | left=TURNCALL param=PMETHODID')' ';'   #Stmt7
        | left=IMETHODID ('++'|'--')  ';'           #Stmt8
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
        | left=BMETHODID                                                #PostF3
        | left=IMETHODID                                                #PostF4
        | left=SMETHODID                                                #PostF5
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

TURNCALL : 'Turn(' ;

SETUP : 'Setup' ;
ROUND : 'Round' ;
TURN : 'Turn' ;
WHILE : 'while' ;
FOR : 'for' ;
IF : 'if' ;
BOOL : 'bool' ;
INT : 'int' ;
STRING : 'string' ;


VMETHODID : 'Player.create('INTPARAM')'
        | 'deck.addJokers('INTPARAM')'
        | 'deck.deal('INTPARAM')'
        | 'deck.assignPoints('INTPARAM(','STRINGPARAM)+')'
        | 'Game.exit()'
        | 'Game.exit(Player.getPlayer('INTPARAM'))'
        | 'Game.exit(player)'
        | 'Game.print('STRINGPARAM')'
        | 'table.discard('STRINGPARAM',Game.discardPile)'
        | 'table.discard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'table.discard('STRINGPARAM',player.getDiscardPile())'
        | 'table.discard(table.getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'table.discard(table.getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'table.discard(table.getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'table.discardAll(Game.discardPile)'
        | 'table.discardAll(Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'table.discardAll(player.getDiscardPile())'
        | 'table.draw('INTPARAM',deck)'
        | 'table.getCardIndex('INTPARAM').flip()'
        | 'Player.getPlayer(' INTPARAM').discard('STRINGPARAM',Game.discardPile)'
        | 'player.discard('STRINGPARAM',Game.discardPile)'
        | 'Player.getPlayer(' INTPARAM').discard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').discard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'Player.getPlayer(' INTPARAM').discard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.discard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.discard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'Player.getPlayer(' INTPARAM').discard('STRINGPARAM',player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').discard(player.getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'player.discard('STRINGPARAM',player.getDiscardPile())'
        | 'player.discard(player.getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'player.discard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.discard(player.getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.discard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'player.discard(player.getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').discard(player.getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').discard(player.getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').discard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').discardAll(discardPile)'
        | 'player.discardAll(discardPile)'
        | 'Player.getPlayer(' INTPARAM').discardAll(Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').discardAll(player.getDiscardPile())'
        | 'player.discardAll(Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.discardAll(player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').draw('INTPARAM',deck)'
        | 'player.draw('INTPARAM',deck)'
        | 'Player.getPlayer(' INTPARAM').getCardIndex('INTPARAM').flip()'
        | 'player.getCardIndex('INTPARAM').flip()'
        | 'Player.getPlayer(' INTPARAM').getDiscardPileIndex('INTPARAM').flip()'
        | 'player.getDiscardPileIndex('INTPARAM').flip()'
        | 'Player.getPlayer(' INTPARAM').getTable().discard('STRINGPARAM',Game.discardPile)'
        | 'player.getTable().discard('STRINGPARAM',Game.discardPile)'
        | 'Player.getPlayer(' INTPARAM').getTable().discard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').getTable().discard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'player.getTable().discard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.getTable().discard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'Player.getPlayer(' INTPARAM').getTable().discard('STRINGPARAM',player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').getTable().discard(player.getTable().getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'player.getTable().discard('STRINGPARAM',player.getDiscardPile())'
        | 'player.getTable().discard(player.getTable().getCardIndex('INTPARAM').id,Game.discardPile)'
        | 'Player.getPlayer(' INTPARAM').getTable().discard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.getTable().discard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').getTable().discard(player.getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').getTable().discard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'player.getTable().discard(player.getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').getTable().discard(player.getTable().getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'player.getTable().discard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'player.getTable().discard(player.getTable().getCardIndex('INTPARAM').id,player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').getTable().discardAll(discardPile)'
        | 'player.getTable().discardAll(discardPile)'
        | 'Player.getPlayer(' INTPARAM').getTable().discardAll(Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.getTable().discardAll(Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').getTable().discardAll(player.getDiscardPile())'
        | 'player.getTable().discardAll(player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').getTable().draw('INTPARAM',deck)'
        | 'player.getTable().draw('INTPARAM',deck)'
        | 'Player.getPlayer(' INTPARAM').getTable().getCardIndex('INTPARAM').flip()'
        | 'player.getTable().getCardIndex('INTPARAM').flip()'
        | 'Player.getPlayer(' INTPARAM').getTable().print()'
        | 'player.getTable().print()'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',Player.getPlayer(I'INTPARAM'.getTable(),'BOOLPARAM')'
        | 'player.layDown('STRINGPARAM',Player.getPlayer('INTPARAM').getTable(),'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',player.getTable(),'BOOLPARAM')'
        | 'player.layDown('STRINGPARAM',player.getTable(),'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',table,'BOOLPARAM')'
        | 'player.layDown('STRINGPARAM',table,'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),'BOOLPARAM')'
        | 'player.layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown(player.getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),player.getTable(),'BOOLPARAM')'
        | 'player.layDown(player.getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown(player.getCardIndex('INTPARAM'),player.getTable(),'BOOLPARAM')'
        | 'player.layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),player.getTable(),'BOOLPARAM')'
        | 'player.layDown(player.getCardIndex('INTPARAM'),player.getTable(),'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),table,'BOOLPARAM')'
        | 'player.layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),table,'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown(player.getCardIndex('INTPARAM'),table,'BOOLPARAM')'
        | 'player.layDown(player.getCardIndex('INTPARAM'),table,'BOOLPARAM')'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',Player.getPlayer('INTPARAM').getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown('STRINGPARAM',Player.getPlayer('INTPARAM').getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',player.getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',Player.getPlayer('INTPARAM').getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown('STRINGPARAM',player.getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',player.getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown('STRINGPARAM',Player.getPlayer('INTPARAM').getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown('STRINGPARAM',player.getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',table,Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown('STRINGPARAM',table,Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown('STRINGPARAM',table,player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown('STRINGPARAM',table,player.getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown(player.getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),player.getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown(player.getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown(player.getCardIndex('INTPARAM'),player.getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),player.getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),player.getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown(player.getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown(player.getCardIndex('INTPARAM'),player.getTable(),Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown(player.getCardIndex('INTPARAM'),Player.getPlayer('INTPARAM').getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM'),player.getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').layDown(player.getCardIndex('INTPARAM'),player.getTable(),player.getCardIndex('INTPARAM').isFaceUp)'
        | 'player.layDown(player.getCardIndex('INTPARAM'),table,player.getCardIndex('INTPARAM').isFaceUp)'
        | 'Player.getPlayer(' INTPARAM').takeCard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.takeCard('STRINGPARAM',Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').takeCard('STRINGPARAM',player.getDiscardPile())'
        | 'player.takeCard('STRINGPARAM',player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').takeCard('STRINGPARAM',Game.discardPile)'
        | 'player.takeCard('STRINGPARAM',Game.discardPile)'
        | 'Player.getPlayer(' INTPARAM').takeCard(Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'player.takeCard(Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').takeCard(player.getDiscardPileIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').takeCard(Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').id,player.getDiscardPile())'
        | 'player.takeCard(player.getDiscardPileIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').takeCard(player.getDiscardPileIndex('INTPARAM').id,player.getDiscardPile())'
        | 'player.takeCard(Player.getPlayer('INTPARAM').getDiscardPileIndex('INTPARAM').id,player.getDiscardPile())'
        | 'player.takeCard(player.getDiscardPileIndex('INTPARAM').id,player.getDiscardPile())'
        | 'Player.getPlayer(' INTPARAM').takeCard(Game.getDiscardPileIndex('INTPARAM').id,Game.discardPile)'
        | 'player.takeCard(Game.getDiscardPileIndex('INTPARAM').id,Game.discardPile)'
        | 'Player.getPlayer(' INTPARAM').takeCard('STRINGPARAM',Player.getPlayer('INTPARAM').getTable())'
        | 'player.takeCard('STRINGPARAM',Player.getPlayer('INTPARAM').getTable())'
        | 'Player.getPlayer(' INTPARAM').takeCard('STRINGPARAM',player.getTable())'
        | 'player.takeCard('STRINGPARAM',player.getTable())'
        | 'Player.getPlayer(' INTPARAM').takeCard('STRINGPARAM',table)'
        | 'player.takeCard('STRINGPARAM',table)'
        | 'Player.getPlayer(' INTPARAM').takeCard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getTable())'
        | 'player.takeCard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getTable())'
        | 'Player.getPlayer(' INTPARAM').takeCard(player.getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getTable())'
        | 'Player.getPlayer(' INTPARAM').takeCard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,player.getTable())'
        | 'player.takeCard(player.getTable().getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM').getTable())'
        | 'Player.getPlayer(' INTPARAM').takeCard(player.getTable().getCardIndex('INTPARAM').id,player.getTable())'
        | 'player.takeCard(Player.getPlayer('INTPARAM').getTable().getCardIndex('INTPARAM').id,player.getTable())'
        | 'player.takeCard(player.getTable().getCardIndex('INTPARAM').id,player.getTable())'
        | 'Player.getPlayer(' INTPARAM').takeCard(table.getCardIndex('INTPARAM').id,table)'
        | 'player.takeCard(table.getCardIndex('INTPARAM').id,table)'
        | 'Player.getPlayer(' INTPARAM').takeCard('STRINGPARAM',Player.getPlayer('INTPARAM'))'
        | 'player.takeCard('STRINGPARAM',Player.getPlayer('INTPARAM'))'
        | 'Player.getPlayer(' INTPARAM').takeCard('STRINGPARAM',player)'
        | 'player.takeCard('STRINGPARAM',player)'
        | 'Player.getPlayer(' INTPARAM').takeCard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM'))'
        | 'player.takeCard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM'))'
        | 'Player.getPlayer(' INTPARAM').takeCard(player.getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM'))'
        | 'Player.getPlayer(' INTPARAM').takeCard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,player)'
        | 'player.takeCard(player.getCardIndex('INTPARAM').id,Player.getPlayer('INTPARAM'))'
        | 'Player.getPlayer(' INTPARAM').takeCard(player.getCardIndex('INTPARAM').id,player)'
        | 'player.takeCard(Player.getPlayer('INTPARAM').getCardIndex('INTPARAM').id,player)'
        | 'player.takeCard(player.getCardIndex('INTPARAM').id,player)'
        | 'Player.getPlayer(' INTPARAM').printHand()'
        | 'player.printHand()'
        | 'deck.shuffle()'
        | 'deck.getCard('INTPARAM').flip()'
        | 'deck.print()'
        | 'deck.returnDiscardPile()'
        | 'deck.returnDiscardPile(Player.getPlayer('INTPARAM')'
        | 'deck.returnDiscardPile(player)'
        ;

BMETHODID : 'table.getCardIndex('INTPARAM').isFaceUp'
          | 'Player.getPlayer(' INTPARAM').getCardIndex('INTPARAM').isFaceUp'
          | 'Player.getPlayer(' INTPARAM').getDiscardPileIndex('INTPARAM').isFaceUp'
          | 'Player.getPlayer(' INTPARAM').getTable().getCardIndex('INTPARAM').isFaceUp'
          | 'player.getCardIndex('INTPARAM').isFaceUp'
          | 'player.getDiscardPileIndex('INTPARAM').isFaceUp'
          | 'player.getTable().getCardIndex('INTPARAM').isFaceUp'
          | 'deck.getCard('INTPARAM').isFaceUp'
        ;
        
IMETHODID : 'table.getCardIndex('INTPARAM').getPoints()'
          | 'table.size()'
          | 'Player.getPlayer(' INTPARAM').getCardIndex('INTPARAM').getPoints()'
          | 'Player.getPlayer(' INTPARAM').getDiscardPileIndex('INTPARAM').getPoints()'
          | 'Player.getPlayer(' INTPARAM').getHandPoints()'
          | 'Player.getPlayer(' INTPARAM').handSize()'
          | 'Player.getPlayer(' INTPARAM').getTable().getCardIndex('INTPARAM').getPoints()'
          | 'Player.getPlayer(' INTPARAM').getTable().size()'
          | 'Player.getPlayer(' INTPARAM').getTablePoints()'
          | 'player.getCardIndex('INTPARAM').getPoints()'
          | 'player.getDiscardPileIndex('INTPARAM').getPoints()'
          | 'player.getHandPoints()'
          | 'player.handSize()'
          | 'player.getTable().getCardIndex('INTPARAM').getPoints()'
          | 'player.getTable().size()'
          | 'player.getTablePoints()'
          | 'Player.getPlayersAmount()'
          | 'deck.getCard('INTPARAM').getPoints()'
          | 'deck.size()'
          | 'Player.getPlayer(' INTPARAM').score'
          | 'player.score'
        ;

SMETHODID : 'Game.input()'
           | 'Game.input('STRINGPARAM')'
           | 'Game.getDiscardPileIndex('INTPARAM').id'
           | 'Game.getDiscardPileIndex('INTPARAM').rank'
           | 'Game.getDiscardPileIndex('INTPARAM').suit'
           | 'table.getCardIndex('INTPARAM').id'
           | 'table.getCardIndex('INTPARAM').rank'
           | 'table.getCardIndex('INTPARAM').suit'
           | 'Player.getPlayer(' INTPARAM').name'
           | 'Player.getPlayer(' INTPARAM').getCardIndex('INTPARAM').id'
           | 'Player.getPlayer(' INTPARAM').getCardIndex('INTPARAM').rank'
           | 'Player.getPlayer(' INTPARAM').getCardIndex('INTPARAM').suit'
           | 'Player.getPlayer(' INTPARAM').getDiscardPileIndex('INTPARAM').id'
           | 'Player.getPlayer(' INTPARAM').getDiscardPileIndex('INTPARAM').rank'
           | 'Player.getPlayer(' INTPARAM').getDiscardPileIndex('INTPARAM').suit'
           | 'Player.getPlayer(' INTPARAM').getTable().getCardIndex('INTPARAM').id'
           | 'Player.getPlayer(' INTPARAM').getTable().getCardIndex('INTPARAM').rank'
           | 'Player.getPlayer(' INTPARAM').getTable().getCardIndex('INTPARAM').suit'
           | 'player.name'
           | 'player.getCardIndex('INTPARAM').id'
           | 'player.getCardIndex('INTPARAM').rank'
           | 'player.getCardIndex('INTPARAM').suit'
           | 'player.getDiscardPileIndex('INTPARAM').id'
           | 'player.getDiscardPileIndex('INTPARAM').rank'
           | 'player.getDiscardPileIndex('INTPARAM').suit'
           | 'player.getTable().getCardIndex('INTPARAM').id'
           | 'player.getTable().getCardIndex('INTPARAM').rank'
           | 'player.getTable().getCardIndex('INTPARAM').suit'
           | 'deck.getCard('INTPARAM').id'
           | 'deck.getCard('INTPARAM').rank'
           | 'deck.getCard('INTPARAM').suit'
        ;
PMETHODID : 'Player.getPlayer(' INTPARAM')' ;

GETPLAYER : 'Player.getPlayer(' ;
PLAYER : 'player' ;
PLAYER2 : 'Player player' ;

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
INTPARAM : (('(')* ('-')? (INTVAL|VARID) ) (('+'|'-'|'*'|'/') ('('|')')* (INTVAL|VARID) ('('|')')* )*
        ;
BOOLPARAM : ('('?('!')?'('?(BOOLVAL|VARID)|('('?(INTPARAM|VARID)('<'|'>'|'>='|'<=')(INTPARAM|VARID)')'?)')'?)(('&&'|'||'|'=='|'!=') ('('?('!')?'('?(BOOLVAL|VARID)|('('?(INTPARAM|VARID)('<'|'>'|'>='|'<=')(INTPARAM|VARID)')'?))')'?)*')'?
        ;
STRINGPARAM : (INTVAL|STRINGVAL|BOOLVAL|VARID) ('+' (INTVAL|STRINGVAL|BOOLVAL|VARID))*
        ;

