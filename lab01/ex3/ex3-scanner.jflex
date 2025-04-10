
%%

%standalone
%class Calc

nl		=  \n|\r|\r\n
intNumber	=  [1-9][0-9]*

letter = [a-zA-Z] // [^] means exclusion, pay attention to the defenition of letters

digit = [0-9]

Id = ({letter} | {digit}) ({letter} | {digit})*

scheme = ("http"|"ftp"|"nntp"|"gopher")

domain = ({names}|{IP})

names = ({letter}+\.{letter}+\.{letter}+)  // [] this means only one caharacter 

IP = ({ipr}\.{ipr}\.{ipr}\.{ipr})

ipr = (25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9]) 

port = ([1-5]?[0-9]{1,4}) // port from 0 to 59999

hexNumber = ([0-9] | 1[1-6])

url = ({scheme}"://"{domain} (":"{port})?  ("/"?  ("%"({hexNumber})+)? {Id} (\. {Id})? "/"?)*  ("#"({Id})+)? ) 


%%

{url}  {System.out.println("URL: " + yytext());}


{nl}|" "|\t 	{;}

.		{System.out.println("Error: " + yytext());}


