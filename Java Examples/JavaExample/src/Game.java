import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Game {    

    private static final Scanner scanner = new Scanner(System.in);

    public static void exit(Player player){
        // Winner and scoreboard
        System.out.println("The winner is "+player+"!");

        Map<String, Integer> scores = new HashMap<>();
        for(Player p : Player.getPlayers()){
            scores.put(p.name,p.score);
        }

        printScoreboard(scores);

        System.exit(0);
    }
    public static void exit(){
        System.out.println("It is a draw!");
        // Prints Scoreboard
        Map<String, Integer> scores = new HashMap<>();
        for(Player p : Player.getPlayers()){
            scores.put(p.name,p.score);
        }

        printScoreboard(scores);

        System.exit(0);
    }
    private static void printScoreboard(Map<String, Integer> scores) {
        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(scores.entrySet());
        Collections.sort(sortedScores, (a, b) -> b.getValue().compareTo(a.getValue()));


        System.out.println("------------------------------");
        System.out.println("|            Scoreboard            |");
        System.out.println("------------------------------");
        System.out.println("| Player      | Score              |");
        System.out.println("------------------------------");

        for (Map.Entry<String, Integer> entry : sortedScores) {
            String playerName = entry.getKey();
            Integer score = entry.getValue();
            System.out.printf("| %-12s| %-18d|%n", playerName, score);
        }

        System.out.println("------------------------------");
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
