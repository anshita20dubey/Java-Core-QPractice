package Task2;
import java.util.Scanner;
/*
    Write a program to print the HCF or GCD of two numbers.
    Example 1: - Input: a=2,b=4  || Output: 2
*/
public class Q4 {
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
        System.out.println("HCF of " + n1 + " & " + n2 + " is: " + hcf);
    }
}
