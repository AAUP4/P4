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
	 * Visit a parse tree produced by {@link CLUBParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(CLUBParser.StmtsContext ctx);
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
	 * Visit a parse tree produced by {@link CLUBParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(CLUBParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CLUBParser.TypeContext ctx);
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
	 * Visit a parse tree produced by {@link CLUBParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CLUBParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CLUBParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CLUBParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(CLUBParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrExpr(CLUBParser.LogicOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndExpr(CLUBParser.LogicAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(CLUBParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelatExpr(CLUBParser.RelatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(CLUBParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(CLUBParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(CLUBParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfExpr(CLUBParser.PostfExprContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link CLUBParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(CLUBParser.DeclContext ctx);
}