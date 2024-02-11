import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class simpleGUI{
    JFrame jf;
    JButton jb;

    simpleGUI(){
        jf = new JFrame("Hello");
        jb = new JButton("Click Me");
        jf.add(jb);

        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}

public class GUI_01 {
    public static void main(String[] args) {
        simpleGUI s = new simpleGUI();
    }
}
