package ducks;

import flyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public String swim() {
        return "Nadando";
    }

    public void display() {
        System.out.print("Voo: ");
        performFly();
        System.out.print("Som: ");
        performQuack();
        swim();
    }

    public void performQuack() {
        getQuackBehavior().quack();
    }

    public void performFly() {
        getFlyBehavior().fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
