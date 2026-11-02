import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4};
        int[] b={3, 4, 5, 6};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int j=0;j<b.length;j++) {
            hs.add(b[j]);
        }
        System.out.println(hs);
    }
} 
