package ducksType;

import QuackBehavior.Quack;
import ducks.Duck;
import flyBehavior.FlyWithWings;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    
    @Override
    public void display() {
        System.out.println("Pato Selvage");
        super.display();
    }
        
}
