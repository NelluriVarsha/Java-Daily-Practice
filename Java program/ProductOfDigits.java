import java.util.*;
class Main{
  static int ProductOfDigits(int n){
    int product=1;
    while(n>0) {
      int ld=n%10;
      product*=ld;
      n/=10;
    }
    return product;
  }
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(ProductOfDigits(n));
  }
}
