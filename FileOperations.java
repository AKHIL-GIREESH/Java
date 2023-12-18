import java.io.*;

class ODD extends Thread{
    FileInputStream fin = null;
    FileOutputStream fout =null;
    int temp,temp1;
    char c;

    ODD(FileOutputStream o,FileInputStream i){
        fin = i;
        fout = o;
    }
    public void run(){
        try{
            temp = fin.read();
            while(temp!=-1){
            c = (char)temp;

            if(!(c == ' ')){
                temp1 = Integer.parseInt(c+"");
                System.out.println(temp1%2);

                if(temp1%2 == 1){
                    System.out.println("Odd");
                    fout.write(temp);
                }
            }
            temp = fin.read();

        }}catch(Exception e){
            System.out.println(e);
        }
    }
}

class EVEN extends Thread{
    FileInputStream fin = null;
    FileOutputStream fout =null;
    int temp,temp1;
    char c;

    EVEN(FileOutputStream o,FileInputStream i){
        fin = i;
        fout = o;
    }

    public void run(){
        try{
            temp = fin.read();
            while(temp!=-1){
            c = (char)temp;

            if(!(c == ' ')){
                temp1 = Integer.parseInt(c+"");
                System.out.println(temp1%2);

                if(temp1%2 == 0){
                    System.out.println("Even");
                    fout.write(temp);

                }
            }
            temp = fin.read();

        }}catch(Exception e){
            System.out.println(e);
        }
    }
}

public class FileOperations {
    public static void main(String[] args) {

        // int temp,temp1;
        // char c;
        FileInputStream fin = null;
        FileOutputStream fout1 = null,fout2 = null;

        try{
            fin = new FileInputStream("f1.txt"); 
            fout1 = new FileOutputStream("fEven.txt");
            fout2 = new FileOutputStream("fOdd.txt");

        }catch(FileNotFoundException e ){
            System.out.println(e);
        }

        ODD o = new ODD(fout2,fin);
        o.start();

        EVEN e = new EVEN(fout1,fin);
        e.start();

        // try{
        //     temp = fin.read();
        //     while(temp!=-1){
        //     c = (char)temp;

        //     if(!(c == ' ')){
        //         temp1 = Integer.parseInt(c+"");
        //         System.out.println(temp1%2);

        //         if(temp1%2 == 1){
        //             System.out.println("Odd");
        //             fout2.write(temp);

        //         }else{
        //             System.out.println("Even");
        //             fout1.write(temp);
        //         }
        //     }
        //     temp = fin.read();

        // }}catch(Exception e){
        //     System.out.println(e);
        // }

        // try{
        //         fin.close();
        //         fout1.close();
        //         fout2.close();
        // }catch(Exception ex){
        //     System.out.println(ex);
        // }
    }
}
