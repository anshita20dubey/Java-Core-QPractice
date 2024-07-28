package Arrays;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int si = 0;
        for (int i = 1; i < n; i++) {
            if (arr[si] > arr[i]) {
                si = i;
            }
        }

        int ssi = -1;
        for (int i = 0; i < n; i++) {
            if (i != si) {
                if (ssi == -1 || arr[ssi] > arr[i]) {
                    ssi = i;
                }
            }
        }

        if (ssi == -1) {
            System.out.println("There is no second smallest");
        } else {
            System.out.println("second smallest: " + arr[ssi] + " at " + ssi);
        }
//        Second Smallest ->
//        int max = Math.max(arr[0],arr[1]);
//        int smax = Math.min(arr[0],arr[1]);
//        for (int i = 0; i < n; i++) {
//            if(arr[i]<max){
//                smax = max;
//                max = arr[i];
//            } else if (arr[i]<smax) {
//                smax = arr[i];
//            }
//        }
//        System.out.println(smax);
    }
}
