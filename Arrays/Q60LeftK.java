package Arrays;

import java.util.Scanner;

public class Q60LeftK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Times: ");
        int k = sc.nextInt();
        k = k % n;

        while (k-- > 0) {
            int copy = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = copy;
        }

        System.out.println("Left rotated array by is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

//        int[] arr2 = new int[n];
//        int count = 0;
//
//        for (int i = times; i < n; i++) {
//            arr2[count] = arr[i];
//            count++;
//        }
//
//        for (int j = 0; j < times; j++) {
//            arr2[count] = arr[j];
//            count++;
//        }
//
//        System.out.println("Left rotated array by " + times + " is:");
//        for (int k = 0; k < n; k++) {
//            System.out.print(arr2[k] + " ");
//        }

    }
}
