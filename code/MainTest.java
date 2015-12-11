package MockDecorator;

/**
 * Created by Marshall on 12/10/2015.
 */
public class MainTest {

    public static void main(String[] args) {
        Coffee espresso = new WholeMilk(new MilkDecorator(new HalfDecaf(new DecafDecorator(new BasicCoffee()))));
        Coffee espresso2 = new YesDecaf(new DecafDecorator(new BasicCoffee()));
        //Coffee espresso3 = new WholeMilk(new MilkDecorator(new BasicCoffee()));
        System.out.println(espresso.getDescription() + " = " + espresso.cost());
        System.out.println(espresso2.getDescription() + " = " + espresso2.cost());
        //System.out.print(espresso3.getDescription() + " = " + espresso2.cost());
    }
}
