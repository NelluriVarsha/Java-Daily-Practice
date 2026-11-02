import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int minimumPrice = a[0];
        int maximumProfit = 0;
        for(int i=1;i<n;i++) {
            if(a[i]<minimumPrice){
                minimumPrice=a[i];
            } else 
            {
                int currentProfit = a[i] - minimumPrice;
                if(currentProfit>maximumProfit){
                    maximumProfit=currentProfit;
                }
            }
        }
        System.out.print(maximumProfit);
        
    }
} 
