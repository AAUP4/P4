import java.util.ArrayList;

public class Main {
    public static ArrayList<Card> discardPile = new ArrayList<Card>();
    public static Deck deck = new Deck();
    public static Table table = new Table();
    public static Player p = new Player("Nanna");

    public static void main(String[] args) {
        // print all 52 cards
        System.out.println(deck.size());
        // draws 3 cards from deck
        p.draw(3, deck);
        // prints deck again now 49
        System.out.println(deck.size());

        p.discardAll(discardPile);

        deck.returnDiscardPile();
        System.out.println(deck.size());

        System.out.println("hello world");
    }
}
