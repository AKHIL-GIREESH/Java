class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

public class DepricatedThreads {
    public static void main(String ar[]) throws InterruptedException{
        A a = new A();
        a.start();
        Thread.sleep(1000);
    }
}
