package comparable_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        for(Suit s: Suit.values())
        {
            for(Rank r: Rank.values())
            {
                cards.add(new Card(s, r));
            }
        }
        System.out.println("Before shuffling: ");
        System.out.println(generateShortString(cards));
        System.out.println("Shuffling....");
        Collections.shuffle(cards);
        System.out.println(generateShortString(cards));
        Collections.sort(cards);
        System.out.println("After sorting");
        System.out.println(generateShortString(cards));
    }

    private static String generateShortString(List<Card> cards) {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for(Card c: cards)
        {
            builder.append(c.toShortString() + ' ');
        }
        builder.append(']');
        return builder.toString();
    }
}