// Generated from E:/study/year4/term2/compiler/ArrayInit2/src\COOL.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link COOLParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(COOLParser.IdContext ctx);
}