package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        setBounds(300, 90, 950, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel l2 = new JLabel("Thankyou " + username + " for Playing!!!");
        l2.setBounds(450, 140, 700, 45);
        l2.setFont(new Font("Cooper Black", Font.BOLD, 30));
        l2.setForeground(new Color (222, 11, 102));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(500, 220, 300, 35);
        l3.setFont(new Font("Tahoma", Font.BOLD, 30));
        l3.setForeground(new Color(255, 255, 255));
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        b1.setBounds(555, 300, 120, 55);
        add(b1);

        setLayout(new BorderLayout());
        JLabel b2=new JLabel(new ImageIcon("C:\\Users\\premd\\Dropbox\\My PC (LAPTOP-RPO2REH4)\\Downloads\\Quiz-Application-Using-Java-master\\Quiz-Application-Using-Java-master\\src\\simple\\minds\\icons\\backgrd.png"));
        add(b2);
        b2.setLayout(new FlowLayout());
        add(b2);
 
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
