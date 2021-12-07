package simple.minds;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.StackWalker.Option;

public class Quiz extends JFrame implements ActionListener{
    
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;

    
    String username;
    Quiz(String username){
        this.username = username;
        setBounds(300, 90, 950, 550);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

       

        qno = new JLabel("");
        qno.setFont(new Font("Arial", Font.PLAIN, 24));
        qno.setBackground(new Color(0, 0, 0));
        qno.setForeground(Color.WHITE);
        qno.setBounds(125, 98, 50, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Arial", Font.PLAIN, 24));
        question.setBackground(new Color(0, 0, 0));
        question.setForeground(Color.WHITE);
        question.setBounds(150, 25, 828, 177);
        add(question);
        
        q[0][0] = "Which is used to find and fix bugs in the Java programs?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "The return type of the hashCode() method in Object class is?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Default value of static integer variable of a class in Java is";
        q[2][1] = "0";
        q[2][2] = "1";
        q[2][3] = "Garbage value";
        q[2][4] = "-1";

        q[3][0] = "Which of the following are not Java keywords?";
        q[3][1] = "double";
        q[3][2] = "switch";
        q[3][3] = "then";
        q[3][4] = "instanceof";

        q[4][0] = "Precedence of division w.r.t multiplication operator";
        q[4][1] = "Higher";
        q[4][2] = "Lower";
        q[4][3] = "None";
        q[4][4] = "Equal";

        q[5][0] = "Which of these have highest precedence?";
        q[5][1] = "++";
        q[5][2] = "()";
        q[5][3] = "*";
        q[5][4] = ">>";

        q[6][0] = "Which keyword is used to access the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "The operator used to allocate memory to array variable in Java";
        q[7][1] = "alloc";
        q[7][2] = "new";
        q[7][3] = "new malloc";
        q[7][4] = "malloc";

        q[8][0] = "Java language was initially called as __";
        q[8][1] = "Oak";
        q[8][2] = "J++";
        q[8][3] = "Sumatra";
        q[8][4] = "Pine";

        q[9][0] = ". Which of the following are not Java modifiers?";
        q[9][1] = "friendly";
        q[9][2] = "private";
        q[9][3] = "public";
        q[9][4] = "transient";
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "0";
        qa[3][1] = "then";
        qa[4][1] = "Equal";
        qa[5][1] = "()";
        qa[6][1] = "import";
        qa[7][1] = "new";
        qa[8][1] = "Oak";
        qa[9][1] = "friendly";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(180, 207, 180, 30);
        opt1.setForeground(new Color(255, 255, 255));
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(null);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(180, 269, 180, 30);
        opt2.setForeground(new Color(255, 255, 255));
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(null);
        add(opt2);
        
        
        opt3 = new JRadioButton("");
        opt3.setBounds(180, 335, 180, 30);
        opt3.setForeground(new Color(255, 255, 255));
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(null);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(180, 402, 180, 30);
        opt4.setForeground(new Color(255, 255, 255));
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(null);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(64, 224, 208));
        next.setForeground(Color.black);
        next.addActionListener(this);
        next.setBounds(550, 250, 200, 40);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(64, 224, 208));
        lifeline.setForeground(Color.black);
        lifeline.setBounds(550, 320, 200, 40);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(64, 224, 208));
        submit.setForeground(Color.black);
        submit.addActionListener(this);
        submit.setBounds(550, 390, 200, 40);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 500, 228);
        }else {
            g.drawString("Times Up!!", 1100, 500);
        }
        
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();

        setLayout(new BorderLayout());
        JLabel l3=new JLabel(new ImageIcon("C:\\Users\\premd\\Dropbox\\My PC (LAPTOP-RPO2REH4)\\Downloads\\Quiz-Application-Using-Java-master\\Quiz-Application-Using-Java-master\\src\\simple\\minds\\icons\\Black Friday Sale Banner (1).png"));
        add(l3);
        l3.setLayout(new FlowLayout());
        add(l3);

        setVisible(true);
    }
    
    public static void main(String[] args){
        new Quiz("").setVisible(true);
    }
}