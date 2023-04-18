public class Card {

    public Card(String S, String R, int P, boolean isFaceUp) {
        this.suit = S;
        this.rank = R;
        this.id = suit.substring(0, 1) + rank;
        points = P;
        this.isFaceUp = isFaceUp;
    }

    public final String suit;
    public final String rank;
    public final String id;
    private int points;
    public boolean isFaceUp;

    public void flip() {
        isFaceUp = !isFaceUp;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int x) {
        points = x;
    }
}
