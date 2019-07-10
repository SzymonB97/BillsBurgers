package pl.sborowy.billsBurgers.rollType;

public class RollType {
    private String name;
    private double price;

    public RollType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
