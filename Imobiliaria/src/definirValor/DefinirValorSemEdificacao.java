package definirValor;

public class DefinirValorSemEdificacao implements DefinirValorComportamento{

    @Override
    public void definirValor(String localizacao, int comodos, float espaco) {
       if(localizacao.equalsIgnoreCase("A")){
           float total = espaco * 100; 
           System.out.print(total);
        }else if(localizacao.equalsIgnoreCase("B")){
           float total = espaco * 750; 
           System.out.print(total);
        }else{
           float total = espaco * 200; 
           System.out.print(total);
        }
    }    
    
}
