package format;

public class WmaPlay {
    
    private String nome;
    
    public void setFile(String nomArq){
        this.nome = nomArq;
        System.out.println("O nome do WMA eh: " + nome);
    }
    
    public void open(){
        System.out.println("Aberto o WMA " + nome); 
    }
    
    public void setLocation(int posicao){
        
        if(posicao == 0){
            System.out.println("O WMA" + nome + " será reproduzido do inicio");
        } 
    }
    
    public void play(){
        System.out.println("O WMA " + nome + " esta sendo reproduzido!");
    }
    
    public void stop(){
        System.out.println("O WMA " + nome + " foi parado!");
    }
    
    
}
