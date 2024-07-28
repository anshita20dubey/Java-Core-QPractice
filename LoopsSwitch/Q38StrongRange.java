package LoopsSwitch;

import java.util.Scanner;

public class Q38StrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int j = 1; j <= 1000; j++) {
            int n = j;
            int copy = n;
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                int fact = 1;
                for (int i = 1; i <= rem; i++) {
                    fact = fact * i;
                }
                sum += fact;
                n = n / 10;
            }
            if (sum == copy) {
                System.out.println(copy);
            }
        }
    }
}
