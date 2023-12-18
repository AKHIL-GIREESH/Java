package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalcGUIlator implements ActionListener,ItemListener{
    JFrame jf;
    JLabel jl1;
    JLabel jl2;
    JLabel jlResult;
    JTextField jtf1;
    JTextField jtf2;
    JButton jbAdd;
    JButton jbSub;
    JButton jbMul;
    JButton jbQuo;
    JLabel jlR;
    JTextField jfR;
    JToggleButton jtb;

    CalcGUIlator(){
        jf = new JFrame("Calculator");
        jl1 = new JLabel("Enter 1st Number");
        jf.add(jl1);

        jtf1 = new JTextField(10);
        jf.add(jtf1);

        jl2 = new JLabel("Enter 2nd Number");
        jf.add(jl2);

        jtf2 = new JTextField(10);
        jf.add(jtf2);

        jbAdd = new JButton("+");
        jbAdd.addActionListener(this);
        jf.add(jbAdd);

        jbSub = new JButton("-");
        jbSub.addActionListener(this);
        jf.add(jbSub);

        jbMul = new JButton("*");
        jbMul.addActionListener(this);
        jf.add(jbMul);

        jbQuo = new JButton("/");
        jbQuo.addActionListener(this);
        jf.add(jbQuo);

        jlR = new JLabel("Result");
        jf.add(jlR); 

        jtb = new JToggleButton("Click!");
        jtb.addItemListener(this);
        jf.add(jtb);

        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        int num1,num2,result;
        num1 = Integer.parseInt(jtf1.getText());
        num2 = Integer.parseInt(jtf2.getText());
        if(s == "+"){
            result = num1+num2;
        }else if(s == "-"){
            result = num1-num2;
        }else if(s == "*"){
            result = num1*num2;
        }else{
            result = num1/num2;
        }

        jlR.setText(""+result);
    }

    public void itemStateChanged(ItemEvent e){

    }

}

public class Calculator {
    public static void main(String[] args) {
        CalcGUIlator c = new CalcGUIlator();
    }
    
}
