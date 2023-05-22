// Generated from C:/Users/Kira/Documents/GitHub/P4/Antlr4_AST3/src\CLUB.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CLUBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CLUBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CLUBParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CLUBParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#setup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup(CLUBParser.SetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#round}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRound(CLUBParser.RoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#turn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurn(CLUBParser.TurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CLUBParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Stmt1}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt1(CLUBParser.Stmt1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Stmt2}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2(CLUBParser.Stmt2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Stmt3}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt3(CLUBParser.Stmt3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Stmt4}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4(CLUBParser.Stmt4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(CLUBParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(CLUBParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(CLUBParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#tParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTParam(CLUBParser.TParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(CLUBParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicOr1}
	 * labeled alternative in {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOr1(CLUBParser.LogicOr1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicOr2}
	 * labeled alternative in {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOr2(CLUBParser.LogicOr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicAnd1}
	 * labeled alternative in {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAnd1(CLUBParser.LogicAnd1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicAnd2}
	 * labeled alternative in {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAnd2(CLUBParser.LogicAnd2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal1}
	 * labeled alternative in {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual1(CLUBParser.Equal1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal2}
	 * labeled alternative in {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual2(CLUBParser.Equal2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Relat1}
	 * labeled alternative in {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelat1(CLUBParser.Relat1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Relat2}
	 * labeled alternative in {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelat2(CLUBParser.Relat2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Add1}
	 * labeled alternative in {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd1(CLUBParser.Add1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Add2}
	 * labeled alternative in {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd2(CLUBParser.Add2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult1}
	 * labeled alternative in {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult1(CLUBParser.Mult1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult2}
	 * labeled alternative in {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult2(CLUBParser.Mult2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary1}
	 * labeled alternative in {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary1(CLUBParser.Unary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary2}
	 * labeled alternative in {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary2(CLUBParser.Unary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PostF1}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostF1(CLUBParser.PostF1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PostF2}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostF2(CLUBParser.PostF2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PostF3}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostF3(CLUBParser.PostF3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PostF4}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostF4(CLUBParser.PostF4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PostF5}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostF5(CLUBParser.PostF5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Primary1}
	 * labeled alternative in {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary1(CLUBParser.Primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Primary2}
	 * labeled alternative in {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary2(CLUBParser.Primary2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(CLUBParser.ValContext ctx);
}