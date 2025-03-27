
%%

%standalone
%class Calc

nl		    =  \n|\r|\r\n
comment     = "/*" ~ "*/"

int_type         = "int"
double_type      = "double"
if               = "if"
else             = "else"
while            = "while"
print            = "print"

SO          = "["
SC          = "]"
S           = ";"
C           = ","
EQ          = "="
MINUS       = "-"
PLUS        = "+"
RO          = "("
RC          = ")"
BO          = "{"
BC          = "}"
MAJ         = ">"
MIN         = "<"

integer     = [0-9]
double      = [0-9]"."[0-9]
id          = [A-Za-z_][A-Za-z0-9_]*

sep        = " "

%%


{int_type}     {System.out.println("INT_TYPE");} 
{double_type}  {System.out.println("DOUBLE_TYPE");} 
{if}           {System.out.println("IF");} 
{else}         {System.out.println("ELSE");} 
{while}        {System.out.println("WHILE");} 
{print}        {System.out.println("PRINT");} 

{SO}           {System.out.println("SO");} 
{SC}           {System.out.println("SC");} 
{S}            {System.out.println("S");}
{C}            {System.out.println("C");}
{EQ}           {System.out.println("EQ");}
{MINUS}        {System.out.println("MINUS");}
{PLUS}         {System.out.println("PLUS");}
{RO}           {System.out.println("RO");}
{RC}           {System.out.println("RC");}
{BO}           {System.out.println("BO");}
{BC}           {System.out.println("BC");}
{MAJ}          {System.out.println("MAJ");}
{MIN}          {System.out.println("MIN");}


{integer}      {System.out.println("INT:"+  yytext());}
{double}       {System.out.println("DOUBLE:"+  yytext());}
{id}           {System.out.println("ID:"+  yytext());}

{sep}          {}
{comment}      {}
{nl}           {}

.		{System.out.println("Error: " + yytext());}

