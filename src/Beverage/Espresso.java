package Beverage;

public class Espresso extends Beverage {
    @Override
    public void getOrderName() {
        System.out.println("Espresso");
    }

    @Override
    public int cost() {
        return 120;
    }
}
