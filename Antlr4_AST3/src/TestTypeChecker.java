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
        TypeCheck.declVar("z","INT","7");
        TypeCheck.assignVar("z", "z++");
        boolean v = TypeCheck.checkArithExpr("-z+3*z-(4*2)");
        assertEquals(true, v);
    }

    @Test
    public void testCheckLogicExpr(){
        TypeCheck.declVar("x","BOOL","true");
        TypeCheck.assignVar("x", "false");
        TypeCheck.assignVar("x", "!x");
        TypeCheck.declVar("y","INT","7");
        TypeCheck.assignVar("y", "7");
        TypeCheck.declVar("z","INT", "5");
        TypeCheck.assignVar("z", "7");
        

        boolean v = TypeCheck.checkLogicExpr("z<y||z>y && z != y && y == z");
                
        assertEquals(true, v);
    }
    @Test
    public void testCheckStringExpr(){
        TypeCheck.declVar("str", "STRING", "\"hello\"");
        // TypeCheck.declVar("strr", "STRING", "\"There\"");
        
        boolean b = TypeCheck.checkStringExpr("str");
        assertEquals(true, b);
    }

    @Test
    public void testCheckLogicExprStringCompare(){
        // TypeCheck.declVar("str", "STRING", "\"hello\"");
        // TypeCheck.declVar("strr", "STRING", "\"There\"");
        
        // boolean w = TypeCheck.checkLogicExpr("str==strr");
        // assertEquals(true, w);
    }



}