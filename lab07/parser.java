
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\002\005\000\002\003" +
    "\004\000\002\003\003\000\002\004\010\000\002\007\003" +
    "\000\002\010\005\000\002\010\003\000\002\012\005\000" +
    "\002\005\004\000\002\005\003\000\002\016\002\000\002" +
    "\006\011\000\002\015\005\000\002\015\003\000\002\013" +
    "\004\000\002\014\003\000\002\014\003\000\002\014\003" +
    "\000\002\014\003\000\002\011\004\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\051\000\004\010\004\001\002\000\004\017\041\001" +
    "\002\000\004\021\012\001\002\000\006\010\004\021\ufffe" +
    "\001\002\000\004\002\010\001\002\000\004\002\001\001" +
    "\002\000\004\021\uffff\001\002\000\004\017\013\001\002" +
    "\000\004\014\017\001\002\000\004\002\000\001\002\000" +
    "\006\002\ufff7\017\013\001\002\000\004\002\ufff8\001\002" +
    "\000\012\004\021\005\023\007\024\013\022\001\002\000" +
    "\004\017\037\001\002\000\004\017\ufff1\001\002\000\004" +
    "\017\uffee\001\002\000\004\017\uffef\001\002\000\004\017" +
    "\ufff0\001\002\000\006\006\027\015\030\001\002\000\006" +
    "\006\ufff3\015\ufff3\001\002\000\004\017\032\001\002\000" +
    "\012\004\021\005\023\007\024\013\022\001\002\000\006" +
    "\006\ufff4\015\ufff4\001\002\000\006\016\uffec\017\032\001" +
    "\002\000\004\016\ufff6\001\002\000\004\016\035\001\002" +
    "\000\006\002\ufff5\017\ufff5\001\002\000\004\016\uffed\001" +
    "\002\000\006\006\ufff2\015\ufff2\001\002\000\006\011\ufffa" +
    "\015\ufffa\001\002\000\004\014\052\001\002\000\004\011" +
    "\046\001\002\000\006\011\ufffc\015\044\001\002\000\004" +
    "\017\041\001\002\000\006\011\ufffb\015\ufffb\001\002\000" +
    "\004\005\047\001\002\000\004\012\050\001\002\000\004" +
    "\017\051\001\002\000\006\010\ufffd\021\ufffd\001\002\000" +
    "\004\020\053\001\002\000\006\011\ufff9\015\ufff9\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\051\000\010\002\006\003\004\004\005\001\001\000" +
    "\010\007\041\010\042\012\037\001\001\000\002\001\001" +
    "\000\006\003\010\004\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\013\006\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\005" +
    "\015\006\014\001\001\000\002\001\001\000\010\013\025" +
    "\014\017\015\024\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\011\032\001" +
    "\001\000\006\013\030\014\017\001\001\000\002\001\001" +
    "\000\004\011\035\001\001\000\004\016\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\044\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    table = new HashMap <String, HashMap <String, Integer>>();

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


    public HashMap <String, HashMap <String, Integer>> table;

    public Object stack(int position){
        return (((Symbol)stack.elementAt(tos + position)).value);
    }

    public void printStatck(){
        System.out.println("---Stack---");
        for(int position=0; position<6; position++){
            Object obj = (((Symbol)stack.elementAt(tos + -position)).value);
            System.out.println("Element: " + obj + " At position: " + -position );
        }
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            { 
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= types SEP descs 
            { parser.Tree.reduce(3,"prog",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // types ::= type types 
            { parser.Tree.reduce(2,"types",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("types",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // types ::= type 
            { parser.Tree.reduce(1,"types",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("types",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // type ::= OP attr_list CP DASH GT VAR 
            { parser.Tree.reduce(6,"type",0);
              Object RESULT =null;
		int attr_listleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int attr_listright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		HashMap attr_list = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int prod_nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int prod_nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String prod_name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    parser.table.put(prod_name, attr_list);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // attr_list ::= attrs 
            { parser.Tree.reduce(1,"attr_list",0);
              HashMap RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		HashMap x = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
RESULT = x;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("attr_list",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // attrs ::= attrs CM attr 
            { parser.Tree.reduce(3,"attrs",0);
              HashMap RESULT =null;
		int attrsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int attrsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		HashMap attrs = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int attrleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int attrright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object[] attr = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    attrs.put(attr[0], attr[1]);
    RESULT = attrs;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("attrs",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // attrs ::= attr 
            { parser.Tree.reduce(1,"attrs",0);
              HashMap RESULT =null;
		int attrleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int attrright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object[] attr = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    RESULT = new HashMap<String,Integer>();
    RESULT.put(attr[0], attr[1]);
 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attrs",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // attr ::= VAR CO INUM 
            { parser.Tree.reduce(3,"attr",0);
              Object[] RESULT =null;
		int attr_nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int attr_nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String attr_name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int attr_weightleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int attr_weightright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer attr_weight = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    RESULT = new Object[2];
    RESULT[0] = new String(attr_name);
    RESULT[1] = new Integer(attr_weight);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("attr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // descs ::= desc descs 
            { parser.Tree.reduce(2,"descs",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("descs",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // descs ::= desc 
            { parser.Tree.reduce(1,"descs",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("descs",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NT$0 ::= 
            { parser.Tree.reduce(0,"NT$0",0);
              Object RESULT =null;
		int prod_nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int prod_nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String prod_name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int scoreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int scoreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer score = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sentenceleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sentenceright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String sentence = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;


    System.out.println(sentence + ", " + score);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // desc ::= VAR CO vals EQ sentence NT$0 SC 
            { parser.Tree.reduce(7,"desc",0);
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int prod_nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int prod_nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		String prod_name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int scoreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int scoreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Integer score = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sentenceleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sentenceright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String sentence = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("desc",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // vals ::= vals CM val 
            { parser.Tree.reduce(3,"vals",0);
              Integer RESULT =null;
		int valsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int valsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer vals = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object[] val = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    String prod_name = (String)parser.stack(-4);
    Integer sym = (Integer)val[0];
    String attr = (String)val[1];
    HashMap<String,Integer> typeWeight = parser.table.get(prod_name);
    Integer v = typeWeight.get(attr);
    Integer score = v * sym;
    RESULT = score + vals;
    

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vals",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // vals ::= val 
            { parser.Tree.reduce(1,"vals",0);
              Integer RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object[] val = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    String prod_name = (String)parser.stack(-4);
    Integer sym = (Integer)val[0];
    String attr = (String)val[1];
    HashMap<String,Integer> typeWeight = parser.table.get(prod_name);
    Integer v = typeWeight.get(attr);
    Integer score = v * sym;
    RESULT = score;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vals",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // val ::= symbl VAR 
            { parser.Tree.reduce(2,"val",0);
              Object[] RESULT =null;
		int symblleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int symblright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer symbl = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    RESULT = new Object[2];
    RESULT[0] = new Integer(symbl);
    RESULT[1] = new String(var);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("val",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // symbl ::= STAR 
            { parser.Tree.reduce(1,"symbl",0);
              Integer RESULT =null;
		
 RESULT = 3;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("symbl",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // symbl ::= PLUS 
            { parser.Tree.reduce(1,"symbl",0);
              Integer RESULT =null;
		
 RESULT = 2;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("symbl",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // symbl ::= DASH 
            { parser.Tree.reduce(1,"symbl",0);
              Integer RESULT =null;
		
 RESULT = 0;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("symbl",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // symbl ::= SL 
            { parser.Tree.reduce(1,"symbl",0);
              Integer RESULT =null;
		
 RESULT = 1;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("symbl",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // sentence ::= VAR sentence 
            { parser.Tree.reduce(2,"sentence",0);
              String RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sentenceleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sentenceright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String sentence = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
RESULT = var + " " +  sentence;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentence",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // sentence ::= VAR 
            { parser.Tree.reduce(1,"sentence",0);
              String RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
RESULT = var; 

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentence",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
