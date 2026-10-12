import java.util.*;
class Main {
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countDigits(n));
    }
}
