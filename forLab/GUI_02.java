import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalGUIlator implements ActionListener{
    JFrame jf;
    JTextField jt1,jt2;
    JButton jbA,jbS,jbM,jbD,jbR;
    JLabel jl,jl2;

    CalGUIlator(){
        jf = new JFrame("Calculator");
        
        jt1 = new JTextField(10);
        jt2 = new JTextField(10);
        jf.add(jt1);
        jf.add(jt2);

        jbA = new JButton("+");
        jbS = new JButton("-");
        jbM = new JButton("*");
        jbD = new JButton("/");
        jbR = new JButton("%");
        jbA.addActionListener(this);
        jbS.addActionListener(this);
        jbM.addActionListener(this);
        jbD.addActionListener(this);
        jbR.addActionListener(this);
        jf.add(jbA);
        jf.add(jbS);
        jf.add(jbM);
        jf.add(jbD);
        jf.add(jbR);

        jl2 = new JLabel("<html><body><br></body></html>");
        jl = new JLabel("Result = ");
        
        jf.add(jl2);
        jf.add(jl);

        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        int a = Integer.parseInt(jt1.getText()), b = Integer.parseInt(jt2.getText());

        if(s.equals("+")){
            jl.setText(jl.getText()+(a+b));
        }else if(s.equals("-")){
            jl.setText(jl.getText()+(a-b));
        }else if(s.equals("*")){
            jl.setText(jl.getText()+(a*b));
        }else if(s.equals("/")){
            jl.setText(jl.getText()+(a/b));
        }else{
            jl.setText(jl.getText()+(a%b));
        }
    }
}

public class GUI_02 {
    public static void main(String[] args) {
        CalGUIlator c = new CalGUIlator();
    }
}