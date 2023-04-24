// Generated from C:/Users/night/Documents/GitHub/P4/Expr/src\Expr.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#setup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup(ExprParser.SetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#round}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRound(ExprParser.RoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#turn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurn(ExprParser.TurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#funcs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncs(ExprParser.FuncsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(ExprParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ExprParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#tParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTParams(ExprParser.TParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ExprParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#iterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterStmt(ExprParser.IterStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(ExprParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(ExprParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExprParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#tParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTParam(ExprParser.TParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ExprParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ExprParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ExprParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(ExprParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#logicOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrExpr(ExprParser.LogicOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#logicAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndExpr(ExprParser.LogicAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(ExprParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#relatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelatExpr(ExprParser.RelatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(ExprParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(ExprParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#postfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfExpr(ExprParser.PostfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(ExprParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(ExprParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ExprParser.DeclContext ctx);
}