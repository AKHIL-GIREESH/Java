import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIfr implements ActionListener{
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jt1,jt2;
    JButton jbFact,jbSquare,jbCube;
    GUIfr(){
        jf = new JFrame();
        jl1 = new JLabel("Enter the Number");
        jl2 = new JLabel("Result");
        jt1 = new JTextField(20);
        jt2 = new JTextField(20);
        jbFact = new JButton("Factorial");
        jbSquare = new JButton("Square");
        jbCube = new JButton("Cube");
        
        jbFact.addActionListener(this);
        jbSquare.addActionListener(this);
        jbCube.addActionListener(this);

        jf.add(jl1);
        jf.add(jl2);
        jf.add(jbFact);
        jf.add(jbSquare);
        jf.add(jbCube);
        jf.add(jt1);
        jf.add(jt2);

        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("Factorial")){
            jt2.setText(""+Factorial(Integer.parseInt(jt1.getText())));
        }else if(s.equals("Square")){
            jt2.setText(""+(Math.pow(Integer.parseInt(jt1.getText()),2)));
        }else if(s.equals("Cube")){
            jt2.setText(""+(Math.pow(Integer.parseInt(jt1.getText()),3)));
        }
    }

    int Factorial(int num){
        int fact=1;
        while(num>1){
            fact*= num--;
        }
        return fact;
    }
}

public class GUI_04 {
    public static void main(String args[]){
        GUIfr g = new GUIfr();
    }
}
