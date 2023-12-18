import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class character{
    FileInputStream fin = null;
    int tempByte;
    character(FileInputStream f){
        fin = f;
    }
    public void run(){
        try{
        tempByte = fin.read();
        while(tempByte != -1){
            
        }
        }catch(Exception e){
         
        }

        try{
            fin.close();
        }catch(Exception e){
            
        }
    }
}

class words{
    FileInputStream fin = null;
    words(FileInputStream f){
        fin = f;
    }
    public void run(){

    }
}

class newline{
    FileInputStream fin = null;
    newline(FileInputStream f){
        fin = f;
    }
    public void run(){

    }
}


public class counting {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try{
        fin = new FileInputStream("f2.txt");
        }catch(FileNotFoundException e){
            
        }
        
        character c = new character(fin);
        words w = new words(fin);
        newline n = new newline(fin);

    }
}
