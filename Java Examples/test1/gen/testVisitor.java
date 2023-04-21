// Generated from C:/Users/night/Documents/GitHub/P4/Java Examples/test1/src\test.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(testParser.PruleContext ctx);
}