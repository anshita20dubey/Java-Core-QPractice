package LoopsSwitch;

import java.util.Scanner;

public class Q38Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int copy = n, sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        System.out.println(sum == copy ? "Strong..." : "Nhi...");

    }
}