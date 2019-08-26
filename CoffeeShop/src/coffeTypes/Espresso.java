package coffeTypes;

public class Espresso extends Beverage {

    public Espresso(String size) {
        setSize(size);
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
