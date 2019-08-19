package complemento;

import definirValor.DefinirValorComEdificacao;
import imobiliaria.Imovel;

public class Casa extends Imovel{
    
    public Casa(String loc, int comodos, float espaco) {
        super(loc, comodos, espaco);
        setComportamentoValor(new DefinirValorComEdificacao());
    }
    
    @Override
    public void display(){
        System.out.print("O valor desta casa é: ");
        super.display();
    }
    
}
