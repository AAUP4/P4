// Generated from C:/Users/night/Documents/GitHub/P4/Antlr4_AST3/src\CLUB.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLUBParser}.
 */
public interface CLUBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLUBParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CLUBParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CLUBParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(CLUBParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(CLUBParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#round}.
	 * @param ctx the parse tree
	 */
	void enterRound(CLUBParser.RoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#round}.
	 * @param ctx the parse tree
	 */
	void exitRound(CLUBParser.RoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#turn}.
	 * @param ctx the parse tree
	 */
	void enterTurn(CLUBParser.TurnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#turn}.
	 * @param ctx the parse tree
	 */
	void exitTurn(CLUBParser.TurnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(CLUBParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(CLUBParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(CLUBParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(CLUBParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CLUBParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CLUBParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#tParams}.
	 * @param ctx the parse tree
	 */
	void enterTParams(CLUBParser.TParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#tParams}.
	 * @param ctx the parse tree
	 */
	void exitTParams(CLUBParser.TParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CLUBParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CLUBParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void enterIterStmt(CLUBParser.IterStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void exitIterStmt(CLUBParser.IterStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(CLUBParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(CLUBParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(CLUBParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(CLUBParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CLUBParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CLUBParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#tParam}.
	 * @param ctx the parse tree
	 */
	void enterTParam(CLUBParser.TParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#tParam}.
	 * @param ctx the parse tree
	 */
	void exitTParam(CLUBParser.TParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CLUBParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CLUBParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CLUBParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CLUBParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CLUBParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CLUBParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CLUBParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CLUBParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(CLUBParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(CLUBParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrExpr(CLUBParser.LogicOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrExpr(CLUBParser.LogicOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndExpr(CLUBParser.LogicAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndExpr(CLUBParser.LogicAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(CLUBParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(CLUBParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelatExpr(CLUBParser.RelatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelatExpr(CLUBParser.RelatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(CLUBParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(CLUBParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(CLUBParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(CLUBParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(CLUBParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(CLUBParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfExpr(CLUBParser.PostfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfExpr(CLUBParser.PostfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(CLUBParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(CLUBParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(CLUBParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(CLUBParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLUBParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CLUBParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLUBParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CLUBParser.DeclContext ctx);
}