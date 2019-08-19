package ducksType;

import QuackBehavior.MuteQuack;
import ducks.Duck;
import flyBehavior.FlyNoWay;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Pato Falso");
        super.display();
    }
    
}
