package LoopsSwitch;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                if (i == n / 2) {
                    System.out.print(i + " = ");
                } else {
                    System.out.print(i + " + ");
                }
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
