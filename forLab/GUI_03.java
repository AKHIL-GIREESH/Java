import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficL implements ActionListener{
    JFrame jf;
    JLabel jl;
    JRadioButton rr,ry,rg;
    ButtonGroup jg;


    TrafficL(){
        jf = new JFrame("Traffic Light");
        jl = new JLabel(" ");
        jf.add(jl);

        jg = new ButtonGroup();
        rr = new JRadioButton("Red");
        ry = new JRadioButton("Yellow");
        rg = new JRadioButton("Green");

        rr.setForeground(Color.RED);
        ry.setForeground(Color.YELLOW);
        rg.setForeground(Color.GREEN);

        jg.add(rr);
        jg.add(ry);
        jg.add(rg);

        jf.add(rr);
        jf.add(ry);
        jf.add(rg);

        rr.addActionListener(this);
        ry.addActionListener(this);
        rg.addActionListener(this);

        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
            String s = e.getActionCommand();

            rr.setForeground(Color.RED);
            ry.setForeground(Color.YELLOW);
            rg.setForeground(Color.GREEN);

            if(rr.isSelected()){
                jl.setText("RED");
                rr.setBackground(Color.RED);
                rr.setForeground(Color.BLACK);
            }else if(ry.isSelected()){
                jl.setText("YELLOW");
                ry.setBackground(Color.YELLOW);
                ry.setForeground(Color.BLACK);
            }else if(rg.isSelected()){
                jl.setText("GREEN");
                rg.setBackground(Color.GREEN);
                rg.setForeground(Color.BLACK);
            }
    }
}
public class GUI_03 {
    public static void main(String[] args) {
        TrafficL L = new TrafficL();
    }
}
