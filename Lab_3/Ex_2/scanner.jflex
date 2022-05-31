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
number = [0-9]
twoDigits = {number}{2}
n_digits = {number}+
exadecimal = [0-9A-F]{5}
isbn = {twoDigits}\-{twoDigits}\-{exadecimal}\-({number}|[A-Z])

days30 = 0[1-9]|(1|2)[0-9]|30
month31 = ({days30}|31)\/(01|03|05|08|07|10|12)
febr28 = (0[1-9]|1[0-9]|2[0-8])\/02

month30 = ({days30})\/(04|06|09|11)
year = (19[0-9]{2})|(20(0|1)[0-9]|202(0|1))
date = ({month31}|{febr28}|{month30})\/{year}
dateBis = 29\/02\/(19(((0|2|4|6|8)(0|4|8))|((1|3|5|7|9)|(2|6)))|20((0(0|4|8))|1(2|6)))

string = {letter}[a-zA-Z\ \,\.\:]*
letter = [A-Z]
genre = (AV|BO|SO)
littType = (LI|LS)
invalid = LI\ BO
stringQm = \"{string}\"


%%

"%%"    {return symbol(sym.SEP);}
;     {return symbol(sym.SC);}
:     {return symbol(sym.COL);}
","     {return symbol(sym.C);}
"->"    {return symbol(sym.ARR);}
{invalid}   {System.out.println("Invalid genre and litterature type combination: LI BO");}
{genre}     {return symbol(sym.GEN);}
{littType}  {return symbol(sym.LITT);}
{letter}    {return symbol(sym.LETT);}

{stringQm}  {return symbol(sym.STRING);}
{date}|{dateBis}    {return symbol(sym.DATE);}

{isbn}  {return symbol(sym.ISBN);}

{n_digits}  {return symbol(sym.NUM);}


{ws}|{nl}       {;}

. {System.out.println("SCANNER ERROR: "+yytext());}
