import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("C:\\Users\\rasmu\\IdeaProjects\\Expr\\src\\test.expr");
            ExprLexer lexer = new ExprLexer(input);
            /*for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
                if (token.getType() == Token.EOF) {
                    System.out.println("EOF");
                }
                else {
                    System.out.println(token);
                }

            }*/

            ExprParser parser = new ExprParser(new CommonTokenStream(lexer));

            ParseTreeWalker walker = new ParseTreeWalker();
            ExprBaseListener listener = new ExprBaseListener() {
                @Override
                public void exitExpr(ExprParser.ExprContext ctx) {
                    System.out.println("Result: " + ctx.getText());
                }
            };

            walker.walk(listener, parser.expr());



            //parser.addParseListener(new ExprBaseListener());
            //parser.prog();


        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}