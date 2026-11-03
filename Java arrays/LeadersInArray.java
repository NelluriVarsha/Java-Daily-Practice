import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max=a[n-1];
        System.out.print(max + " ");
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>=max){
                System.out.print(a[i] +" ");
                max=a[i];
            } 
        }
    }
}
