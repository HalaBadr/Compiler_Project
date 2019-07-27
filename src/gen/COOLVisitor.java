package gen;// Generated from /home/nourhan/nourhan/projects (1)/src/COOL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface COOLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(COOLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(COOLParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(COOLParser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(COOLParser.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(COOLParser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(COOLParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(COOLParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(COOLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(COOLParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(COOLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(COOLParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(COOLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#assigmentstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigmentstmt(COOLParser.AssigmentstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#methodOwnCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnMethodCall(COOLParser.OwnMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(COOLParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link COOLParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcall(COOLParser.MethodcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(COOLParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(COOLParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(COOLParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(COOLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#caseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStmt(COOLParser.CaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#negativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(COOLParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#minusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(COOLParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#isvoidExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(COOLParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(COOLParser.BoolNotContext ctx);
}