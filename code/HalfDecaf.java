package MockDecorator;

/**
 * Created by Marshall on 12/10/2015.
 */
public class HalfDecaf extends Decorator {

    public HalfDecaf(Coffee basic) {
        super(basic);
    }

    public String getDescription() {
        return basic.getDescription() + "Decaf->1/2";
    }

    public double cost() {
        return basic.cost() + 0.25d;
    }
}
