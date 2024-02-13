import java.io.IOException;

class demo{
    demo() throws IOException{
        throw new IOException();
    }
}

public class Errors_02 {
    public static void main(String[] args) throws IOException {
        try{
            demo d = new demo();
            System.out.println("Hello");
        }catch(IOException e){
            System.out.println(e);
        }
        
        //System.out.println("Hllo");
    }
}
