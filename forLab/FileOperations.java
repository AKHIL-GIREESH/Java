import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOperations {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("sample.txt");
            fout = new FileOutputStream("rsample.txt");
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
            String s = "No.of characters = "+characters+"\nNo.of Words = "+words+"\nNo.of lines = "+lines;
            for(int k=0;k<s.length();k++){
                fout.write(s.charAt(k));
            }
            System.out.println(characters);
            System.out.println(lines);
            System.out.println(words);
            fin.close();
            fout.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
