interface A{
    void inA();
    interface B{
        void inB();
    }
}

class B implements A,A.B{
    public void inA(){
        System.out.println("In A");
    }

    public void inB(){
        System.out.println("In B");
    }
}


public class interfaces {
    public static void main(String a[]){
        B obj = new B();
        obj.inA();
        obj.inB();
    }    
}
