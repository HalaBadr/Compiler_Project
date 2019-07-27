import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.*;

public class lexer_main {
    public static void main(String[] args) throws Exception{
        Scanner read = new Scanner(System.in);
        System.out.println("Enter file name");
        String inputFile = read.next()+".txt";
        CharStream input = CharStreams.fromFileName(inputFile);
        COOL lexer = new COOL(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        List<Token> token = tokens.getTokens();
       // System.out.println(token.size());
String out="";
boolean b=false;
        for(int i = 0 ; i < token.size() ; i++ ){
            if(token.get(i).getType()==49)
            {
                 b= true;
               System.out.println("In line "+token.get(i).getLine()+" this symbol "+token.get(i).getText()+"is not allowed");
            }
           else if(token.get(i).getType()==4||token.get(i).getType()==48 && b==false)
            {
                out+="<"+token.get(i).getLine()+",ID,"+token.get(i).getText()+">\n";
            }

           else if(token.get(i).getType()==1||token.get(i).getType()==2||token.get(i).getType()==3 && b==false)
            {
                out+="<"+token.get(i).getLine()+",NUM,"+token.get(i).getText()+">\n";
            }
           else if(token.get(i).getType()==9 && b==false)
            {
                out+="<"+token.get(i).getLine()+",Literal,"+token.get(i).getText()+">\n";
            }

            else if(b==false) {out+="<"+token.get(i).getLine()+","+token.get(i).getText()+">\n";}


        }
        if(b == false) {
            PrintWriter w = new PrintWriter("out.txt", "UTF-8");
            w.println(out);
            w.close();
        }

        //COOLParser parser = new COOLParser(tokens);
        //System.out.println(tokens);

/*

        */
       /* ParseTree tree = parser.array();   // begin parsing from array

       // System.out.println(tree.toStringTree(parser));    // print tree of parsing

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new UnicodeConvertListener(), tree);
*/
    }
}
