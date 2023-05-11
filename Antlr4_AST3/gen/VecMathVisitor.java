// Generated from C:/Users/night/Documents/GitHub/P4/Antlr4_AST3/src\VecMath.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VecMathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VecMathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VecMathParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(VecMathParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssign(VecMathParser.StatAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrint(VecMathParser.StatPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(VecMathParser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInt(VecMathParser.ExprIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVec}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVec(VecMathParser.ExprVecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(VecMathParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(VecMathParser.ExprAddContext ctx);
}