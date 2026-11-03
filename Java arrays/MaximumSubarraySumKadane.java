import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int cs=a[0], ms=a[0];
        for(int i=1;i<n;i++){
            // cs+=a[i];
            cs=Math.max(cs+a[i], a[i]);
            ms=Math.max(ms,cs);
        }
        System.out.println(ms);
    }
}
