package format;

import action.FormatoAudio;

public class Mp3 implements FormatoAudio{

    private String nome;
    
    @Override
    public void abrir(String nomeArq) {
       this.nome = nomeArq;
        System.out.println("Foi aberto o player: " + nome);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo o player: " + nome);
    }

    @Override
    public void parar() {
        System.out.println("Reprodução do player " + nome + "parada!");
    }
    
}
