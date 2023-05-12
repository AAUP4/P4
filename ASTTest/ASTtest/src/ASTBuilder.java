import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class ASTBuilder extends CLUBBaseListener{
    static String[] tokenNames = {"NULL", "NULL", "AND", "OR", "EQ", "NOTEQ", "SMALLER", "LARGER", "SMALLEREQ", "BIGGEREQ",
            "INCREM", "DECREM", "PLUS", "MINUS", "MULT", "DIVIDE", "DOT", "NOT",
            "ASSIGN", "COMMA", "SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY",
            "LSQUARE", "RSQUARE", "WS", "SETUP", "ROUND", "TURN", "WHILE",
            "FOR", "IF", "BOOL", "INT", "STRING", "METHODID", "BOOLVAL", "CLASSID",
            "OBJID", "INTVAL", "VARID", "FUNCID", "STRINGVAL"};

    public static void main(String[] args) throws Exception {
        // Create the lexer
        CLUBLexer lexer = new CLUBLexer(CharStreams.fromFileName("C:\\Users\\night\\IdeaProjects\\ASTtest\\src\\input.clubs"));

        // Create a buffer of tokens between the lexer and parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        CLUBParser parser = new CLUBParser(tokens);

        // Parse the input to build the parse tree
        ParseTree tree = parser.program();

        // Create the AST
        ASTNode ast = buildAST(tree);

        // Print the AST
        System.out.println(ast.toStringTree());
    }

    private static ASTNode buildAST(ParseTree tree) {
        if (tree instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) tree;
            Token token = terminalNode.getSymbol();
            String text = "NULL";
            if(token.getType()<44) {
                text = tokenNames[token.getType() + 1] + ", " + token.getText();
            }
            // Create a leaf node
            return new ASTNode(text);
        }

        String ruleName = tree.getClass().getSimpleName().replaceAll("Context$", "");

        ASTNode astNode = new ASTNode(ruleName);
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            ASTNode childNode = buildAST(child);
            astNode.addChild(childNode);
        }

        return astNode;
    }
}
class ASTNode {
    private String value;
    private List<ASTNode> children;

    public ASTNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    public String getValue() {
        return value;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return value;
    }

    public String toStringTree() {
        StringBuilder builder = new StringBuilder();
        toStringTreeHelper(builder, "", "");
        return builder.toString();
    }

    private void toStringTreeHelper(StringBuilder builder, String prefix, String childPrefix) {
        builder.append(prefix);
        builder.append(value);
        builder.append("\n");
        for (int i = 0; i < children.size(); i++) {
            ASTNode child = children.get(i);
            if (i == children.size() - 1) {
                child.toStringTreeHelper(builder, childPrefix + "└── ", childPrefix + "    ");
            } else {
                child.toStringTreeHelper(builder, childPrefix + "├── ", childPrefix + "│   ");
            }
        }
    }
}