import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

public class testPlayer {
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

    @Test
    public void testPlayerHandSize(){
        Deck y = new Deck();
        Player p = new Player("Player1");
        p.draw(3, y);
        int x = p.handSize();
        assertEquals(3, x);
    }

    @Test
    public void testPlayerDiscard(){
        Deck y = new Deck();
        Player p = new Player("p1");
        p.draw(1, y);
        p.discard("D13", Main.discardPile);
        int x = Main.discardPile.size();
        assertEquals(1, x);
        Main.discardPile.clear(); 
    }
    
    @Test
    public void testPlayerDiscardAll(){
        Deck y = new Deck();
        Player p = new Player("p1");
        p.draw(3, y);
        p.discardAll(Main.discardPile);
        int x = Main.discardPile.size();
        assertEquals(3, x);
        Main.discardPile.clear();
    }

    @Test
    public void testPlayerDraw() {
        Deck y = new Deck();
        Player p = new Player("player 1");
        int amountOfCards = 5;
        p.draw(amountOfCards, y);
        int x = p.handSize();
        assertEquals(amountOfCards, x);
    }

    @Test
    public void testPlayerTakeCardFromPlayer() {
        Deck y = new Deck();
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");        
        p2.draw(1, y);
        p1.takeCard("D13", p2);
        Card ide = p1.getCard(0);
        assertEquals("D13", ide.id);        
    }

    @Test
    public void testPlayerLayDown() {
        Deck y = new Deck();
        Player p = new Player("Player 1");
        Table t = new Table();
        p.draw(1, y);
        int x = t.getCards().size();
        assertEquals(0, x);
        p.layDown("D13", t, true);
        Card x2 = t.getCards().get(0);
        assertEquals("D13", x2.id);
    }
    
    @Test
    public void testPlayerTakeCardFromTable() {
        Deck y = new Deck();
        Player p1 = new Player("Player 1");
        Table t = new Table();
        p1.draw(1, y);
        p1.layDown("D13", t, true);
        p1.takeCard("D13", t);
        Card x = p1.getCard(0);
        assertEquals("D13", x.id);
    }   

    @Test
    public void testPlayerTakeCardFromDiscardPile() {
        Deck y = new Deck();
        Player p = new Player("Player 1");
        p.draw(1, y);
        p.discardAll(Main.discardPile);
        p.takeCard("D13", Main.discardPile);
        Card x = p.getCard(0);
        assertEquals("D13", x.id);
        Main.discardPile.clear();
    }
    
}