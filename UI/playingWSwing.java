package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI implements ActionListener{
    JFrame jf;
    JButton jbADD;
    JButton jbSUB;
    JTextField jtf1;
    JTextField jtf2;
    JLabel jl;
    GUI(){
        jf = new JFrame();
        jf.setLayout(new FlowLayout());
        jf.setSize(500,500);

        jbADD = new JButton("+");
        jf.add(jbADD);
        jbADD.addActionListener(this);

        jbSUB = new JButton("-");
        jf.add(jbSUB);
        jbSUB.addActionListener(this);

        jtf1 = new JTextField("hi",20);
        jf.add(jtf1);

        jtf2 = new JTextField(20);
        jf.add(jtf2);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("Works");
        jl = new JLabel("Answer is "+Integer.parseInt(jtf1.getText())+Integer.parseInt(jtf2.getText()));
        jf.add(jl);
        jf.setVisible(true);
    }
}

public class playingWSwing {
    public static void main(String[] args) {
        GUI g = new GUI();
    }
}
