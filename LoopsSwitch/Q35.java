package LoopsSwitch;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            System.out.print(rem);
            sum += rem;
            n = n / 10;
            if (n != 0) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + sum);
    }
}
