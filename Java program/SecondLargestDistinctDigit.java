import java.util.*;
class Main {
    static int SecondLargestDigit(int n) {
        int firstlargest=-1, secondlargest=-1;

        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit>firstlargest) {
              secondlargest=firstlargest;
              firstlargest=lastDigit;

            } else if( lastDigit>secondlargest && lastDigit<firstlargest) {
              secondlargest=lastDigit;
            }
            n /= 10;
        }
        if(secondlargest==-1) return -1;
        return secondlargest;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

       int result = SecondLargestDigit(n);
      if (result == -1) {
        System.out.println("No second largest digit");
      } else {
        System.out.println(result);
      }
    }
}
