import java.util.*;

public class String_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        int i, j, flag = 0;
        int len = str.length();
        System.out.println(str.charAt(0));
        for (i = 1; i < len; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (str.charAt(j) == str.charAt(i)) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println(str.charAt(i));
            }

        }

    }

}