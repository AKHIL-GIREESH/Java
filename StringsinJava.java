import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringsinJava {
    public static void main(String ar[]){

        char c[] = new char[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String s = br.readLine();
            System.out.println(s);

            for(int i=0;i<s.length();i++){
                c[s.length()-i-1] = s.charAt(i);
            }

            s = new String(c);

            System.out.println(s);
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
