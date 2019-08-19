package tipoBarco;

import locadora.Barco;
import navegacao.Remos;

public class Jangada extends Barco {

    public Jangada() {
        setComportamentoMovimento(new Remos());
    }

    @Override
    public void display() {
        System.out.print("O barco é do tipo Jangada ");
        super.display();
    }

}
