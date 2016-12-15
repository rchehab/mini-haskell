grammar Haskell;

@header {
package br.unb.poo.mh.grammar;
}

start	: expressaoOr EOF
		| declaracaoFuncao EOF
		;

expressaoOr				: expressaoOr OR expressaoOr												| expressaoAnd;
expressaoAnd			: expressaoAnd AND expressaoAnd												| expressaoNot;
expressaoNot			: NOT expressaoNot															| expressaoEqual;

expressaoEqual			: expressaoEqual EQ expressaoEqual											| expressaoLessThan;
expressaoLessThan		: expressaoLessThan LT expressaoLessThan									| expressaoGreaterThan;
expressaoGreaterThan	: expressaoGreaterThan GT expressaoGreaterThan								| expressaoLessOrEqual;
expressaoLessOrEqual	: expressaoLessOrEqual LE expressaoLessOrEqual								| expressaoGreaterOrEqual;
expressaoGreaterOrEqual	: expressaoGreaterOrEqual GE expressaoGreaterOrEqual						| expressaoSubtracao;

expressaoSubtracao		: expressaoSubtracao SUB expressaoSubtracao									| expressaoSoma;
expressaoSoma			: expressaoSoma SOM expressaoSoma											| expressaoDivisor;
expressaoDivisor		: expressaoDivisor DIV expressaoDivisor										| multiplicacao;
multiplicacao			: multiplicacao MUL multiplicacao											| ifThenElse;

ifThenElse				: IF expressaoOr THEN expressaoOr ELSE ifThenElse							| aplicacaoFuncao;

aplicacaoFuncao			: name '(' expressaoOr* ')'													| parentesis;

parentesis				: '(' expressaoOr ')'														| valorInteiro;
valorInteiro			: INT																		| valorBooleano;
valorBooleano			: BOOL																		| identificador;

name					: ID;
identificador			: ID;


declaracaoFuncao		: name+ testeGuarda;

testeGuarda				: guardaFalsa | guardas;

guardaFalsa				: '=' expressaoOr;

guardas					: guarda+;

guarda					: '|' expressaoOr '=' expressaoOr;

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