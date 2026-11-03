
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++){
            b[j]=s.nextInt();
        }
        int i=0, j=0;
        while(i<n&&j<m){
                if(a[i]<=b[j]){
                    System.out.print(a[i]+" ");
                    i++;
                }else {
                    System.out.print(b[j]+" ");
                    j++;
                }
            }
        while(i<n){
            System.out.print(a[i]+" ");
            i++;
        }
        if(j<m){
            System.out.print(b[j]+" ");
            j++;
        }
    }
}
