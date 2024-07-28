package Task3;
/*
       Third Maximum	Number
       Given an	integer	array nums, return the third distinct maximum number in
       this	array.	If	the	third	maximum	does not exist,	return	the	maximum
       number.
       Example	1:	Input:	nums	=	[3,2,1]
       Output:	1
       Example	2:	Input:	nums	=	[1,2]
       Output: 2
*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                thirdMax = secMax;
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] < max) {
                thirdMax = secMax;
                secMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] < secMax && arr[i] < max) {
                thirdMax = arr[i];
            }
        }
        System.out.println(thirdMax);
    }
}
