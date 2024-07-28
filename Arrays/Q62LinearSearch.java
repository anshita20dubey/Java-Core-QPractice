package Arrays;

import java.util.Scanner;

public class Q62LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int find = sc.nextInt();
        int check = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == find) {
                check = i;
                break;
            }
        }
        System.out.println(check == -1 ? "Not found " + check : "Found at " + check);
    }
}
