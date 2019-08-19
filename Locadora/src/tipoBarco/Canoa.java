package tipoBarco;

import locadora.Barco;
import navegacao.Remos;

public class Canoa extends Barco{
    
    public Canoa(){
        setComportamentoMovimento(new Remos());
    }

    @Override
    public void display() {
        System.out.print("O barco é do tipo Canoa ");
        super.display();
    }

}
