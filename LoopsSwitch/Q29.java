package LoopsSwitch;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Even sum is: " + evenSum);
        System.out.println("Odd sum is: " + oddSum);
    }
}
