package Condiments;

import Beverage.Beverage;

public class ChocolateSyrup extends Condiment {
    public ChocolateSyrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void getOrderName() {
        super.getOrderName();
        System.out.println("Chocolate Syrup");
    }

    @Override
    public int cost() {
        return beverage.cost() + 10;
    }
}
