import org.antlr.v4.runtime.CommonToken;


public class VecMathBuildASTVisitor extends VecMathBaseVisitor<AST> {
    @Override
    public AST visitProg(VecMathParser.ProgContext ctx) {
        AST ast = new AST();
        for (VecMathParser.StatContext stmt : ctx.stat()) {
            ast.addChild(visit(stmt));
        }
        return ast;
    }

    @Override
    public AST visitStatAssign(VecMathParser.StatAssignContext ctx) {
        AST ast = new AST(ctx.assign);
        ast.addChild(new AST(ctx.ID().getSymbol()));
        ast.addChild(visit(ctx.expr()));
        return ast;
    }

    @Override
    public AST visitStatPrint(VecMathParser.StatPrintContext ctx) {
        AST ast = new AST(ctx.print);
        ast.addChild(visit(ctx.expr()));
        return ast;
    }

    @Override
    public AST visitExprMult(VecMathParser.ExprMultContext ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.left));
        ast.addChild(visit(ctx.right));
        return ast;
    }

    @Override
    public AST visitExprAdd(VecMathParser.ExprAddContext ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.left));
        ast.addChild(visit(ctx.right));
        return ast;
    }

    @Override
    public AST visitExprVec(VecMathParser.ExprVecContext ctx) {
        AST ast = new AST(new CommonToken(VecMathParser.VEC, "VEC"));
        for (VecMathParser.ExprContext expr : ctx.expr()) {
            ast.addChild(visit(expr));
        }
        return ast;
    }

    @Override
    public AST visitExprId(VecMathParser.ExprIdContext ctx) {
        AST ast = new AST(ctx.ID().getSymbol());
        return ast;
    }

    @Override
    public AST visitExprInt(VecMathParser.ExprIntContext ctx) {
        AST ast = new AST(ctx.INT().getSymbol());
        return ast;
    }
}