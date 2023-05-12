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
	 * Enter a parse tree produced by the {@code Assign1}
	 * labeled alternative in {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssign1(CLUBParser.Assign1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign1}
	 * labeled alternative in {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssign1(CLUBParser.Assign1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign2}
	 * labeled alternative in {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssign2(CLUBParser.Assign2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign2}
	 * labeled alternative in {@link CLUBParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssign2(CLUBParser.Assign2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicOr1}
	 * labeled alternative in {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOr1(CLUBParser.LogicOr1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicOr1}
	 * labeled alternative in {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOr1(CLUBParser.LogicOr1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicOr2}
	 * labeled alternative in {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOr2(CLUBParser.LogicOr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicOr2}
	 * labeled alternative in {@link CLUBParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOr2(CLUBParser.LogicOr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicAnd1}
	 * labeled alternative in {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAnd1(CLUBParser.LogicAnd1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicAnd1}
	 * labeled alternative in {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAnd1(CLUBParser.LogicAnd1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicAnd2}
	 * labeled alternative in {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAnd2(CLUBParser.LogicAnd2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicAnd2}
	 * labeled alternative in {@link CLUBParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAnd2(CLUBParser.LogicAnd2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal1}
	 * labeled alternative in {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqual1(CLUBParser.Equal1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal1}
	 * labeled alternative in {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqual1(CLUBParser.Equal1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal2}
	 * labeled alternative in {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqual2(CLUBParser.Equal2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal2}
	 * labeled alternative in {@link CLUBParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqual2(CLUBParser.Equal2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Relat1}
	 * labeled alternative in {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelat1(CLUBParser.Relat1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Relat1}
	 * labeled alternative in {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelat1(CLUBParser.Relat1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Relat2}
	 * labeled alternative in {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelat2(CLUBParser.Relat2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Relat2}
	 * labeled alternative in {@link CLUBParser#relatExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelat2(CLUBParser.Relat2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Add1}
	 * labeled alternative in {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdd1(CLUBParser.Add1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Add1}
	 * labeled alternative in {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdd1(CLUBParser.Add1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Add2}
	 * labeled alternative in {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdd2(CLUBParser.Add2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Add2}
	 * labeled alternative in {@link CLUBParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdd2(CLUBParser.Add2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult1}
	 * labeled alternative in {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMult1(CLUBParser.Mult1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult1}
	 * labeled alternative in {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMult1(CLUBParser.Mult1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult2}
	 * labeled alternative in {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMult2(CLUBParser.Mult2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult2}
	 * labeled alternative in {@link CLUBParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMult2(CLUBParser.Mult2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary1}
	 * labeled alternative in {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnary1(CLUBParser.Unary1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary1}
	 * labeled alternative in {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnary1(CLUBParser.Unary1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary2}
	 * labeled alternative in {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnary2(CLUBParser.Unary2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary2}
	 * labeled alternative in {@link CLUBParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnary2(CLUBParser.Unary2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PostF1}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostF1(CLUBParser.PostF1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PostF1}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostF1(CLUBParser.PostF1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PostF2}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostF2(CLUBParser.PostF2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PostF2}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostF2(CLUBParser.PostF2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PostF3}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostF3(CLUBParser.PostF3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PostF3}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostF3(CLUBParser.PostF3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PostF4}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostF4(CLUBParser.PostF4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PostF4}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostF4(CLUBParser.PostF4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PostF5}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostF5(CLUBParser.PostF5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PostF5}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostF5(CLUBParser.PostF5Context ctx);
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
}