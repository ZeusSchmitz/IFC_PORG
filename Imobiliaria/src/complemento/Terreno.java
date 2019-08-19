package complemento;

import definirValor.DefinirValorComEdificacao;
import imobiliaria.Imovel;

public class Terreno extends Imovel{
    
    public Terreno(String loc, int comodos, float espaco) {
        super(loc, comodos, espaco);
        setComportamentoValor(new DefinirValorComEdificacao());
    }
    @Override
    public void display(){
        System.out.print("O valor deste terreno é: ");
        super.display();
    }
    
}
