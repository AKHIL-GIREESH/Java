import java.util.*;

class Third extends Thread{
    int rand;
    Third(int _rand){
        rand = _rand;
    }

    public void run(){
        System.out.println("Number = "+rand+"Cube = "+Math.pow(rand,3));
    }
}

class Second extends Thread{
    int rand;
    Second(int _rand){
        rand = _rand;
    }

    public void run(){
        System.out.println("Number = "+rand+"Square = "+Math.pow(rand,2));
    }
}

class First extends Thread{
    int rand;
    public void run(){
        try{
            for(int i = 0;i<5;i++){
                Random r = new Random();
                rand = r.nextInt(10);
                if(rand%2 == 0){
                    Second s = new Second(rand);
                    s.start();
                }else{
                    Third t = new Third(rand);
                    t.start();
                }
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


public class Threads_05 {
    public static void main(String[] args) {
        First f = new First();
        f.start();
    }
}
