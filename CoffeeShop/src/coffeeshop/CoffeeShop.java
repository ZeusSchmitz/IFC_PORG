package coffeeshop;

import coffeTypes.Beverage;
import additional.Mocha;
import additional.Soy;
import additional.Whip;
import coffeTypes.DarkRoast;
import coffeTypes.Espresso;
import coffeTypes.HouseBlend;

public class CoffeeShop {

    public static void main(String[] args) {
        Beverage beverage = new Espresso("G");
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast("M");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend("P");
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost()
        );
    }

}
