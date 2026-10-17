import java.util.*;
class Main{
  static int SumOfTwoLargestDistinctDigits(int n){
    int firstLargest=0, secondLargest=0, sum=0;
    while(n>0) {
      int lastDigit=n%10;
      if(lastDigit>firstLargest) {
        secondLargest=firstLargest;
        firstLargest=lastDigit;
      }
      if(lastDigit>secondLargest&&lastDigit<firstLargest) {
        secondLargest=lastDigit;
      }
      sum=firstLargest+secondLargest;
      n/=10;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(SumOfTwoLargestDistinctDigits(n));
  }
}
