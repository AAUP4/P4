import java.util.HashMap;
import java.util.Map;

public class Card {

    public Card(String S, String R, int P, boolean isFaceUp) {
        this.suit = S;
        this.rank = R;

        if(this.rank=="Joker"){this.id = "J"+jokerNR; jokerNR++;}
        else {this.id = suit.substring(0, 1) + RankToIntString(rank);}
        
        points = P;
        this.isFaceUp = isFaceUp;
    }

    private static int jokerNR = 1;

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

    private static String RankToIntString(String rank) {
        Map<String, String> cardValueMap = new HashMap<>();
        cardValueMap.put("Ace", "1");
        cardValueMap.put("Knight", "11");
        cardValueMap.put("Queen", "12");
        cardValueMap.put("King", "13");
    
        String cardValue = cardValueMap.get(rank);
        if (cardValue != null) {
            return cardValue;
        } else {
            return rank;
        }
    }
}
