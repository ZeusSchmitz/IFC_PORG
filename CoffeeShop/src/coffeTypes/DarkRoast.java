package coffeTypes;

public class DarkRoast extends Beverage{
    
    public DarkRoast(String size) {
        setSize(size);
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
