package Translation.TranslatorClasses;
import Translation.Temp;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.Token;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;
import gen.COOLParser;

// CASE stmt OF (OBJECTID ':' TYPEID CASE_ARROW stmt ';') + ESAC
public class CaseStmtTranslator extends Translator  {
    ParseTree parseTree;

    // check that child of parsetree is case stmt
    public CaseStmtTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.CaseStmtContext.class);
        parseTree = parsetree;
    }
    
    // generate 3address code for case
    @Override
    public String generate() {
        TranslationHandler.write(space + "Case :");
        space +="\t\t";

        String  Child = new stmtTranslator(parseTree.getChild(1)).generate();

        Temp myRes = new Temp();
        Temp myType = new Temp();

        TranslationHandler.write(space + myType.toString() + " = TYPEOF " + Child);

        String afterAll = TranslationHandler.getNewLabel();
        for(int i = 3, j = 1 ; i+6 < parseTree.getChildCount() ; i += 6, ++j) {

            TranslationHandler.write(String.format(space + "Case #%d :", j));
            space +="\t\t";

            String nextLabel = TranslationHandler.getNewLabel();
            String childIType = parseTree.getChild(i + 2).getText();
            if(!parseTree.getChild(i+6).getText().contains("esac")){
                int num = j+1;
                TranslationHandler.write(space + "IFFALSE " + myType.toString() + " = " + childIType + " GOTO " + "Case #" + num );
            }
            else
                TranslationHandler.write(space + "IFFALSE " + myType.toString() + " = " + childIType + " GOTO " + afterAll);
            String childITemp = new stmtTranslator(parseTree.getChild(i + 4)).generate();
            TranslationHandler.write(space + myRes.toString() + " = " + childITemp);
            TranslationHandler.write(space + "GOTO " + afterAll);
            space = space.substring(0,space.length()-2);
        }
        TranslationHandler.write("");
        TranslationHandler.write(space + afterAll + ":");
        space +="\t\t";
        
        return myRes.toString();
    }
}
