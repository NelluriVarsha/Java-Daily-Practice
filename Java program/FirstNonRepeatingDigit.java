import java.util.*;
class Main{
  static int findFirstNonRepeatingDigit(int n){
    int[] df=new int[10];
    int org=n;
    while(n>0){
    int ld=n%10;
      df[ld]++;
      n/=10;
    }
    int rev=0;
    while(org>0) {
      int ld=org%10;
      rev=rev*10+ld;
      org/=10;
    }
    while(rev>0) {
      int ld=rev%10;
      if(df[ld]==1) {
        return ld;
      }
      rev/=10;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(findFirstNonRepeatingDigit(n));
  }
}
