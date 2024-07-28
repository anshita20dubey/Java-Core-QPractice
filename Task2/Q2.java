package Task2;

import java.util.Scanner;

/*
    Given a positive integer n, return the smallest positive integer that is a
    multiple of both 2 and n.
    Example: - Input: n = 5 || Output: 10
*/
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int ans = 0;
        if (n % 2 == 0) {
            ans = n;
        } else {
            ans = 2 * n;
        }
        System.out.println("Smallest multiple of 2 and " + n + " is: " + ans);
    }
}