/*Read file name frm user copy contents from source to destination file
After copying convert to uppercase in the destination file
Catch block for handling exceptions like filenotfound*/

import java.io.*;
import java.util.*;

public class File_01 {
    public static void main(String[] args) {
        FileInputStream fin = null;//,finForUpperCase = null;
        FileOutputStream fout = null;

        Scanner obj = new Scanner(System.in);
        System.out.println("Input the Read filename 👇");
        String in = obj.nextLine();

        System.out.println("Input the Write filename 👇");
        String out = obj.nextLine();

        try{
            fin = new FileInputStream(in);
            fout = new FileOutputStream(out);

        }catch(FileNotFoundException e){
            System.out.println(e);
        }

        try{
            int i;
            do{
                i = fin.read();
                if(i>=97 && i<123){
                    fout.write(i-=32);
                }else{
                    fout.write(i);
                }
                //fout.write(i);
            }while(i!=-1);
        }catch(IOException e){
            System.out.println(e);
        }

        // try{
        //     finForUpperCase = new FileInputStream(out);
        //     int i;
        //     do{
        //         i = finForUpperCase.read();
        //         if(i>=97 && i<123){
        //             fout.write(i-=32);
        //         }else{
        //             fout.write(i);
        //         }
        //     }while(i!=-1);
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        try{
            fin.close();
            fout.close();
            //finForUpperCase.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
