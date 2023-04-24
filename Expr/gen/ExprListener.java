// Generated from C:/Users/night/Documents/GitHub/P4/Expr/src\Expr.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(ExprParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(ExprParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#round}.
	 * @param ctx the parse tree
	 */
	void enterRound(ExprParser.RoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#round}.
	 * @param ctx the parse tree
	 */
	void exitRound(ExprParser.RoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#turn}.
	 * @param ctx the parse tree
	 */
	void enterTurn(ExprParser.TurnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#turn}.
	 * @param ctx the parse tree
	 */
	void exitTurn(ExprParser.TurnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(ExprParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(ExprParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(ExprParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(ExprParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExprParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExprParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tParams}.
	 * @param ctx the parse tree
	 */
	void enterTParams(ExprParser.TParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tParams}.
	 * @param ctx the parse tree
	 */
	void exitTParams(ExprParser.TParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ExprParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ExprParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void enterIterStmt(ExprParser.IterStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void exitIterStmt(ExprParser.IterStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(ExprParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(ExprParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(ExprParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(ExprParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tParam}.
	 * @param ctx the parse tree
	 */
	void enterTParam(ExprParser.TParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tParam}.
	 * @param ctx the parse tree
	 */
	void exitTParam(ExprParser.TParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ExprParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ExprParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ExprParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ExprParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ExprParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ExprParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(ExprParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(ExprParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrExpr(ExprParser.LogicOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrExpr(ExprParser.LogicOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndExpr(ExprParser.LogicAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndExpr(ExprParser.LogicAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(ExprParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(ExprParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relatExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelatExpr(ExprParser.RelatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relatExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelatExpr(ExprParser.RelatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ExprParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ExprParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ExprParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ExprParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfExpr(ExprParser.PostfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfExpr(ExprParser.PostfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ExprParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ExprParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(ExprParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(ExprParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ExprParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ExprParser.DeclContext ctx);
}