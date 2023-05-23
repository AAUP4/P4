import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;



 


public class CLUBtoJava {

    static HashMap<String, String> intDecl = new HashMap();
    static HashMap<String, String> stringDecl = new HashMap();
    static HashMap<String, String> boolDecl = new HashMap();


    static String relativePath = "src/test.club";
    static String absolutePath = System.getProperty("user.dir") + "/" + relativePath;

    public static List<String> readFileLines() {
        List<String> tokens = new ArrayList<>();
        try (FileReader fileReader = new FileReader(absolutePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    tokens.add(tokenizer.nextToken());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tokens;
    }

    public static String ConvertToJava(){  
        String readFromFile = "public class Main {\npublic static Deck deck = new Deck();\npublic static Table table = new Table();\npublic static void main(String[] args) {\nSetup();\nfor (Player player : Player.getPlayers()){\nRound();\n}\nGame.exit();\n}\n";
        for (int i = 0; i < readFileLines().size(); i++ ) {
            if(readFileLines().get(i).equals("Setup")){
                System.out.println("public static void Setup()");
                //readFromFile.concat("Test");
                readFromFile += "public static void Setup()";
            }
            else if(readFileLines().get(i).equals("Round")){
                System.out.println("public static void Round()");
                readFromFile += "public static void Round()";
            }
            else if(readFileLines().get(i).equals("Turn")){
                System.out.print("public static void Turn");
                readFromFile += "public static void Turn";
            }
            else if(readFileLines().get(i).startsWith("player")){
                System.out.println(" player");
                readFromFile += " player";
            }
            else if(readFileLines().get(i).equals("bool")){
                if (readFileLines().get(i+2).equals("=")) {
                    System.out.print("Vars." + readFileLines().get(i+1));
                    boolDecl.put(readFileLines().get(i+1), "public static Boolean ");
                    readFromFile += "Vars." + readFileLines().get(i+1);
                    i+=1;
                    
                }
                else {
                    System.out.print("Boolean ");
                    readFromFile += "static Boolean ";
                }
                
            }
            else if(readFileLines().get(i).equals("int")){
                if (readFileLines().get(i+2).equals("=")) {
                    System.out.print(readFileLines().get(i+1));
                    readFromFile += "Vars." + readFileLines().get(i+1);
                    intDecl.put(readFileLines().get(i+1), "public static int ");
                    i+=1;
                }
                // in case its a new function do:
                else {
                    System.out.print("int ");
                    readFromFile += "static int ";
                }
            }
            else if(readFileLines().get(i).equals("string")){
                
                if(readFileLines().get(i+2).equals("=")){
                    System.out.print(readFileLines().get(i+1));
                    stringDecl.put(readFileLines().get(i+1), "public static String ");
                    readFromFile += "Vars." + readFileLines().get(i+1);
                    i+=1;
                } else {
                    System.out.print("static String ");
                    readFromFile += "static String ";
                }
            }
            else if(readFileLines().get(i).startsWith("\"")) {
                int j = 0;
                Boolean keepGoing = true;
                StringBuilder temp = new StringBuilder();
                while (keepGoing) {
                    if (readFileLines().get(i+j).endsWith(";")) {
                        temp.append(readFileLines().get(i+j));
                        keepGoing = false;
                    }
                    else {
                        temp.append(readFileLines().get(i+j));
                        temp.append(" ");
                    }
                    j++;
                }
                System.out.println(temp);
                readFromFile += temp;
                i += j - 1;
            }
            else if(readFileLines().get(i).equals("}")){
                System.out.println("}");
                readFromFile += "}\n";
            }
            else if(readFileLines().get(i).equals("{")){
                System.out.println("{");
                readFromFile += "\n{";
            }
            else if (intDecl.containsKey(readFileLines().get(i))) {
                readFromFile += "Vars." + readFileLines().get(i);
            }
            else if (stringDecl.containsKey(readFileLines().get(i))) {
                readFromFile += "Vars." + readFileLines().get(i);
            }
            else if (boolDecl.containsKey(readFileLines().get(i))) {
                readFromFile += "Vars." + readFileLines().get(i);
            }
            else if(readFileLines().get(i).contains("++")){
                readFromFile += "Vars." + readFileLines().get(i);

            }
            else if (Character.isUpperCase(readFileLines().get(i).charAt(0))) {
                if (readFileLines().get(i).equals("Round") ||
                 readFileLines().get(i).equals("Setup") || 
                 readFileLines().get(i).equals("Turn")){

                } else {
                    if (readFileLines().get(i).contains("{")) {
                        readFromFile += "public void " + readFileLines().get(i).substring(0, readFileLines().get(i).length()-1) + "(){";
                    }
                    else if (readFileLines().get(i).contains("(")){
                        readFromFile += readFileLines().get(i);
                    }
                    else {
                        readFromFile += readFileLines().get(i);
                    }
                }
                
                
            }
            else{
                System.out.print(readFileLines().get(i));
                readFromFile += readFileLines().get(i);
            }                
        } 
        readFromFile += "\n" + "}";
        // System.out.println("This is the string input: " + readFromFile);
        return readFromFile;
    }

    

    public static String printVarDecl() {
        StringBuilder builder = new StringBuilder();
        intDecl.forEach((varName, varType) -> builder.append(varType).append(varName).append(";\n"));
        stringDecl.forEach((varName, varType) -> builder.append(varType).append(varName).append(";\n"));
        boolDecl.forEach((varName, varType) -> builder.append(varType).append(varName).append(";\n"));
        return builder.toString();
    }



    public static void writeToJavaFile() {        
        try {
            // Main File
            checkIfFileExistElseCreate("Javaoutput.java");
            FileWriter fileWriter = new FileWriter("Javaoutput.java");
            fileWriter.write(ConvertToJava());
            fileWriter.close();
            // Vars file
            checkIfFileExistElseCreate("Vars.java");
            FileWriter varWriter = new FileWriter("Vars.java");
            varWriter.write("public abstract class Vars {\n" + printVarDecl() + "}");
            varWriter.close();
            System.out.println("Its lit");
        }
        catch (IOException e) {
            System.out.println("Its Britney bitch!");
        }
    }

    public static void checkIfFileExistElseCreate(String fileName) {
        try {
            File obj = new File(fileName);
        if(obj.createNewFile()){
            System.out.println("File created: " + obj.getName());
        } else {
            System.out.println("File Already Exists!");
        }
        } catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
/* TODO: Make 2 files Main and Vars and*/
/* TODO: Generate file 2 and make sure Main imports it */
// TODO: 
}

