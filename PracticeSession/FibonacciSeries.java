package PracticeSession;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0, curr = 1;
        System.out.print(prev + " " + curr + " ");
        for (int i = 2; i < n; i++) {
            int next = prev + curr;
            System.out.print(next + " ");
            prev = curr;
            curr = next;
        }
    }
}
