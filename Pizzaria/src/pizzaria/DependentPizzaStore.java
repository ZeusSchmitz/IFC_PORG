package pizzaria;

import chicagoPizza.ChicagoStyleCheesePizza;
import chicagoPizza.ChicagoStylePepperoniPizza;
import chicagoPizza.ChicagoStyleVeggiePizza;
import nyPizza.NYStyleCheesePizza;
import nyPizza.NYStylePepperoniPizza;
import nyPizza.NYStyleVeggiePizza;

public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        switch (style) {
            case "NY":
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            default:
                break;
        }
break;
            case "Chicago":
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
            default:
                break;
        }
break;
            default:
                System.out.println("Error: invalid type of pizza");
                return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
