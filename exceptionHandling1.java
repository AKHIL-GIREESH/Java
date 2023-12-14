import java.io.*;

public class exceptionHandling1 {
    public static void main(String ar[]){
        int a = 1;
        try{
            int b;
            try{
                b = 1/(a-a);
            }catch(Exception e){
                System.out.println(e);
            }
        }catch(ArithmeticException e){
            System.out.println("Outer"+e);
        }
    }
}
