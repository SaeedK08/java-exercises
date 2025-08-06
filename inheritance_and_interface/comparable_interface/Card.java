package comparable_interface;

public class Card implements Comparable<Card> {
    private final Suit suit;
    private final Rank rank;
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public Suit getSuit() {
        return this.suit;
    }
    public Rank getRank() {
        return this.rank;
    }
    public int getRankValue() {
        return rank.getValue();
    }
    public int getSuitValue() {
        return suit.ordinal();
    }

    @Override
    public int compareTo(Card other) {
        int result = this.suit.ordinal() - other.suit.ordinal();
        if (result == 0)
        {
            result = this.rank.ordinal() - other.rank.ordinal();
        }
        return result;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if(other instanceof Card)
        {
            Card otherCard = (Card) other;
            return (otherCard.rank == this.rank && otherCard.suit == this.suit);
        }
        return false; 
        //or: return this.compareTo(other) == 0;
    }
    @Override
    public String toString() {
        return "Card suit: " + this.suit + ", Card rank: " + this.rank;
    }
    public String toShortString() {
        String info = "";
        switch(this.rank)
        {
            case ACE: 
                info += 'A';
                break;
            case KING: info += 'K';
                break;
            case QUEEN: info += "Q";
                break;
            case JACK: info += "J";
                break;
            default: 
                info += rank.getValue();
        }
        switch(this.suit)
        {
            case HEARTS:
                info += '\u2764';
                break;
            case SPADES:
                info += '\u2660';
                break;
            case DIAMONDS:
                info += '\u2666';
                break;
            case CLUBS:
                info += '\u2663';
                break;
            default: break;
        }
        return info;
    }
}