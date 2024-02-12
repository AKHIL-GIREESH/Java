//import javax.print.attribute.standard.MediaSize.NA;

class AgeNotWithinRangeException extends Exception{
    AgeNotWithinRangeException(){
        super("Underaged!");
    }
}

class NameIsNotValidException extends Exception{
    NameIsNotValidException(){
        super("Name is not valid");
    }
}

public class Errors_01 {
    public static void main(String[] args) {
        int i=0;
        try{
            if(i==0){
                throw new AgeNotWithinRangeException();
            }
        }catch(AgeNotWithinRangeException e){
            System.out.println(e);
        }
        i++;
        try{
            if(i==1){
                throw new NameIsNotValidException();
            }
        }catch(NameIsNotValidException e){
            System.out.println(e);
        }
        
    }
}
