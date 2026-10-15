import java.util.*;
class Main {
    static int largestDigit(int n) {
        int max = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit > max) {
                max = lastDigit;
            }
            n /= 10;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(largestDigit(n));
    }
}
