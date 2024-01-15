public class Frequency {
    public static void main(String args[]){
        String s = "NUTTERTOOLS";
        int localCount;
        int MaxCount=0;
        char MaxVal = s.charAt(0);
        for(int i=0;i<s.length();i++){
            localCount = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    localCount++;
                }
            }
            if(localCount > MaxCount){
                MaxCount = localCount;
                MaxVal = s.charAt(i);
            }
        }
        System.out.print(MaxVal);
    }
}
