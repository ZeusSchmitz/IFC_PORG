package locadora;

import tipoBarco.BarcoVela;
import tipoBarco.Bateira;
import tipoBarco.Canoa;
import tipoBarco.Iate;
import tipoBarco.Jangada;

public class Locadora {

    public static void main(String[] args) {
        
        Bateira b = new Bateira();
        b.display();
        BarcoVela v = new BarcoVela();
        v.display();
        Canoa c  = new Canoa();
        c.display();
        Iate i = new Iate();
        i.display();
        Jangada j = new Jangada();
        j.display();
        
    }
    
}
