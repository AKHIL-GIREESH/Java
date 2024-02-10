import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileOperations {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("sample.txt");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        int i,words=0,characters=0,lines=0;
        char c;
        try{
            do{
                i = fin.read();
                c = (char)i;
                if(i!=-1){
                    characters++;
                    if(c == ' ' || c == '\n'){
                        words++;
                    }
                    if(c == '\n'){
                        lines++;
                    }
                }
                
            }while(i!=-1);
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            System.out.println(characters);
            System.out.println(lines);
            System.out.println(words);
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
