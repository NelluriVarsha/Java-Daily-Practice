import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int target=s.nextInt();
        boolean found=false;
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]+a[j]==target){
                    
                    System.out.print(i+" , "+j);
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("No pair found");
        }
    }
}
