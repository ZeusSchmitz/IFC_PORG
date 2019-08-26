package coffeTypes;

public class Decaf extends Beverage{

    public Decaf(String size) {
        setSize(size);
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
