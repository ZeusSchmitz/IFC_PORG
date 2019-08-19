package ducksType;

import QuackBehavior.Quack;
import ducks.Duck;
import flyBehavior.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
        
    @Override
    public void display() {
        System.out.println("Pato marrom");
        super.display();
    }
        
}
