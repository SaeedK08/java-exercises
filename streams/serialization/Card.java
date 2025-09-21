package serialization;

import java.io.Serializable;

public class Card implements Serializable {
    // private static final long serialVerionUID = 1L;      Set the serialVersionUID manually
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRankValue() {
        return rank.getValue();
    }

    public int getSuitValue() {
        return suit.ordinal(); // default values, 0, 1, 2, 3
    }

    public boolean equals(Card other) {
        return this.rank == other.rank && this.suit == other.suit;
    }

    public int compareRank(Card other) {
        return this.rank.getValue() - other.rank.getValue();
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
