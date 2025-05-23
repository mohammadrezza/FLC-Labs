
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
    "\000\022\000\002\002\004\000\002\002\005\000\002\003" +
    "\004\000\002\003\004\000\002\003\003\000\002\003\003" +
    "\000\002\004\004\000\002\011\007\000\002\006\005\000" +
    "\002\007\005\000\002\007\003\000\002\010\005\000\002" +
    "\010\003\000\002\012\004\000\002\014\005\000\002\014" +
    "\003\000\002\013\003\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\004\014\004\001\002\000\014\004\ufff5\007" +
    "\042\010\ufff5\011\ufff5\012\ufff5\001\002\000\006\014\004" +
    "\015\033\001\002\000\010\002\ufffc\006\ufffc\014\ufffc\001" +
    "\002\000\006\006\026\014\004\001\002\000\006\004\014" +
    "\012\015\001\002\000\004\002\013\001\002\000\010\002" +
    "\ufffd\006\ufffd\014\ufffd\001\002\000\004\002\001\001\002" +
    "\000\010\002\ufffb\006\ufffb\014\ufffb\001\002\000\004\005" +
    "\016\001\002\000\004\014\004\001\002\000\006\004\022" +
    "\011\021\001\002\000\006\004\ufff7\011\ufff7\001\002\000" +
    "\004\014\004\001\002\000\010\002\ufffa\006\ufffa\014\ufffa" +
    "\001\002\000\006\004\ufff8\011\ufff8\001\002\000\004\014" +
    "\004\001\002\000\010\002\ufffe\006\ufffe\014\ufffe\001\002" +
    "\000\004\014\004\001\002\000\010\002\uffff\006\uffff\014" +
    "\uffff\001\002\000\006\004\031\011\021\001\002\000\004" +
    "\014\ufff9\001\002\000\006\002\000\014\004\001\002\000" +
    "\006\010\ufff0\011\ufff0\001\002\000\006\010\ufff1\011\ufff1" +
    "\001\002\000\006\010\040\011\037\001\002\000\006\010" +
    "\ufff2\011\ufff2\001\002\000\006\014\004\015\033\001\002" +
    "\000\012\004\ufff6\010\ufff6\011\ufff6\012\ufff6\001\002\000" +
    "\006\010\ufff3\011\ufff3\001\002\000\006\014\ufff4\015\ufff4" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\016\002\010\003\006\004\011\010\007\011" +
    "\005\012\004\001\001\000\002\001\001\000\012\010\033" +
    "\012\004\013\035\014\034\001\001\000\002\001\001\000" +
    "\014\004\026\006\023\010\007\011\024\012\004\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\007\016\010\017\012\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\010\022\012\004\001\001\000\002" +
    "\001\001\000\002\001\001\000\014\003\031\004\011\010" +
    "\007\011\005\012\004\001\001\000\002\001\001\000\010" +
    "\007\027\010\017\012\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\004\026\010\007" +
    "\011\024\012\004\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\010\033" +
    "\012\004\013\040\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

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

    table = new HashMap <String, HashMap <String, Double>>();

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


    public HashMap <String, HashMap <String, Double>> table;

    public Object stack(int position){
        return (((Symbol)stack.elementAt(tos + position)).value);
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
          case 1: // prog ::= SECTIONS INTER SECTIONS 
            { parser.Tree.reduce(3,"prog",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // SECTIONS ::= SECTIONS FACTS 
            { parser.Tree.reduce(2,"SECTIONS",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SECTIONS",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SECTIONS ::= SECTIONS RULE 
            { parser.Tree.reduce(2,"SECTIONS",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SECTIONS",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SECTIONS ::= FACTS 
            { parser.Tree.reduce(1,"SECTIONS",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SECTIONS",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SECTIONS ::= RULE 
            { parser.Tree.reduce(1,"SECTIONS",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SECTIONS",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // FACTS ::= PREDICATE DOT 
            { parser.Tree.reduce(2,"FACTS",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTS",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // RULE ::= PREDICATE CO DASH PREDICATES DOT 
            { parser.Tree.reduce(5,"RULE",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RULE",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // INTER ::= QDASH PREDICATES DOT 
            { parser.Tree.reduce(3,"INTER",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INTER",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // PREDICATES ::= PREDICATES CM PREDICATE 
            { parser.Tree.reduce(3,"PREDICATES",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PREDICATES",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // PREDICATES ::= PREDICATE 
            { parser.Tree.reduce(1,"PREDICATES",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PREDICATES",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // PREDICATE ::= FUNCTOR ARGS CP 
            { parser.Tree.reduce(3,"PREDICATE",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PREDICATE",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // PREDICATE ::= ATOM 
            { parser.Tree.reduce(1,"PREDICATE",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PREDICATE",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // FUNCTOR ::= ATOM OP 
            { parser.Tree.reduce(2,"FUNCTOR",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FUNCTOR",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ARGS ::= ARGS CM ARG 
            { parser.Tree.reduce(3,"ARGS",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARGS",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ARGS ::= ARG 
            { parser.Tree.reduce(1,"ARGS",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARGS",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ARG ::= PREDICATE 
            { parser.Tree.reduce(1,"ARG",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARG",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ARG ::= VAR 
            { parser.Tree.reduce(1,"ARG",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARG",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
