package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Math.max(arr[0],arr[1]);
        int sec = Math.min(arr[0],arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if(arr[i]>first){
                sec = first;
                first = arr[i];
            } else if (arr[i]>sec) {
                sec = arr[i];
            }
        }

        System.out.println("first is: "+first);
        System.out.println("sec is: "+sec);

    }
}
