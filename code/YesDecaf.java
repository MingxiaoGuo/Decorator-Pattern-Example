package MockDecorator;

/**
 * Created by Marshall on 12/10/2015.
 */
public class YesDecaf extends Decorator {
    public YesDecaf(Coffee basic) {
        super(basic);
    }

    public String getDescription() {
        return basic.getDescription() + "Decaf->Yes";
    }

    public double cost() {
        return basic.cost() + 0.5d;
    }
}
