package audio;

import java.io.*;
import sun.audio.*;

public class Som {
    String musica;

    public static void inicio() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\RPIIMUD\\src\\audio\\musica.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop ;
    }
     public static void parar() throws Exception{
         AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\RPIIMUD\\src\\audio\\musica.wav"));
         AudioPlayer.player.stop(audio); 
     }
}