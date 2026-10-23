
import java.util.Scanner;

class ThirdLargestDistinctDigit {

    static int findThirdLargestDistinctDigit(int n) {
        int firstLargest = -1;
        int secondLargest = -1;
        int thirdLargest = -1;

        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = lastDigit;
            } 
            else if (lastDigit > secondLargest && lastDigit != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = lastDigit;
            } 
            else if (lastDigit > thirdLargest
                    && lastDigit != firstLargest
                    && lastDigit != secondLargest) {
                thirdLargest = lastDigit;
            }

            n = n / 10;
        }

        return thirdLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = s.nextInt();

        int res = findThirdLargestDistinctDigit(n);

        System.out.println(res);

    }
}
