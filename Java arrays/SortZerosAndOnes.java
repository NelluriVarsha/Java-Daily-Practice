import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int z=0, o=0;
        for(int i=0;i<n;i++){
           if(a[i]==0){
              z++; 
           } else {
               o++;
           }
        }
        for(int i=0;i<z;i++){
            a[i]=0;
        }
        for(int i=z;i<a.length;i++){
            a[i]=1;
        }
        System.out.print(Arrays.toString(a));
    }
}
