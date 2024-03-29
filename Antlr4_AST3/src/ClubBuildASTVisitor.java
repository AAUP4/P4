import java.util.ArrayList;

public class ClubBuildASTVisitor extends CLUBBaseVisitor<AST> {
    ArrayList<String> FuncCalls = new ArrayList<>();

    // Start of tree
    @Override
    public AST visitProgram(CLUBParser.ProgramContext ctx) {
        TypeCheck.TypeMapSetup();
        AST ast = new AST();
        ast.addChild(visit(ctx.setup()));
        ast.addChild(visit(ctx.round()));
        ast.addChild(visit(ctx.turn()));
        int i = 0;
        for (CLUBParser.FuncContext func : ctx.func()) {
            ast.addChild(visit(ctx.func(i)));
            i++;
        }
        if(!FuncCalls.isEmpty()) {
            for (String funcCall : FuncCalls) {
                if(!TypeCheck.FuncIDs.isEmpty()) {
                    if (!TypeCheck.FuncIDs.contains(funcCall)) {
                        throw new IllegalArgumentException("Function " + funcCall + " has not been declared.");
                    }
                } else {throw new IllegalArgumentException("Function " + funcCall + " has not been declared.");}
            }
        }
        return ast;
    }

    @Override
    public AST visitSetup(CLUBParser.SetupContext ctx) {
        TypeCheck.declFunc("Setup");
        AST ast = new AST(ctx.SETUP().getSymbol());
        int i = 0;
        for (CLUBParser.StmtContext stmt : ctx.stmt()) {
            ast.addChild(visit(ctx.stmt(i)));
            i++;
        }
        return ast;
    }

    @Override
    public AST visitRound(CLUBParser.RoundContext ctx) {
        TypeCheck.declFunc("Round");
        AST ast = new AST(ctx.ROUND().getSymbol());
        int i = 0;
        for (CLUBParser.StmtContext stmt : ctx.stmt()) {
            ast.addChild(visit(ctx.stmt(i)));
            i++;
        }
        return ast;
    }
     @Override
     public AST visitTurn1(CLUBParser.Turn1Context ctx){

         TypeCheck.declFunc("Turn");
         AST ast = new AST(ctx.TURN().getSymbol());
         int i = 0;
         for (CLUBParser.StmtContext stmt : ctx.stmt()) {
             ast.addChild(visit(ctx.stmt(i)));
             i++;
         }
         return ast;
    }


    @Override
    public AST visitFunc(CLUBParser.FuncContext ctx){
        TypeCheck.declFunc(ctx.left.getText());
        AST ast = new AST(ctx.left);
        int i = 0;
        for (CLUBParser.StmtContext stmt : ctx.stmt()) {
            ast.addChild(visit(ctx.stmt(i)));
            i++;
        }
        return ast;
    }

