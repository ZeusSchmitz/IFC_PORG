package tipoBarco;

import locadora.Barco;
import navegacao.Motor;

public class Iate extends Barco{
    
    public Iate(){
        setComportamentoMovimento(new Motor());
    }

    @Override
    public void display() {
        System.out.print("O barco é do tipo Iate ");
        super.display();
    }

}
