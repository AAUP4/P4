import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ASTtoJava {

    private String lInput;
    public ASTtoJava(String input){
        this.lInput = input;
    }   

    public void convertToJava(String input){
        input = input.replaceAll("[< > ' ,]", " ");

        //String input = this.lInput;
        String[] tokens = input.split("\\s*(?<!\\\\)\\s+\\s*");
        // System.out.println(tokens[3]);
        int i = 0;
        for (String string : tokens) {   
                     
            if(string.equals("(")){
                // Creates Setup
                if(tokens[i+1].equals("SETUP")){
                    convertSetup();
                }
                // Creates Round
                if(tokens[i+1].equals("ROUND")){
                    convertRound();
                }
                // Check if its an Assignment
                if(tokens[i+1].equals("ASSIGN")){
                    
                    // Check if its an int
                    if(tokens[i+3].equals("INT")){
                        convertIntAssignments(tokens[i+4], tokens[i+6], tokens[i+8]);
                    }
                    // Check if its a boolean
                    else if(tokens[i+3].equals("BOOL")){
                        convertBoolAssignments(tokens[i+6], tokens[i+8]);
                    }
                    // Check if it is a string
                    else if(tokens[i+3].equals("STRING")){
                        // If strings has no spaces run this:
                        if(tokens[i+8].endsWith("\"")){
                            convertStringAssignments(tokens[i+6], tokens[i+8]);
                        } 
                        // if it has more spaces we do this:  
                        else {
                            List<String> stringVal = new ArrayList<>();
                            int x = 8;
                            while (!tokens[i + x].equals(")")) {
                                stringVal.add(tokens[i + x]);
                                x++;
                            }
                        
                            StringBuilder output = new StringBuilder();
                            for (int o = 0; o < stringVal.size(); o++) {
                                if (o > 0) {
                                    output.append(" ");
                                }
                                output.append(stringVal.get(o));
                            }
                            convertStringAssignments(tokens[i + 6], output.toString());
                        }
                        
                    }
                    
                }
                if(tokens[i+1].equals("IF")){
                    // convertIf();
                }
            }
            // if we find a double closing parent
            if(string.equals("))") || string.equals(")))")){    
                //Check if there is is anything after these            
                if(tokens.length > i + 2){
                    // If its followed by round we set curly closing
                    if(tokens[i+2].equals("ROUND") && tokens.length - 1 > i){
                        setEndCurlyBracket();
                    }
                    if(tokens[i+2].equals("TURN") && tokens.length - 1 > i){
                        setEndCurlyBracket();
                    }
                    if(tokens[i+2].equals("FUNCID") && tokens.length - 1 > i){
                        setEndCurlyBracket();
                    }

                    // if there is nothing after this we set curly closing
                } else if(tokens.length == i + 1){
                    setEndCurlyBracket();
                }

            }
            i++;
        }
        
    }
    
    public static String convertIntAssignments(String varType, String varName, String value){
        System.out.println(varType + " " + varName + " = " + value + ";");
        return varType + " " + varName + " = " + value + ";";
    }
    public static String convertBoolAssignments(String varName, String value){

        System.out.println("Boolean" + " " + varName + " = " + value + ";");
        return "Boolean" + " " + varName + " = " + value + ";";
    }
    public static String convertStringAssignments(String varName, String value){
            System.out.println("String" + " " + varName + " = " + value + ";");
            return "String" + " " + varName + " = " + value + ";";        
    }
    public static String convertSetup(){
        System.out.println("public void Setup(){");
        return "public void Setup(){";
    }
    public static String convertRound(){
        System.out.println("public void Round(){");
        return "public void Round(){";
    }
    public static String convertTurn(){
        System.out.println("public void Turn(Player player){");
        return "";
    }
    public static String setEndCurlyBracket(){
        System.out.println("}");
        return "}";
    }
    public static String convertPrint(){
        return "";
    }
    public static String convertIf(String logicalOp, String varID, String Val){
        System.out.println("We here");
        return "";
    }



    //  public static String convertExpression(String varType, String varName, String value) {
        
    //     String variableType = tokens[3].substring(1, tokens[3].length() - 2);
    //     String variableName = tokens[5].substring(1, tokens[5].length() - 2);
    //     String value = tokens[7].substring(1, tokens[7].length() - 3);
        
    //     return variableType + " " + variableName + " = " + value + ";";
    // }

}
