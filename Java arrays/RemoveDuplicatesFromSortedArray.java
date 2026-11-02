
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int j=0;
        for(int i=1;i<n;i++){
           if(a[j]!=a[i]){
               j++;
               a[j]=a[i];
           }
        }
        for(int i = 0; i <= j; i++) {
          System.out.print(a[i] + " ");
        }
        
    }
} 
