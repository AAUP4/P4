import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("C:\\Users\\night\\Documents\\Github\\P4\\Antlr4_AST3\\src\\test.expr");
        CharStream input2 = CharStreams.fromFileName("C:\\Users\\night\\Documents\\Github\\P4\\Antlr4_AST3\\src\\test.club");

        CLUBLexer Clexer = new CLUBLexer(input2);
        CommonTokenStream Ctokens = new CommonTokenStream(Clexer);
        CLUBParser Cparser = new CLUBParser(Ctokens);
        ParseTree Ctree = Cparser.program();

        AST ast = new ClubBuildASTVisitor().visit(Ctree);

        if (ast != null) {
            System.out.println(ast.toStringTree());
        } else {
            System.out.println("AST is null.");
        }



        /*Lexer Tokens and Parser for VecMath*/
        /*
        VecMathLexer lexer = new VecMathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VecMathParser parser = new VecMathParser(tokens);
        ParseTree tree = parser.prog();
        for (AST ast : new VecMathBuildASTVisitor().visit(tree).getChildren()) {
            System.out.println(ast.toStringTree());
        }*/
    }
}





























