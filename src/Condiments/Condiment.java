package Condiments;

import Beverage.Beverage;

public abstract class Condiment extends Beverage {
    Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    public void getOrderName() {
        beverage.getOrderName();
        System.out.print("Your add-ons are :");
    }
}
