package adapter;

import action.FormatoAudio;
import format.WmaPlay;

public class WmaAdapter implements FormatoAudio{
    
    WmaPlay wma;
    
    public WmaAdapter(WmaPlay wma){
        this.wma = wma;
    }

    @Override
    public void abrir(String nomeArq) {
        wma.setFile(nomeArq);
        wma.open();
    }

    @Override
    public void reproduzir() {
        wma.setLocation(0);
        wma.play();
    }

    @Override
    public void parar() {
        wma.stop();
    }
    
}
