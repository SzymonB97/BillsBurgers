package pl.sborowy.billsBurgers.meats;

public class Meat {
    private String name;
    private double price;

    public Meat(String name, double price) {
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
