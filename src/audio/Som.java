package audio;
import static audio.Som.musica;
import java.io.*;
import sun.audio.*;

public class Som {
    
     public static AudioStream inicio() throws Exception {
        //mudar o caminho para cada maquina
        String musica = "/home/rafael/NetBeansProjects/RPIIMUD/src/audio/inicio.wav";
        InputStream in = new FileInputStream(musica);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
        return audio;
    }
     public static AudioStream parar(AudioStream musica) throws Exception{
         AudioPlayer.player.stop(musica);  
         return null;
     }
    
    public static void musica() throws Exception {
        //mudar o caminho para cada maquina      
        String musica = "/home/rafael/NetBeansProjects/RPIIMUD/src/audio/fundo.wav";
        InputStream in = new FileInputStream(musica);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
    }          

}
