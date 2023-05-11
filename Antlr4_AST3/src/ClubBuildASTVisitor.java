import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;


public class ClubBuildASTVisitor extends CLUBBaseVisitor<AST> {
    // Start på træet med hovednode
    @Override
    public AST visitProgram(CLUBParser.ProgramContext ctx) {
        AST ast = new AST();
        ast.addChild(visit(ctx.setup()));
        ast.addChild(visit(ctx.round()));
        ast.addChild(visit(ctx.turn()));
        ast.addChild(visit(ctx.funcs()));
        return ast;
    }

    @Override
    public AST visitSetup(CLUBParser.SetupContext ctx) {
        AST ast = new AST(ctx.SETUP().getSymbol());
        ast.addChild(visit(ctx.stmts()));
        return ast;
    }

    @Override
    public AST visitRound(CLUBParser.RoundContext ctx) {
        AST ast = new AST(ctx.ROUND().getSymbol());
        ast.addChild(visit(ctx.stmts()));
        return ast;
    }

    @Override
    public AST visitStmts(CLUBParser.StmtsContext ctx) {
        AST ast = new AST(ctx.getStart());
        int childCount = ctx.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                if (ctx.getChild(i) instanceof CLUBParser.StmtContext) {
                    ast.addChild(visit(ctx.getChild(i)));
                }
            }
        }
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

