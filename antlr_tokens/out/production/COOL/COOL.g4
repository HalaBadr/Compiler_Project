lexer grammar  COOL;

Digit : [0-9];
Digits : Digit+;
Num : Digits (. Digits)? ('e' [+-]? Digits )?;
Letter : [A-Za-z];

Char :Letter|SEMICOLON|DARROW|LPAREN|RPAREN|COMMA|PLUS|MINUS|STAR|TILDE|LBRACE|RBRACE|DOT|ASSIGN|ATSYM|COLON|DoubleQout|Digit|Relop;
Relop : '<'| '<=' |'=' ;
TRUE	: 't'('r'|'R')('u'|'U')('e'|'E');
FALSE	: 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');
Literal : DoubleQout (Char|WS)* DoubleQout;

BOOL_CONST	: (TRUE|FALSE);
WS : [\r\t\n ]-> skip;

SEMICOLON   : ';';
DARROW      : '=>';
LPAREN	    : '(';
RPAREN	    : ')';
COMMA	    : ',';
PLUS	    : '+';
MINUS	    : '-';
STAR	    : '*';
SLASH	    : '/';
TILDE	    : '~';
LBRACE	    : '{';
RBRACE	    : '}';
DOT	    : '.';
ASSIGN	    : '<-';
ATSYM	    : '@';
COLON	    : ':';
DoubleQout  : '"';

CASE	: ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
ESAC		: ('e'|'E')('s'|'S')('a'|'A')('c'|'C');
IF    : ('i'|'I')('f'|'F');
FI		    : ('f'|'F')('i'|'I');
WHILE		: ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
THEN		: ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
ELSE		: ('e'|'E')('l'|'L')('s'|'S')('e'|'E');
LOOP		: ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL		: ('p'|'P')('o'|'O')('o'|'O')('l'|'L');
CLASS	: ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');
IN		    : ('i'|'I')('n'|'N');
INHERITS	: ('i'|'I')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
OF	   : ('o'|'O')('f'|'F');
LET	  : ('l'|'L')('e'|'E')('t'|'T');
NEW		    : ('n'|'N')('e'|'E')('w'|'W');
VOID	:('v'|'V')('o'|'O')('i'|'I')('d'|'D');
NOT	   : ('n'|'N')('o'|'O')('t'|'T');
STRING     : ('S'|'s')('T'|'t')('R'|'r')('I'|'i')('N'|'n')('G'|'g');
INT         :  ('I'|'i')('N'|'n')('T'|'t');
ID          : Letter(Letter|Digit|'_')*;
ERORR:.;