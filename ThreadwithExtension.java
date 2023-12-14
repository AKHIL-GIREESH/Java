class A extends Thread{
    public void run(){
        try{
            for(int i=0;i<4;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class ThreadwithExtension {
    public static void main(String ar[]){
        A a = new A();
        a.start();

        A b = new A();
        b.start();


        A c = new A();
        c.start();
    }
}
