grammar Haskell;

@header {
//package br.unb.poo.mh.grammar;
}

start	: expressao EOF
		| declaracao EOF
		;

declaracao	: funcname=ID (param+=ID)* '=' expressao	#DeclaracaoFuncao
			;

expressao		: IF expressao THEN expressao ELSE expressao	#IfThenElse

				| expressao EQ expressao						#Equal
				| expressao LE expressao						#LessOrEqual
				| expressao GE expressao						#GreaterOrEqual
				| expressao LT expressao						#LessThan
				| expressao GT expressao						#GreaterThan

				| expressao MUL expressao						#Multiplicacao
				| expressao DIV expressao						#Divisor
				| expressao SOM expressao						#Soma
				| expressao SUB expressao						#Subtracao

				| expressao AND expressao						#And
				| expressao OR expressao						#Or
				| NOT expressao									#Not

				| funcname=ID (expressao)*						#AplicacaoFuncao

				| '(' expressao ')'								#Parentesis

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