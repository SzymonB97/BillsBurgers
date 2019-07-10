package pl.sborowy.billsBurgers.hamburgers;

import pl.sborowy.billsBurgers.additions.Additions;
import pl.sborowy.billsBurgers.meats.Meat;
import pl.sborowy.billsBurgers.rollType.RollType;
import pl.sborowy.billsBurgers.rollType.WhiteBread;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private static final int ADDITIONS_MAXIMUM_AMOUNT = 4;

    private String name;
    private RollType rollType;
    private Meat meat;
    private List<Additions> additionsList;

    protected Hamburger(String name, RollType rollType, Meat meat) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.additionsList = new ArrayList<>();
    }

    protected Hamburger(String name, Meat meat) {
        this.name = name;
        this.rollType = new WhiteBread();
        this.meat = meat;
        this.additionsList = new ArrayList<>();
    }

    public Hamburger(Meat meat) {
        this.name = "BASE HAMBURGER";
        this.rollType = new WhiteBread();
        this.meat = meat;
        this.additionsList = new ArrayList<>();
    }

    public void addAddition(Additions addition) {
        if (additionsList.size() < ADDITIONS_MAXIMUM_AMOUNT) {
            additionsList.add(addition);
        } else System.out.println("Maximum additions for this burger!!!");
    }

    public double getBasePrice() {
        return getMeat().getPrice() +
                getRollType().getPrice();
    }

    public double getAdditionsPrice() {
        double price = 0;

        for (int i = 0; i < additionsList.size(); i++) {
            price += additionsList.get(i).getPrice();
        }
        return price;
    }

    public double getTotalPrice() {
        return getBasePrice() + getAdditionsPrice();
    }

    public String getName() {
        return name;
    }

    public RollType getRollType() {
        return rollType;
    }

    public Meat getMeat() {
        return meat;
    }

    public List<Additions> getAdditionsList() {
        return additionsList;
    }

    public void seeAdditionsList() {
        for (int i = 0; i < additionsList.size(); i++) {
            System.out.println("Product:" + additionsList.get(i).getName() + " Price: " + additionsList.get(i).getPrice());
        }
    }
}
