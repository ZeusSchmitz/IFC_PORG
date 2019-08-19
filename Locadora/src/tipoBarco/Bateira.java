package tipoBarco;

import locadora.Barco;
import navegacao.Motor;

public class Bateira extends Barco{

    public Bateira(){
        setComportamentoMovimento(new Motor());
    }

    @Override
    public void display() {
        System.out.print("O barco é do tipo Bateira ");
        super.display();
    }
}
