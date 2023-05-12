import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testPlayer {
    @Test
    public void testPlayerGetCard() {
        Deck y = new Deck();
        Player p = new Player("Player 1");
        p.draw(3, y);
        Card x = p.getCardIndex(2);
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
    public void playerGetTable(){
        Deck y = new Deck();
        Player p = new Player("yeet");
        p.draw(5, y);
        p.layDown("D13", p.getTable(), true);
        String x = p.getTable().getCardIndex(0).id;
        assertEquals("D13", x);
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
        int t = y.size();
        assertEquals(amountOfCards, x);
        assertEquals(52 - amountOfCards, t);
    }

    @Test
    public void testPlayerTakeCardFromPlayer() {
        Deck y = new Deck();
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");        
        p2.draw(1, y);
        p1.takeCard("D13", p2);
        Card ide = p1.getCardIndex(0);
        assertEquals("D13", ide.id);        
    }
    @Test
    public void testPlayerGetTablePoints(){
        Deck y = new Deck();
        Player p = new Player("player1");
        p.draw(1, y);
        p.layDown("D13", p.getTable(), true);
        int x = p.getTablePoints();
        assertEquals(1, x);
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
        Card x = p1.getCardIndex(0);
        assertEquals("D13", x.id);
    }   

    @Test
    public void testPlayerTakeCardFromDiscardPile() {
        Deck y = new Deck();
        Player p = new Player("Player 1");
        p.draw(1, y);
        p.discardAll(Main.discardPile);
        p.takeCard("D13", Main.discardPile);
        Card x = p.getCardIndex(0);
        assertEquals("D13", x.id);
        Main.discardPile.clear();
    }

    @Test
    public void testPlayerTableIntergration() {
        Deck y = new Deck();
        Player p = new Player("Player 1");
        Table t = new Table();
        p.draw(6, y); //d: k, q, j, 10, 9, 8
        t.draw(3, y);//d: 7, 6, 5
        assertEquals(43, y.size());

        Card pc = p.getCardIndex(0);
        assertEquals("D13", pc.id); // diamond king
        Card tc = t.getCardIndex(0);
        assertEquals("D7", tc.id); //diamond 7

        p.takeCard("D7", t);//player takes card from table
        assertEquals(t.size(), 2); //two cards should be left

        t.discardAll(Main.discardPile); //discard all table cards to deck
        assertEquals(0, t.size());
        p.discardAll(Main.discardPile); //discard all player cards to deck
        assertEquals(0, p.handSize());

        y.returnDiscardPile(); // return cards from discard pile to deck
        assertEquals(52, y.size()); //size of discard pile should be 52 again
        Main.discardPile.clear();
    }
}
