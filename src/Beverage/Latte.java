package Beverage;

public class Latte extends Beverage {
    @Override
    public void getOrderName() {
        System.out.println("Latte");
    }

    @Override
    public int cost() {
        return 150;
    }
}
