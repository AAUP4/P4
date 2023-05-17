import java.util.ArrayList;

public class Table {
    public Table(){
        
    }
    private ArrayList<Card> tableCards = new ArrayList<Card>();
        
    // public void draw(n){
        
    // }
    public ArrayList<Card> getCards() {
        return tableCards;
    }
    public Card getCardIndex(int index){
        return tableCards.get(index);
    }
    public void draw(int numberOfCardsToDraw, Deck deck) {
        for (int i = 0; i < numberOfCardsToDraw; i++) {
            this.tableCards.add(deck.getCard(deck.getCards().size() - 1));
            deck.getCards().remove(deck.getCards().size() - 1);
        }
    }
    public void discard(String cardId, ArrayList<Card> discardPile) {
        for (int i = 0; i < tableCards.size(); i++) {
            if (cardId.equals(tableCards.get(i).id)) {
                discardPile.add(tableCards.get(i));
                tableCards.remove(i);
                break;
            }
        }
    }
    
    public void discardAll(ArrayList<Card> discardPile){
        int size = tableCards.size();
        for(int i = size - 1; i >= 0; i--){
            discardPile.add(tableCards.get(i));
            tableCards.remove(i);
        }
    }
    public void print(){
        for (Card card : this.getCards()) {
            System.out.println(card.rank + " of " + card.suit + "s");
        }
    }
    public int size(){        
        return tableCards.size();
    }
    




}

