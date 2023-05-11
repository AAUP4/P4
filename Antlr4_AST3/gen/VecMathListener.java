// Generated from C:/Users/night/Documents/GitHub/P4/Antlr4_AST3/src\VecMath.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VecMathParser}.
 */
public interface VecMathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VecMathParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(VecMathParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecMathParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(VecMathParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(VecMathParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(VecMathParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(VecMathParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(VecMathParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(VecMathParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(VecMathParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(VecMathParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(VecMathParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVec}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVec(VecMathParser.ExprVecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVec}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVec(VecMathParser.ExprVecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(VecMathParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(VecMathParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(VecMathParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(VecMathParser.ExprAddContext ctx);
}