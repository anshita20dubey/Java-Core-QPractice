package Arrays;

import java.util.Scanner;

public class Q63BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Finding element:");
        int find = sc.nextInt();

        int start = 0, end = n - 1, check = 0;
        int mid = (start + end) / 2;

        for (int i = 0; i < n; i++) {
            if (arr[i] == find) {
                check = i;
                break;
            } else if (arr[i] > find) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }

        System.out.println(check == 0 ? "Hai hi nhi" : "Mil gya " + arr[check] + " at " + check);

    }
}