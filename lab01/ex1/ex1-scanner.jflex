
%%

%standalone
%class Calc

nl		=  \n|\r|\r\n
intNumber	=  [1-9][0-9]*

letter = [^0-9\\\*\!\>\|\,\"\n\r] // [^] means exclusion, pay attention to the defenition of letters

digit = [0-9]

Id = ({letter} |{digit})({letter} | {digit})*

pathFileName = ({letter}":")? (\\)? ({Id} \\ )* {Id} (\. {Id})?


%%

{pathFileName}  {System.out.println("Path: " + yytext());}


{nl}|" "|\t 	{;}

.		{System.out.println("Error: " + yytext());}


