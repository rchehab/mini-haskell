grammar Haskell;

@header {
	package br.unb.poo.mh.grammar;
	import br.unb.poo.mh;
}

start	: expression EOF #Start
		;

expressao		: expressaoBinaria								#ExpressaoBinaria
				| func param '=' expressao						#DeclaracaoFuncao //Declaracao de funcao nao eh exatamente expresssao, mudar isso
				| func listExpressao							#AplicacaoFuncao
				| NOT expressao									#Not
				| IF expressao THEN expressao ELSE expressao	#IfThenElse
				| INT											#Inteiro
				| BOOL											#Booleano
				| ID											#Identificador
				;
expressaoBinaria: expressao LE expressao						#LessOrEqual
				| expressao GE expressao						#GreaterOrEqual
				| expressao LT expressao						#LessThan
				| expressao GT expressao						#GreaterThan
				| expressao OR expressao						#Or
				| expressao AND expressao						#And
				| expressao DIV expressao						#Divisor
				| expressao SUB expressao						#Subtracao
				| expressao MUL expressao						#Multiplicacao
				| expressao SOM expressao						#Soma
				| expressao EQ expressao						#Equal
				;


LE: '<=';
GE: '>=';
LT: '<';
GT: '>';
EQ: '==';
IF: 'if';
THEN: 'then;
ELSE: 'else';
NOT: 'not' | 'NOT';
OR: 'or | 'OR';
AND: 'and' | 'AND';
DIV: '/';
SUB: '-';
MUL: '*';
SOM: '+';

INT: [0-9]+;
BOOL: 'true | 'TRUE' | 'false | 'FALSE';
ID: ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9])*;