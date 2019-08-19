package complemento;

import definirValor.DefinirValorComEdificacao;
import imobiliaria.Imovel;

public class Apartamento extends Imovel{
    
    public Apartamento(String loc, int comodos, float espaco) {
        super(loc, comodos, espaco);
        setComportamentoValor(new DefinirValorComEdificacao());
    }
    @Override
    public void display(){
        System.out.print("O valor deste apartamento é: ");
        super.display();
    }
    
}
