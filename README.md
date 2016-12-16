# mini-haskell

Rafael Lourenço de Lima Chehab 15/0045123

Raphael Soares                 14/0160299

Felipe Franco                  15/0125071

Jean Pierre Sissé              09/0139879


A main está na classe ProgramaPrincipal no package br.unb.poo.mh em src/

Após iniciada a execução deve-se sair escrevendo "quit"

Para abrir um arquivo a.txt escreva load(a.txt), **sem aspas**.
Esse arquivo deve conter somente uma funcao

Imprima set para ativar a verificacao de tipos

Imprima reset para desativar a verificacao de tipo

**Aviso**: *Se for utilizada uma função recursiva a verificacao de tipos deve estar desativada, 
caso contrario pode ocorrer um problema de execucao



Para avaliar uma expressão, basta escrevê-la, exemplo:

Haskell> 1 + 2

:: Inteiro

3

Haskell>


Ao usar uma aplicação de funçao deve-se colocar parentesis ao redor dos parâmetros,
porém dentro dos parentêsis não é necessário nenhum separador. Exemplo:

Haskell> soma a b = a + b

:: Inteiro

Haskell> soma (1 2)

:: Inteiro

3

O mini haskell utilizado possui as seguintes funcionalidades:
subtracao,
parentesis,
multiplicacao,
*lista*, 
ifthenelse,
concatenar,
*guarda e guardas*,
soma,
or,
not,
and,
lessthan,
lessorequal,
greaterthan,
greaterorequal,
equal,
divisor,
*declaracaofuncao*,
*aplicacaofuncao*.

A prioridade entre as expressoes é, da primeira a ser executada
até a menor:

identificador;
lista;
valorBooleano;
valorInteiro;
parentesis;
aplicacaoFuncao;
ifThenElse;
concatenar;
multiplicacao;
expressaoDivisor;
expressaoSoma;
expressaoSubtracao;
expressaoGreaterOrEqual;
expressaoLessOrEqual;
expressaoGreaterThan;
expressaoLessThan;
expressaoEqual;
expressaoNot;
expressaoAnd;
expressaoOr.


Na pasta examples/, há um exemplo para cada expressao, como também um arquivo com a descricao de uso.
Como por example subtraco.hs e subtracao_desc.txt

Para fazer o Parser do texto utilizou-se ANTLR, a gramática e classe dele estão no packet
br.unb.poo.mh.grammar.
A versão utilizada é 4.5.3,
e a instalação foi feito seguindo o manual de https://github.com/antlr/antlr4/blob/master/doc/getting-started.md
