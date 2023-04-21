import java.util.ArrayList;
import java.util.Collections;
public class Deck {

    Deck() {
        String[] suits = { "Club", "Spade", "Heart", "Diamond" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Knight", "Queen", "King" };

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                Card card = new Card(suit, ranks[i], 1, false);
                cards.add(card);
            }
        }
    }

    private ArrayList<Card> cards = new ArrayList<Card>();

    public void addJokers(int n) {
        if (n < 1 || n > 3) {
            throw new IllegalArgumentException("Jokers must be between 1 and 3");
        }

        for (int i = 0; i < n; i++) {
            String s = Integer.toString(i);
            Card joker = new Card("Joker", s, 1, false);
            cards.add(joker);
        }
    }
    // public void assignPoints([], n){

    // }

    // Shuffles the deck
    public void shuffle() {
        Collections.shuffle(this.cards);
    }
    
    // Deals a number of cards to each player
    public void deal(int numberOfCardToDeal) {
        for (int i = 0; i < numberOfCardToDeal; i++) {
            for (Player player : Player.getPlayers()) {
                player.draw(1, Main.deck);
                this.cards.remove(this.cards.size() - 1);
            }
        }
    }
    
    // Returns card object for the index
    public Card getCard(int index){
        return this.cards.get(index);
    }
    // Returns card objects in the list
    public ArrayList<Card> getCards() {
        return this.cards;
    }
    // prints all cards with their id followed by points
    public void print() {
        for(Card card : cards){
            System.out.println(card.id + "  " + card.getPoints());
        }
    }
    // returns the size of the deck(amount of remaining cards)
    public int size() {
        return cards.size();
    }

    public void returnCards() {
        for(Player player : Player.getPlayers()){
            for(Card card : player.getHand()){
                    cards.add(card);
                    player.getHand().remove(cards.size()-1); // Changed from getCards, best regards - Skytte

            }
        }
    }

    public void returnDiscardPile(Player p) {
        
    }

    public void returnDiscardPile() {

    }

}