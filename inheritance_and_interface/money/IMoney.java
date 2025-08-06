package money;

public interface IMoney extends Comparable<Money> {
    /**
     * Return the amount of this money.Money.
     */
    double getAmount();

    /**
     * Return the currency of this money.Money.
     */
    Currency getCurrency();

    /**
     * Return a copy of this instance.
     */
    Money copy();

    /**
     * Creates a money.Money instance, with the indicated currency.
     * @param newCurrency
     * @return money.Money instance.
     */
    Money toCurrency(Currency newCurrency);

    /**
     * Create a new money.Money instance with the sum, in the same currency as this.
     * @param moneyToAdd The money to add to this money.
     * @return A new money.Money instance with the same currency as this.
     */
    Money add(Money moneyToAdd);

    /**
     * Create a new money.Money instance with the difference, in the same currency as this.
     * @param moneyToRemove The money to remove from this money.
     * @return A new money.Money instance in the currency as this.
     * @throws IllegalArgumentException If the sum is less than zero.
     */
    Money subtract(Money moneyToRemove) throws IllegalArgumentException;

    /**
     * Return a string with the amount, rounded to two decimals, and the currency.
     */
    @Override
    String toString();

    /**
     * Compare amounts, internally concerted to EUR. Two instances are
     * considered equal if amounts differ less than 1E-3.
     * Also see documentation for interface java.lang.Comparable.
     */
    @Override
    int compareTo(Money other);

    /**
     * Compare amounts, internally concerted to EUR. Two instances are
     * considered equal if amounts differ less than 1E-3.
     * Also see documentation for class java.lang.Object.
     */
    @Override
    boolean equals(Object other);

}