import java.util.HashMap;
import java.util.Map;

public abstract class TypeCheck {

    static Map<String, String> VarType = new HashMap<>();
    static Map<String, Integer> VarInt = new HashMap<>();
    static Map<String, Boolean> VarBool = new HashMap<>();
    static Map<String, String> VarString = new HashMap<>();


    static <T> void declVar(String varID, String type, T value){
        if(!checkVarExist(varID)){
            switch (type) {
                case "INT":
                    if(value instanceof Integer) {
                        VarType.put(varID, type);
                        VarInt.put(varID, (Integer) value);
                    } else {
                        throw new IllegalArgumentException("Value does not match variable type for: " + varID);
                    }
                case "BOOL":
                    if(value instanceof Boolean) {
                        VarType.put(varID, type);
                        VarBool.put(varID, (Boolean) value);
                    } else {
                        throw new IllegalArgumentException("Value does not match variable type for: " + varID);
                    }
                case "STRING":
                    if(value instanceof String) {
                        VarType.put(varID, type);
                        VarString.put(varID, (String) value);
                    } else {
                        throw new IllegalArgumentException("Value does not match variable type for: " + varID);
                    }
                default:
                    throw new IllegalStateException("Unexpected type value: " + type);
            }
        } else {
            throw new IllegalArgumentException("The variable with ID: "+varID+" was already declared.");
        }
    }

    static <T> void assignVar(String varID, T value){
        if(VarType.containsKey(varID)) {
            switch () {

            }
        }
    }

    static String checkVarType(String varID){
        if(VarType.containsKey(varID)) {
        return VarType.get(varID);
        } else {
            throw new IllegalArgumentException("Variable is not declared.");
        }
    }

    static int getVarIntValue(String varID) {
        if(VarInt.containsKey(varID)) {
            return VarInt.get(varID);
        } else {
            throw new IllegalArgumentException("Variable ID does not match an int value.");
        }
    }

    static boolean getVarBoolValue(String varID) {
        if(VarBool.containsKey(varID)) {
            return VarBool.get(varID);
        } else {
            throw new IllegalArgumentException("Variable ID does not match a boolean value.");
        }
    }

    static String getVarStringValue(String varID) {
        if(VarString.containsKey(varID)) {
            return VarString.get(varID);
        } else {
            throw new IllegalArgumentException("Variable ID does not match a string value.");
        }
    }

    static boolean checkVarExist(String varID){
        return VarType.containsKey(varID);
    }

}
