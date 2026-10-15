import java.util.*;
class Main {
    static int countSpecificDigit(int n, int d) {
        int count=0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit==d) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d=s.nextInt();
        System.out.println(countSpecificDigit(n, d));
    }
}
