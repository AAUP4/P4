import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AST {
    Token token;             // from which token do we create this node?
    List<AST> children;      // normalized list of children

    public AST() { ; } // for making nil-rooted nodes

    public AST(Token token) { this.token = token; }

    /** Create node from token type; used mainly for imaginary tokens */
    public AST(int tokenType) { this.token = new CommonToken(tokenType); }

    /** external visitors execute the same action for all nodes
     * with same node type while walking
     */
    public int getNodeType() { return token.getType(); }

    public void addChild(AST t) {
        if (children == null) children = new ArrayList<>();
        children.add(t);
    }
    public void addChildren(AST... nodes) {
        List<AST> asts = new ArrayList<AST>();
        for (AST node : nodes){asts.add(node);}
        for (int i = 0; i < asts.size(); i++) {
            this.addChild(asts.get(i));
        }
    }

    public List<AST> getChildren() { return children; }

    /** to represent flat lists. A list is a subtree w/o a root, which we simulate
     * with a nil root node. A nil node is a node with token == null.
     */
    public boolean isNil() { return token == null; }

    /** Compute string for single node */
    public String toString() {
        String typeName = CLUBParser.VOCABULARY.getSymbolicName(getNodeType());
        typeName = typeName == null ? token.getText() : typeName;
        return token != null ? "<" +typeName +", '" + token.getText() +"'>": "nil";
    }

    /** Compute string for a whole tree */
    public String toStringTree() {
        if (children == null || children.isEmpty()) return this.toString();

        StringBuilder buf = new StringBuilder();
        if (!isNil()) {
            buf.append('(');
            buf.append(this.toString());
            buf.append(' ');
        }
        for (int i = 0; i < children.size(); i++) {
            AST t = children.get(i); // normalized (unnamed) children
            if (t != null) {  // Null check
                if (i > 0) buf.append(' ');
                buf.append(t.toStringTree());
            }
        }
        if (!isNil()) buf.append(')');
        return buf.toString();
    }
}

