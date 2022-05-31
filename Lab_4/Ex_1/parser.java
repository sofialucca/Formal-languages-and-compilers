
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
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
    "\000\025\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\004\000\002\004\006\000\002\004\006" +
    "\000\002\006\005\000\002\006\005\000\002\005\003\000" +
    "\002\005\005\000\002\007\003\000\002\007\003\000\002" +
    "\010\003\000\002\010\005\000\002\011\006\000\002\011" +
    "\003\000\002\012\003\000\002\012\003\000\002\012\003" +
    "\000\002\013\002\000\002\013\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\012\002\uffee\003\uffee\011\uffee\013\uffee\001" +
    "\002\000\004\002\045\001\002\000\012\002\000\003\011" +
    "\011\013\013\007\001\002\000\006\007\042\010\041\001" +
    "\002\000\014\004\031\005\ufff2\006\ufff2\007\ufff2\010\ufff2" +
    "\001\002\000\012\002\uffef\003\uffef\011\uffef\013\uffef\001" +
    "\002\000\006\007\026\010\025\001\002\000\012\002\uffed" +
    "\003\uffed\011\uffed\013\uffed\001\002\000\006\003\020\013" +
    "\007\001\002\000\012\002\ufff1\003\ufff1\011\ufff1\013\ufff1" +
    "\001\002\000\012\002\ufff0\003\ufff0\011\ufff0\013\ufff0\001" +
    "\002\000\006\006\ufff9\007\ufff9\001\002\000\006\006\023" +
    "\007\022\001\002\000\004\007\021\001\002\000\012\002" +
    "\ufffa\003\ufffa\011\ufffa\013\ufffa\001\002\000\012\002\ufffb" +
    "\003\ufffb\011\ufffb\013\ufffb\001\002\000\004\013\007\001" +
    "\002\000\006\006\ufff8\007\ufff8\001\002\000\004\013\007" +
    "\001\002\000\012\002\ufffe\003\ufffe\011\ufffe\013\ufffe\001" +
    "\002\000\006\006\023\007\030\001\002\000\012\002\ufffc" +
    "\003\ufffc\011\ufffc\013\ufffc\001\002\000\006\012\035\013" +
    "\007\001\002\000\006\005\ufff7\006\ufff7\001\002\000\006" +
    "\005\ufff5\006\ufff5\001\002\000\006\005\036\006\037\001" +
    "\002\000\006\005\ufff6\006\ufff6\001\002\000\012\005\ufff3" +
    "\006\ufff3\007\ufff3\010\ufff3\001\002\000\006\012\035\013" +
    "\007\001\002\000\006\005\ufff4\006\ufff4\001\002\000\004" +
    "\013\007\001\002\000\012\002\uffff\003\uffff\011\uffff\013" +
    "\uffff\001\002\000\006\006\023\007\044\001\002\000\012" +
    "\002\ufffd\003\ufffd\011\ufffd\013\ufffd\001\002\000\004\002" +
    "\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\006\002\003\013\004\001\001\000\002\001" +
    "\001\000\014\003\007\004\014\006\013\011\005\012\011" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\005\016" +
    "\011\015\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\011\023\001\001\000" +
    "\002\001\001\000\006\005\026\011\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\007" +
    "\032\010\033\011\031\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\007\037\011\031\001\001\000\002\001\001" +
    "\000\006\005\042\011\015\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

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
 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


    public static int facts = 0;
    public static int interr = 0;
    public static int errors = 0;
    /* To run the program type: java parser test.txt */
    public static void main(String argv[]){
	try {
        /* Scanner instantiation */
        scanner l = new scanner(new FileReader(argv[0]));
        /* Parser instantiation */
        parser p = new parser(l);
        /* Run the parser */
        Object result = p.parse().value;      
      } catch (NullPointerException e){
              System.err.println("Syntax error, null pointer");
      } catch (FileNotFoundException e){
              System.err.println("Errore opening file " + argv[0]);
      } catch (Exception e){
              e.printStackTrace();
      }
    }

    public void report_error(String message, Object info) {
        System.err.print("ERROR: Syntax error");
        if (info instanceof Symbol)
            if (((Symbol)info).left != -1){
                int line = (((Symbol)info).left)+1;
                int column = (((Symbol)info).right)+1;
                System.err.print(" (linea "+line+", colonna "+column+"): "+message);
            } else System.err.print(": "+message);
        else System.err.print(": "+message);
    }

    public void syntax_error(Symbol cur_token){}

    // Return actual symbol
    /* It returns the object of type Symbol in the top of the parser stack.
    */
    public Symbol getToken() {
        return ((Symbol)stack.elementAt(tos));
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
          case 0: // $START ::= logic EOF 
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
          case 1: // logic ::= listElements 
            { parser.Tree.reduce(1,"logic",0);
              Object RESULT =null;
		
    if(parser.facts == 0 || parser.errors == 1){
        return null;
        //System.out.println("Failure termination: File not correct\n");
    }else
        System.out.println("Correct grammar\n");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("logic",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // fact ::= predicate P 
            { parser.Tree.reduce(2,"fact",1);
              Object RESULT =null;
		parser.facts = 1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("fact",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // fact ::= error P 
            { parser.Tree.reduce(2,"fact",1);
              Object RESULT =null;
		
    parser.errors = 1;
    parser.report_error("Error in fact\n", parser.getToken());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("fact",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // rule ::= predicate PD predicatesList P 
            { parser.Tree.reduce(4,"rule",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("rule",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // rule ::= error PD predicatesList P 
            { parser.Tree.reduce(4,"rule",0);
              Object RESULT =null;
		
        parser.errors = 1;
        parser.report_error("Error in rule\n", parser.getToken());
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("rule",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // interrogation ::= QD predicatesList P 
            { parser.Tree.reduce(3,"interrogation",0);
              Object RESULT =null;
		if(interr == 1){
        System.err.println("You must have only one interrogation");
        parser.report_error("Error in interrogation\n", parser.getToken());
        parser.errors = 1;
    }else{
        interr++;
    }
              CUP$parser$result = parser.getSymbolFactory().newSymbol("interrogation",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // interrogation ::= QD error P 
            { parser.Tree.reduce(3,"interrogation",0);
              Object RESULT =null;
		
        parser.errors = 1;
        parser.report_error("Error in interrogation\n", parser.getToken());
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("interrogation",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // predicatesList ::= predicate 
            { parser.Tree.reduce(1,"predicatesList",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("predicatesList",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // predicatesList ::= predicatesList C predicate 
            { parser.Tree.reduce(3,"predicatesList",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("predicatesList",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // argument ::= predicate 
            { parser.Tree.reduce(1,"argument",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argument",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // argument ::= VARIABLE 
            { parser.Tree.reduce(1,"argument",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argument",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // argumentsList ::= argument 
            { parser.Tree.reduce(1,"argumentsList",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumentsList",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // argumentsList ::= argumentsList C argument 
            { parser.Tree.reduce(3,"argumentsList",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumentsList",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // predicate ::= ATOM RO argumentsList RC 
            { parser.Tree.reduce(4,"predicate",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("predicate",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // predicate ::= ATOM 
            { parser.Tree.reduce(1,"predicate",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("predicate",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // elementsFile ::= interrogation 
            { parser.Tree.reduce(1,"elementsFile",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementsFile",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // elementsFile ::= rule 
            { parser.Tree.reduce(1,"elementsFile",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementsFile",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // elementsFile ::= fact 
            { parser.Tree.reduce(1,"elementsFile",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementsFile",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // listElements ::= 
            { parser.Tree.reduce(0,"listElements",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listElements",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // listElements ::= listElements elementsFile 
            { parser.Tree.reduce(2,"listElements",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listElements",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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