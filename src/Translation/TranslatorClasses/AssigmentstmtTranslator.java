package Translation.TranslatorClasses;
import  gen.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

//OBJECTID ASSIGNMENT stmt
public class AssigmentstmtTranslator extends Translator {

    ParseTree parseTree;

    //check that child of expression is assignmentstmt
    public AssigmentstmtTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.AssigmentstmtContext.class);
        parseTree = parsetree;
    }

    //generate 3address code for assignmentstmt
    public String generate() {
        String exprString ="", termString;
        char c1 = parseTree.getChild(0).getText().charAt(0);
        char c2='0';
        if(parseTree.getChildCount() >=3)
            c2 = parseTree.getChild(2).getText().charAt(0);

        if(parseTree.getChildCount() >=1 && parseTree.getChild(0).getClass().toString().contains("TerminalNodeImpl") && !(parseTree.getChild(0).getText().contains("self")) && !(c1>='0' && c1<='9' && !(c1 =='{' ||c1 =='}'))) {
            ScopeHandler.getToken(parseTree.getChild(0).getText());

        }

        if(parseTree.getChildCount() >=3 && parseTree.getChild(2).getClass().toString().contains("TerminalNodeImpl") && !(parseTree.getChild(2).getText().contains("self")) && !(c2>='0' && c2<='9' && !(c2 =='{' ||c2 =='}'))) {
            ScopeHandler.getToken(parseTree.getChild(2).getText());
        }

        if (parseTree.getChildCount() == 1){return  parseTree.getChild(0).getText();}


        if (parseTree.getChild(0).getChildCount() == 0)exprString =  parseTree.getChild(0).getText();

        if(parseTree.getChild(2).getChildCount() == 0) termString =  parseTree.getChild(2).getText();
        else termString = new stmtTranslator(parseTree.getChild(2)).generate();


        // assign expression's value into variable
        TranslationHandler.write(
                String.format(
                        "%s%s = %s\t",
                        space,
                        exprString,
                        termString
                )
        );
        return termString;
    }
}
