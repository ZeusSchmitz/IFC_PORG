package ducksType;

import QuackBehavior.Squeak;
import ducks.Duck;
import flyBehavior.FlyNoWay;

public class RubberDuck  extends Duck{

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
       
    @Override
    public void display() {
        System.out.println("Pato Rubbber");
        super.display();
    }
        
}
