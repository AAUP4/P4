import java.util.ArrayList;

public class Player{

    Player(String Name) {
            this.name = Name;
            this.score = 0;
        }

    public String name;
    public int score;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private Table table = new Table();
    private ArrayList<Card> discardPile = new ArrayList<Card>();

    private static ArrayList<Player> players = new ArrayList<Player>();    

    public static ArrayList<Player> getPlayers(){
        return players;
    }
    
    public static void create(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player("player" + (i+1));
            players.add(player);
        }
    }
    
    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandPoints() {
        int handPoints = 0;

        for (Card card : this.hand) {
            handPoints += card.getPoints(); 
        }

        return handPoints;
    }

    public int handSize(){
        return this.hand.size();
    }

    public void printHand() {
        for (Card card : hand) {
            System.out.println(card.rank + " of " + card.suit + "s");
        }
    }

    public Table getTable() {
        return this.table;
    }

    public int getTablePoints() {
        int tablePoints = 0;

        for (Card card : this.table.getCards()) {
            tablePoints += card.getPoints(); 
        }

        return tablePoints;
    }

    public void printTable() {
        for (Card card : this.table.getCards()) {
            System.out.println(card.rank + " of " + card.suit + "s");
        }
    }

    public ArrayList<Card> getDiscardPile() {
        return discardPile;
    }

    public void draw(int numberOfCardsToDraw, Deck deck) {
        for (int i = 0; i < numberOfCardsToDraw; i++) {
            this.hand.add(deck.getCard(deck.getCards().size() - 1));
            deck.getCards().remove(deck.getCards().size() - 1);
        }
    }

    public void discard(String cardId, ArrayList<Card> discardPile) {
        for (int i = 0; i < hand.size(); i++) {
            if (cardId == hand.get(i).id) {
                discardPile.add(hand.get(i));
                hand.remove(i);
                break;
            }
        }
    }
    public void discardAll(ArrayList<Card> discardPile){
        int size = hand.size();
        for(int i = size - 1; i >= 0; i--){
            discardPile.add(hand.get(i));
            hand.remove(i);
        }
    }

    public void takeCard(String cardToTake, Player playerToTakeFrom) {
        for (Card card : playerToTakeFrom.hand) {
            if (cardToTake == card.id) { 
                hand.add(card);
                playerToTakeFrom.hand.remove(card);
                break;
            }
        }
    }

    public void takeCard(String cardToTake, Table tableToTakeFrom) {
        for (Card card : tableToTakeFrom.getCards()) {
            if (cardToTake == card.id) {
                hand.add(card);
                tableToTakeFrom.getCards().remove(card);
                break;
            }
        }
    }

    public void takeCard(String cardToTake, ArrayList<Card> discardPileToTakeFrom) {
        for (Card card : discardPileToTakeFrom) {
            if (cardToTake == card.id) {
                hand.add(card);
                discardPileToTakeFrom.remove(card);
                break;
            }
        }
    }

    public void layDown(String cardToLayDown, Table tableToLayTo, Boolean isFaceUp) {
        for(Card card : hand){
            if(cardToLayDown == card.id){
                card.isFaceUp = isFaceUp;
                tableToLayTo.getCards().add(card);
                hand.remove(card);
                break;
            }
        }
    }
}