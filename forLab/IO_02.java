import java.io.*;

public class IO_02 {
    public static void main(String[] args) {
        FileWriter fout = null;
        FileInputStream fin = null;
        BufferedReader br = null;
        int i;
        char c;
        String s;

        try{
            fin = new FileInputStream("sample.txt");
            fout = new FileWriter("newFIle.txt");
            br = new BufferedReader(new InputStreamReader(fin));
        }catch(Exception e){
            System.out.print(e);
        }

        try{
                s = br.readLine();
                System.out.print(s);
                //System.out.print(s);
            }catch(IOException e){
                System.out.print(e);
            }

            try{
                fin.close();
                fout.close();
            }catch(IOException e){
                System.out.print(e);
            }
    }
}
