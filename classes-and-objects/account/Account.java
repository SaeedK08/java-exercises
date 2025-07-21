package account;

public class Account {

    private double balance;
    private final String name;
    private final long number;

    public Account(String name, long number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public Account(String name, long number) {
        this(name, number, 0.0);
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    // mutator metods
    public void deposit(double amount) {
        if (amount < 0) {
            // unexpected - terminate excecution
            throw new IllegalArgumentException();
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        String info = "name: " + name + ", number: " + number + ", balance: ";
        info += String.format("%.2f", balance);
        return info;
    }
}