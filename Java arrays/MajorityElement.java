import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        boolean[] visited = new boolean[n];
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    visited[j]=true;
                }
            }
            if(count>n/2){
                System.out.println(a[i]);
                found = true;
                break;
            }
        }
        if (!found) {
                System.out.println("No majority element");
            }
    }
}
