package additional;

import coffeTypes.Beverage;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        
        switch(beverage.getSize()){
            case "P":
                return .10 + beverage.cost();
            case "M":
                return .15 + beverage.cost();
            default:
                return .20 + beverage.cost();
        }
    }
}
