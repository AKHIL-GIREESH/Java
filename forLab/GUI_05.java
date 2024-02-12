import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ThreadGUI extends Thread implements ActionListener{
    JFrame jf;
    static JTextField jf1 = null,jf2 = null;
    JButton jb1,jb2;
    ThreadGUI tg1 = null,tg2 = null,tmain = null;
    int num;
    static boolean flag = true;

    ThreadGUI(int num){
        this.num = num;
    }

    void ThreadpartOfGUI(){
        jf = new JFrame();
        jf1 = new JTextField(20);
        jf2 = new JTextField(20);
        jb1 = new JButton("START");
        jb2 = new JButton("STOP");

        jb1.addActionListener(this);
        jb2.addActionListener(this);

        jf.add(jf1);
        jf.add(jf2);
        jf.add(jb1);
        jf.add(jb2);

        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("START")){
            flag = true;
            tg1 = new ThreadGUI(1);
            tg1.start();

            tg2 = new ThreadGUI(2);
            tg2.start();
        }else if(s.equals("STOP")){
            flag = false;
        }
    }

    public void run(){
        //System.out.println(tmain.num);
        try{
            if(num == 1){
                String s1=null;
                for(int i=0;i<10;i++){
                    if(flag == true){
                        s1 = jf1.getText();
                        jf1.setText(s1+i);
                        Thread.sleep(1000);
                    }
                }
            }else if(num == 2 && flag == true){
                String s2=null;
                for(int i=0;i<10;i++){
                    if(flag == true){
                        s2 = jf1.getText();
                        jf2.setText(s2+i);
                        Thread.sleep(1000);
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

}

public class GUI_05 {
    public static void main(String[] args) {
        ThreadGUI tg = new ThreadGUI(10);
        tg.ThreadpartOfGUI();
    }
}
