grammar COOLParser;

program
   : programBlocks
   ;

programBlocks
   : classDefine ';' programBlocks # classes
   | EOF # eof
   ;

classDefine
   : CLASS TYPEID (INHERITS TYPEID)? '{' (feature ';')* '}'
   ;

feature
   : OBJECTID '(' (formal (',' formal)*)* ')' ':' TYPEID '{' expression '}' # method
   | OBJECTID ':' TYPEID (ASSIGNMENT expression)? # property
   ;

formal
   : OBJECTID ':' TYPEID
   ;

/* method argument */
expression
   : expression ('@' TYPEID)? '.' OBJECTID '(' (expression (',' expression)*)* ')' # methodCall
   | OBJECTID '(' (expression (',' expression)*)* ')' # ownMethodCall
   | IF expression THEN expression ELSE expression FI # if
   | WHILE expression LOOP expression POOL # while
   | '{' (expression ';') + '}' # block
   | LET OBJECTID ':' TYPEID (ASSIGNMENT expression)? (',' OBJECTID ':' TYPEID (ASSIGNMENT expression)?)* IN expression # letIn
   | CASE expression OF (OBJECTID ':' TYPEID CASE_ARROW expression ';') + ESAC # case
   | NEW TYPEID # new
   | INTEGER_NEGATIVE expression # negative
   | ISVOID expression # isvoid
   | expression MULTIPLY expression # multiply
   | expression DIVISION expression # division
   | expression ADD expression # add
   | expression MINUS expression # minus
   | expression LESS_THAN expression # lessThan
   | expression LESS_EQUAL expression # lessEqual
   | expression EQUAL expression # equal
   | NOT expression # boolNot
   | '(' expression ')' # parentheses
   | OBJECTID # id
   | INT # int
   | STRING # string
   | TRUE # true
   | FALSE # false
   | OBJECTID ASSIGNMENT expression # assignment
   ;

// key words

CLASS
   : 'c' 'l' 'a' 's' 's'
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
   : 'n' 'o' 't'
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