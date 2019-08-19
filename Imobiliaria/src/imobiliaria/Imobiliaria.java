package imobiliaria;

import complemento.Apartamento;
import complemento.Casa;
import complemento.Terreno;

public class Imobiliaria {

    public static void main(String[] args) {
        Casa c1 = new Casa("A", 3, 64);
        c1.display();
        Apartamento ap1 = new Apartamento("B", 4, 80);
        ap1.display();
        Terreno t1 = new Terreno("B", 0, 120);
        t1.display();
    }
    
}
