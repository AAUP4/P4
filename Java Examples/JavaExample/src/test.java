import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class test {
    
    private static final Object NULL = null;
    public int Threeplus2(){
        int i = 2;
        int x = 3;
        int result = i + x;
        return result;
    }

    @Test
    public void testif5(){
        int y = Threeplus2();
        assertEquals(5, y);
    }


    //Cards Class test
    @Test
    public void testFlip(){
        Card y = new Card("Heart", "8", 1, true);
        assertEquals(true, y.isFaceUp);
        y.flip();
        assertEquals(false, y.isFaceUp);

    }
    @Test
    public void testGetPoints(){
        Card y = new Card("Heart", "King", 1, true);
        int value = y.getPoints();
        assertEquals(1, value);
    }

    @Test
    public void testSetPoints(){
        Card y = new Card("Club", "Ace", 1, true);
        assertEquals(1, y.getPoints());
        y.setPoints(5);
        assertEquals(5, y.getPoints());
    }
    // Deck Class test
    @Test
    public void testDeckSize(){
        Deck y = new Deck();
        int x = y.size();
        assertEquals(52, x);
    }
    @Test
    public void testDeckDeal(){
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
    }

}
