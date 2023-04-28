import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class testCard {
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
    
}
