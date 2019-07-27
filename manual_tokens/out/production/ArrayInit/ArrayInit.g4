grammar ArrayInit;

array: OPENBRACKT  list '}'
	|
	OPENBRACKT '}';

list: (obj ',' list)
	|
	obj;

obj: NUM | array;
NUM : [0-9]+;
WS : [\t\n]+ ->skip;

OPENBRACKT : '{' ;