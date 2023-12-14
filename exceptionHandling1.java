public class exceptionHandling1 {
    public static void main(String ar[]){
        
        try{
            
            try{


            }catch(Exception e){
                System.out.println(e);
            }
        }catch(ArithmeticException e){
            System.out.println("Outer"+e);
        }
    }
}
