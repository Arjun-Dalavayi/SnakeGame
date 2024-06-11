package Game;

import java.awt.*;

public class SnakeSize {
    public int tileHeight=20;
    public int tileWidth=20;

    public int numberOfRowTiles=31;
    public int numberOfColumnTiles=31;
    public int panelWidth=numberOfRowTiles*tileHeight;
    public int panelHeight=numberOfColumnTiles*tileWidth;
    public int [] X=new int[numberOfColumnTiles*numberOfColumnTiles];
    public int [] Y=new int[numberOfColumnTiles*numberOfRowTiles];


    public int snakeFoodx=20;
    public int snakeFoody =20;
    public int snakeLength=1;

    public int score;

    Image[] bodyImage=new Image[numberOfRowTiles*numberOfColumnTiles];



}
