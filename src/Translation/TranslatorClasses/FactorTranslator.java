package Translation.TranslatorClasses;
import Translation.*;
import gen.*;
import Translation.TranslateAndError.*;
import org.antlr.v4.runtime.tree.ParseTree;


//factor (DIVISION|MULTIPLY)expression| expression
public class FactorTranslator  extends Translator {

    ParseTree parseTree;

    //check that child of parsetree is factor
    public FactorTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.FactorContext.class);
        parseTree = parsetree;
    }

    //generate 3address code for factor
    public String generate() {

        //check that factor has only one child 
        if (parseTree.getChildCount() == 1) {
            return new ExprTranslator(parseTree.getChild(0)).generate();
        }

        // factor has 3 children
        String termString = new FactorTranslator(parseTree.getChild(0)).generate();

        String valueString = new ExprTranslator(parseTree.getChild(2)).generate();

        Temp myRes = new Temp();

        // assign expression's value into variable
        TranslationHandler.write(
                String.format(
                        "%s%s = %s %s %s\t",
                        space,
                        myRes,
                        termString,
                        parseTree.getChild(1).getText(),
                        valueString
                )
        );

        return myRes.toString();

    }
    }


