import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception {
        
        String relativePath = "src/GoFish.club";
        String absolutePath = System.getProperty("user.dir") + "/" + relativePath;
        CharStream input2 = CharStreams.fromFileName(absolutePath);


        CLUBLexer Clexer = new CLUBLexer(input2);
        CommonTokenStream Ctokens = new CommonTokenStream(Clexer);
        CLUBParser Cparser = new CLUBParser(Ctokens);
        ParseTree Ctree = Cparser.program();

        AST ast = new ClubBuildASTVisitor().visit(Ctree);
        if (ast != null) {
            System.out.println(ast.toStringTree());                                  
            System.out.println(CLUBtoJava.readFileLines());
            System.out.println("Test:");  
            CLUBtoJava.writeToJavaFile();

        } else {
            System.out.println("AST is null.");
        }
    }    
}





























