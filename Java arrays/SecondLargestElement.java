
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Array must contain at least one element");
            return;
        }

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int fl = a[0];
        int sl = 0;
        boolean foundSecondLargest = false;

        for (int i = 1; i < n; i++) {
            if (a[i] > fl) {
                sl = fl;
                fl = a[i];
                foundSecondLargest = true;
            } else if (a[i] < fl &&
                       (!foundSecondLargest || a[i] > sl)) {
                sl = a[i];
                foundSecondLargest = true;
            }
        }

        System.out.println("firstLargest: " + fl);

        if (foundSecondLargest) {
            System.out.println("secondLargest: " + sl);
        } else {
            System.out.println("No second largest element");
        }

        s.close();
    }
}
