import java.io.*;

public class IOOperations {
    public static void main(String ar[]){
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));

        try{
            int a = obj.read();
            System.out.println(a);

            char c = (char)a;
            System.out.println(c);

            String s = obj.readLine();
            System.out.println(s);

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
