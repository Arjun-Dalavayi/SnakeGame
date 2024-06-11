package Game;

import GameInterface.GameInterface;
import database.DataBase;

import javax.swing.*;
import java.util.Random;

public class SnakeMoment {
    SnakeSize obj;
    Panel panel;
    MyThread myThread;
    DataBase dataBase;
    Sound sound;
    static String directionHolder="right";
    static int temp=0;

    public SnakeMoment(SnakeSize obj, Panel panel,Sound sound,MyThread myThread,DataBase dataBase) {
        this.obj = obj;
        this.panel = panel;
        this.sound=sound;
        this.myThread=myThread;
        this.dataBase=dataBase;
        foodPlacer();
    }

    public void moveSnake(){
        for(int i=obj.snakeLength-1;i>0;i--){
            obj.X[i]=obj.X[i-1];
            obj.Y[i]=obj.Y[i-1];
            obj.bodyImage[i]=obj.bodyImage[i-1];
        }

        switch (Controls.direction){
            case "up":
                obj.Y[0]-=20;
                panel.image.tempHead=panel.image.upHead;
                if(!directionHolder.equals("up")){
                    setCurve("up");
                }
                if(temp==0) {
                    obj.bodyImage[0] = panel.image.upAndDownBody;
                    temp=1;
                }else {
                    obj.bodyImage[0] = panel.image.upAndDownBody1;
                    temp=0;
                }
                directionHolder="up";
            break;
            case "down":
                obj.Y[0]+=20;
                panel.image.tempHead=panel.image.downHead;
                if(!directionHolder.equals("down")){
                    setCurve("down");
                }
                if(temp==0) {
                obj.bodyImage[0] = panel.image.upAndDownBody;
                temp=1;
                }else {
                obj.bodyImage[0] = panel.image.upAndDownBody1;
                temp=0;
                 }
                directionHolder="down";
            break;
            case "right":
                obj.X[0]+=20;
                panel.image.tempHead=panel.image.rightHead;
                if(!directionHolder.equals("right")){
                    setCurve("right");
                }

                if(temp==0) {
                    obj.bodyImage[0]=panel.image.leftAndRightBody;
                    temp=1;
                }else {
                    obj.bodyImage[0]=panel.image.leftAndRightBody1;
                    temp=0;
                }
                directionHolder="right";
            break;
            case "left":
                obj.X[0]-=20;
                panel.image.tempHead=panel.image.leftHead;
                if(!directionHolder.equals("left")){
                    setCurve("left");
                }
                if(temp==0) {
                    obj.bodyImage[0]=panel.image.leftAndRightBody;
                    temp=1;
                }else {
                    obj.bodyImage[0]=panel.image.leftAndRightBody1;
                    temp=0;
                }
                directionHolder="left";
            break;
        }
    }
    public void checkCollision(){
        for(int i=1;i< obj.snakeLength;i++){
            if(obj.X[0]==obj.X[i] && obj.Y[0]==obj.Y[i]){
                gameOver();
            }
        }


          if(obj.X[0]>obj.panelWidth-1 || obj.X[0]<0 || obj.Y[0]>obj.panelHeight-1 || obj.Y[0]<0){
              gameOver();
          }
    }

   public void checkFoodCollision(){
       if(obj.X[0]==obj.snakeFoodx && obj.Y[0]==obj.snakeFoody){
           foodPlacer();
           soundEf(1);
           obj.snakeLength++;
           obj.score++;
       }
   }
    public void gameOver(){
        soundEf(2);
        JOptionPane.showMessageDialog(null," Your Score : "+obj.score,"Game Over",JOptionPane.ERROR_MESSAGE);
        myThread.bool=false;
        dataBase.checkHighScore(myThread.levelIndex,obj.score);
        panel.frame.dispose();
        new GameInterface();
        Controls.direction="right";
        directionHolder="right";
    }

    public void backButton(){
        myThread.bool=false;
        panel.frame.dispose();
        Controls.direction="right";
        directionHolder="right";
        new GameInterface();

    }
    public void foodPlacer(){
        Random random=new Random();
        obj.snakeFoodx=obj.tileWidth*random.nextInt(obj.numberOfRowTiles);
        obj.snakeFoody=obj.tileHeight*random.nextInt(obj.numberOfColumnTiles);
    }

    public void soundEf(int i){
        sound.setFile(i);
         sound.play();
    }


    public void setCurve(String direction){
        switch (direction){
            case "up":
                if(directionHolder.equals("left")){
                    obj.bodyImage[1]=panel.image.leftUpCurve;
                }else {
                    obj.bodyImage[1]=panel.image.rightUpCurve;

                }
                break;
            case "down":
                if(directionHolder.equals("left")){
                    obj.bodyImage[1]=panel.image.leftDownCurve;
                }else {
                    obj.bodyImage[1]=panel.image.rightDownCurve;

                }
                break;
            case "right":
                if(directionHolder.equals("up")){
                    obj.bodyImage[1]=panel.image.leftDownCurve;
                }else {
                    obj.bodyImage[1]=panel.image.leftUpCurve;

                }
                break;
            case "left":
                if(directionHolder.equals("up")){
                obj.bodyImage[1]=panel.image.rightDownCurve;
            }else {
                obj.bodyImage[1]=panel.image.rightUpCurve;

            }
                break;
        }
    }
}
