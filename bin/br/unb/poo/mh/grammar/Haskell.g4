grammar Haskell;

@header {
package br.unb.poo.mh.grammar;
}

start	: expressao EOF
		| declaracao EOF
		;

declaracao	: funcname=ID (param+=ID)* '=' expressao	#DeclaracaoFuncao
			;

expressao		: IF expressao THEN expressao ELSE expressao	#IfThenElse
				| funcname=ID (expressao)*								#AplicacaoFuncao
				| NOT expressao									#Not
				| expressao LE expressao						#LessOrEqual
				| expressao GE expressao						#GreaterOrEqual
				| expressao LT expressao						#LessThan
				| expressao GT expressao						#GreaterThan
				| expressao AND expressao						#And
				| expressao OR expressao						#Or
				| expressao DIV expressao						#Divisor
				| expressao SUB expressao						#Subtracao
				| expressao MUL expressao						#Multiplicacao
				| expressao SOM expressao						#Soma
				| expressao EQ expressao						#Equal
				| INT											#Inteiro
				| BOOL											#Booleano
				| ID											#Identificador
				;

WS : [ \r\t\n]+ -> skip;

LE: '<=';
GE: '>=';
LT: '<';
GT: '>';
EQ: '==';
IF: 'if';
THEN: 'then';
ELSE: 'else';
NOT: 'not' | 'NOT';
OR: 'or' | 'OR';
AND: 'and' | 'AND';
DIV: '/';
SUB: '-';
MUL: '*';
SOM: '+';

INT: [0-9]+;
BOOL: 'true' | 'TRUE' | 'false' | 'FALSE';
ID: ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9])*; //Melhorar para poder mais tipos de identificadores