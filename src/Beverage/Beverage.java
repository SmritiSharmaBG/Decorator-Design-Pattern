package Beverage;

public abstract class Beverage {
    public void welcomeMessage() {
        System.out.println("Welcome to StarBucks coffee. The order is : ");
        getOrderName();
    }

    public abstract void getOrderName();

    public abstract int cost();
}
