package PracticeSession;

import java.util.Scanner;

/*
    For a given positive integer N, the purpose is to find the value of F2 + F4 + F6 +………+ F2n till N number. Where Fi indicates the i’th Fibonacci number.
    Input: n = 4
    Output: 33
    N = 4, So here the fibonacci series will be produced from 0th term till 8th term:
    0, 1, 1, 2, 3, 5, 8, 13, 21
    Sum of numbers at even indexes = 0 + 1 + 3 + 8 + 21 = 33.

    Input: n = 7
    Output: 609
    0 + 1 + 3 + 8 + 21 + 55 + 144 + 377 = 609.
*/
public class FibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int prev = 0, curr = 1;

        int sum = prev+curr;
        for (int i = 2; i <= n; i++) {
            int next = prev+curr;

            sum = sum + next;
            prev = curr;
            curr = next;
        }
        System.out.println("Sum is: "+sum);
    }
}
