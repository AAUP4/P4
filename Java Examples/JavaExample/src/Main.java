import java.util.ArrayList;

public class Main {
    public static ArrayList<Card> discardPile = new ArrayList<Card>();
    public static Deck deck = new Deck();
    public static Table table = new Table();
    public static Player p = new Player("Nanna");
    public static void main(String[] args) {
        Game.exit();
    }
}
