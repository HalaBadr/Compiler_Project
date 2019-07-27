package Translation.TranslatorClasses;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

//((function| decl ))*
public class FeatureTranslator extends Translator {
    ParseTree parseTree;
    
    //check that child of expression is feature
    public FeatureTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.FeatureContext.class);
        parseTree =parsetree;
    }

    //generate 3address code for feature
    @Override
    public String generate() {
        ScopeHandler.pushScope();

        for (int i = 0; i < parseTree.getChildCount(); ++i) {

            ParseTree child = parseTree.getChild(i);
            //check is child is decl
            if (child instanceof COOLParser.DeclContext) {
                String temp = new DeclTranslator(child).generate();
            }

            //check is child is function
            if (child instanceof COOLParser.FunctionContext) {
                String temp = new FunctionTranslator(child).generate();
            }
        }
        ScopeHandler.popScope();
        return null;
    }
}
