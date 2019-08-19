package flyBehavior;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Este pato não pode voar");
    }
    
}
