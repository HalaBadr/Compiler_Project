package gen;// Generated from /home/nourhan/nourhan/projects (1)/src/COOL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link COOLParser}.
 */
public interface COOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(COOLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(COOLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterClasses(COOLParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitClasses(COOLParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterEof(COOLParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitEof(COOLParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(COOLParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(COOLParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(COOLParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(COOLParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterMethod(COOLParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitMethod(COOLParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(COOLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(COOLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterProperty(COOLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitProperty(COOLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(COOLParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(COOLParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(COOLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(COOLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(COOLParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(COOLParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(COOLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(COOLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#assigmentstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssigmentstmt(COOLParser.AssigmentstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#assigmentstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssigmentstmt(COOLParser.AssigmentstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#methodOwnCall}.
	 * @param ctx the parse tree
	 */
	void enterOwnMethodCall(COOLParser.OwnMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#methodOwnCall}.
	 * @param ctx the parse tree
	 */
	void exitOwnMethodCall(COOLParser.OwnMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(COOLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(COOLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link COOLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(COOLParser.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link COOLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(COOLParser.MethodcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(COOLParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(COOLParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(COOLParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(COOLParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(COOLParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(COOLParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(COOLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(COOLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(COOLParser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(COOLParser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#negativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(COOLParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#negativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(COOLParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(COOLParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(COOLParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(COOLParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(COOLParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(COOLParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(COOLParser.BoolNotContext ctx);
}