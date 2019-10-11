package player;

import action.FormatoAudio;
import adapter.WmaAdapter;
import format.Mp3;
import format.WmaPlay;

public class Player {

    public static void main(String[] args) {
        
        Mp3 mp3 = new Mp3();
        WmaPlay wma = new WmaPlay();
        
        WmaAdapter wmaAdapter = new WmaAdapter(wma);
        
        wma.setFile("Fundao da grota.wma");
        wma.open();
        wma.setLocation(3);
        wma.play();
        wma.stop();
        
        System.out.println("\n Reproducao MP3: ");
        testeAudio(mp3, "Musica.mp3");
        
        System.out.println("\n Reproducao WAV: ");
        testeAudio(mp3, "Musica.wav");
        
        System.out.println("\n Reproducao WMA: ");
        testeAudio(mp3, "Musica.wma");
    }
    
    public static void testeAudio(FormatoAudio audio, String nomArquivo){
        audio.abrir(nomArquivo);
        audio.reproduzir();
        audio.parar();
    }
            
}
