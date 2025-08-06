package comparator_card;

import java.util.Comparator;
import comparable_interface.Card;


public class RankComparator implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        return c1.getRankValue() - c2.getRankValue();
    }
}