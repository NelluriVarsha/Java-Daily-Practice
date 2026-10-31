
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        boolean found=false;
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]==a[j]){
                     found=true;
                    System.out.print(a[i]);
                }
            }
        }
        if(!found){
            
            System.out.print("No duplicates found");
        } 
    
    }
}
