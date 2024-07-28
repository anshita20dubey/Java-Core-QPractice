package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int copy[] = new int[arr.length];

        int j =0;
        for (int i = arr.length-1; i >=0 ; i--) {
            copy[j++] = arr[i];
        }

        System.out.println(Arrays.toString(copy));

        // toString = it is a method jo object ko readable form me convert kr dega
    }
}
