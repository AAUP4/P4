import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



 


public class CLUBtoJava {


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

    public static void ConvertToJava(){        
        
        for (int i = 0; i < readFileLines().size(); i++ ) {
            if(readFileLines().get(i).equals("Setup")){
                System.out.println("public void Setup()");
            }
            else if(readFileLines().get(i).equals("Round")){
                System.out.println("public void Round()");
            }
            else if(readFileLines().get(i).equals("Turn(Player")){
                System.out.print("public void Turn(Player");
            }
            else if(readFileLines().get(i).startsWith("player)")){
                System.out.println(" player){");
            }
            else if(readFileLines().get(i).equals("bool")){
                System.out.print("Boolean ");
            }
            else if(readFileLines().get(i).equals("int")){
                System.out.print("int ");
            }
            else if(readFileLines().get(i).equals("string")){
                System.out.print("String ");
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
                i += j - 1;
            }
            else if(readFileLines().get(i).equals("}")){
                System.out.println("}");
            }
            else if(readFileLines().get(i).equals("{")){
                System.out.println("{");
            }
            else if(readFileLines().get(i).startsWith("for")){
                System.out.print("for(int ");
            }
            else{
                System.out.print(readFileLines().get(i));
            }
                 
        }
    }




}
