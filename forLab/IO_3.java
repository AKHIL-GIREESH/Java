import java.io.Serializable;

import java.util.*;

class Quick{
    void QuickSort(String a[],int first,int last){
        int i,j;
        String s,temp;
        if(first<last){
            i=first;
            j=last;
            s = a[first];
            while(i<j){
                while(a[i].compareTo(s)<=0 && i<last){
                    i++;
                }
                while(a[j].compareTo(s)>=0 && j>first){
                    j--;
                }

                if(i<j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                temp = a[j];
                a[j] = a[first];
                a[first] = temp;
                QuickSort(a, first, j-1);
                QuickSort(a, j+1, last);

            }
        }
    }
}

public class IO_3 {
    public static void main(String[] args) {
        int sz;
        String a[] = new String[10];
        System.out.println("Num");
        Scanner obj = new Scanner(System.in);
        sz = obj.nextInt();

        for(int i=0;i<sz;i++){
            System.out.println("Num");
            a[i] = obj.nextLine();
        }
        
        Quick q = new Quick();
        q.QuickSort(a,0,sz-1);

        for(int i=0;i<sz;i++){
            System.out.println(a[i]);
        }
    }
}
