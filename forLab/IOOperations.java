import java.io.*;

public class IOOperations {
    public static void main(String[] args) {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a;
        char c;
        String s="";
        try{
            do{
                a = obj.read();
                System.out.println(a);
                c = (char)a;
                System.out.println(c);
                s+=c;
            }while(c!='f');
        }catch(Exception e){

        }

        System.out.println(s.length());
    }
}
