%%

%caseless
%standalone
%xstate comment
%xstate init_tag
%xstate within_tag
%xstate closing_tag
%xstate end_of_file
%state end_of_file
%class Ex_2

%{
    int tags = 0;
    int table = 0;
    int h1 = 0;
    int h2 = 0;
    int h3 = 0;
    int h4 = 0;
    String currentState = "no state";
    
%}


 
keywordFormat = [a-zA-Z][a-zA-Z0-9]*
attributeValue = [0-9]+|(\"[^\"]+\" | \'[^\"\']+\')
attribute = (\ )+{keywordFormat}((\ )*\=(\ )*{attributeValue})?
closingComment = --\>{nl}*
closingKeyword = {keywordFormat}(\ )*\>


nl		=  \n|\r|\r\n



%%
<init_tag>  {

    "html"  {
        if(currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            currentState = "YYINITIAL";
            yybegin(within_tag);
            
        }else{
            System.out.println("Can't have HTML initial tag in the middle of the code");
        }
    }

    "h1"    {
        if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            h1++;
            currentState = "within_tag";
            yybegin(within_tag);

        }else{
            System.out.println("First tag must be HTML");
        }
    }
    "h2"    {
        if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            h2++;
            currentState = "within_tag";            
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }

    }
    "h3"    {
        if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            h3++;
            currentState = "within_tag";
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }

    }
    "h4"    {
        if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            h4++;
            currentState = "within_tag";
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }        
        
    }
    "table" {
        if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            table++;

            currentState = "within_tag";
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }

    }
    {keywordFormat} {
        if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            currentState = "within_tag";
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }

    }
    
    .		{System.out.println("Error: " + yytext() + " invalid tag name");}
}

<within_tag>    {
    ">" {
        System.out.print(yytext());
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
    }

    {attribute} {
        System.out.print(yytext());

    }

}

<closing_tag>   {

    "h1>"    {
        System.out.print(yytext());
        tags++;
        h1++;
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
    }
    "h2>"    {
        System.out.print(yytext());
        tags++;
        h2++;
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
    }
    "h3>"    {
        System.out.print(yytext());
        tags++;
        h3++;
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
    }
    "h4>"    {
        System.out.print(yytext());
        tags++;
        h4++;
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
    }
    "table>" {
        System.out.print(yytext());
        tags++;
        table++;

        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
    }
    "html>" {
        System.out.print(yytext());
        tags++;
        currentState = "end_of_file";
        yybegin(end_of_file);        
    }
    {closingKeyword} {
        tags++;
        System.out.print(yytext());
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);        
    }

    .		{System.out.println("Error: " + yytext() + " invalid tag name");}

}
<end_of_file>   {
     "<!--"    {yybegin(comment);}
     .  {System.out.print("Error: after closing HTML tag only comments are allowed");}     
}

<comment>   {
    {closingComment}   {
        if(currentState.equals("end_of_file")){
            yybegin(end_of_file);
        }else{
            yybegin(YYINITIAL);  
        }
        
    }
    .   {;}
} 

"<!--"    {yybegin(comment);}    



"</" {
        System.out.print(yytext());
        yybegin(closing_tag);       
}
"<" {
        System.out.print(yytext());
        yybegin(init_tag);    
    }
.		{System.out.print( yytext());}

<<EOF>>  {
            System.out.println("\n\nTotal number of tags: " + tags);
            System.out.println("Total number of table tags: " + table);
            System.out.println("Total number of table tags: " + h1);
            System.out.println("Total number of table tags: " + h2);
            System.out.println("Total number of table tags: " + h3);
            System.out.println("Total number of table tags: " + h4);
            return YYEOF;
        }   
