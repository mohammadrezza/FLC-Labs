
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int QUM = 11;
  public static final int CP = 15;
  public static final int PLUS = 4;
  public static final int CM = 13;
  public static final int OP = 14;
  public static final int STAR = 5;
  public static final int CIM = 12;
  public static final int CB = 3;
  public static final int OB = 2;
  public static final int SINUM = 19;
  public static final int EOF = 0;
  public static final int SL = 9;
  public static final int VEC_VAR = 17;
  public static final int error = 1;
  public static final int DOT = 7;
  public static final int EQ = 6;
  public static final int DASH = 10;
  public static final int SC = 8;
  public static final int FNUM = 18;
  public static final int SCA_VAR = 16;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "OB",
  "CB",
  "PLUS",
  "STAR",
  "EQ",
  "DOT",
  "SC",
  "SL",
  "DASH",
  "QUM",
  "CIM",
  "CM",
  "OP",
  "CP",
  "SCA_VAR",
  "VEC_VAR",
  "FNUM",
  "SINUM"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[11]=new String("QUM");
		TT[15]=new String("CP");
		TT[4]=new String("PLUS");
		TT[13]=new String("CM");
		TT[14]=new String("OP");
		TT[5]=new String("STAR");
		TT[12]=new String("CIM");
		TT[3]=new String("CB");
		TT[2]=new String("OB");
		TT[19]=new String("SINUM");
		TT[0]=new String("EOF");
		TT[9]=new String("SL");
		TT[17]=new String("VEC_VAR");
		TT[1]=new String("error");
		TT[7]=new String("DOT");
		TT[6]=new String("EQ");
		TT[10]=new String("DASH");
		TT[8]=new String("SC");
		TT[18]=new String("FNUM");
		TT[16]=new String("SCA_VAR");
	}
public String getTT(int i){return TT[i];}
}

