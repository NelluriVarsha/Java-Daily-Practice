import java.util.*;
class Main {
    static int revNum(int n) {
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev=rev*10+lastDigit;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(revNum(n));
    }
}
