package audio;

import java.io.*;
import sun.audio.*;

public class Som {

    String musica;

    public static AudioStream inicio() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\RPIIMUD\\src\\audio\\musica.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop;
        return audio;

    }

    public static AudioStream parar(AudioStream musica) throws Exception {
        AudioPlayer.player.stop(musica);
        return null;
    }

    public static void parar() throws Exception {
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\RPIIMUD\\src\\audio\\musica.wav"));
        AudioPlayer.player.stop(audio);
    }

}
