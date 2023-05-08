import java.util.Scanner;

public class Game {    

    private static final Scanner scanner = new Scanner(System.in);

    public void exit(Player player){
        // Winner and scoreboard

        System.exit(0);
    }
    public static void exit(){
        System.out.println("It is a draw!");
        // Prints Scoreboard
        

        System.exit(0);
    }
    public static void print(String textToPrint){
        System.out.println(textToPrint);
    }    

    public static String input() {
        System.out.print("");
        return scanner.nextLine();
    }

    public static String input(String textToUser){
        System.out.print(textToUser);
        return scanner.nextLine();
    }


}
