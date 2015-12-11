package MockDecorator;

/**
 * Created by Marshall on 12/10/2015.
 */
public class Decorator implements Coffee {

    Coffee basic;

    public Decorator(Coffee basic) {

        this.basic = basic;

    }

    @Override
    public String getDescription() {
        return basic.getDescription();
    }

    @Override
    public double cost() {
        return basic.cost();
    }
}
