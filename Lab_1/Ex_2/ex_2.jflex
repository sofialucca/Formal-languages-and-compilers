
%%

%standalone
%class Ex_2

letter = [^\\\/\:\*\?\"\-\>\|\n\r\t\ ]
id = ({letter}|[0-9])({letter}|[0-9])*
fileType = {id}
fileName = ({letter}|[0-9]|{escape})+
pathName = {fileName}

scheme = gopher|(f|ht|nn)tp
name = (www\.)?{id}\.{id}
maxIp = (1[0-9]{2})|(2([0-4][0-9]|5[0-5]))|[1-9]
ipAddress = {maxIp}\.{maxIp}\.{maxIp}\.{maxIp}
domain = {name}|{ipAddress}
escape = \%[0-9][A-F]


address = {scheme}\:\/\/{domain}(\:[0-9]+)?(\/{pathName})*(\/{fileName}(\/|\.({fileType}|html\#{letter}+)))?

nl		=  \n|\r|\r\n

%%

{address}	{System.out.println("Address: " +yytext());}

{nl}|" "|\t 	{;}

.		{System.out.println("Error: " + yytext());}

