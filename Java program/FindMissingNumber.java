/*
 * Problem: Find the Missing Number
 *
 * Description:
 * Given an integer N and an array containing numbers
 * from 1 to N with exactly one number missing,
 * find the missing number.
 *
 * Approach:
 * 1. Calculate the expected sum using N * (N + 1) / 2.
 * 2. Calculate the sum of the given array elements.
 * 3. Subtract the actual sum from the expected sum.
 *
 *
 * Example:
 * N = 6
 * Array = [1, 2, 3, 5, 6]
 * Output = 4
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a={1,2,3,5};
        int esum=(n*(n+1))/2;
        int asum=0;
        for(int i=0;i<a.length;i++){
            asum+=a[i];
        }
        int res = esum-asum;
        System.out.println(res);
           
    }
}
        
     
