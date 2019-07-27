package gen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import org.antlr.v4.runtime.CommonTokenStream;
import java.util.List;


import org.antlr.v4.runtime.*;



public class LexerTest {
    public void generateTokens(CommonTokenStream tokens) throws FileNotFoundException, UnsupportedEncodingException {

        tokens.fill();
        List<Token> token = tokens.getTokens();

        String out = "";
        boolean b = false;
        for (int i = 0; i < token.size(); i++) {
            if (token.get(i).getType() == 51) {
                b = true;
                System.out.println("In line " + token.get(i).getLine() + " this symbol " + token.get(i).getText() + "is not allowed");
            } else if (token.get(i).getType() == 32 && b == false) {
                out += "<" + token.get(i).getLine() + ",OBJECTID," + token.get(i).getText() + ">\n";
            } else if (token.get(i).getType() == 30  && b == false) {
                out += "<" + token.get(i).getLine() + ",INT," + token.get(i).getText() + ">\n";
            } else if (token.get(i).getType() == 29 && b == false) {
                out += "<" + token.get(i).getLine() + ",STRING," + token.get(i).getText() + ">\n";
            } else if (b == false) {
                out += "<" + token.get(i).getLine() + "," + token.get(i).getText() + ">\n";
            }


        }
        if (b == false) {
            PrintWriter w = new PrintWriter("OutTokens.txt", "UTF-8");
            w.println(out);
            w.close();
        }
    }
}