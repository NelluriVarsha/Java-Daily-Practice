import java.util.*;
class Main {
   static int lcm(int a, int b)  {
       int lcm=1;
        for (int i = Math.max(a,b); i<=a*b;i++) {
            if (i %a == 0 && i%b==0) {
              lcm=i;
              break;
            }
        }
     return lcm;
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int a = s.nextInt();
int b = s.nextInt();
System.out.println(lcm(a, b));
    }
}
