grammar COOL;

program
   : programBlocks
   ;

programBlocks
   : classDefine ';' programBlocks # classes
   | EOF # eof
   ;

classDefine
   : CLASS TYPEID (INHERITS TYPEID)? '{' feature  '}'
   ;

feature
   : ((function| decl ))*
   ;

function
   :  OBJECTID '(' param? ')' ':' TYPEID '{' stmt '}' ';' # method
   ;

param
   : param',' formal
   |formal
   ;

decl
   : OBJECTID ':' TYPEID (ASSIGNMENT stmt)? # property
   ;

formal
   : OBJECTID (':' TYPEID)?
   ;

stmt
   : stmt (ADD|MINUS|LESS_THAN|LESS_EQUAL|EQUAL) factor
   | factor
   ;

factor
   :  factor (DIVISION|MULTIPLY)expression
   | expression
   ;



/* method argument */
expression:(
    methodCall
   | methodOwnCall
   | ifStmt
   | whileStmt
   | letStmt
   | block
   | decl
   | caseStmt
   | negativeExpr
   | minusExpr
   | isvoidExpr
   | notExpr
   | OBJECTID
   | INT
   | STRING
   | TRUE
   | FALSE
   | SELF
   | assigmentstmt
   )
   ;

assigmentstmt
   : OBJECTID ASSIGNMENT stmt
   ;

methodOwnCall
   : OBJECTID '(' list ')' # ownMethodCall
   ;

list
   : list ',' stmt | stmt
   ;
methodCall
   : OBJECTID  '.' methodOwnCall # methodcall
   ;

ifStmt
   : IF stmt THEN stmt (ELSE stmt)? FI # if
   ;

whileStmt
   : WHILE stmt LOOP stmt POOL # while
   ;

letStmt
   : LET decl (',' decl ) * IN stmt
   ;

block:
    '{'
        (stmt ';')+
    '}'
    ;

caseStmt
   : CASE stmt OF (OBJECTID ':' TYPEID CASE_ARROW stmt ';') + ESAC
   ;

negativeExpr
   : INTEGER_NEGATIVE stmt # negative
   ;
minusExpr
   : MINUS stmt
   ;
isvoidExpr
   : ISVOID stmt # isvoid
   ;

notExpr
   :  NOT stmt # boolNot
   ;

// key words

CLASS
   : 'c' 'l' 'a' 's' 's'
   ;

SELF
   : 's' 'e' 'l' 'f'
   ;

ELSE
   : 'e' 'l' 's' 'e'
   ;


FALSE
   : 'f' 'a' 'l' 's' 'e'
   ;


FI
   : 'f' 'i'
   ;


IF
   : 'i' 'f'
   ;


IN
   : 'i' 'n'
   ;


INHERITS
   : 'i' 'n' 'h' 'e' 'r' 'i' 't' 's'
   ;


ISVOID
   : 'i' 's' 'v' 'o' 'i' 'd'
   ;


LET
   : 'l' 'e' 't'
   ;


LOOP
   : 'l' 'o' 'o' 'p'
   ;


POOL
   : 'p' 'o' 'o' 'l'
   ;


THEN
   : 't' 'h' 'e' 'n'
   ;


WHILE
   : 'w' 'h' 'i' 'l' 'e'
   ;


CASE
   : 'c' 'a' 's' 'e'
   ;


ESAC
   : 'e' 's' 'a' 'c'
   ;


NEW
   : 'n' 'e' 'w'
   ;


OF
   : 'o' 'f'
   ;


NOT
   : 'N' 'O' 'T'
   ;


TRUE
   : 't' 'r' 'u' 'e'
   ;

// primitives

STRING
   : '"' (ESC | ~ [\\"\r\n])* '"'
   ;
INT
   : [0-9] +
   ;
TYPEID
   : [A-Z] [_0-9A-Za-z]*
   ;
OBJECTID
   : [a-z_] [_0-9A-Za-z]*
   ;
ASSIGNMENT
   : '<-'
   ;
CASE_ARROW
   : '=>'
   ;
ADD
   : '+'
   ;
MINUS
   : '-'
   ;
MULTIPLY
   : '*'
   ;
DIVISION
   : '/'
   ;
LESS_THAN
   : '<'
   ;
LESS_EQUAL
   : '<='
   ;
EQUAL
   : '='
   ;
INTEGER_NEGATIVE
   : '~'
   ;

 ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
 UNICODE
   : 'u' HEX HEX HEX HEX
   ;
 HEX
   : [0-9a-fA-F]
   ;
// comments
OPEN_COMMENT
   : '(*'
   ;
CLOSE_COMMENT
   : '*)'
   ;
COMMENT
   : OPEN_COMMENT (COMMENT | .)*? CLOSE_COMMENT -> skip
   ;
ONE_LINE_COMMENT
   : '--' (~ '\n')* '\n'? -> skip
   ;
// skip spaces, tabs, newlines, note that \v is not suppoted in antlr
WHITESPACE
   : [ \t\r\n\f] + -> skip
   ;
ERORR
   :.
   ;
