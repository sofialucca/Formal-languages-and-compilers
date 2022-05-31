%%

%standalone
%class Ex_1

commentMoreLines = \/\*[^(\*\/)]*\*\/
library = [a-z0-9]+\.h
include = \#include\ {library}
variable = [a-zA-Z0-9\_]+
integer = 0|([\+\-]?[1-9][0-9]*)
double = {integer}\.[0-9]{1,2}

commentOneLine = \/\/[^(\/\*)]*{nl}
comment = {commentMoreLines}|{commentOneLine}
not = \!{variable}
nl		=  \n|\r|\r\n


%%
{comment} {;}

"[" {System.out.print("SO ");}

"]" {System.out.print("SC ");}

"(" {System.out.print("RO ");}

")" {System.out.print("RC ");}

"{" {System.out.print("BO ");}

"}" {System.out.print("BC ");}

"+" {System.out.print("PLUS ");}

"-" {System.out.print("MINUS ");}

"*" {System.out.print("MUL ");}

"/" {System.out.print("DIV ");}

"=" {System.out.print("EQ ");}

";" {System.out.print("S ");}

"," {System.out.print("C ");}

"<" {System.out.print("MIN ");}

">" {System.out.print("MAJ ");}

"&" {System.out.print("POINT ");}

"&&" {System.out.print("AND ");}

"||" {System.out.print("OR ");}

{not} {System.out.print("NOT ");}

"!=" {System.out.print("NEQ ");}

"int" {System.out.print("INT_TYPE ");}

"double" {System.out.print("DOUBLE_TYPE ");}

"if" {System.out.print("IF ");}

"else" {System.out.print("ELSE ");}

"while" {System.out.print("WHILE ");}

"print" {System.out.print("PRINT ");}

{integer} {System.out.print("INT:" + yytext() + " ");}

{double} {System.out.print("DOUBLE:" + yytext() + " ");}

{variable} {System.out.print("ID:" + yytext() + " ");}

{nl}|" "|\t|{include} 	{;}

.		{System.out.print("Error: " + yytext());}