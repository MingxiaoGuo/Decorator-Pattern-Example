package MockDecorator;

/**
 * Created by Marshall on 12/10/2015.
 */
public class BasicCoffee implements Coffee {



    @Override
    public String getDescription() {
        return "Basic";
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
