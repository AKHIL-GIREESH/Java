import java.io.*;

public class IO_01 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;
        char c;
        String s="";

        try{
            fin = new FileInputStream("numberfile.txt");
            fout = new FileOutputStream("newFIle.txt");
        }catch(Exception e){
            System.out.print(e);
        }

        try{
            do{
                i = fin.read();
                if(i!=-1){
                    c = (char)i;
                    System.out.print(Integer.parseInt(""+c));
                    fout.write(c);
                }
            }while(i!=-1);
            fout.write("9".charAt(0));
            System.out.print(s);
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
