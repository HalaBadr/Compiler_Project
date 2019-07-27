package Translation.TranslateAndError;

import org.antlr.v4.runtime.tree.ParseTree;
import gen.*;
import org.stringtemplate.v4.ST;

import java.util.LinkedList;
import java.util.Queue;

abstract public class Translator {

    protected ParseTree parseTree;
    public static int param_num;
    public static String space="";
    public static String methodCall="";
    public static Queue <String> param_list = new LinkedList<String>();
    public Translator(ParseTree parseTree, Class targetClass) {
        this.parseTree = parseTree;
        //check if this parseTree of targetClass type or not
        if (!targetClass.isInstance(parseTree)) {
            throw new RuntimeException(
                    String.format(
                            "Expected %s, found %s!",
                            targetClass,
                            parseTree.getClass()
                    )
            );
        }
    }

    abstract public String generate();
}