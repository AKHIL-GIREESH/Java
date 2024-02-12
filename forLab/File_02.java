import java.io.*;

public class File_02{
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br;
        try {
            int i, len, count = 0;
            String str = "";
            String revstr = "";
            fr = new FileReader("sample.txt");
            fw = new FileWriter("rsample2.txt");
            br = new BufferedReader(fr);

            i = br.read();

            while (i != -1) {

                str = str + (char) i;
                i = br.read();
                

            }
            System.out.println("the string is  " + str);
            len = str.length();
            for (i = len - 1; i >= 0; i--) {
                revstr = revstr + str.charAt(i);
            }
            System.out.println("the reversed string is  " + revstr);
            if (!revstr.equals(str)) {
                System.out.println("the string is not palindrome");
                /*
                 * int j = br.read();
                 * int count = 0;
                 * for (i = 0; i < len; i++) {
                 * if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                 * str.charAt(i) == 'o'
                 * || str.charAt(i) == 'u') {
                 * count = count + 1;
                 * } else {
                 * fw.write(j);
                 * }
                 * j = br.read();
                 * }
                 * System.out.println("the count is" + count);
                 */

                
            }
            else{
                System.out.println("the string is palindrome");
                //int j = br.read();
                for(int j = 0;j<str.length();j++) {
                    char k = str.charAt(j);
                    System.out.println(k);
                    if (k != 'a' && k != 'e' && k != 'i' && k != 'o'
                            && k != 'u') {
                        fw.write((int) k);

                    } else {

                        count = count + 1;

                    }
                    //j = br.read();
                }
                System.out.println("the number of vowels are " + count);
            }

            fr.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}