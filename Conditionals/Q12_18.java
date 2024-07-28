package Conditionals;

import java.util.Scanner;

public class Q12_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int great = a;

        if (great < b) {
            if (b > c) {
                System.out.println(b + " is greatest");
            } else {
                System.out.println(c + " is greatest");
            }
        } else {
            System.out.println(a + " is greatest");
        }

    }
}
