package pl.sborowy.billsBurgers.hamburgers;

import pl.sborowy.billsBurgers.additions.Additions;
import pl.sborowy.billsBurgers.additions.Chips;
import pl.sborowy.billsBurgers.additions.Cola;
import pl.sborowy.billsBurgers.meats.Meat;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(Meat meat) {
        super("DELUXE BURGER", meat);
        super.addAddition(new Chips());
        super.addAddition(new Cola());
    }

    @Override
    public void addAddition(Additions addition) {
        System.out.println("This burger has only 2 additions in his base package!!!");
    }
}
