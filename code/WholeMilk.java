package MockDecorator;

/**
 * Created by Marshall on 12/10/2015.
 */
public class WholeMilk extends MilkDecorator {
    public WholeMilk(Coffee basic) {
        super(basic);
    }

    public String getDesciption() {
        return basic.getDescription() + " Milk->WholeMilk";
    }

    public double cost() {
        return basic.cost() + 1.0d;
    }
}
