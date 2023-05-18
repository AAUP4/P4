import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.junit.Assert.*;
public class TestTypeChecker {

    @Test 
    public void TestTypeChecker() {
        TypeCheck.TypeMapSetup();
        
        boolean result = TypeCheck.processInput("deck.returnDiscardPile(Player.getPlayer(15243))");        
        // System.out.print(TypeCheck.method);
        assertEquals(true, result);
        
    }
    @Test 
    public void TestTypeChecker2() {
        TypeCheck.TypeMapSetup();
        boolean result = TypeCheck.VM.containsKey("deck.returnDiscardPile(Player.getPlayer(INT))");        
        assertEquals(true, result);
    }
    
    @Test
    public void testAll(){
        TypeCheck.TypeMapSetup();
        for (Map.Entry<String, ArrayList<String>> set : TypeCheck.VM.entrySet()) {    
            String x = set.getKey();
            System.out.println(x);
            boolean result = TypeCheck.VM.containsKey(x);        
            assertEquals(true, result);
        }
    }
    @Test
    public void testCheckArithExpr(){
        TypeCheck.declVar("x","INT","7");
        TypeCheck.assignVar("x", "x++");
        boolean v = TypeCheck.checkArithExpr("-x+3*x-(4*2)");
        assertEquals(true, v);
    }

    @Test
    public void testCheckLogicExpr(){
        TypeCheck.declVar("x","BOOL","true");
        TypeCheck.assignVar("x", "false");
        TypeCheck.assignVar("x", "!x");
        TypeCheck.declVar("y","INT","7");
        TypeCheck.assignVar("y", "y++");
        boolean v = TypeCheck.checkLogicExpr("-y+3*y-(4*2)<y&&y!=0");
        assertEquals(true, v);
    }
}