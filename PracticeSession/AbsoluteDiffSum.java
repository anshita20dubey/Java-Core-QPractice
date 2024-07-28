package PracticeSession;

import java.util.Scanner;
/*
      Given a sorted array of distinct elements, the task is to find the summation of absolute differences of all pairs in the given array.
      Examples:
      Input : arr[] = {1, 2, 3, 4}
      Output: 10
              Sum of |2-1| + |3-1| + |4-1| + |3-2| + |4-2| + |4-3| = 10
*/

public class AbsoluteDiffSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum += Math.abs(arr[j]-arr[i]);
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
