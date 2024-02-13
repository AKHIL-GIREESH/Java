import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class simpleGUI implements ActionListener,ItemListener{
    JFrame jf;
    JButton jb;
    JLabel jl,jl2;
    JTextField jtf;
    JToggleButton jtb;
    JCheckBox jc1,jc2,jc3;
    JTextArea jTA;

    simpleGUI(){
        jf = new JFrame("Hello");
        jb = new JButton("Click Me");
        jl = new JLabel("Label");
        jl2 = new JLabel(" ");
        jtb = new JToggleButton("OFF");
        jtf = new JTextField("TextField",10);
        jb.addActionListener(this);
        jtb.addItemListener(this);
        jf.add(jb);
        jf.add(jl);
        jf.add(jtf);
        jf.add(jl2);
        jf.add(jtb);

        jc1 = new JCheckBox("li1");
        jc2 = new JCheckBox("li2");
        jc3 = new JCheckBox("li3");
        jc1.addItemListener(this);
        jc2.addItemListener(this);
        jc3.addItemListener(this);
        jf.add(jc1);
        jf.add(jc2);
        jf.add(jc3);

        jTA = new JTextArea(5,10);
        jf.add(jTA);

        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();
        if(s.equals("Click Me")){
            jb.setText("Clicked");
        }else{jb.setActionCommand("Click Me");}
    }

    public void itemStateChanged(ItemEvent e){
        System.out.println(e.getItem());
        if(jtb.isSelected()){
            jtb.setText("ON");
            jl2.setText("Activated");
        }else{
            jl2.setText(" ");
            jtb.setText("OFF");
        }

        if(jc1.isSelected()){
            jTA.setText("li1");
        }
    }
}

public class GUI_08 {
    public static void main(String[] args) {
        simpleGUI s = new simpleGUI();
    }
}

