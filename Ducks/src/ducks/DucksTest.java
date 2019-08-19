package ducks;

import ducksType.DecoyDuck;
import ducksType.MallardDuck;
import ducksType.RedHeadDuck;
import ducksType.RubberDuck;


public class DucksTest extends Duck{
    
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        RedHeadDuck red = new RedHeadDuck();
        RubberDuck rud = new RubberDuck();
        DecoyDuck dd = new DecoyDuck();
        
        md.display();
        
        red.display();
        
        rud.display();
        
        dd.display();
    }
}
