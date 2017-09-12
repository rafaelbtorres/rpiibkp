package audio;

import java.io.*;
import sun.audio.*;

public class Som {

    String musica;

    public static AudioStream inicio() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("/home/rafael/NetBeansProjects/RPIIMUD-master/src/audio/musica_menu.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop;
        return audio;
    }

    public static AudioStream parar(AudioStream musica) throws Exception {
        AudioPlayer.player.stop(musica);
        return null;
    }

    public static AudioStream fase1() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("/home/rafael/NetBeansProjects/RPIIMUD-master/src/audio/musica_fase1.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop;
        return audio;
    }

    public static AudioStream cervo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("/home/rafael/NetBeansProjects/RPIIMUD-master/src/audio/cervo_morto.wav"));
        AudioPlayer.player.start(audio);
        return audio;

    }

    public static AudioStream porta() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("/home/rafael/NetBeansProjects/RPIIMUD-master/src/audio/porta.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop;
        return audio;
    }

}
