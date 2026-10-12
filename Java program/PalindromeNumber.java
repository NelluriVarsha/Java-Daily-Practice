import java.util.*;
class Main {
    static boolean isPalindrome(int n) {
        int org = n;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return org == rev;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");
    }
}
