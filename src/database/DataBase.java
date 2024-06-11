package database;

import javax.swing.*;
import java.sql.*;

public class DataBase {

    public void checkHighScore(int levelIndex,int playerScore){
        int [] scores=getHighScore();
        if(levelIndex==0 && scores[0]<playerScore){
            setHighScore(playerScore,"easyHighScore");
            JOptionPane.showMessageDialog(null," Easy : "+playerScore,"New High Score",JOptionPane.PLAIN_MESSAGE);
        }
        if(levelIndex==1 && scores[1]<playerScore){
            setHighScore(playerScore,"mediumHighScore");
            JOptionPane.showMessageDialog(null," Medium : "+playerScore,"New High Score",JOptionPane.PLAIN_MESSAGE);
        }
        if(levelIndex==2 && scores[2]<playerScore){
           setHighScore(playerScore,"hardHighScore");
            JOptionPane.showMessageDialog(null," Hard : "+playerScore,"New High Score",JOptionPane.PLAIN_MESSAGE);
        }
    }
    private void setHighScore(int score,String columnName){
        try {

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/SnakeGame","root","password");
            Statement statement= con.createStatement();
            String query="update highscore set "+columnName+"= ? where id = ? ";
            PreparedStatement p=con.prepareStatement(query);
            int id=1;
            p.setInt(1,score);
            p.setInt(2,id);
            p.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int[] getHighScore(){
        int[] highScores=new int[3];
        try {
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/SnakeGame","root","password");
            Statement statement= con.createStatement();
            String query="select * from highscore";
            ResultSet rs=statement.executeQuery(query);
            while (rs.next()){
                highScores[0]=rs.getInt("easyHighScore");
                highScores[1]=rs.getInt("mediumHighScore");
                highScores[2]=rs.getInt("hardHighScore");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return highScores;
    }
}
