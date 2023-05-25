import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        /*if (n < 1 || n > 3) {
            throw new IllegalArgumentException("Jokers must be between 1 and 3");
        }*/
        if (n < 0) {
            n = 0;
        }
        if (n > 3) {
            n = 3;
        }

        for (int i = 0; i < n; i++) {
            Card joker = new Card("Joker", "Joker", 1, false);
            cards.add(joker);
        }
    }
    public void assignPoints(int points, String... cardIDs){
        for (String cardId : cardIDs){
            for (Card card : this.cards){
                if(cardId.equals(card.id)){
                    card.setPoints(points);
                }
            }            
        }
    }
    
    // Assigns points for either a rank or a suit.
    public void assignPoints(String rankOrSuit, int points) {
        for (Card card : cards) {
            // rank
            if (rankOrSuit == card.rank) {
                card.setPoints(points);
            } else if (rankOrSuit == card.suit) {
                card.setPoints(points);
            }
        }
    }

    // Assign points for specific rank and specific suit
    public void assignPoints(String rank, String suit, int points) {
        for (Card card : cards) {
            if (rank == card.rank && suit == card.suit) {
                card.setPoints(points);
            }
        }
    }

    // Shuffles the deck
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    // Deals a number of cards to each player
    public void deal(int numberOfCardToDeal) {
        for (int i = 0; i < numberOfCardToDeal; i++) {
            for (Player player : Player.getPlayers()) {
                player.draw(1, Main.deck);                
            }
        }
    }

    // Returns card object for the index
    public Card getCard(int index) {
        return this.cards.get(index);
    }

    // Returns card objects in the list
    public ArrayList<Card> getCards() {
        return this.cards;
    }

    // prints all cards with their id followed by points
    public void print() {
        for (Card card : cards) {
            System.out.println(card.id + "  " + card.getPoints());
        }
    }

    // returns the size of the deck(amount of remaining cards)
    public int size() {
        return cards.size();
    }

    public void returnCards() {
        for (Player player : Player.getPlayers()) {
            for (Card card : player.getHand()) {
                cards.add(card);
                player.getHand().remove(cards.size() - 1); // Changed from getCards, best regards - Skytte
                
            }
            for (Card card : player.getTable().getCards()) {
                cards.add(card);
                player.getTable().getCards().remove(cards.size() - 1); 
                
            }
            returnDiscardPile(player);
        }
        returnDiscardPile();
        for (Card card : Main.table.getCards()) {
            cards.add(card);
            Main.table.getCards().remove(cards.size() - 1); 
            
        }

    }

    // Returns all cards from player discard pile to the deck.
    public void returnDiscardPile(Player p) {
        for (Card card : p.getDiscardPile()) {
            cards.add(card);
            p.getDiscardPile().remove(cards.size() - 1); // Removes one card from the player discard pile
        }
    }
    // return cards for main discard pile to the deck.
    public void returnDiscardPile() {
        Iterator<Card> iterator = Game.discardPile.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            cards.add(card);
            iterator.remove();
        }
    }
}
