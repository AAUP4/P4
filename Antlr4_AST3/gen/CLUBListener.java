// Generated from C:/Users/ida-0/Documents/GitHub/P4/Antlr4_AST3/src\CLUB.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by the {@code Stmt1}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt1(CLUBParser.Stmt1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Stmt1}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt1(CLUBParser.Stmt1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Stmt2}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt2(CLUBParser.Stmt2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Stmt2}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt2(CLUBParser.Stmt2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Stmt3}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt3(CLUBParser.Stmt3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Stmt3}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt3(CLUBParser.Stmt3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Stmt4}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt4(CLUBParser.Stmt4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Stmt4}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt4(CLUBParser.Stmt4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Stmt5}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt5(CLUBParser.Stmt5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Stmt5}
	 * labeled alternative in {@link CLUBParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt5(CLUBParser.Stmt5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CLUBParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CLUBParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void enterFor(CLUBParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link CLUBParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void exitFor(CLUBParser.ForContext ctx);
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
	 * Enter a parse tree produced by the {@code PostF6}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostF6(CLUBParser.PostF6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PostF6}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostF6(CLUBParser.PostF6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PostF7}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostF7(CLUBParser.PostF7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PostF7}
	 * labeled alternative in {@link CLUBParser#postfExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostF7(CLUBParser.PostF7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Primary1}
	 * labeled alternative in {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary1(CLUBParser.Primary1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Primary1}
	 * labeled alternative in {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary1(CLUBParser.Primary1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Primary2}
	 * labeled alternative in {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary2(CLUBParser.Primary2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Primary2}
	 * labeled alternative in {@link CLUBParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary2(CLUBParser.Primary2Context ctx);
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