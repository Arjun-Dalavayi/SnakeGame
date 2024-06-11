package Game;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Sound {
    Clip clip;
    URL [] soundUrl=new URL[5];
    public Sound(){
        soundUrl[0]=getClass().getResource("/sound/background.wav");
        soundUrl[1]=getClass().getResource("/sound/eatSound.wav");
        soundUrl[2]=getClass().getResource("/sound/gameOver.wav");
    }
    public void setFile(int i){
        try {
            AudioInputStream ais= AudioSystem.getAudioInputStream(soundUrl[i]);
            clip=AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void play(){
        clip.start();
    }

    public void loop(){
        clip.loop(43);
    }
    public void stop(){
        clip.stop();
    }


}
