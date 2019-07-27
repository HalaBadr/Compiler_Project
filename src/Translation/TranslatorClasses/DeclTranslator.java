package Translation.TranslatorClasses;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.Token;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

//OBJECTID ':' TYPEID (ASSIGNMENT stmt)?
public class DeclTranslator extends Translator {

    ParseTree parseTree;
    //check that child of parse tree is declaration
    public DeclTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.DeclContext.class);
        parseTree =parsetree;
    }

    // generate 3address code for decl
    @Override
    public String generate() {
        String idName = parseTree.getChild(0).getText();
        String type = parseTree.getChild(2).getText();

        Token token = new Token(idName, type);
        ScopeHandler.addToken(token);

        String exprTemp = null;

        // check if the production has assignment, generate its expression
        if (parseTree.getChildCount() > 4) {
            ParseTree exprNode = parseTree.getChild(4);
            exprTemp = new stmtTranslator(exprNode).generate();
        }


        if (exprTemp != null) {
            // assign expression's value into variable
            TranslationHandler.write(
                    String.format(
                            "%s%s = %s",
                            space,
                            token.name,
                            exprTemp
                    )
            );
        }
        return null;
    }
}
