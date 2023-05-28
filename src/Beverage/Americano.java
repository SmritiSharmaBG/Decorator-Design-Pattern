package Beverage;

public class Americano extends Beverage {
    @Override
    public void getOrderName() {
        System.out.println("Americano");
    }

    @Override
    public int cost() {
        return 100;
    }
}
