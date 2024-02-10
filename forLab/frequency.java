import java.util.*;

class frequency{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Input the String");
        String s1 = obj.nextLine();

        System.out.println("Input the String");
        char c = obj.nextLine().charAt(0);
        int fr=0;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == c){
                fr++;
            }
        }
        System.out.println("Frequency of "+c+ " = "+fr);
    }
}