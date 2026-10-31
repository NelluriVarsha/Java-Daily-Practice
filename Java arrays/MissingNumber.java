import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=s.nextInt();
        }
        int expectedsum=(n*(n+1))/2;
        int actualsum=0;
        for(int i=0;i<a.length;i++) {
            actualsum+=a[i];
        }
        
        System.out.print(expectedsum-actualsum);
    }
}
