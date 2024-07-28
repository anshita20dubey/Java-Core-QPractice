package LoopsSwitch;

import java.util.Scanner;

public class Q37Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int rev = 0, copy = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev == copy ? "Pallindrome hai.." : "Nhi hai..");
    }
}
