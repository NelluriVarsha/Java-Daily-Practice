
import java.util.*;

class Main {
    static boolean armstrong(int n) {
        int original = n;
        int temp = n;
        int c = 0;
        while (temp > 0) {
            c++;
            temp /= 10;
        }
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            int cur = (int) Math.pow(lastDigit, c);
            sum += cur;
            n /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(armstrong(n) ? "Armstrong" : "Not Armstrong");
    }
}
