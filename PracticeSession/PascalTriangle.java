package PracticeSession;
/*
   number Pascal triangle
   a. print the nth row rth column's value - (n-1)C(r-1)
   b. print whole nth row -
      ans = 1;
      ans*(n-c)/c
   c. print the whole triangle

*/

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
