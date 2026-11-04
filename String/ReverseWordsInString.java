import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] w = str.split(" ");
        String rev = "";
        for (int i = w.length - 1; i >= 0; i--) {
            rev += w[i];
            if (i > 0) {
                rev += " ";
            }
        }
        System.out.println(rev);
    }
}
