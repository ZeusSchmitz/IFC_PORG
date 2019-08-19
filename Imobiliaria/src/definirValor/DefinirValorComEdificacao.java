package definirValor;

public class DefinirValorComEdificacao implements DefinirValorComportamento{

    @Override
    public void definirValor(String localizacao, int comodos, float espaco) {
        
        if(localizacao.equalsIgnoreCase("A")){
            float total = (espaco * 3000) + (1000 * comodos); 
            System.out.println(total);
        }else if(localizacao.equalsIgnoreCase("B")){
            float total = (espaco * 1000) + (1000 * comodos); 
            System.out.println(total);
        }else{
            float total = (espaco * 500) + (1000 * comodos); 
            System.out.println(total);
        }
    } 
    
}
