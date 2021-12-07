package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMinds extends JFrame implements ActionListener{
    
    JButton b1, b2;
    JTextField t1;
    SimpleMinds(){
        setBounds(300, 90, 950, 550); // dleft, //dup // length, height ///////
        getContentPane().setBackground(new Color(0, 49, 83));
        setLayout(null);

        

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Cooper Black", Font.BOLD, 24));
        l3.setForeground(new Color(255, 240, 31));
        l3.setBounds(350, -30, 300, 800);
        add(l3);



        
        t1 = new JTextField();
        t1.setBounds(310, 410, 300, 25);
        t1.setFont(new Font("Arial", Font.BOLD, 20));
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(500, 460, 120, 25);
        b1.setBackground(new Color(255, 16, 240));
        b1.setForeground(new Color(0, 0, 0));
        b1.addActionListener(this);
        add(b1);

        
        
        b2 = new JButton("Exit");
        b2.setBounds(300, 460, 120, 25);
        b2.setBackground(new Color(255, 16, 240));
        b2.setForeground(new Color(0, 0, 0));
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);


        setLayout(new BorderLayout());
        JLabel l1=new JLabel(new ImageIcon("C:\\Users\\premd\\Dropbox\\My PC (LAPTOP-RPO2REH4)\\Downloads\\Quiz-Application-Using-Java-master\\Quiz-Application-Using-Java-master\\src\\simple\\minds\\icons\\login1.jpg"));
        add(l1);
        l1.setLayout(new FlowLayout());
        add(l1);

        setVisible(true);

        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new SimpleMinds();
    }
    
}