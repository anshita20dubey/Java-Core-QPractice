package Task2;
import java.util.Scanner;
/*
    Write a program to print the LCM of two numbers.
    Example 1: - Input: a=2,b=4  || Output: 4
    Example 2: - Input: a=7,b=5  || Output: 35
*/
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = 1;
        if (n1 > n2) {
            for (int i = 2; i <= n2 / 2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    hcf = i;
                }
            }
        } else {
            for (int i = 2; i <= n1 / 2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    hcf = i;
                }
            }
        }
        int lcm = (n1 * n2) / hcf;
        System.out.println("LCM of the " + n1 + " & " + n2 + " is: " + lcm);
    }
}