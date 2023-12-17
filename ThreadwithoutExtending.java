class A{
    void methodfr(){

        Thread t = new Thread();
        System.out.println(t.currentThread());
        try{
            for(int i=0;i<4;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class ThreadwithoutExtending {
    public static void main(String ar[]){
        A a = new A();
        a.methodfr();
    }
}
