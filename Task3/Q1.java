package Task3;
/*
   	 Maximum	Consecutive	Ones
     Given	a binary array nums, return	the	maximum	number	of	consecutive
     1's	in	the	array.
     Example 1:
     Input:	nums = [1,1,0,1,1,1]
     Output: 3
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        System.out.println("Maximum sequence is: "+max);

    }
}
