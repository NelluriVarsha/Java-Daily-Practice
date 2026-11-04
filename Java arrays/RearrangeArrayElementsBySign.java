import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                pos[p] = a[i];
                p++;
            } else {
                neg[q] = a[i];
                q++;
            }
        }
        int r = p;
        int t = q;
        p = 0;
        q = 0;
        int[] res = new int[n];
        int k = 0;
        while (p < r && q < t) {
            res[k] = pos[p];
            p++;
            k++;

            res[k] = neg[q];
            q++;
            k++;
        }
        while (p < r) {
            res[k] = pos[p];
            p++;
            k++;
        }
        while (q < t) {
            res[k] = neg[q];
            q++;
            k++;
        }
        System.out.println(Arrays.toString(res));
    }
}
