package Translation.TranslatorClasses;
import gen.*;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;

//classDefine ';' programBlocks # classes| EOF;
public class BlockTranslator extends Translator {

    ParseTree parseTree;
    //ensure that child of parsetree is block
    public BlockTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.BlockContext.class);
        parseTree =parsetree;
    }

    //generate 3address code for block
    @Override
    public String generate() {
        String res="";
        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            ParseTree child = parseTree.getChild(i);
            //check that child of block is stmt
            if (child instanceof COOLParser.StmtContext) {

                 res = new stmtTranslator(child).generate();
            }
        }
        return res;
    }
}
