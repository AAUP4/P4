import static org.junit.Assert.assertEquals;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.junit.Assert.*;
public class TestTypeChecker {

    @Test 
    public void TestTypeCheckerInt() {
        TypeCheck.TypeMapSetup();
        
        boolean result = TypeCheck.processInput("deck.returnDiscardPile(Player.getPlayer(1))","VOID");        
        // System.out.print(TypeCheck.method);
        assertEquals(true, result);
        
    }
    @Test 
    public void TestTypeCheckerString() {
        TypeCheck.TypeMapSetup();
        TypeCheck.declVar("syv", "INT", "7");
        
        boolean result = TypeCheck.processInput("Game.print(\"hello\" + syv)","VOID");        
        // System.out.print(TypeCheck.method);
        assertEquals(true, result);
        
    }
    @Test 
    public void TestTypeChecker2() {
        TypeCheck.TypeMapSetup();
        TypeCheck.declVar("syv", "INT", "7");

        boolean result = TypeCheck.processInput("deck.returnDiscardPile(Player.getPlayer(12+4 + syv))","VOID");        
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
        TypeCheck.declVar("strr", "STRING", "\"There\"");
        TypeCheck.declVar("moo", "BOOL", "true");
        
        boolean b = TypeCheck.checkStringExpr("str + strr + str");
        assertEquals(true, b);
    }

    @Test
    public void testCheckLogicExprStringCompare(){
        TypeCheck.declVar("str", "STRING", "\"hello\"");
        TypeCheck.declVar("strr", "STRING", "\"There\"");
        
        boolean w = TypeCheck.checkLogicExpr("str == \"3\"");
        assertEquals(true, w);
    }
    @Test
    public void testcheckValidValueBOOL(){
        boolean b = TypeCheck.checkValidValue("true","BOOL");
        assertEquals(true, b);
    }
    @Test
    public void testcheckValidValueINT(){
        boolean b = TypeCheck.checkValidValue("5+4","INT");
        assertEquals(true, b);
    }
    @Test
    public void testcheckValidValueSTRING(){
        boolean b = TypeCheck.checkValidValue("\"hello\"","STRING");
        assertEquals(true, b);
    }


    @Test
    public void testAssignVarSTRING(){
        TypeCheck.declVar("str", "STRING", "\"hello\"");
        assertEquals(TypeCheck.VarString.get("str"),"\"hello\"");
        
        TypeCheck.assignVar("str", "\"there\"");
        assertEquals(TypeCheck.VarString.get("str"),"\"there\"");    
    }



}