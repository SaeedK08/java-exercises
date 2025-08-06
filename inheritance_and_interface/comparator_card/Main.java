package comparator_card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import comparable_interface.Card;
import comparable_interface.Rank;
import comparable_interface.Suit;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        // create cards
        for (Suit s : Suit.values()) { // iterate over Suit values
            for (Rank r : Rank.values()) {// iterate over Rank values
                cards.add(new Card(s, r));
            }
        }
        System.out.println("Original");
        System.out.println(generateShortString(cards));

        Collections.shuffle(cards);
        System.out.println("Shuffled:");
        System.out.println(generateShortString(cards));

        Comparator<Card> rankComparator = new RankComparator();
        Collections.sort(cards, rankComparator);
        System.out.println("Sorted by rank");
        System.out.println(generateShortString(cards));

        Collections.sort(cards, new AceHighComparator());
        System.out.println("Sorted by with ace considered the highest rank");
        System.out.println(generateShortString(cards));
    }
    public static String generateShortString(List<Card> cards)
    {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for(Card c: cards) {
            builder.append(c.toShortString() + ' ');
        }
        builder.append(']');
        return builder.toString();
    }
}