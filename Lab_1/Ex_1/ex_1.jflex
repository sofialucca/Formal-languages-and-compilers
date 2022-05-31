
%%

%standalone
%class ex_1

letter = [^\\\/\:\*\?\"\-\>\|\n\r\t\ ]
id = ({letter}|[0-9])({letter}|[0-9])*
fileType = {id}
pathName = {id}
fileName = {id}
drive = {letter}
pathFileName = ({drive}\:)?(\\)?({pathName}\\)*{fileName}(\.{fileType})?
nl		=  \n|\r|\r\n

%%

{pathFileName}	{System.out.println("Path: " +yytext());}

{nl}|" "|\t 	{;}

.		{System.out.println("Error: " + yytext());}

