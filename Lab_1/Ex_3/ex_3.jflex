
%%

%standalone
%class Ex_3

variable = [a-zA_Z0-9\_]+
include = \#include\ \<[a-z]+\.[a-z]\>
define = \#define\ {variable}\ [0-9]+
intro = {include}|{define}
commentMoreLines = \/\*[^(\/\*)]*\*\/
commentOneLine = \/\/[^(\/\*)]*{nl}
keywords = if|long|double|char\[\]|else|return|int|while|struct|
integer = 0|[\+\-]?[1-9][0-9]*
double = {integer}\.[0-9]{1,2}
num = {integer}|{double}
comment = {commentMoreLines}|{commentOneLine}
nl		=  \n|\r|\r\n


%%
{intro} {
    System.out.println("<FONT COLOR=\"#00FF00\">"+ yytext() +"</FONT>");
}
{keywords} {
    System.out.println("<FONT COLOR=\"#0000FF\">"+yytext()+"</FONT>");
}
{num} {
    System.out.println("<FONT COLOR=\"#FF0000\">" + yytext()+ "</FONT>");
}
{comment} {
    System.out.println("<FONT COLOR=\"#C0C0C0\">" + yytext()+ "</FONT>")
}
{nl} {
    System.out.println("<BR>");
}

.		{System.out.print(yytext());}

