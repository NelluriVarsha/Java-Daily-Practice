import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[idx] = a[i];
                idx++;
            }
        }

        while (idx < n) {
            a[idx] = 0;
            idx++;
        }

        System.out.println(Arrays.toString(a));
    }
}
