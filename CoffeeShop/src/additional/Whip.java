package additional;

import coffeTypes.Beverage;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        
        switch(beverage.getSize()){
            case "P":
                return .5 + beverage.cost();
            case "M":
                return .7 + beverage.cost();
            default:
                return .10 + beverage.cost();
        }
    }
}
