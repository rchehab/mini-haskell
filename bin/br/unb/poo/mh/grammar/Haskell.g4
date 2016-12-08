grammar Haskell;

@header {
package br.unb.poo.mh.grammar;
}

start	: expressaoNot EOF
		| declaracaoFuncao EOF
		;

declaracaoFuncao	: funcname=ID (param+=ID)* '=' expressaoNot;


expressaoNot			: NOT expressaoNot															| expressaoOr;
expressaoOr				: expressaoOr OR expressaoOr												| expressaoAnd;
expressaoAnd			: expressaoAnd AND expressaoAnd												| expressaoEqual;

expressaoEqual			: expressaoEqual EQ expressaoEqual											| expressaoLessThan;
expressaoLessThan		: expressaoLessThan LT expressaoLessThan									| expressaoGreaterThan;
expressaoGreaterThan	: expressaoGreaterThan GT expressaoGreaterThan								| expressaoLessOrEqual;
expressaoLessOrEqual	: expressaoLessOrEqual LE expressaoLessOrEqual								| expressaoGreaterOrEqual;
expressaoGreaterOrEqual	: expressaoGreaterOrEqual GE expressaoGreaterOrEqual						| expressaoSubtracao;

expressaoSubtracao		: expressaoSubtracao SUB expressaoSubtracao									| expressaoSoma;
expressaoSoma			: expressaoSoma SOM expressaoSoma											| expressaoDivisor;
expressaoDivisor		: expressaoDivisor DIV expressaoDivisor										| expressaoMultiplicacao;
expressaoMultiplicacao	: expressaoMultiplicacao MUL expressaoMultiplicacao							| expressaoIfThenElse;

expressaoIfThenElse		: IF expressaoNot THEN expressaoNot ELSE expressaoIfThenElse				| aplicacoDeFuncao;

aplicacoDeFuncao		: funcname=ID '(' expressaoNot* ')'											| parentesis;

parentesis				: '(' expressaoNot ')'														| valorInteiro;
valorInteiro			: INT																		| valorBooleano;
valorBooleano			: BOOL																		| identificador;
identificador			: ID;

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