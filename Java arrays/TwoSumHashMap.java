import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        HashMap<Integer, Integer> m=new HashMap<>();
        int target=s.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            int required=target-a[i];
            if(m.containsKey(required)){
                System.out.print(m.get(required)+ ", "+i);
                found=true;
                break;
            }
            m.put(a[i], i);
        }
        if(!found){
            System.out.print("No pair found");
        }
    }
}
