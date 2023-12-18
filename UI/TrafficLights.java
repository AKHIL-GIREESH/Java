package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TrafficLights implements ActionListener
{
    JFrame jf;
    JLabel jl;
    JRadioButton rr,ry,rg;
    ButtonGroup bg;
    TrafficLights()
    {
        jf=new JFrame("tarfficlights");
        jl=new JLabel("select");
        rr=new JRadioButton("red");
        ry=new JRadioButton("yellow");
        rg=new JRadioButton("green");
        bg=new ButtonGroup();
        rr.setBackground(Color.RED);
        ry.setForeground(Color.YELLOW);
        rg.setForeground(Color.GREEN);
        bg.add(rr);
        bg.add(ry);
        bg.add(rg);
        jf.add(jl);
        jf.add(rr);
        jf.add(ry);
        jf.add(rg);
        jf.setSize(4000,5000);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        // bg.add(rr);
        // bg.add(ry);
        // bg.add(rg);
        rr.addActionListener(this);
        ry.addActionListener(this);
        rg.addActionListener(this);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent ae)
        {
            String s=ae.getActionCommand();
            if(s.equals("red"))
            {
                jl.setForeground(Color.RED);
                jl.setText("stop");
            }
            else if(s.equals("yellow"))
            {
                jl.setForeground(Color.YELLOW);
                jl.setText("wait");
            }
            else if(s.equals("green"))
            {
                jl.setForeground(Color.GREEN);
                jl.setText("go");
            }
        }   
    
    public static void main(String args[])
    {
        TrafficLights ob=new TrafficLights();
    }
}