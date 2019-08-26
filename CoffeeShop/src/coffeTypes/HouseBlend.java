package coffeTypes;

public class HouseBlend extends Beverage {
    
    public HouseBlend(String size) {
        setSize(size);
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
