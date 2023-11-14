class A{
    A(){
        System.out.println("A"); 
    }

    A(int a){
        System.out.println("Aint");
    }
}

class B extends A{
    int a  = 10;
    B(){
        super(10);
        System.out.println("B");
    }
} 


public class Super {
    public static void main(String a[]){
        B b = new B();

        B a1 = b;
        a1.a = 5;
        System.out.println(b.a);

    }
}


