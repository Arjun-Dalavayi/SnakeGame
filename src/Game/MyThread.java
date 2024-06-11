package Game;

import database.DataBase;

public class MyThread extends Thread implements Cloneable{
    Panel panel;

    SnakeMoment snakeMoment;
    Controls controls;
    public boolean bool=true;
    private final int [] level={400,200,100};
    int levelIndex;
    public MyThread(){
    }

    public MyThread(int levelIndex,Sound sound,DataBase dataBase){
        this.levelIndex=levelIndex;
        panel=new Panel();
        snakeMoment=new SnakeMoment(panel.snakeSize,panel,sound,this,dataBase);
        controls=new Controls(snakeMoment);
        panel.frame.addKeyListener(controls);
        bool=true;
        start();
    }

    @Override
    public void run() {
        while (bool) {
            snakeMoment.moveSnake();
            snakeMoment.checkCollision();
            panel.repaint();
            snakeMoment.checkFoodCollision();

            try {
                Thread.sleep(level[levelIndex]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
