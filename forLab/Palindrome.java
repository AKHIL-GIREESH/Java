import java.util.*;

public class Palindrome {
    public static void main(String args[]){ 
        Scanner obj = new Scanner(System.in);
        
        String s1 = obj.nextLine();
        String r= "";

        for(int i=s1.length()-1;i>=0;i--){
            r+= s1.charAt(i);
        }

        System.out.print(s1.equals(r)?"Palindrome":"!Palindrome");
    }    
}