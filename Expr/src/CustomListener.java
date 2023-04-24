import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
public class CustomListener extends ExprBaseListener {

    private int indent = 0;
    private String[] tokenNames;

    public CustomListener(){
        tokenNames = ExprParser._SYMBOLIC_NAMES;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        printIndent();
        System.out.println("(" + ctx.getClass().getSimpleName() + ")");
        indent++;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        indent--;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        Token token = node.getSymbol();
        String symbolName = tokenNames[token.getType()];
        printIndent();
        System.out.println(symbolName + ": " + node.getText());
    }

    private void printIndent() {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }
}
