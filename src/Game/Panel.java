package Game;

import Images.Images;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    SnakeSize snakeSize;
    JFrame frame;
    Images image;


    Panel(){
        image=new Images();
        frame=new JFrame();
        snakeSize=new SnakeSize();
        setPreferredSize(new Dimension(snakeSize.panelWidth,snakeSize.panelHeight));
        add(new JLabel(image.backGround));


        frame.setSize(snakeSize.panelWidth,snakeSize.panelHeight);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gd = (Graphics2D) g;
        gd.setFont(new Font("Italic",Font.BOLD,20));
        gd.drawImage(image.foodImage, snakeSize.snakeFoodx, snakeSize.snakeFoody, this);
        for (int i = 0; i < snakeSize.snakeLength; i++) {
            if (i == 0) {
                gd.drawImage(image.tempHead, snakeSize.X[0], snakeSize.Y[0], this);
            } else {
                gd.drawImage(snakeSize.bodyImage[i], snakeSize.X[i], snakeSize.Y[i], this);
            }
            gd.drawString("Score "+snakeSize.score,snakeSize.panelWidth-90, (snakeSize.panelHeight+20)-snakeSize.panelHeight);
        }
    }
}
