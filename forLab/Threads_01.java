import java.io.*;

class T1 extends Thread{
    synchronized public void run(){
    try{
        for(int i=0;i<3;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }catch(Exception e){
        System.out.print(e);
    }
        
    }
}

class T2 extends Thread{
    public void run(){
        try{
            for(int i=0;i<3;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.print(e);
        }
            
        }
}

public class Threads_01{

    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
        T2 t2 = new T2();
        t2.start();  
    }
    
}
