import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(m.containsKey(ch)) {
                m.put(ch, m.get(ch) + 1);
            } else {
                m.put(ch, 1);
            }
        }
        boolean found = false;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(m.get(ch) == 1) {
                System.out.println(ch);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("No non-repeating character");
        }
    }
}
