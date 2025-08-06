package comparator_card;
import comparable_interface.Card;
import comparable_interface.Rank;
import java.util.Comparator;

public class AceHighComparator implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        int result = c1.getSuitValue() - c2.getSuitValue();
        if (result == 0) {
            int value1 = c1.getRank() == Rank.ACE ? 14 : c1.getRankValue(); 
            int value2 = c2.getRank() == Rank.ACE ? 14 : c1.getRankValue(); 
            result = value1 - value2;
        }
        return result;
    }
}