package Task2;
import java.util.Scanner;
/*
    Write a program to generate and print the first N terms of the Fibonacci
    series.
    Example: - Input: num = 5|| Output: 0 1 1 2 3 5
*/
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int prev = 0, curr = 1;
        System.out.print(prev + " " + curr+" ");
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            System.out.print(next + " ");
            prev = curr;
            curr = next;
        }
    }
}