import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("C:\\Users\\night\\Documents\\GitHub\\P4\\Expr\\src\\test.expr");
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
                // If start rule changes name remember to rename this function as well
                public void exitProgram(ExprParser.ProgramContext ctx) {
                    System.out.println("Result: " + ctx.getText());
                }
            };

            walker.walk(listener, parser.program());


            //parser.addParseListener(new ExprBaseListener());
            /*
            ParserRuleContext contexttest = parser.program();
            ParseTree treetest = contexttest.getChild(0);
            String treeString = treetest.toStringTree(parser);
            System.out.println(treeString);*/
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}