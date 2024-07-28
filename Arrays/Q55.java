package Arrays;

import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int gi = 0;
        for (int j = 0; j < n; j++) {
            if (arr[gi] < arr[j]) {
                gi = j;
            }
        }

//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            max = Math.min(max,arr[i]);
//        }
//        System.out.println(max);
        System.out.println("Greatest number is " + arr[gi] + " at " + gi + " index");
    }
}
