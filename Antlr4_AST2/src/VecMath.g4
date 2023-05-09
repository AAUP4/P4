// START: header
grammar VecMath;
tokens { VEC }       // define imaginary token for vector literal
// END: header

// START: stat
prog:   stat+ ;              // build list of stat trees
stat:   ID assign='=' expr  #StatAssign // '=' is operator subtree root
    |   print='print' expr  #StatPrint  // 'print' is subtree root
    ;
// END: stat

// START: expr
expr: left=expr op=('*'|'.') right=expr #ExprMult // '*', '.' are roots
    | left=expr op='+' right=expr       #ExprAdd  // '+' is root node
    | '[' expr (',' expr)* ']'    #ExprVec  // VEC is root
    | INT                               #ExprInt
    | ID                                #ExprId
    ;
// END: expr

ID  :   'a'..'z'+ ;
INT :   '0'..'9'+ ;
WS  :   (' '|'\r'|'\n')+ -> skip ;