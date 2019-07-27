import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class lexer_main {
    public static void main(String[] args) throws Exception{
        String inputFile = "t.expr";
        FileInputStream is= new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
       // COOLLexer lexer = new COOLLexer(input);

        Lexer_cool lexer_cool = new Lexer_cool(input);
        lexer_cool.Scan();

       /* CommonTokenStream tokens = new CommonTokenStream(lexer);
        COOLParser parser = new COOLParser(tokens);

        System.out.println(tokens);
        */
       /* ParseTree tree = parser.array();   // begin parsing from array

       // System.out.println(tree.toStringTree(parser));    // print tree of parsing

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new UnicodeConvertListener(), tree);
*/
    }
}
