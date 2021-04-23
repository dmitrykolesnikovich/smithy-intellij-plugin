/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package software.amazon.smithy.plugin.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static software.amazon.smithy.plugin.language.psi.SmithyTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Smithy.flex</tt>
 */
public class SmithyLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 14432 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\2\11\1\14\1\36\3\11\1\37\10\11\1\40\1\41\5\14\1\42\1\43"+
    "\11\11\1\44\2\11\1\45\5\11\1\46\4\11\1\47\1\50\4\11\51\14\1\51\3\14\1\52\1"+
    "\53\4\14\1\54\12\11\1\55\u0381\11");

  /* The ZZ_CMAP_Y table has 2944 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\10\1\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\24\12\13\1\25"+
    "\1\13\1\26\1\25\1\13\1\27\4\1\1\13\1\30\1\31\2\1\2\13\1\30\1\1\1\32\1\25\5"+
    "\13\1\33\1\34\1\35\1\1\1\36\1\13\1\1\1\37\5\13\1\40\1\41\1\42\1\13\1\30\1"+
    "\43\1\13\1\44\1\45\1\1\1\13\1\46\4\1\1\13\1\47\4\1\1\50\2\13\1\51\1\1\1\52"+
    "\1\53\1\25\1\54\1\55\1\56\1\57\1\60\1\61\1\53\1\16\1\62\1\55\1\56\1\63\1\1"+
    "\1\64\1\65\1\66\1\67\1\22\1\56\1\70\1\1\1\71\1\53\1\72\1\73\1\55\1\56\1\70"+
    "\1\1\1\61\1\53\1\41\1\74\1\75\1\76\1\77\1\1\1\71\1\65\1\1\1\100\1\36\1\56"+
    "\1\51\1\1\1\101\1\53\1\1\1\102\1\36\1\56\1\103\1\1\1\60\1\53\1\104\1\100\1"+
    "\36\1\13\1\105\1\60\1\106\1\53\1\107\1\110\1\111\1\13\1\112\1\113\1\1\1\65"+
    "\1\1\1\25\2\13\1\114\1\113\1\115\2\1\1\116\1\117\1\120\1\121\1\122\1\123\2"+
    "\1\1\71\1\1\1\115\1\1\1\124\1\13\1\125\1\1\1\126\7\1\2\13\1\30\1\127\1\115"+
    "\1\130\1\131\1\132\1\133\1\115\2\13\1\134\2\13\1\135\24\13\1\136\1\137\2\13"+
    "\1\136\2\13\1\140\1\141\1\14\3\13\1\141\3\13\1\30\2\1\1\13\1\1\5\13\1\142"+
    "\1\25\45\13\1\143\1\13\1\144\1\30\4\13\1\30\1\145\1\146\1\16\1\13\1\16\1\13"+
    "\1\16\1\146\1\71\3\13\1\147\1\1\1\150\1\115\2\1\1\115\5\13\1\27\1\151\1\13"+
    "\1\152\4\13\1\40\1\13\1\153\2\1\1\65\1\13\1\154\1\155\2\13\1\156\1\13\1\77"+
    "\1\115\2\1\1\13\1\113\3\13\1\155\2\1\2\115\1\157\5\1\1\110\2\13\1\147\1\160"+
    "\1\115\2\1\1\161\1\13\1\162\1\42\2\13\1\40\1\1\2\13\1\147\1\1\1\163\1\42\1"+
    "\13\1\154\1\46\5\1\1\164\1\165\14\13\4\1\21\13\1\142\2\13\1\142\1\166\1\13"+
    "\1\154\3\13\1\167\1\170\1\171\1\125\1\170\1\172\1\1\1\173\2\1\1\174\1\1\1"+
    "\175\1\1\1\125\6\1\1\176\1\177\1\200\1\201\1\202\3\1\1\203\147\1\2\13\1\153"+
    "\2\13\1\153\10\13\1\204\1\205\2\13\1\134\3\13\1\206\1\1\1\13\1\113\4\207\4"+
    "\1\1\127\35\1\1\210\2\1\1\211\1\25\4\13\1\212\1\25\4\13\1\135\1\110\1\13\1"+
    "\154\1\25\4\13\1\153\1\1\1\13\1\30\3\1\1\13\40\1\133\13\1\40\4\1\135\13\1"+
    "\40\2\1\10\13\1\125\4\1\2\13\1\154\20\13\1\125\1\13\1\213\1\1\2\13\1\153\1"+
    "\127\1\13\1\154\4\13\1\40\2\1\1\214\1\215\5\13\1\216\1\13\1\153\1\27\3\1\1"+
    "\214\1\217\1\13\1\31\1\1\3\13\1\147\1\215\2\13\1\147\1\1\1\115\1\1\1\220\1"+
    "\42\1\13\1\40\1\13\1\113\1\1\1\13\1\125\1\50\2\13\1\31\1\127\1\115\1\221\1"+
    "\222\2\13\1\46\1\1\1\223\1\115\1\13\1\224\3\13\1\225\1\226\1\227\1\30\1\66"+
    "\1\230\1\231\1\207\2\13\1\135\1\40\7\13\1\31\1\115\72\13\1\147\1\13\1\232"+
    "\2\13\1\156\20\1\26\13\1\154\6\13\1\77\2\1\1\113\1\233\1\56\1\234\1\235\6"+
    "\13\1\16\1\1\1\161\25\13\1\154\1\1\4\13\1\215\2\13\1\27\2\1\1\156\7\1\1\221"+
    "\7\13\1\125\1\1\1\115\1\25\1\30\1\25\1\30\1\236\4\13\1\153\1\237\1\240\2\1"+
    "\1\241\1\13\1\14\1\242\2\154\2\1\7\13\1\30\30\1\1\13\1\125\3\13\1\71\2\1\2"+
    "\13\1\1\1\13\1\243\2\13\1\40\1\13\1\154\2\13\1\244\3\1\11\13\1\154\1\115\2"+
    "\13\1\244\1\13\1\156\2\13\1\27\3\13\1\147\11\1\23\13\1\113\1\13\1\40\1\27"+
    "\11\1\1\245\2\13\1\246\1\13\1\40\1\13\1\113\1\13\1\153\4\1\1\13\1\247\1\13"+
    "\1\40\1\13\1\77\4\1\3\13\1\250\4\1\1\71\1\251\1\13\1\147\2\1\1\13\1\125\1"+
    "\13\1\125\2\1\1\124\1\13\1\155\1\1\3\13\1\40\1\13\1\40\1\13\1\31\1\13\1\16"+
    "\6\1\4\13\1\46\3\1\3\13\1\31\3\13\1\31\60\1\1\161\2\13\1\27\2\1\1\65\1\1\1"+
    "\161\2\13\2\1\1\13\1\46\1\115\1\161\1\13\1\113\1\65\1\1\2\13\1\252\1\161\2"+
    "\13\1\31\1\253\1\254\2\1\1\13\1\22\1\156\5\1\1\255\1\256\1\46\2\13\1\153\1"+
    "\1\1\115\1\73\1\55\1\56\1\70\1\1\1\257\1\16\11\1\3\13\1\155\1\260\1\115\2"+
    "\1\3\13\1\1\1\261\1\115\12\1\2\13\1\153\2\1\1\262\2\1\3\13\1\1\1\263\1\115"+
    "\2\1\2\13\1\30\1\1\1\115\3\1\1\13\1\77\1\1\1\115\26\1\4\13\1\115\1\127\34"+
    "\1\3\13\1\46\20\1\1\56\1\13\1\153\1\1\1\71\1\115\1\1\1\215\1\13\67\1\71\13"+
    "\1\77\16\1\14\13\1\147\53\1\2\13\1\153\75\1\44\13\1\113\33\1\43\13\1\46\1"+
    "\13\1\153\1\115\6\1\1\13\1\154\1\1\3\13\1\1\1\147\1\115\1\161\1\264\1\13\67"+
    "\1\4\13\1\155\1\71\3\1\1\161\4\1\1\71\1\1\76\13\1\125\1\1\57\13\1\31\20\1"+
    "\1\16\77\1\6\13\1\30\1\125\1\46\1\77\66\1\5\13\1\221\3\13\1\146\1\265\1\266"+
    "\1\267\3\13\1\270\1\271\1\13\1\272\1\273\1\36\24\13\1\274\1\13\1\36\1\135"+
    "\1\13\1\135\1\13\1\221\1\13\1\221\1\153\1\13\1\153\1\13\1\56\1\13\1\56\1\13"+
    "\1\275\3\276\14\13\1\155\3\1\4\13\1\147\1\115\112\1\1\267\1\13\1\277\1\300"+
    "\1\301\1\302\1\303\1\304\1\305\1\156\1\306\1\156\24\1\55\13\1\113\2\1\103"+
    "\13\1\155\15\13\1\154\150\13\1\16\25\1\41\13\1\154\36\1");

  /* The ZZ_CMAP_A table has 3184 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\2\1\1\3\22\0\1\62\1\61\1\6\1\25\1\60\3\61\1\72\1\73\1\61\1\32"+
    "\1\65\1\74\1\30\1\5\1\26\11\27\1\63\2\61\1\64\2\61\1\21\1\15\2\22\1\55\1\13"+
    "\1\14\2\22\1\54\2\22\1\16\1\22\1\20\3\22\1\11\1\17\1\10\1\12\5\22\1\70\1\7"+
    "\1\71\1\61\1\22\1\61\1\33\1\34\1\41\1\40\1\31\1\53\1\50\1\52\1\47\2\22\1\35"+
    "\1\43\1\37\1\36\1\56\1\22\1\46\1\45\1\44\1\42\1\57\2\22\1\51\1\22\1\66\1\61"+
    "\1\67\7\0\1\1\12\0\1\4\11\0\1\23\12\0\1\23\4\0\1\23\5\0\27\23\1\0\12\23\4"+
    "\0\14\23\16\0\5\23\7\0\1\23\1\0\1\23\1\0\5\23\1\0\2\23\2\0\4\23\1\0\1\23\6"+
    "\0\1\23\1\0\3\23\1\0\1\23\1\0\4\23\1\0\23\23\1\0\13\23\10\0\6\23\1\0\26\23"+
    "\2\0\1\23\6\0\10\23\10\0\13\23\5\0\3\23\15\0\12\24\4\0\6\23\1\0\1\23\17\0"+
    "\2\23\7\0\2\23\12\24\3\23\2\0\2\23\1\0\16\23\15\0\11\23\13\0\1\23\16\0\12"+
    "\24\6\23\4\0\2\23\4\0\1\23\5\0\6\23\4\0\1\23\11\0\1\23\3\0\1\23\7\0\11\23"+
    "\7\0\5\23\1\0\10\23\6\0\26\23\3\0\1\23\2\0\1\23\7\0\12\23\4\0\12\24\1\23\4"+
    "\0\10\23\2\0\2\23\2\0\26\23\1\0\7\23\1\0\1\23\3\0\4\23\3\0\1\23\20\0\1\23"+
    "\15\0\2\23\1\0\1\23\5\0\6\23\4\0\2\23\1\0\2\23\1\0\2\23\1\0\2\23\17\0\4\23"+
    "\1\0\1\23\7\0\12\24\2\0\3\23\20\0\11\23\1\0\2\23\1\0\2\23\1\0\5\23\3\0\1\23"+
    "\2\0\1\23\30\0\1\23\13\0\10\23\2\0\1\23\3\0\1\23\1\0\6\23\3\0\3\23\1\0\4\23"+
    "\3\0\2\23\1\0\1\23\1\0\2\23\3\0\2\23\3\0\3\23\3\0\14\23\13\0\10\23\1\0\2\23"+
    "\10\0\3\23\5\0\1\23\4\0\10\23\1\0\6\23\1\0\5\23\3\0\1\23\3\0\2\23\15\0\13"+
    "\23\2\0\1\23\6\0\3\23\10\0\1\23\12\0\6\23\5\0\22\23\3\0\10\23\1\0\11\23\1"+
    "\0\1\23\2\0\7\23\11\0\1\23\1\0\2\23\14\0\12\24\7\0\2\23\1\0\1\23\2\0\2\23"+
    "\1\0\1\23\2\0\1\23\6\0\4\23\1\0\7\23\1\0\3\23\1\0\1\23\1\0\1\23\2\0\2\23\1"+
    "\0\4\23\1\0\2\23\11\0\1\23\2\0\5\23\1\0\1\23\11\0\12\24\2\0\14\23\1\0\24\23"+
    "\13\0\5\23\22\0\7\23\4\0\4\23\3\0\1\23\3\0\2\23\7\0\3\23\4\0\15\23\14\0\1"+
    "\23\1\0\6\23\1\0\1\23\5\0\1\23\2\0\13\23\1\0\15\23\1\0\4\23\2\0\7\23\1\0\1"+
    "\23\1\0\4\23\2\0\1\23\1\0\4\23\2\0\7\23\1\0\1\23\1\0\4\23\2\0\16\23\2\0\6"+
    "\23\2\0\15\23\2\0\1\23\1\4\17\23\1\0\10\23\7\0\15\23\1\0\6\23\23\0\1\23\4"+
    "\0\1\23\3\0\5\23\2\0\22\23\1\0\1\23\5\0\17\23\1\0\16\23\2\0\5\23\13\0\14\23"+
    "\13\0\1\23\15\0\7\23\7\0\16\23\15\0\2\23\12\24\3\0\3\23\11\0\4\23\1\0\4\23"+
    "\3\0\2\23\11\0\10\23\1\0\1\23\1\0\1\23\1\0\1\23\1\0\6\23\1\0\7\23\1\0\1\23"+
    "\3\0\3\23\1\0\7\23\3\0\4\23\2\0\6\23\4\0\13\4\15\0\2\1\5\0\1\4\17\0\1\4\1"+
    "\0\1\23\15\0\1\23\2\0\1\23\4\0\1\23\2\0\12\23\1\0\1\23\3\0\5\23\6\0\1\23\1"+
    "\0\1\23\1\0\1\23\1\0\4\23\1\0\13\23\2\0\4\23\5\0\5\23\4\0\1\23\4\0\2\23\13"+
    "\0\5\23\6\0\4\23\3\0\2\23\14\0\10\23\7\0\10\23\1\0\7\23\1\0\1\4\4\0\2\23\12"+
    "\0\5\23\5\0\2\23\3\0\7\23\6\0\3\23\12\24\2\23\13\0\11\23\2\0\27\23\2\0\7\23"+
    "\1\0\3\23\1\0\4\23\1\0\4\23\2\0\6\23\3\0\1\23\1\0\1\23\2\0\5\23\1\0\12\23"+
    "\12\24\5\23\1\0\3\23\1\0\10\23\4\0\7\23\3\0\1\23\3\0\2\23\1\0\1\23\3\0\2\23"+
    "\2\0\5\23\2\0\1\23\1\0\1\23\30\0\3\23\3\0\6\23\2\0\6\23\2\0\6\23\11\0\7\23"+
    "\4\0\5\23\3\0\5\23\5\0\1\23\1\0\10\23\1\0\5\23\1\0\1\23\1\0\2\23\1\0\2\23"+
    "\1\0\12\23\6\0\12\23\2\0\6\23\2\0\6\23\2\0\6\23\2\0\3\23\3\0\14\23\1\0\16"+
    "\23\1\0\2\23\1\0\2\23\1\0\10\23\6\0\4\23\4\0\16\23\2\0\1\23\1\0\14\23\1\0"+
    "\2\23\3\0\1\23\2\0\4\23\1\0\2\23\12\0\10\23\6\0\6\23\1\0\3\23\1\0\12\23\3"+
    "\0\1\23\12\0\4\23\13\0\12\24\1\23\1\0\1\23\3\0\7\23\1\0\1\23\1\0\4\23\1\0"+
    "\17\23\1\0\2\23\14\0\3\23\7\0\4\23\11\0\2\23\1\0\1\23\20\0\4\23\10\0\1\23"+
    "\13\0\10\23\5\0\3\23\2\0\1\23\2\0\2\23\2\0\4\23\1\0\14\23\1\0\1\23\1\0\7\23"+
    "\1\0\21\23\1\0\4\23\2\0\10\23\1\0\7\23\1\0\14\23\1\0\4\23\1\0\5\23\1\0\1\23"+
    "\3\0\14\23\2\0\13\23\1\0\10\23\2\0\22\24\1\0\2\23\1\0\1\23\2\0\1\23\1\0\12"+
    "\23\1\0\4\23\1\0\1\23\1\0\1\23\6\0\1\23\4\0\1\23\1\0\1\23\1\0\1\23\1\0\3\23"+
    "\1\0\2\23\1\0\1\23\2\0\1\23\1\0\1\23\1\0\1\23\1\0\1\23\1\0\1\23\1\0\2\23\1"+
    "\0\1\23\2\0\4\23\1\0\7\23\1\0\4\23\1\0\4\23\1\0\1\23\1\0\12\23\1\0\5\23\1"+
    "\0\3\23\1\0\5\23\1\0\5\23");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\5\5\1\1"+
    "\1\6\2\7\1\10\1\11\15\5\1\1\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\0\1\25\1\0\1\5\1\26\1\0\3\5"+
    "\1\27\25\5\2\30\1\24\1\31\1\25\1\0\1\5"+
    "\1\26\2\5\2\0\14\5\1\32\1\5\1\33\7\5"+
    "\1\30\3\0\1\34\1\0\1\5\1\35\16\5\1\30"+
    "\1\0\1\36\13\5\1\30\1\37\12\5\1\30\5\5"+
    "\1\40\1\5\1\30\3\5\1\41\2\5\1\42\1\5"+
    "\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
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
    "\0\0\0\75\0\172\0\267\0\364\0\75\0\u0131\0\u016e"+
    "\0\u01ab\0\u01e8\0\u0225\0\u0262\0\75\0\75\0\u029f\0\u02dc"+
    "\0\75\0\u0319\0\u0356\0\u0393\0\u03d0\0\u040d\0\u044a\0\u0487"+
    "\0\u04c4\0\u0501\0\u053e\0\u057b\0\u05b8\0\u05f5\0\u0632\0\75"+
    "\0\75\0\75\0\75\0\75\0\75\0\75\0\75\0\75"+
    "\0\75\0\u066f\0\u06ac\0\u06e9\0\u0726\0\u0763\0\u07a0\0\u07dd"+
    "\0\u07a0\0\u081a\0\u0857\0\u0894\0\u08d1\0\u090e\0\u094b\0\u0988"+
    "\0\u09c5\0\u0a02\0\u0a3f\0\u0a7c\0\u0ab9\0\u0af6\0\u0b33\0\u0b70"+
    "\0\u0bad\0\u0bea\0\u0c27\0\u0c64\0\u0ca1\0\u0cde\0\u0d1b\0\u0d58"+
    "\0\u0d95\0\u0dd2\0\u0e0f\0\u0e4c\0\u0e89\0\75\0\u0ec6\0\u0f03"+
    "\0\u07dd\0\u0f40\0\u0f7d\0\u0fba\0\u0262\0\u0ff7\0\u1034\0\u1071"+
    "\0\u10ae\0\u10eb\0\u1128\0\u1165\0\u11a2\0\u11df\0\u121c\0\u1259"+
    "\0\u1296\0\u016e\0\u12d3\0\u016e\0\u1310\0\u134d\0\u138a\0\u13c7"+
    "\0\u1404\0\u1441\0\u147e\0\u14bb\0\u14f8\0\u1535\0\u1572\0\u016e"+
    "\0\u15af\0\u15ec\0\u016e\0\u1629\0\u1666\0\u16a3\0\u16e0\0\u171d"+
    "\0\u175a\0\u1797\0\u17d4\0\u1811\0\u184e\0\u188b\0\u18c8\0\u1905"+
    "\0\u1942\0\u197f\0\u19bc\0\u016e\0\u19f9\0\u1a36\0\u1a73\0\u1ab0"+
    "\0\u1aed\0\u1b2a\0\u1b67\0\u1ba4\0\u1be1\0\u1c1e\0\u1c5b\0\u1c98"+
    "\0\75\0\u1cd5\0\u1d12\0\u1d4f\0\u1d8c\0\u1dc9\0\u1e06\0\u1e43"+
    "\0\u1e80\0\u1ebd\0\u1efa\0\u1f37\0\u1f74\0\u1fb1\0\u1fee\0\u202b"+
    "\0\u2068\0\u016e\0\u20a5\0\u20e2\0\u211f\0\u215c\0\u2199\0\u016e"+
    "\0\u21d6\0\u2213\0\u0dd2\0\u2250\0\u016e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
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
    "\1\2\4\3\1\4\1\5\1\6\1\7\2\10\1\11"+
    "\1\12\3\10\1\13\1\14\2\10\1\2\1\15\1\16"+
    "\1\17\1\20\1\11\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\10\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\3\10\1\36\4\10\1\37\1\2\1\3\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\76\0\4\3\55\0\1\3\17\0\1\52\67\0"+
    "\6\53\1\54\1\55\65\53\10\0\1\10\1\56\7\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\25\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\10"+
    "\1\0\25\10\25\0\11\10\1\0\3\10\1\0\2\57"+
    "\1\0\1\10\1\60\1\61\24\10\14\0\1\60\10\0"+
    "\5\10\1\62\3\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\25\10\25\0\2\10\1\63\6\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\25\10\25\0"+
    "\11\64\1\0\2\64\5\0\1\64\1\0\25\64\43\0"+
    "\2\17\73\0\2\20\55\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\23\10\1\65\1\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\2\10\1\66\1\67\10\10\1\70\1\10\1\71\6\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\10"+
    "\1\0\3\10\1\72\10\10\1\73\10\10\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\23\10"+
    "\1\74\1\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\1\75\24\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\3\10\1\76"+
    "\21\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\4\10\1\77\5\10\1\100\12\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\101\1\0"+
    "\1\102\24\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\14\10\1\103\10\10\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\104\1\0\11\10"+
    "\1\105\5\10\1\106\5\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\107\1\0\25\10\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\4\10"+
    "\1\110\20\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\2\10\1\111\22\10\25\0\11\112"+
    "\1\0\2\112\5\0\1\112\1\0\24\112\1\113\15\0"+
    "\2\114\2\0\1\114\1\115\67\114\6\53\1\116\1\55"+
    "\65\53\6\0\1\117\66\0\1\53\3\0\71\53\10\0"+
    "\2\10\1\120\6\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\25\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\57\1\0\1\10\1\0\25\10\43\0\2\121\55\0"+
    "\6\10\1\122\2\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\25\10\25\0\6\10\1\123\2\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\25\10\15\0"+
    "\1\124\3\0\4\124\11\64\1\124\3\64\1\125\2\64"+
    "\1\124\1\64\1\124\25\64\15\124\10\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\23\10\1\126"+
    "\1\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\3\10\1\127\21\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\3\10\1\130"+
    "\21\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\15\10\1\131\7\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\11\10\1\132"+
    "\13\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\4\10\1\133\20\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\12\10\1\134"+
    "\12\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\135\1\0\25\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\10\10\1\136\14\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\6\10\1\137\1\140\15\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\14\10\1\141\10\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\142"+
    "\1\0\25\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\11\10\1\143\13\10\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\23\10"+
    "\1\144\1\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\10\10\1\145\14\10\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\11\10"+
    "\1\144\1\10\1\146\11\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\13\10\1\147\11\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\10"+
    "\1\0\3\10\1\150\21\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\12\10\1\151\12\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\10"+
    "\1\0\11\10\1\152\13\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\3\10\1\153\21\10"+
    "\25\0\11\112\1\0\3\112\1\0\2\112\1\0\1\112"+
    "\1\0\25\112\25\0\11\112\1\0\3\112\1\0\2\112"+
    "\1\0\1\154\1\0\25\112\15\0\2\114\2\0\71\114"+
    "\2\115\2\0\71\115\2\0\1\155\1\156\2\0\1\157"+
    "\76\0\3\10\1\160\5\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\25\10\25\0\7\10\1\120\1\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\25\10"+
    "\25\0\6\10\1\160\2\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\25\10\25\0\11\161\1\0\2\161"+
    "\5\0\1\161\1\0\25\161\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\2\10\1\162\22\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\10"+
    "\1\0\1\10\1\163\23\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\2\10\1\164\22\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\10"+
    "\1\0\21\10\1\35\1\165\2\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\163\1\0\25\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\15\10\1\163\7\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\11\10\1\144\13\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\13\10\1\166\11\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\167\1\0\25\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\7\10\1\170"+
    "\15\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\1\10\1\171\23\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\3\10\1\172"+
    "\21\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\1\173\24\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\174\1\0\25\10\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\24\10"+
    "\1\175\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\7\10\1\176\4\10\1\72\10\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\13\10\1\177\11\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\3\10\1\200\21\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\201\1\0"+
    "\25\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\1\177\24\10\25\0\11\112\1\0\3\112"+
    "\1\0\2\112\1\0\1\112\1\0\13\112\1\202\11\112"+
    "\17\0\1\155\1\156\1\0\1\155\1\157\1\0\13\155"+
    "\2\0\50\155\2\0\1\155\100\0\1\203\66\0\1\124"+
    "\3\0\4\124\11\161\1\124\3\161\1\125\2\161\1\124"+
    "\1\161\1\124\25\161\15\124\10\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\16\10\1\204\6\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\205"+
    "\1\0\25\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\206\1\0\25\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\1\207\24\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\12\10\1\210\12\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\10\10\1\211\14\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\2\10\1\132\22\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\4\10\1\144\20\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\5\10\1\212\17\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\12\10\1\213\12\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\14\10\1\214\10\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\6\10\1\215\16\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\11\10\1\163\13\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\7\10\1\216\15\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\15\10\1\217\7\10\25\0\11\112\1\0\3\112\1\0"+
    "\2\112\1\0\1\112\1\0\12\112\1\220\12\112\23\0"+
    "\1\221\76\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\1\222\24\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\6\10\1\223\16\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\10"+
    "\1\0\11\10\1\224\13\10\25\0\11\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\1\0\23\10\1\225\1\10"+
    "\25\0\11\10\1\0\3\10\1\0\2\10\1\0\1\226"+
    "\1\0\25\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\1\227\24\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\11\10\1\230"+
    "\13\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\6\10\1\231\16\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\11\10\1\232"+
    "\13\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\13\10\1\214\11\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\233\1\0\25\10\25\0"+
    "\11\112\1\0\3\112\1\0\2\112\1\0\1\112\1\0"+
    "\14\112\1\234\10\112\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\4\10\1\163\20\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\14\10\1\235\10\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\14\10\1\236\10\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\1\237\24\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\4\10\1\177\20\10\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\11\10"+
    "\1\240\13\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\1\241\24\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\242\1\0\25\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\7\10\1\243\15\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\13\10\1\163\11\10\25\0"+
    "\11\112\1\0\3\112\1\0\2\112\1\0\1\112\1\0"+
    "\3\112\1\244\21\112\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\10\10\1\245\14\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\3\10\1\246\21\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\10\1\0\6\10\1\247\16\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\1\250\24\10\25\0\11\10\1\0\3\10\1\0\2\10"+
    "\1\0\1\10\1\0\10\10\1\251\14\10\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\13\10"+
    "\1\252\11\10\25\0\11\112\1\0\3\112\1\0\2\112"+
    "\1\0\1\112\1\0\4\112\1\253\20\112\25\0\11\10"+
    "\1\0\3\10\1\0\2\10\1\0\1\10\1\0\1\254"+
    "\24\10\25\0\11\10\1\0\3\10\1\0\2\10\1\0"+
    "\1\10\1\0\4\10\1\242\20\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\255\1\0\25\10\25\0"+
    "\11\10\1\0\3\10\1\0\2\10\1\0\1\10\1\0"+
    "\23\10\1\163\1\10\25\0\11\10\1\0\3\10\1\0"+
    "\2\10\1\0\1\144\1\0\25\10\25\0\11\10\1\0"+
    "\3\10\1\0\2\10\1\0\1\10\1\0\2\10\1\163"+
    "\22\10\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8845];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\6\1\2\11\2\1\1\11"+
    "\16\1\12\11\1\1\1\0\1\1\1\0\2\1\1\0"+
    "\35\1\1\11\1\0\4\1\2\0\27\1\3\0\1\1"+
    "\1\0\21\1\1\0\15\1\1\11\34\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public SmithyLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public SmithyLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 36: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 37: break;
          case 3: 
            { return DQUOTE;
            } 
            // fall through
          case 38: break;
          case 4: 
            { return ESCAPE;
            } 
            // fall through
          case 39: break;
          case 5: 
            { return IDENTIFIER;
            } 
            // fall through
          case 40: break;
          case 6: 
            { return POUND;
            } 
            // fall through
          case 41: break;
          case 7: 
            { return INT;
            } 
            // fall through
          case 42: break;
          case 8: 
            { return FRAC;
            } 
            // fall through
          case 43: break;
          case 9: 
            { return PLUS;
            } 
            // fall through
          case 44: break;
          case 10: 
            { return COLON;
            } 
            // fall through
          case 45: break;
          case 11: 
            { return EQ;
            } 
            // fall through
          case 46: break;
          case 12: 
            { return COMMA;
            } 
            // fall through
          case 47: break;
          case 13: 
            { return LBRACE;
            } 
            // fall through
          case 48: break;
          case 14: 
            { return RBRACE;
            } 
            // fall through
          case 49: break;
          case 15: 
            { return LBRACK;
            } 
            // fall through
          case 50: break;
          case 16: 
            { return RBRACK;
            } 
            // fall through
          case 51: break;
          case 17: 
            { return LPAREN;
            } 
            // fall through
          case 52: break;
          case 18: 
            { return RPAREN;
            } 
            // fall through
          case 53: break;
          case 19: 
            { return MINUS;
            } 
            // fall through
          case 54: break;
          case 20: 
            { return LINE_COMMENT;
            } 
            // fall through
          case 55: break;
          case 21: 
            { return QUOTED_TEXT;
            } 
            // fall through
          case 56: break;
          case 22: 
            { return EXP;
            } 
            // fall through
          case 57: break;
          case 23: 
            { return TRAIT_ID;
            } 
            // fall through
          case 58: break;
          case 24: 
            { return SHAPE_ID_MEMBER;
            } 
            // fall through
          case 59: break;
          case 25: 
            { return DOC_COMMENT;
            } 
            // fall through
          case 60: break;
          case 26: 
            { return USE_KEYWORD;
            } 
            // fall through
          case 61: break;
          case 27: 
            { return COMPLEX_TYPE_NAME;
            } 
            // fall through
          case 62: break;
          case 28: 
            { return NODE_CONSTANTS;
            } 
            // fall through
          case 63: break;
          case 29: 
            { return SIMPLE_TYPE_NAME;
            } 
            // fall through
          case 64: break;
          case 30: 
            { return APPLY;
            } 
            // fall through
          case 65: break;
          case 31: 
            { return TEXT_BLOCK;
            } 
            // fall through
          case 66: break;
          case 32: 
            { return NODE_OBJECT_TYPE_NAME;
            } 
            // fall through
          case 67: break;
          case 33: 
            { return METADATA;
            } 
            // fall through
          case 68: break;
          case 34: 
            { return VERSION;
            } 
            // fall through
          case 69: break;
          case 35: 
            { return NAMESPACE_KEYWORD;
            } 
            // fall through
          case 70: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}