package money;

public enum Currency {
    EUR("euro", 1.00),
    USD("dollar", 0.91),
    SEK("kronor", 0.095),
    NOK("kronor", 0.092);

    private String name;
    private double rate;
    private Currency(String name, double rate) {
        this.name = name; 
        this.rate = rate;
    }
    
    public String getName() {
        return this.name;
    }
    public double getRate() {
        return this.rate;
    }

}