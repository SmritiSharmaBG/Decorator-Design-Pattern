import Beverage.Beverage;
import Condiments.Caramel;
import Condiments.ChocolateSyrup;
import Condiments.VanillaExtract;
import Beverage.Espresso;
import Beverage.Cappuccino;
import Beverage.Latte;

public class StarBucksReception {
    public static void main(String[] args) {
        // Espresso with vanilla extract
        Beverage o1 = new VanillaExtract(new Espresso());
        o1.welcomeMessage();
        System.out.println("Make a payment of : " + o1.cost());
        System.out.println("-----------------------------------------------------------------");

        // Espresso with vanilla extract and caramel : Just add Caramel to the previous order
        Beverage o2 = new Caramel(o1);
        o2.welcomeMessage();
        System.out.println("Make a payment of : " + o2.cost());
        System.out.println("-----------------------------------------------------------------");

        // Cappuccino with double chocolate syrup
        Beverage o3 = new ChocolateSyrup(new ChocolateSyrup(new Cappuccino()));
        o3.welcomeMessage();
        System.out.println("Make a payment of : " + o3.cost());
        System.out.println("-----------------------------------------------------------------");

        // Latte with caramel, vanilla extract and caramel
        Beverage o4 = new Caramel(new VanillaExtract(new Caramel(new Latte())));
        o4.welcomeMessage();
        System.out.println("Make a payment of : " + o4.cost());
        System.out.println("-----------------------------------------------------------------");

        System.out.println("-- END OF ORDER --");

    }
}
