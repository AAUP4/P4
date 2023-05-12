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
        ast.addChild(visit(ctx.stmts()));
        return ast;
    }

    @Override
    public AST visitRound(CLUBParser.RoundContext ctx) {
        AST ast = new AST(ctx.ROUND().getSymbol());
        i = 0;
        ast.addChild(visit(ctx.stmts()));
        return ast;
    }


    @Override
    public AST visitStmts(CLUBParser.StmtsContext ctx) {
        AST ast = new AST(ctx.getStart());
        i = 0;
        for(CLUBParser.StmtContext stmt : ctx.stmt()){
            i++;
        }
        for(int x = 1; x < i; x++){
            ast.addChild(visit(ctx.stmt(x)));
        }
        return ast;
    }
    @Override
    public AST visitStmt(CLUBParser.StmtContext ctx) {
        AST ast = new AST(ctx.getStart());
//        ast.addChild(new AST(ctx.INTVAL().getSymbol()));
        return ast;
    }
//    @Override
//    public AST visitStmts(CLUBParser.StmtsContext ctx) {
//        AST ast = new AST(ctx.getStart());
////        CLUBParser.StmtsContext ctx2 = ctx;
//        int childCount = ctx.getChildCount();
//        if (childCount > 0) {
//            ast.addChild(visit(ctx.stmt()));
////            ctx.setParent(ctx2);
//            ast.addChild(visit(ctx.stmts()));
//        }
//        return ast;
//    }
//    @Override
//    public AST visitStmts(CLUBParser.StmtsContext ctx){
//        AST ast = new AST(ctx.getStart());
//        int childCount = ctx.getChildCount();
//        for(int i = 0; i < childCount; i++){
//            if(ctx.getChild(i) instanceof CLUBParser.StmtsContext){
//                ast.addChild(visit(ctx.getChild(i)));
//            }
//        }
//        return ast;
//    }

    //    Rule for VisitTurn, Probably works but we dont have the rules for the parameters for it.
//    @Override
//    public AST visitTurn(CLUBParser.TurnContext ctx) {
//        AST ast = new AST(ctx.TURN().getSymbol());
//        ast.addChild(visit(ctx.stmts()));
//        return ast;
//    }
}

