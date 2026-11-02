import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!hs.add(a[i])) {
                System.out.println(a[i]);
                break;
            }
        }
    }
} 
