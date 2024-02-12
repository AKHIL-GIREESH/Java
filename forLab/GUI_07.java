import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CAL implements ActionListener{
    JFrame jf;
    JLabel jl;
    JRadioButton rr,ry,rg;
    ButtonGroup bg;

    CAL(){
        jf = new JFrame();
        
        jl = new JLabel("Label");
        jf.add(jl);

        rr = new JRadioButton("RED");
        ry = new JRadioButton("YELLOW");
        rg = new JRadioButton("GREEN");
        bg = new ButtonGroup();

        bg.add(rr);
        bg.add(ry);
        bg.add(rg);

        rr.addActionListener(this);
        ry.addActionListener(this);
        rg.addActionListener(this);

        jf.add(rr);
        jf.add(ry);
        jf.add(rg);

        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        if(rr.isSelected()){
            rr.setForeground(Color.RED);
            jl.setText("RED");
            jl.setBackground(Color.RED);
        }
    }

}

public class GUI_07{
    public static void main(String[] args) {
        CAL c = new CAL();
    }
    
}
