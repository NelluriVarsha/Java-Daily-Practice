
import java.util.*;
class Main{
static int countOccurrences(int[] a, int target) {
    int count = 0;

    for (int i = 0; i < a.length; i++) {
        if (a[i] == target) {
            count++;
        }
    }

    return count;
}
 public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a = new int[n]; 
        int target=s.nextInt();
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        System.out.println(countOccurrences(a, target));
        
    }
}
