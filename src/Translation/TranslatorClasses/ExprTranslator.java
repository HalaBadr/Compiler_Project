package Translation.TranslatorClasses;
import gen.*;
import Translation.Environment.ScopeHandler;
import Translation.Temp;
import Translation.TranslateAndError.TranslationHandler;
import Translation.TranslateAndError.Translator;
import org.antlr.v4.runtime.tree.ParseTree;


//(methodCall| methodOwnCall| ifStmt| whileStmt| letStmt| block| decl| caseStmt| negativeExpr| minusExpr| isvoidExpr| notExpr| OBJECTID| INT| STRING| TRUE| FALSE| SELF| assigmentstmt)
public class ExprTranslator extends Translator {

    //check that child of parsetree is expr
    ParseTree parseTree;
    public ExprTranslator(ParseTree parsetree) {
        super(parsetree, COOLParser.ExpressionContext.class);
        parseTree =parsetree;
    }

    //generate 3address code for expr
    @Override
    public String generate() {
        String exprString , termString;

        //check that expr is MethodOwnCall
        if(parseTree.getChild(0) instanceof COOLParser.MethodOwnCallContext) {
          String call = new MethodOwnCallTranslator(parseTree.getChild(0)).generate();
          return  call;
        }

        //check that expr is MethodCall
        else if(parseTree.getChild(0) instanceof COOLParser.MethodCallContext) {
            String call = new MethodCallTranslator(parseTree.getChild(0)).generate();
            return  call;
        }

        //check that expr is Assigmentstmt
        else if(parseTree.getChild(0) instanceof COOLParser.AssigmentstmtContext) {
            String assig = new AssigmentstmtTranslator(parseTree.getChild(0)).generate();
            return assig;
        }

        //check that expr is iftmt
        else if(parseTree.getChild(0) instanceof COOLParser.IfStmtContext) {
            String iff = new ifStmtTranslator(parseTree.getChild(0)).generate();
            return  iff;
        }

        //check that expr is Letstmt
        else if(parseTree.getChild(0) instanceof COOLParser.LetStmtContext) {
            String let = new LetStmtTranslator(parseTree.getChild(0)).generate();
            return  let;
        }

        //check that expr is Block
        else if(parseTree.getChild(0) instanceof COOLParser.BlockContext) {
            String block = new BlockTranslator(parseTree.getChild(0)).generate();
            return  block;
        }
       
        //check that expr is Decl
        else if(parseTree.getChild(0) instanceof COOLParser.DeclContext) {
            String decl = new DeclTranslator(parseTree.getChild(0)).generate();
            return  decl;
        }

        //check that expr is Isvoid
        else if(parseTree.getChild(0) instanceof COOLParser.IsvoidExprContext) {
            String isvoid = new IsvoidTranslator(parseTree.getChild(0)).generate();
            return  isvoid;
        }
        
        //check that expr is Negative
        else if(parseTree.getChild(0) instanceof COOLParser.NegativeExprContext) {
            String neg = new NegativeTranslator(parseTree.getChild(0)).generate();
            return  neg;
        }
        
        //check that expr is MinusExpr
        else if(parseTree.getChild(0) instanceof COOLParser.MinusExprContext) {
            String minus = new MinusExprTranslator(parseTree.getChild(0)).generate();
            return  minus;
        }

        //check that expr is Notexpr
        else if(parseTree.getChild(0) instanceof COOLParser.NotExprContext) {
            String not = new NotExprTranslator(parseTree.getChild(0)).generate();
            return  not;
        }

        //check that expr is WhileStmt
        else if(parseTree.getChild(0) instanceof COOLParser.WhileStmtContext) {
            String whil = new WhileStmtTranslator(parseTree.getChild(0)).generate();
            return  whil;
        }

        //check that expr is Casestmt
        else if(parseTree.getChild(0) instanceof COOLParser.CaseStmtContext) {
            String cas = new CaseStmtTranslator(parseTree.getChild(0)).generate();
            return  cas;
        }

        else if (parseTree.getChildCount() == 1){
            char c1 = parseTree.getChild(0).getText().charAt(0);

            if(!(parseTree.getChild(0).getText().contains("TRUE")) && !(parseTree.getChild(0).getText().contains("FALSE")) && !(parseTree.getChild(0).getText().contains("INT")) && !(parseTree.getChild(0).getText().contains("STRING")) &&!(parseTree.getChild(0).getText().contains("self")) && ((c1>='a' && c1<='z') || (c1 >='A' && c1 <='Z') || c1 == '_')) {
                ScopeHandler.getToken(parseTree.getChild(0).getText());

            }

            return  parseTree.getChild(0).getText();}

          else {

            return null;
        }

    }
}
