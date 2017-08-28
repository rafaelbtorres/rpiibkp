package audio;
import java.io.*;
import sun.audio.*;

public class Som {
     public static void inicio() throws Exception {
        //mudar o caminho para cada maquina
        String musica = "/home/rafael/NetBeansProjects/RPIIMUD/src/audio/inicio.wav";
        InputStream in = new FileInputStream(musica);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
    }
     public static void parar(String musica) throws Exception{
         String som = musica;
         InputStream in = new FileInputStream(som);
         AudioStream audio = new AudioStream(in);
         AudioPlayer.player.stop(audio);  
     }
    
    public static void musica() throws Exception {
        //mudar o caminho para cada maquina      
        String musica = "/home/rafael/NetBeansProjects/RPIIMUD/src/audio/fundo.wav";
        InputStream in = new FileInputStream(musica);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
    }          
}
