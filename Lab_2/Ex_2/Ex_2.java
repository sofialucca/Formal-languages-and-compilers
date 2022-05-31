// DO NOT EDIT
// Generated by JFlex 1.8.1 http://jflex.de/
// source: ex_2.jflex


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Ex_2 {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int comment = 2;
  public static final int init_tag = 4;
  public static final int within_tag = 6;
  public static final int closing_tag = 8;
  public static final int end_of_file = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\1\1\2\2\1\1\22\0\1\3\1\4\1\5"+
    "\4\0\1\6\5\0\1\7\1\0\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\5\11\2\0\1\16\1\17\1\20"+
    "\2\0\1\21\1\22\2\23\1\24\2\23\1\25\3\23"+
    "\1\26\1\27\6\23\1\30\6\23\6\0\1\21\1\22"+
    "\2\23\1\24\2\23\1\25\3\23\1\26\1\27\6\23"+
    "\1\30\6\23\12\0\1\2\u01a2\0\2\2\326\0\u0100\2";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\1\2\1\3\2\4\1\5\3\6\1\2"+
    "\1\7\3\5\2\10\1\0\1\11\1\0\1\12\1\13"+
    "\1\14\1\15\2\6\1\0\1\2\2\0\1\16\7\0"+
    "\1\17\2\6\2\0\1\20\1\21\1\22\1\23\2\0"+
    "\1\24\1\25\1\6\2\0\1\2\2\0\1\26\2\0"+
    "\1\27\1\0\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\31\0\62\0\113\0\144\0\175\0\226\0\226"+
    "\0\257\0\226\0\310\0\226\0\341\0\372\0\u0113\0\u012c"+
    "\0\226\0\u0145\0\u015e\0\u0177\0\226\0\u0190\0\u01a9\0\226"+
    "\0\u01c2\0\341\0\341\0\341\0\341\0\u01db\0\u01f4\0\u012c"+
    "\0\u020d\0\u0226\0\u0145\0\226\0\u023f\0\u0258\0\u0271\0\u028a"+
    "\0\u02a3\0\u02bc\0\u02d5\0\u02ee\0\u0307\0\u0320\0\u0339\0\u0352"+
    "\0\226\0\226\0\226\0\226\0\u036b\0\u0384\0\226\0\341"+
    "\0\u039d\0\u03b6\0\u03cf\0\u03e8\0\u0401\0\u041a\0\341\0\u0433"+
    "\0\u044c\0\226\0\u0465\0\226";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\7\2\10\13\7\1\11\12\7\1\12\2\10\4\12"+
    "\1\13\21\12\1\14\2\10\16\14\4\15\1\16\2\15"+
    "\1\17\3\10\1\20\14\10\1\21\10\10\1\14\2\10"+
    "\16\14\4\22\1\23\2\22\1\24\1\25\2\10\13\25"+
    "\1\26\12\25\35\0\1\27\3\0\1\30\27\0\1\31"+
    "\32\0\5\15\3\0\10\15\11\0\1\15\1\32\1\33"+
    "\1\34\1\35\3\0\7\15\1\36\11\0\5\15\3\0"+
    "\1\37\7\15\3\0\1\40\15\0\10\41\3\0\1\42"+
    "\5\0\5\43\2\0\1\44\10\43\3\0\1\42\5\0"+
    "\1\43\1\45\1\46\1\47\1\50\2\0\1\44\7\43"+
    "\1\51\3\0\1\42\5\0\5\43\2\0\1\44\1\52"+
    "\7\43\4\0\1\27\33\0\1\53\41\0\1\54\21\0"+
    "\5\15\3\0\6\15\1\55\1\15\11\0\5\15\3\0"+
    "\1\15\1\56\6\15\3\0\1\57\5\0\5\41\1\0"+
    "\1\60\1\0\10\41\3\0\1\42\14\0\1\44\13\0"+
    "\1\42\5\0\5\43\2\0\1\61\10\43\3\0\1\42"+
    "\5\0\5\43\2\0\1\62\10\43\3\0\1\42\5\0"+
    "\5\43\2\0\1\63\10\43\3\0\1\42\5\0\5\43"+
    "\2\0\1\64\10\43\3\0\1\42\5\0\5\43\2\0"+
    "\1\44\6\43\1\65\1\43\3\0\1\42\5\0\5\43"+
    "\2\0\1\44\1\43\1\66\6\43\7\0\1\67\22\0"+
    "\1\54\40\0\5\15\3\0\5\15\1\70\2\15\11\0"+
    "\5\15\3\0\5\15\1\71\2\15\3\0\1\57\13\0"+
    "\1\60\14\0\1\60\1\0\1\72\1\73\2\0\5\74"+
    "\16\0\1\42\5\0\5\43\2\0\1\44\5\43\1\75"+
    "\2\43\3\0\1\42\5\0\5\43\2\0\1\44\5\43"+
    "\1\76\2\43\11\0\5\15\3\0\3\15\1\77\4\15"+
    "\5\100\1\0\23\100\5\101\2\0\22\101\11\0\5\74"+
    "\16\0\1\42\5\0\5\43\2\0\1\102\10\43\3\0"+
    "\1\42\5\0\5\43\2\0\1\44\3\43\1\103\4\43"+
    "\5\100\1\10\23\100\5\101\1\0\1\10\22\101\3\0"+
    "\1\42\5\0\5\43\2\0\1\104\10\43";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1150];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\2\11\1\1\1\11\1\1\1\11\4\1\1\11"+
    "\3\1\1\11\1\1\1\0\1\11\1\0\6\1\1\0"+
    "\1\1\2\0\1\11\7\0\3\1\2\0\4\11\2\0"+
    "\1\11\2\1\2\0\1\1\2\0\1\1\2\0\1\11"+
    "\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    int tags = 0;
    int table = 0;
    int h1 = 0;
    int h2 = 0;
    int h3 = 0;
    int h4 = 0;
    String currentState = "no state";
    


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Ex_2(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
              {
                System.out.println("\n\nTotal number of tags: " + tags);
            System.out.println("Total number of table tags: " + table);
            System.out.println("Total number of table tags: " + h1);
            System.out.println("Total number of table tags: " + h2);
            System.out.println("Total number of table tags: " + h3);
            System.out.println("Total number of table tags: " + h4);
            return YYEOF;
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.print( yytext());
            }
            // fall through
          case 25: break;
          case 2:
            { System.out.print(yytext());
            }
            // fall through
          case 26: break;
          case 3:
            { System.out.print(yytext());
        yybegin(init_tag);
            }
            // fall through
          case 27: break;
          case 4:
            { ;
            }
            // fall through
          case 28: break;
          case 5:
            { System.out.println("Error: " + yytext() + " invalid tag name");
            }
            // fall through
          case 29: break;
          case 6:
            { if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            currentState = "within_tag";
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }
            }
            // fall through
          case 30: break;
          case 7:
            { System.out.print(yytext());
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
            }
            // fall through
          case 31: break;
          case 8:
            { System.out.print("Error: after closing HTML tag only comments are allowed");
            }
            // fall through
          case 32: break;
          case 9:
            { System.out.print(yytext());
        yybegin(closing_tag);
            }
            // fall through
          case 33: break;
          case 10:
            { if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            h1++;
            currentState = "within_tag";
            yybegin(within_tag);

        }else{
            System.out.println("First tag must be HTML");
        }
            }
            // fall through
          case 34: break;
          case 11:
            { if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            h2++;
            currentState = "within_tag";            
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }
            }
            // fall through
          case 35: break;
          case 12:
            { if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            h3++;
            currentState = "within_tag";
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }
            }
            // fall through
          case 36: break;
          case 13:
            { if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            h4++;
            currentState = "within_tag";
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }
            }
            // fall through
          case 37: break;
          case 14:
            { tags++;
        System.out.print(yytext());
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
            }
            // fall through
          case 38: break;
          case 15:
            { if(currentState.equals("end_of_file")){
            yybegin(end_of_file);
        }else{
            yybegin(YYINITIAL);  
        }
            }
            // fall through
          case 39: break;
          case 16:
            { System.out.print(yytext());
        tags++;
        h1++;
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
            }
            // fall through
          case 40: break;
          case 17:
            { System.out.print(yytext());
        tags++;
        h2++;
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
            }
            // fall through
          case 41: break;
          case 18:
            { System.out.print(yytext());
        tags++;
        h3++;
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
            }
            // fall through
          case 42: break;
          case 19:
            { System.out.print(yytext());
        tags++;
        h4++;
        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
            }
            // fall through
          case 43: break;
          case 20:
            { yybegin(comment);
            }
            // fall through
          case 44: break;
          case 21:
            { if(currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            currentState = "YYINITIAL";
            yybegin(within_tag);
            
        }else{
            System.out.println("Can't have HTML initial tag in the middle of the code");
        }
            }
            // fall through
          case 45: break;
          case 22:
            { if(!currentState.equals("no state")){
            System.out.print(yytext());
            tags++;
            table++;

            currentState = "within_tag";
            yybegin(within_tag);
        }else{
            System.out.println("First tag must be HTML");
        }
            }
            // fall through
          case 46: break;
          case 23:
            { System.out.print(yytext());
        tags++;
        currentState = "end_of_file";
        yybegin(end_of_file);
            }
            // fall through
          case 47: break;
          case 24:
            { System.out.print(yytext());
        tags++;
        table++;

        currentState = "YYINITIAL";
        yybegin(YYINITIAL);
            }
            // fall through
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Ex_2 [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Ex_2 scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Ex_2(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
