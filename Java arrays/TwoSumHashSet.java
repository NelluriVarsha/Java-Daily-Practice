import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        HashSet<Integer> m=new HashSet<>();
        int target=s.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            int required=target-a[i];
            if(m.contains(required)){  
                found=true;
                    break;
            }
            else {
              m.add(a[i]);
            }
        }
        if(!found){
            System.out.print("No pair found");
        } else {
                System.out.print("pair found");
        }
    }
}
