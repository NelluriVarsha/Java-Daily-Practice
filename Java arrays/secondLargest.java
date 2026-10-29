import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int first = a[0];
        int second = 0;
        boolean foundSecond = false;
        for (int i = 1; i < n; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
                foundSecond = true;
            } else if (a[i] < first &&
                       (!foundSecond || a[i] > second)) {
                second = a[i];
                foundSecond = true;
            }
        }
        System.out.println("Largest: " + first);

        if (foundSecond) {
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No second largest element");
        }
    }
}
