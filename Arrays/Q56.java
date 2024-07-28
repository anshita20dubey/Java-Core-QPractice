package Arrays;

import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        int gi = 0;
        for (int i = 0; i < n; i++) {
            if (arr[gi] < arr[i]) {
                gi = i;
            }
        }
        int sgi = 0;
        for (int k = 0; k < n; k++) {
            if (arr[sgi] < arr[k] && gi != k) {
                sgi = k;
            }
        }
        System.out.println("Second greatest element is " + arr[sgi] + " at " + sgi + " index");
    }
}
