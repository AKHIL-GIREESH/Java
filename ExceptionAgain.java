public class ExceptionAgain {
    public static void main(String args[]){
        try{
            String s = null;
            System.out.print(s.length());
        }catch(NullPointerException e){
            System.out.print(e);
        }finally{
            System.out.print("Hmm");
        }
    }
}
