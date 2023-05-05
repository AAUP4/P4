import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;


public class TestDeck {
    @Test
    public void testDeckSize() {
        Deck y = new Deck();
        int x = y.size();
        assertEquals(52, x);
    }

    @Test
    public void testDeckAssignPointsMultiple() {
        Deck y = new Deck();
        Card x = y.getCard(51);
        assertEquals("King", x.rank);
        assertEquals(1, x.getPoints());
        y.assignPoints("King", 15);

        for (Card card : y.getCards()) {
            if (card.rank == "King") {
                assertEquals(15, card.getPoints());
            }
        }
    }

    @Test
    public void testDeckShuffle() {
        Deck y = new Deck();
        Card x = y.getCard(51);
        assertEquals("King", x.rank);
        y.shuffle();
        x = y.getCard(51);
        assertNotEquals("King", x.rank);
    }

    @Test
    public void testDeckAssignPointsSingle() {
        Deck deck = new Deck();
        deck.assignPoints("King", "Diamond", 20);

        for (Card card : deck.getCards()) {
            if (card.rank == "King" && card.suit == "Diamond") {
                assertEquals(20, card.getPoints());
            } else {
                assertEquals(1, card.getPoints());
            }
        }
    }

    @Test
    public void testDeckReturnToDiscardPile() {
        Deck y = new Deck();
        Player p = new Player("Player 1");
        assertEquals(52, y.size());
        p.draw(3, y);
        assertEquals(49, y.size());
        p.discardAll(Main.discardPile);
        int dpilesize = Main.discardPile.size();
        assertEquals(3, dpilesize);
        y.returnDiscardPile();
        assertEquals(52, y.size());
        Main.discardPile.clear();
    }
    
    @Test
    public void testDeckAddJokers() {
        int jokerAmount = 3;
        Deck y = new Deck();
        int ysize = y.size();
        assertEquals(52, ysize);
        y.addJokers(jokerAmount);
        int jsize = y.size();
        assertEquals(55, jsize);
        for (int i = 0; i < jokerAmount; i++) {
            Card getcard = y.getCard(52 + i);
            assertEquals("Joker", getcard.rank);
        }
    }

    @Test
    public void testDeckAddJokersMoreThanThree() {
        int jokerAmount = 4;
        Deck deck = new Deck();
        assertEquals(52, deck.size());

        deck.addJokers(jokerAmount);
        assertEquals(55, deck.size());
    }


    @Test
    public void testDeckAddJokersLessThanZero() {
        int jokerAmount = -2;
        Deck deck = new Deck();
        assertEquals(52, deck.size());

        deck.addJokers(jokerAmount);
        assertEquals(52, deck.size());
    }

}
