import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.TranslationHandler;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import gen.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        Scanner read = new Scanner(System.in);
        System.out.println("Enter file name");
        String inputFile =  read.next() + ".txt";
        CharStream input = CharStreams.fromFileName(inputFile);


        COOLLexer lexer = new COOLLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

         LexerTest lex = new LexerTest();
         lex.generateTokens(tokens);

        COOLParser parser = new COOLParser(tokens);

       // Parser.writeTree(parser);

        COOLParser.ProgramContext tree = parser.program();
        ParseTree parseTree = tree.getChild(0).getChild(0).getChild(tree.getChild(0).getChild(0).getChildCount()-2);


        String out = tree.toStringTree(parser);


        PrintWriter w = new PrintWriter("AST.txt", "UTF-8");
        w.println(out);
        w.close();
        ScopeHandler.clear();

        TranslationHandler.setStream(new FileOutputStream("out.txt"));
        TranslationHandler.translate(parseTree);

    }
}