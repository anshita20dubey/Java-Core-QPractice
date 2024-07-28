package Arrays;

import java.util.Scanner;

public class Q60RightK {
    public static void main(String[] args) {
        // arr = 1 3 5 7 9
        // k = 2
        // output = 7 9 1 3 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter times:");
        int times = sc.nextInt();

        times = times % n;

        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int count = (i + times) % n;
            arr2[count] = arr[i];
        }

        for (int elem : arr2) {
            System.out.print(elem + " ");
        }

    }
}
