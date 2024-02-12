import java.io.*;

class lower extends Thread{
    FileInputStream fin = null;
    FileOutputStream fout = null;
    lower(){
        try{
            fin = new FileInputStream("sample.txt");
            fout = new FileOutputStream("sampleupper.txt");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void run(){
        int i=0;
        do{
            try{
                i = fin.read();
                if(i>=65 && i<=90){
                    fout.write(i);
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
        }while(i!=-1);
        try{
            fin.close();
            fout.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

class upper extends Thread{
    FileInputStream fin;
    FileOutputStream fout;
    upper(FileInputStream in,FileOutputStream out){
        fin = in;
        fout = out;
    }
    public void run(){
        int i=0;
        do{
            try{
                i = fin.read();
                if(i>=97 && i<=122){
                    fout.write(i);
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
        }while(i!=-1);

        try{
            fin.close();
            fout.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


public class Threads_03 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream foutO = null,foutE = null;
        try{
            fin = new FileInputStream("sample.txt");
            foutO = new FileOutputStream("sampleupper.txt");
            foutE = new FileOutputStream("samplelower.txt");
        }catch(Exception e){
            System.out.println(e);
        }
        lower l = new lower();
        upper u = new upper(fin,foutE);

        l.start();
        u.start();
    }
}
