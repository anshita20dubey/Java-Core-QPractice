package LoopsSwitch;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        while (n > 0) {
            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }
}