    @Override
    public AST visitStmt1(CLUBParser.Stmt1Context ctx) {
        if(!TypeCheck.processInput(ctx.tParam().getText()+ctx.op.getText()+ctx.logicOrExpr().getText(),"VOID")){ throw new IllegalArgumentException("Input is not a valid declaration.");}
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.tParam()));
        ast.addChild(visit(ctx.logicOrExpr()));

        return ast;
    }

    public AST visitStmt1_2(CLUBParser.Stmt1_2Context ctx) {
        if(!TypeCheck.processInput(ctx.tParam().getText()+ctx.op.getText()+ctx.right.getText(),"VOID")){ throw new IllegalArgumentException("Input is not a valid declaration.");}
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.tParam()));
        ast.addChild(new AST(ctx.right));

        return ast;
    }

    @Override
    public AST visitStmt2(CLUBParser.Stmt2Context ctx) {
        return visit(ctx.assignExpr());
    }

    @Override
    public AST visitStmt3(CLUBParser.Stmt3Context ctx) {
        return visit(ctx.selectStmt());
    }

    @Override
    public AST visitStmt4(CLUBParser.Stmt4Context ctx) {
        return visit(ctx.iterStmt());
    }

    @Override
    public AST visitStmt5(CLUBParser.Stmt5Context ctx) {
        TypeCheck.processInput(ctx.left.getText(),"VOID");
        return new AST(ctx.left);
    }

    @Override
    public AST visitStmt6(CLUBParser.Stmt6Context ctx) {
        FuncCalls.add(ctx.left.getText());
        return new AST(ctx.left);
    }

    @Override
    public AST visitStmt7(CLUBParser.Stmt7Context ctx) {
        TypeCheck.checkValidValue(ctx.param.getText(),"VOID");
        return new AST(ctx.left);
    }


    @Override
    public AST visitStmt8(CLUBParser.Stmt8Context ctx) {
        return new AST(ctx.left);
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
    public AST visitSelectStmt(CLUBParser.SelectStmtContext ctx) {
        AST ast = new AST(ctx.IF().getSymbol());
        if(!TypeCheck.checkValidValue(ctx.logicOrExpr().getText(),"BOOL")){ throw new IllegalArgumentException(ctx.logicOrExpr().getText()+" is not a valid logic expression.");}
        ast.addChild(visit(ctx.logicOrExpr()));
        int i = 0;
        for (CLUBParser.StmtContext stmt : ctx.stmt()) {
            ast.addChild(visit(ctx.stmt(i)));
            i++;
        }
        return ast;
    }

    @Override
    public AST visitWhile(CLUBParser.WhileContext ctx) {
        AST ast = new AST(ctx.WHILE().getSymbol());
        if(!TypeCheck.checkValidValue(ctx.logicOrExpr().getText(),"BOOL")){ throw new IllegalArgumentException(ctx.logicOrExpr().getText()+" is not a valid logic expression.");}
        ast.addChild(visit(ctx.logicOrExpr()));
        int i = 0;
        for (CLUBParser.StmtContext stmt : ctx.stmt()) {
            ast.addChild(visit(ctx.stmt(i)));
            i++;
        }
        return ast;
    }

    @Override
    public AST visitFor(CLUBParser.ForContext ctx) {
        AST ast = new AST(ctx.FOR().getSymbol());
        AST decl = new AST(ctx.op);
        ast.addChild(decl);
        if(!TypeCheck.processInput(ctx.tParam().getText()+"="+ctx.addExpr().getText(),"VOID")){ throw new IllegalArgumentException("Input is not a valid declaration.");}
        decl.addChild(visit(ctx.tParam()));
        decl.addChild(visit(ctx.addExpr()));
        if(!TypeCheck.checkValidValue(ctx.logicOrExpr().getText(),"BOOL")){ throw new IllegalArgumentException(ctx.logicOrExpr().getText()+" is not a valid logic expression.");}
        ast.addChild(visit(ctx.logicOrExpr()));
        AST incr = new AST(ctx.rop);
        ast.addChild(incr);
        if(!TypeCheck.checkValidValue(ctx.right.getText()+ctx.rop.getText(),"INT")){ throw new IllegalArgumentException(ctx.right.getText()+ctx.rop.getText()+" is not a valid arithmetic expression.");}
        incr.addChild(new AST(ctx.right));
        int i = 0;
        for (CLUBParser.StmtContext stmt : ctx.stmt()) {
            ast.addChild(visit(ctx.stmt(i)));
            i++;
        }
        return ast;
    }

    @Override
    public AST visitAssignExpr(CLUBParser.AssignExprContext ctx) {
        if(!TypeCheck.processInput(ctx.left.getText()+ctx.op.getText()+ctx.logicOrExpr().getText(),ctx.left.getText().toUpperCase())){ throw new IllegalArgumentException("Input is not a valid assignment.");}
        AST ast = new AST(ctx.op);
        AST l = new AST(ctx.left);
        ast.addChild(l);
        ast.addChild(visit(ctx.logicOrExpr()));
        return ast;
    }

    @Override
    public AST visitLogicOr1(CLUBParser.LogicOr1Context ctx) {
        return visit(ctx.logicAndExpr());
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
        return visit(ctx.equalExpr());
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
        return visit(ctx.relatExpr());
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
        return visit(ctx.addExpr());
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
        return visit(ctx.multExpr());
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
        return visit(ctx.unaryExpr());
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
        return visit(ctx.postfExpr());
    }

    @Override
    public AST visitUnary2(CLUBParser.Unary2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.postfExpr()));
        return ast;
    }

    @Override
    public AST visitPostF1(CLUBParser.PostF1Context ctx) {
        return visit(ctx.primaryExpr());
    }

    @Override
    public AST visitPostF2(CLUBParser.PostF2Context ctx) {
        AST ast = new AST(ctx.op);
        ast.addChild(visit(ctx.primaryExpr()));
        return ast;
    }



    @Override
    public AST visitPostF3(CLUBParser.PostF3Context ctx) {
        if(!TypeCheck.processInput(ctx.left.getText(),"BOOL")){ throw new IllegalArgumentException("Input is not a valid method call.");}
        return new AST(ctx.left);
    }

    @Override
    public AST visitPostF4(CLUBParser.PostF4Context ctx) {
        if(!TypeCheck.processInput(ctx.left.getText(),"INT")){ throw new IllegalArgumentException("Input is not a valid method call.");}
        return new AST(ctx.left);
    }

    @Override
    public AST visitPostF5(CLUBParser.PostF5Context ctx) {
        if(!TypeCheck.processInput(ctx.left.getText(),"STRING")){ throw new IllegalArgumentException("Input is not a valid method call.");}
        return new AST(ctx.left);
    }

    @Override
    public AST visitPrimary1(CLUBParser.Primary1Context ctx) {
        return visit(ctx.val());
    }

    @Override
    public AST visitPrimary2(CLUBParser.Primary2Context ctx) {
        if(!TypeCheck.checkVarExist(ctx.left.getText())){ throw new IllegalArgumentException("Input is not a valid variable.");}
        return new AST(ctx.left);
    }


    @Override
    public AST visitVal(CLUBParser.ValContext ctx) {
        return new AST(ctx.left);
    }
}

