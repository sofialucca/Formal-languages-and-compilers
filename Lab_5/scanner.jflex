import java_cup.runtime.*;
import java.io.*;
%%

%unicode
%cup
%line
%column

realScalar = (([0-9]+(\.[0-9]*)?) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?
scalarId = [a-z]
vectorId = [A-Z]    
nl = \n|\r|\n\r

%%

"+"     {return new Symbol(sym.PLUS, yyline, yycolumn);}
"-"     {return new Symbol(sym.MINUS, yyline, yycolumn);}
"*"     {return new Symbol(sym.MUL, yyline, yycolumn);}
"/"     {return new Symbol(sym.DIV, yyline, yycolumn);}
"^"     {return new Symbol(sym.POW, yyline, yycolumn);}
"."     {return new Symbol(sym.SCALARPROD, yyline, yycolumn);}
";"     {return new Symbol(sym.S, yyline, yycolumn);}
","     {return new Symbol(sym.C, yyline, yycolumn);}
"="     {return new Symbol(sym.EQ, yyline, yycolumn);}
"["     {return new Symbol(sym.SO, yyline, yycolumn);}
"]"     {return new Symbol(sym.SC, yyline, yycolumn);}
"("     {return new Symbol(sym.RO, yyline, yycolumn);}
")"     {return new Symbol(sym.RC, yyline, yycolumn);}
"?"     {return new Symbol(sym.QM, yyline, yycolumn);}

{realScalar}    {return new Symbol(sym.NUM, yyline, yycolumn, new Float(yytext()));}
{scalarId}  {return new Symbol(sym.SCALARID, yyline, yycolumn, new String(yytext()));}
{vectorId}  {return new Symbol(sym.VECTORID, yyline, yycolumn, new String(yytext()));}
"/*" ~ "*/"       { ; }

{nl}|" "|\t       { ; } 

.       {;}