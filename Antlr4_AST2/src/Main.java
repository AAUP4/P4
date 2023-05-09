import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("C:\\Users\\night\\IdeaProjects\\Antlr4_AST2\\src\\test.expr");
//        File directory = new File("Antlr4_AST2/src/test.expr");
//        System.out.println("TEST: " + directory.getAbsolutePath());
//        String filePath = directory.getAbsolutePath();
//        CharStream input = CharStreams.fromFileName(filePath);

        //CharStream input = CharStreams.fromFileName(args[0]);
        VecMathLexer lexer = new VecMathLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VecMathParser parser = new VecMathParser(tokens);

        ParseTree tree = parser.prog();

        for (AST ast : new VecMathBuildASTVisitor().visit(tree).getChildren()) {
            System.out.println(ast.toStringTree());
        }
    }
}