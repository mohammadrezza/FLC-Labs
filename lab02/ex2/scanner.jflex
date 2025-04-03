
%%

%{
    public int tags_cnt = 0;
%}

%eof{
    System.out.println("Total number of tags:" + tags_cnt);

%eof}

%class Calc 

nl		    =  \n|\r|\r\n
comment     = "<!--" ~ "-->"
sep         = " "
tag         = "<" ~ ">"

%%

{tag}   {tags_cnt++;}



{sep}          {}
{comment}      {}
{nl}           {}

.		{System.out.println("Error: " + yytext());}
