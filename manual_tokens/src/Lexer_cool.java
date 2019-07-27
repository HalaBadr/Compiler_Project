import org.antlr.v4.runtime.CharStream;

import java.io.IOException;
import java.util.Hashtable;

public class Lexer_cool extends COOLLexer {

    public int line = 1;
    private char peek = ' ';
    public CharStream input;
    COOLLexer cool ;
    private Hashtable words = new Hashtable();
    void reserve(Word t){
        words.put(t.lexeme,t);
    }

    public Lexer_cool(CharStream input1){
        super(input1);
        input= input1;
        reserve(new Word(cool.TRUE,"true"));
        reserve(new Word(cool.FALSE, "false"));
        reserve(new Word(cool.IF, "if"));
        reserve(new Word(cool.FI, "fi"));
        reserve(new Word(cool.WHILE, "while"));
        reserve(new Word(cool.LOOP, "loop"));
        reserve(new Word(cool.POOL, "pool"));
        reserve(new Word(cool.THEN, "then"));
        reserve(new Word(cool.CASE, "case"));
        reserve(new Word(cool.ESAC, "esac"));
        reserve(new Word(cool.ELSE, "else"));
        reserve(new Word(cool.LET, "let"));
        reserve(new Word(cool.NEW, "new"));
        reserve(new Word(cool.VOID, "void"));
        reserve(new Word(cool.NOT, "not"));
        reserve(new Word(cool.IN, "in"));
        reserve(new Word(cool.CLASS, "class"));
        reserve(new Word(cool.INHERITS, "inherits"));
        reserve(new Word(cool.OF, "of"));
        reserve(new Word(cool.EOF, "eof"));
        reserve(new Word(cool.INT, "Int"));
        reserve(new Word(cool.STRING, "String"));
    }

    public void Scan() throws IOException{
        int x = input.size();
        System.out.println(input + " ,"+ x);
        int i=0;
        String ss = input.toString();
        while (i!=x) {
            for (; i <= x; i++) {
                peek = ss.charAt(i);
                if (peek == ' ' || peek == '\t') continue;
                else if (peek == '\n') line = line + 1;
                else break;
            }
            if (Character.isDigit(peek)) {
                int v = 0;
                do {
                    v = 10 * v + Character.digit(peek, 10);

                    if (i == x +1) {
                        peek = ' ';
                        break;
                    }
                    i++;
                    peek = ss.charAt(i);
                } while (Character.isDigit(peek) && i < x);
                new print_Token(4, Integer.toString(v));
            }

            else if (Character.isLetter(peek)) {
                StringBuffer b = new StringBuffer();
                do {
                    b.append(peek);

                    if (i == x +1) {
                        peek = ' ';
                        break;
                    }
                    i++;
                    peek = ss.charAt(i);
                } while (Character.isLetterOrDigit(peek));
                String s = b.toString();
                Word w = (Word) words.get(s);
                if (w != null) {
                    new print_Token(w.tag, w.lexeme);
                }
                else {
                    w = new Word(Tag.ID, s);
                    words.put(s, w);
                    new print_Token(50, w.lexeme);
                }
            }

            else if (peek == '<') {
                if (i == x+1 ) {
                    peek = ' ';
                }
                if(i<x) i++;
                peek = ss.charAt(i);

                if (peek == '=') {
                    new print_Token(6, "<=");
                    if (i == x + 1) {
                        peek = ' ';
                    }
                    if(i<x) i++;


                } else if(peek == '-'){
                    new print_Token(100,"<-");
                    if (i == x + 1) {
                        peek = ' ';
                    }
                    if(i<x)i++;
                }
                else if (peek != ' ')
                    new print_Token(6, "<");
            }

            else if (peek == '=') {
                new print_Token(6, "=");
                if (i == x + 1) {
                    peek = ' ';
                }
                if(i<x) i++;
            }

            else {
                String s = Character.toString(peek);
                new print_Token(100, s);
                if (i == x+ 1) {
                    peek = ' ';
                }
                if(i < x) i++;

            }


        }

        peek=' ';
    }
}
