import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testTable {
    @Test
    public void tableDraw(){
        Deck y = new Deck();
        Table t = new Table();
        t.draw(3, y);
        int c = t.getCards().size();
        assertEquals(3, c);
    }


    @Test
    public void tableGetCards(){
        Deck y = new Deck();
        Table t = new Table();
        t.draw(3, y);
        Card c = t.getCards().get(1);
        assertEquals("D12", c.id);
    }

    @Test
    public void tableGetCardsIndex(){
        Deck y = new Deck();
        Table t = new Table();
        t.draw(3, y);
        Card c = t.getCardIndex(1);
        assertEquals("D12", c.id);
    }
    @Test
    public void tableSize(){
        Deck y = new Deck();
        Table t = new Table();
        t.draw(3, y);
        assertEquals(3, t.size());
    }
    @Test
    public void tableDiscard(){
        Deck y = new Deck();
        Table t = new Table();
        t.draw(3, y);
        Card c = t.getCardIndex(1);
        t.discard(c.id, Main.discardPile);
        assertEquals(2, t.size());
        Main.discardPile.clear();
    }
    @Test
    public void tableDiscardAll(){
        Deck y = new Deck();
        Table t = new Table();
        t.draw(3, y);
        t.discardAll(Main.discardPile);
        assertEquals(0, t.size());
        Main.discardPile.clear();
    }
}


