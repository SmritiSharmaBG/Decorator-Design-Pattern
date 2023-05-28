package Condiments;

import Beverage.Beverage;

public class VanillaExtract extends Condiment {
    public VanillaExtract(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void getOrderName() {
        super.getOrderName();
        System.out.println("Vanilla Extract");
    }

    @Override
    public int cost() {
        return beverage.cost() + 30;
    }
}
