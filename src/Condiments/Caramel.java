package Condiments;

import Beverage.Beverage;

public class Caramel extends Condiment {

    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void getOrderName() {
        super.getOrderName();
        System.out.println("Caramel");
    }

    @Override
    public int cost() {
        return beverage.cost() + 20;
    }
}
