package Beverage;

public class Cappuccino extends Beverage{
    @Override
    public void getOrderName()
    {
        System.out.println("Cappuccino");
    }

    @Override
    public int cost() {
        return 80;
    }
}
