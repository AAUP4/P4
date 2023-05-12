import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Stack;


public class ClubBuildASTVisitor extends CLUBBaseVisitor<AST> {

    Stack<AST> stack = new Stack<AST>();

    // Start of tree
    @Override
    public AST visitProgram(CLUBParser.ProgramContext ctx) {
        AST ast = new AST();
        ast.addChild(visit(ctx.setup()));
        ast.addChild(visit(ctx.round()));
        ast.addChild(visit(ctx.turn()));
        ast.addChild(visit(ctx.funcs()));
        return ast;
    }
    public int i = 0;

    @Override
    public AST visitSetup(CLUBParser.SetupContext ctx) {
        AST ast = new AST(ctx.SETUP().getSymbol());
        i = 0;
        for(CLUBParser.StmtContext stmt : ctx.stmt()){
            ast.addChild(visit(ctx.stmt(i)));
            i++;
        }
        return ast;
    }

    @Override
    public AST visitRound(CLUBParser.RoundContext ctx) {
        AST ast = new AST(ctx.ROUND().getSymbol());
        i = 0;
        for(CLUBParser.StmtContext stmt : ctx.stmt()){
            ast.addChild(visit(ctx.stmt(i)));
            i++;
        }
        return ast;
    }

    @Override
    public AST visitStmt(CLUBParser.StmtContext ctx) {
        AST ast = new AST(ctx.op);
        switch(ctx.getStart().getType()){
            case 33:
                ast.addChild(visit(ctx.tParam()));
                ast.addChild(visit(ctx.logicOrExpr()));
                break;
            case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                ast.addChild(visit(ctx.assignExpr()));
                break;
            case 30: case 31:

            case 32:

        }

        return ast;
    }

    @Override
    public AST visitTParam(CLUBParser.TParamContext ctx) {
        AST ast = new AST(); // Do this if it has no root node and several children.
        AST left = new AST(ctx.left);
        ast.addChild(left);
        AST right = new AST(ctx.right);
        ast.addChild(right);
        return ast;
    }



    @Override
    public AST visitAssign1(CLUBParser.Assign1Context ctx) {
        AST ast = visit(ctx.logicOrExpr()); // Do this if it has no root node and only 1 child.
        return ast;
    }

    @Override
    public AST visitAssign2(CLUBParser.Assign2Context ctx) {
        AST ast = new AST(ctx.op);
        AST left = new AST(ctx.left);
        ast.addChild(left);
        ast.addChild(visit(ctx.logicOrExpr()));
        return ast;
    }

    @Override
    public AST visitLogicOr1(CLUBParser.LogicOr1Context ctx) {
        AST ast = visit(ctx.logicAndExpr());
        return ast;
    }

    @Override
    public AST visitLogicOr2(CLUBParser.LogicOr2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.logicAndExpr()));
        ast.addChild(visit(ctx.logicOrExpr()));
        return ast;
    }

    @Override
    public AST visitLogicAnd1(CLUBParser.LogicAnd1Context ctx) {
        AST ast = visit(ctx.equalExpr());
        return ast;
    }

    @Override
    public AST visitLogicAnd2(CLUBParser.LogicAnd2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.equalExpr()));
        ast.addChild(visit(ctx.logicAndExpr()));
        return ast;
    }

    @Override
    public AST visitEqual1(CLUBParser.Equal1Context ctx) {
        AST ast = visit(ctx.relatExpr());
        return ast;
    }

    @Override
    public AST visitEqual2(CLUBParser.Equal2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.relatExpr()));
        ast.addChild(visit(ctx.equalExpr()));
        return ast;
    }

    @Override
    public AST visitRelat1(CLUBParser.Relat1Context ctx) {
        AST ast = visit(ctx.addExpr());
        return ast;
    }

    @Override
    public AST visitRelat2(CLUBParser.Relat2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.addExpr()));
        ast.addChild(visit(ctx.relatExpr()));
        return ast;
    }
    @Override
    public AST visitAdd1(CLUBParser.Add1Context ctx) {
        AST ast = visit(ctx.multExpr());
        return ast;
    }

    @Override
    public AST visitAdd2(CLUBParser.Add2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.multExpr()));
        ast.addChild(visit(ctx.addExpr()));
        return ast;
    }
    @Override
    public AST visitMult1(CLUBParser.Mult1Context ctx) {
        AST ast = visit(ctx.unaryExpr());
        return ast;
    }

    @Override
    public AST visitMult2(CLUBParser.Mult2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.unaryExpr()));
        ast.addChild(visit(ctx.multExpr()));
        return ast;
    }
    @Override
    public AST visitUnary1(CLUBParser.Unary1Context ctx) {
        AST ast = visit(ctx.postfExpr());
        return ast;
    }

    @Override
    public AST visitUnary2(CLUBParser.Unary2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.postfExpr()));
        return ast;
    }

    @Override
    public AST visitPostF1(CLUBParser.PostF1Context ctx) {
        AST ast = visit(ctx.primaryExpr());
        return ast;
    }

    @Override
    public AST visitPostF2(CLUBParser.PostF2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.primaryExpr()));
        return ast;
    }
    @Override
    public AST visitPostF3(CLUBParser.PostF3Context ctx) {
        AST ast = new AST();
        ast.addChild(visit(ctx.primaryExpr()));
        ast.addChild(visit(ctx.params()));
        return ast;
    }
    @Override
    public AST visitPostF4(CLUBParser.PostF4Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.primaryExpr()));
        ast.addChild(visit(ctx.postfExpr()));
        return ast;
    }



    //    Rule for VisitTurn, Probably works but we dont have the rules for the parameters for it.
//    @Override
//    public AST visitTurn(CLUBParser.TurnContext ctx) {
//        AST ast = new AST(ctx.TURN().getSymbol());
//        ast.addChild(visit(ctx.stmts()));
//        return ast;
//    }
}

