package audio;
import java.io.*;
import sun.audio.*;

public class Som {
     public static String inicio() throws Exception {
        //mudar o caminho para cada maquina
        String musica = "/home/rafael/NetBeansProjects/RPIIMUD/src/audio/inicio.wav";
        InputStream in = new FileInputStream(musica);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
        return musica;
    }
     public static void parar(String musica) throws Exception{
         InputStream in = new FileInputStream(musica);
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
