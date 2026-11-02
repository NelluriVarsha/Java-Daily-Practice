
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
       boolean sorted = true;
      for(int i = 0; i < a.length - 1; i++) {
        if(a[i] > a[i+1]) {
          sorted = false;
          break;
        }
      }
      if(sorted) {
        System.out.println("Array is sorted");
      } else {
        System.out.println("Array is not sorted");
      }   
    }
} 
