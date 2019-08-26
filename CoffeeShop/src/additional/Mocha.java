package additional;

import coffeTypes.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
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
