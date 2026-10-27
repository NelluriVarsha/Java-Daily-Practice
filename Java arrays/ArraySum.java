import java.util.*;
class Main {
    static int arraySum(int[] a) {
        
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a = new int[n]; 
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        System.out.println(arraySum(a));
        
    }
}
