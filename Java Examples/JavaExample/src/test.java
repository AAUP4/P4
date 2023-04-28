import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class test {

    // private static final Object NULL = null;
    public int Threeplus2() {
        int i = 2;
        int x = 3;
        int result = i + x;
        return result;
    }

    @Test
    public void testif5() {
        int y = Threeplus2();
        assertEquals(5, y);
    }

    // Cards Class test
    @Test
    public void testCardFlip() {
        Card y = new Card("Heart", "8", 1, true);
        assertEquals(true, y.isFaceUp);
        y.flip();
        assertEquals(false, y.isFaceUp);

    }

    @Test
    public void testCardGetPoints() {
        Card y = new Card("Heart", "King", 1, true);
        int value = y.getPoints();
        assertEquals(1, value);
    }

    @Test
    public void testCardSetPoints() {
        Card y = new Card("Club", "Ace", 1, true);
        assertEquals(1, y.getPoints());
        y.setPoints(5);
        assertEquals(5, y.getPoints());
    }

    // Deck Class test
    

    @Test
    public void testPlayerGetCard() {
        Deck y = new Deck();
        Player p = new Player("Player 1");
        p.draw(3, y);
        Card x = p.getCard(2);
        assertEquals("Knight", x.rank);
        assertEquals("Diamond", x.suit);
        assertEquals(1, x.getPoints());
    }    

    @Test
    public void testPlayerGetHand(){
        Deck y = new Deck();
        Player p = new Player("Player 1");
        p.draw(3, y);
        p.getHand();
        assertEquals(3, p.handSize());
    }
    @Test
    public void testPlayerGetHandPoints() {
        Deck y = new Deck();
        Player p = new Player("Player 1");
        p.draw(3, y);
        int ppoints = p.getHandPoints();
        assertEquals(3, ppoints);
    }
}
