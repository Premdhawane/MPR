package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(300, 90, 950, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
    
	
        
        JLabel l1 = new JLabel("Welcome " + username + " to our QUIZ!!!");
        l1.setForeground(new Color(255, 16, 240));
        l1.setFont(new Font("Cooper Black", Font.BOLD, 30));
        l1.setBounds(280,-30,1650,300);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.BOLD, 15));
        l2.setBackground(new Color(0, 0, 0));
        l2.setForeground(new Color(135, 206, 235));
        l2.setBounds(220, -45, 1650, 700);
        l2.setText(
            "<html>"+ 
            "1. This will be an MCQ based quiz." + "<br><br>" +
            "2. Each question will have 4 options out of which only one is correct." + "<br><br>" +
            "3. You must answer each question befroe the 15 sec timer runs out. " + "<br><br>" +
            "4.If you fail to submit the question,it will get auto-submitted. " + "<br><br>" +
            "5. You can go to the next question by clicking on the buttons." + "<br><br>" +
            "6. There is a 50-50 Lifeline that can be used only once throughout the quiz." + "<br><br>" +
            "7. We discourage you from using any unfair means to find th answers." + "<br><br>" +
            "8. All the best!" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(370, 430, 100, 20);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(500, 430, 100, 20);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);


        setLayout(new BorderLayout());
        JLabel l3=new JLabel(new ImageIcon("C:\\Users\\premd\\Dropbox\\My PC (LAPTOP-RPO2REH4)\\Downloads\\Quiz-Application-Using-Java-master\\Quiz-Application-Using-Java-master\\src\\simple\\minds\\icons\\quizback (1).jpg"));
        add(l3);
        l1.setLayout(new FlowLayout());
        add(l3);

        setVisible(true);


    }

    
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }

    
    public static void main(String[] args){
        new Rules("");
    }
}
