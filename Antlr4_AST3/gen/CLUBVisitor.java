// Generated from C:/Users/night/Documents/GitHub/P4/Antlr4_AST3/src\CLUB.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link CLUBParser#funcs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncs(CLUBParser.FuncsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CLUBParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#tParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTParams(CLUBParser.TParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CLUBParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterStmt(CLUBParser.IterStmtContext ctx);
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
	 * Visit a parse tree produced by {@link CLUBParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CLUBParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign1}
	 * labeled alternative in {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign1(CLUBParser.Assign1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign2}
	 * labeled alternative in {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign2(CLUBParser.Assign2Context ctx);
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
	 * Visit a parse tree produced by {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(CLUBParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(CLUBParser.ValContext ctx);
}