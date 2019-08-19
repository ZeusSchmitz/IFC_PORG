package tipoBarco;

import locadora.Barco;
import navegacao.Vela;

public class BarcoVela extends Barco{
    
    public BarcoVela(){
        setComportamentoMovimento(new Vela());
    }

    @Override
    public void display() {
        System.out.print("O barco é do tipo a Vela, ");
        super.display();
    }
    
}
