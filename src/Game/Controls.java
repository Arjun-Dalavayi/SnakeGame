package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls implements KeyListener {
    static String direction="right";
    SnakeMoment snakeMoment;
    public Controls(){

    }
    public Controls(SnakeMoment snakeMoment){
        this.snakeMoment=snakeMoment;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


//    MyThread myThread=new MyThread();
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==37){
            direction ="left";
        }
        if (e.getKeyCode()==38) {
            direction ="up";
        }
        if (e.getKeyCode()==39) {
            direction ="right";
        }if (e.getKeyCode()==40) {
            direction ="down";
        }

        if(e.getKeyCode()==65){
            direction ="left";
        }
        if (e.getKeyCode()==87) {
            direction ="up";
        }
        if (e.getKeyCode()==68) {
            direction ="right";
        }
        if (e.getKeyCode()==83) {
            direction ="down";
        }
        if(e.getKeyCode()==66){
            snakeMoment.backButton();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
