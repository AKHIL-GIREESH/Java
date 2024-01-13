class childThread extends Thread{
    String name;
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(name + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
    }
}


public class ThreeChildThreads {
    public static void main(String args[]){
        childThread c1 = new childThread();
        c1.name = "Thread 1";
        childThread c2 = new childThread();
        c2.name = "Thread 2";
        childThread c3 = new childThread();
        c3.name = "Thread 3";

        c1.start();
        c2.start();
        c3.start();
    }
}
