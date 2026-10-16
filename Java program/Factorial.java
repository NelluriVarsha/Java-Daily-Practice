import java.util.*;
public class Main{
    static int fact(int n){
        if(n<=1) {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(fact(n));
    }
}
