import java.util.*;

class Main {
    static int countEvenNum(int n) {
        int count = 0;


        while (n > 0) {
            int lastDigit = n % 10;
            if(lastDigit%2==0) count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countEvenNum(n));
    }
}
