package GameInterface;

import Game.MyThread;
import Game.Sound;
import Images.Images;
import database.DataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameInterface extends JFrame implements ActionListener {


        private JButton startButton;
        public   static JComboBox<String> levelButton;
        private final JButton highScoreButton;
        private final JButton exitButton;
        private final JButton helpButton;
        private final JPanel panel;
        Images images;
        private final Font font;
        private final Sound sound;
        private  final DataBase dataBase;
    public GameInterface() {

            dataBase=new DataBase();
            sound=new Sound();
            sound.setFile(0);
            sound.play();
            sound.loop();
            font=new Font("Italic",Font.ITALIC,25);
            images=new Images();
            panel=new JPanel();
            panel.setBounds(0,0,640,640);
//            panel.setBackground(Color.black);
            JLabel label=new JLabel(images.firstBackGround);
            label.setBounds(0,0,640,640);

            panel.setLayout(null);


            // Create buttons

            startButton = new JButton("START");
            startButton.setBounds(230,160,150,70);
            startButton.setFont(font);
            startButton.setFocusable(false);



            String [] level={"Level : Easy","Level : Medium","Level : Hard"};
            levelButton = new JComboBox<>(level);
            levelButton.setBounds(230,250,150,40);
            levelButton.setFont(new Font("Italic",Font.ITALIC,20));


            highScoreButton=new JButton("HighScore");
            highScoreButton.setBounds(230,310,150,40);
            highScoreButton.setFont(font);

            helpButton=new JButton("Help");
            helpButton.setBounds(230,370,150,40);
            helpButton.setFont(font);
            helpButton.setFocusable(false);

            exitButton=new JButton("Exit");
            exitButton.setBounds(230,430,150,40);
            exitButton.setFont(font);
            exitButton.setFocusable(false);

            // Set layout
            setLayout(new FlowLayout());

            // Add buttons to the frame
            panel.add(startButton);
            panel.add(levelButton);
            panel.add(highScoreButton);
            panel.add(helpButton);
            panel.add(exitButton);
             panel.add(label);
            add(panel);

            // Add action listeners
            startButton.addActionListener(this);
            levelButton.addActionListener(this);
            highScoreButton.addActionListener(this);
            helpButton.addActionListener(this);
            exitButton.addActionListener(this);

            // Set frame properties
            setSize(640, 640);
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            setLocationRelativeTo(null);// Center the frame
            setResizable(false);
            setLayout(null);
            setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==startButton){
                    dispose();
                    sound.stop();
                    new MyThread(levelButton.getSelectedIndex(),sound,dataBase);
            }
          if(e.getSource()==highScoreButton){
                  int [] scores=dataBase.getHighScore();
                  JOptionPane.showMessageDialog(null," Easy : "+scores[0]+"\n Medium : "+scores[1]+"\n " +
                          "Hard : "+ scores[2],"HIGH SCORES",JOptionPane.PLAIN_MESSAGE);
          }
          if(e.getSource()==helpButton){
                  JOptionPane.showMessageDialog(null,"W or PgUp : To move snake UP \n" +
                          "S or PgDn : To move snake DOWN\n" +
                          "A or <- : To move snake LEFT\n" +
                          "D or -> : To move snake RIGHT\n" +
                          "B : To back from Game","Help",JOptionPane.PLAIN_MESSAGE);
          }

          if(e.getSource()==exitButton){
                  dispose();
          }
    }
}






