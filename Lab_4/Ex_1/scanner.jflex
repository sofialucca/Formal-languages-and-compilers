import java_cup.runtime.*;

%%

%class scanner
%unicode
%cup
%line
%column


%{
  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
	
  }
%}

nl = \r|\n|\r\n
ws = [ \t]
integer =  ([1-9][0-9]*|0)
real = (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?
number = (\+|\-)?({integer} | {real})
variable = [A-Z\_][a-zA-Z0-9\_]*
atom = [a-z][a-zA-Z0-9\_]* | {number}

%%

"("     {return symbol(sym.RO);}
")"     {return symbol(sym.RC);}
"."     {return symbol(sym.P);}
","     {return symbol(sym.C);}
":-"    {return  symbol(sym.PD);}
"?-"    {return symbol(sym.QD);}


{variable}  {return symbol(sym.VARIABLE);}
{atom}      {return symbol(sym.ATOM);}

"/*" ~ "*/"     {;}
{ws}|{nl}       {;}

