
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int GEN = 12;
  public static final int NUM = 11;
  public static final int ARR = 6;
  public static final int C = 5;
  public static final int LITT = 13;
  public static final int DATE = 7;
  public static final int SC = 3;
  public static final int LETT = 14;
  public static final int QM = 10;
  public static final int STRING = 8;
  public static final int EOF = 0;
  public static final int SEP = 2;
  public static final int ISBN = 9;
  public static final int error = 1;
  public static final int COL = 4;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SEP",
  "SC",
  "COL",
  "C",
  "ARR",
  "DATE",
  "STRING",
  "ISBN",
  "QM",
  "NUM",
  "GEN",
  "LITT",
  "LETT"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[12]=new String("GEN");
		TT[11]=new String("NUM");
		TT[6]=new String("ARR");
		TT[5]=new String("C");
		TT[13]=new String("LITT");
		TT[7]=new String("DATE");
		TT[3]=new String("SC");
		TT[14]=new String("LETT");
		TT[10]=new String("QM");
		TT[8]=new String("STRING");
		TT[0]=new String("EOF");
		TT[2]=new String("SEP");
		TT[9]=new String("ISBN");
		TT[1]=new String("error");
		TT[4]=new String("COL");
	}
public String getTT(int i){return TT[i];}
}

