package pl.sborowy.billsBurgers.hamburgers;

import pl.sborowy.billsBurgers.additions.Additions;
import pl.sborowy.billsBurgers.meats.Meat;
import pl.sborowy.billsBurgers.rollType.BrownRyeBread;

public class HealthyBurger extends Hamburger {
    private static final int ADDITIONS_MAXIMUM_AMOUNT = 6;

    public HealthyBurger(Meat meat) {
        super("HEALTHY BURGER", new BrownRyeBread(), meat);
    }

    @Override
    public void addAddition(Additions addition) {
        if (getAdditionsList().size() < ADDITIONS_MAXIMUM_AMOUNT) {
            getAdditionsList().add(addition);
        } else System.out.println("Maximum additions for this burger!!!");
    }
}
