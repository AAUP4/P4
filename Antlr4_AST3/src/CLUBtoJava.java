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
        String readFromFile = "";
        for (int i = 0; i < readFileLines().size(); i++ ) {
            if(readFileLines().get(i).equals("Setup")){
                System.out.println("public void Setup()");
                //readFromFile.concat("Test");
                readFromFile += "public void Setup()";
            }
            else if(readFileLines().get(i).equals("Round")){
                System.out.println("public void Round()");
                readFromFile += "public void Round()";
            }
            else if(readFileLines().get(i).equals("Turn")){
                System.out.print("public void Turn");
                readFromFile += "public void Turn";
            }
            else if(readFileLines().get(i).startsWith("player")){
                System.out.println(" player");
                readFromFile += " player";
            }
            else if(readFileLines().get(i).equals("bool")){
                if (readFileLines().get(i+2).equals("=")) {
                    System.out.print(readFileLines().get(i+1));
                    boolDecl.put(readFileLines().get(i+1), "Boolean ");
                    readFromFile += readFileLines().get(i+1);
                    i+=1;
                    
                }
                else {
                    System.out.print("Boolean ");
                    readFromFile += "Boolean ";
                }
                
            }
            else if(readFileLines().get(i).equals("int")){
                if (readFileLines().get(i+2).equals("=")) {
                    System.out.print(readFileLines().get(i+1));
                    readFromFile += readFileLines().get(i+1);
                    intDecl.put(readFileLines().get(i+1), "int ");
                    i+=1;
                }
                // in case its a new function do:
                else {
                    System.out.print("int ");
                    readFromFile += "int ";
                }
            }
            else if(readFileLines().get(i).equals("string")){
                
                if(readFileLines().get(i+2).equals("=")){
                    System.out.print(readFileLines().get(i+1));
                    stringDecl.put(readFileLines().get(i+1), "String ");
                    readFromFile += readFileLines().get(i+1);
                    i+=1;
                } else {
                    System.out.print("String ");
                    readFromFile += "String ";
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
            else{
                System.out.print(readFileLines().get(i));
                readFromFile += readFileLines().get(i);
            }                
        } 
        readFromFile += "\n" + printVarDecl();
        System.out.println("This is the string input: " + readFromFile);
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
            checkIfFileExistElseCreate("Javaoutput.java");
            FileWriter fileWriter = new FileWriter("Javaoutput.java");
            
            
            fileWriter.write(ConvertToJava());
            fileWriter.close();
            System.out.println("Its lit");
        }
        catch (IOException e) {
            System.out.println("Its Britney bitch!");
        }
    }

    public static void checkIfFileExistElseCreate(String fileName) {
        try {
            File obj = new File("Javaoutput.txt");
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
}
