package Arrays;

import java.util.Scanner;

public class Q59Left1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // 11 22 33
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int copy = arr[0];

        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[n-1] = copy;
        System.out.println("Array left rotated by 1 is: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
