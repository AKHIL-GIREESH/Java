import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Cal implements ActionListener{
    JFrame jf;
    JButton j1,j2,j5,jPlus,jDiv,jEquals;
    JTextField jtf;
    int num1=0,num2=0;
    String cookingNum="",operator=null;

    Cal(){
        jf = new JFrame();

        jtf = new JTextField("",40);
        jf.add(jtf);
        
        j1 = new JButton("1");
        j2 = new JButton("2");
        j5 = new JButton("5");
        jPlus = new JButton("+");
        jDiv = new JButton("/");
        jEquals = new JButton("=");

        j1.addActionListener(this);
        j2.addActionListener(this);
        j5.addActionListener(this);
        jPlus.addActionListener(this);
        jDiv.addActionListener(this);
        jEquals.addActionListener(this);
        
        jf.add(j1);
        jf.add(j2);
        jf.add(j5);
        jf.add(jPlus);
        jf.add(jDiv);
        jf.add(jEquals);

        jf.setSize(400,400);
        jf.setLayout(new GridLayout(3,2));
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        
        switch(s){
            case "1": cookingNum+=s;
                        jtf.setText(jtf.getText()+s);
                        break;
            case "2": cookingNum+=s;
                        jtf.setText(jtf.getText()+s);
                        break;
            case "5": cookingNum+=s;
                        jtf.setText(jtf.getText()+s);
                        break;
            case "+": num1 = Integer.parseInt(cookingNum);
                    jtf.setText(jtf.getText()+s);
                      cookingNum = "";
                      operator = s;
                      break;
            case "/": num1 = Integer.parseInt(cookingNum);
                        jtf.setText(jtf.getText()+s);
                      cookingNum = "";
                      operator = s;
                      break;
            case "=": num2 = Integer.parseInt(cookingNum);
                      cookingNum = "";
                      switch(operator){
                        case "+": jtf.setText(""+(num1+num2));
                                    break;
                        case "/": jtf.setText(""+(num1/num2));
                                    break;
                        }
                        num1 = 0;
                        num2 = 0;
                      break;
        }
    }
}

public class GUI_06 {
    public static void main(String[] args) {
        Cal c = new Cal();
    }    
}
