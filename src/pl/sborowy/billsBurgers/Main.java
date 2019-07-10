package pl.sborowy.billsBurgers;

import pl.sborowy.billsBurgers.additions.*;
import pl.sborowy.billsBurgers.hamburgers.DeluxeBurger;
import pl.sborowy.billsBurgers.hamburgers.Hamburger;
import pl.sborowy.billsBurgers.hamburgers.HealthyBurger;
import pl.sborowy.billsBurgers.meats.Beef;
import pl.sborowy.billsBurgers.meats.Pork;

public class Main {

    public static void main(String[] args) {
        Hamburger baseHamburger = new Hamburger(new Pork());

        System.out.println("Base price for " + baseHamburger.getName() + " with " + baseHamburger.getMeat().getName() + " is " + baseHamburger.getBasePrice());

        baseHamburger.addAddition(new Chips());
        baseHamburger.addAddition(new Cola());
        baseHamburger.addAddition(new Onion());
        baseHamburger.addAddition(new Ketchup());
        baseHamburger.addAddition(new Lettuce());

        baseHamburger.seeAdditionsList();
        System.out.println("All additions for " + baseHamburger.getName() + " cost " + baseHamburger.getAdditionsPrice());
        System.out.println("Total price for " + baseHamburger.getName() + " is " + baseHamburger.getTotalPrice());

        System.out.println("-------------------------------");
        Hamburger healthyHamburger = new HealthyBurger(new Beef());

        System.out.println("Base price for " + healthyHamburger.getName() + " with " + healthyHamburger.getMeat().getName() + " is " + healthyHamburger.getBasePrice());

        healthyHamburger.addAddition(new Onion());
        healthyHamburger.addAddition(new Onion());
        healthyHamburger.addAddition(new Tomato());
        healthyHamburger.addAddition(new Lettuce());
        healthyHamburger.addAddition(new Lettuce());
        healthyHamburger.addAddition(new Tomato());
        healthyHamburger.addAddition(new Tomato());

        healthyHamburger.seeAdditionsList();
        System.out.println("All additions for " + healthyHamburger.getName() + " cost " + healthyHamburger.getAdditionsPrice());
        System.out.println("Total price for " + healthyHamburger.getName() + " is " + healthyHamburger.getTotalPrice());

        System.out.println("-------------------------------");
        Hamburger deluxeBurger = new DeluxeBurger(new Beef());

        System.out.println("Base price for " + deluxeBurger.getName() + " with " + deluxeBurger.getMeat().getName() + " is " + deluxeBurger.getBasePrice());

        deluxeBurger.addAddition(new Onion());

        deluxeBurger.seeAdditionsList();
        System.out.println("All additions for " + deluxeBurger.getName() + " cost " + deluxeBurger.getAdditionsPrice());
        System.out.println("Total price for " + deluxeBurger.getName() + " is " + deluxeBurger.getTotalPrice());
    }
}
