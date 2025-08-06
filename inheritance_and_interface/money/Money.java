package money;

public class Money implements IMoney {
    private double amount;
    private Currency currency;
    
    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money(Currency currency) {
        this(0, currency);
    }

    public Money() {
        this(0, Currency.EUR);
    }

    public double getAmount() {
        return this.amount;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public Money copy() {
        return new Money(this.amount, this.currency);
    }

    public Money toCurrency(Currency newCurrency) {
        return new Money(this.exchangeThisAmount(newCurrency), newCurrency);
    }

    public Money add(Money moneyToAdd) {
        double newAmount;
        if (this.currency == moneyToAdd.currency) {
            newAmount = this.amount + moneyToAdd.getAmount();
        }
        else {
            newAmount = this.amount + moneyToAdd.exchangeThisAmount(this.currency);
        }
        return new Money(newAmount, this.currency);
    }

    public Money subtract(Money moneyToRemove) throws IllegalArgumentException {
        double newAmount;
        if (this.currency == moneyToRemove.currency) {
            newAmount = this.amount - moneyToRemove.getAmount();
        }
        else {
            newAmount = this.amount - moneyToRemove.exchangeThisAmount(this.currency);
        }
        if(newAmount < 0) {
            throw new IllegalArgumentException("new amount < 0");
        }
        return new Money(newAmount, this.currency);
    }

    public String toString() {
        return String.format("%.2f %s", this.amount, this.currency.toString());
    }

    public int compareTo(Money other) {
        double sum = this.exchangeThisAmount(Currency.EUR)
                     - other.exchangeThisAmount(Currency.EUR);
        System.out.println(sum);
        if (Math.abs(sum) < 1E-3) return 0;
        else if (sum > 0) return 1;
        else return -1;
    }

    @Override
    public boolean equals(Object other) {
        if(this==other) return true;
        if(other instanceof Money) {
            Money otherMoney = (Money) other;
            return (otherMoney.amount == this.amount) && (otherMoney.currency == this.currency);
        }
        return false;
    }

    public double exchangeThisAmount(Currency currency) {
        return this.amount * this.currency.getRate() / currency.getRate();
    }

}