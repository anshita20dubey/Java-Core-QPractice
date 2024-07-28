package Arrays;

import java.util.Scanner;

public class Q66SubArray {
    public static void main(String[] args) {
        // continuous series of elements is called SubArray
        // sample code traversal of subarray for(i=0->i<n) nested for(j=i->i<n)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target:");
        int target = sc.nextInt();
        int count=0;

//        for (int i = 0; i < arr.length; i++) {
//            int sum=0;
//            for (int j = i; j < arr.length; j++){
//                sum += arr[j];
//                if(sum==target) count++;
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum==target) {
                    count++;
                    for (int k = i; k <= j; k++) {
                        System.out.println(arr[k] + " ");
                    }
                }

            }
        }

        System.out.println(count);
    }
}
