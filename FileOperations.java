import java.io.*;

class ODD extends Thread{
    public void run(FileOutputStream fout,int temp){
        try{
            fout.write(temp);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class EVEN extends Thread{
    public void run(FileOutputStream fout,int temp){
        try{
            fout.write(temp);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class FileOperations {
    public static void main(String[] args) {

        int temp,temp1;
        char c;
        FileInputStream fin = null;
        FileOutputStream fout1 = null,fout2 = null;

        try{
            fin = new FileInputStream("f1.txt"); 
            fout1 = new FileOutputStream("fEven.txt");
            fout2 = new FileOutputStream("fOdd.txt");

        }catch(FileNotFoundException e ){
            System.out.println(e);
        }

        try{
            temp = fin.read();
            while(temp!=-1){
            c = (char)temp;

            if(!(c == ' ')){
                temp1 = Integer.parseInt(c+"");
                System.out.println(temp1%2);

                if(temp1%2 == 1){
                    System.out.println("Odd");
                    fout2.write(temp);

                }else{
                    System.out.println("Even");
                    fout1.write(temp);
                }
            }
            temp = fin.read();

        }}catch(Exception e){
            System.out.println(e);
        }

        try{
                fin.close();
                fout1.close();
                fout2.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
