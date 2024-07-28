package Task1;
/*
    Create a program for Hailstone Numbers
    keep iterating N as following
    N = N / 2 // For Even N
    and N = 3 * N + 1 // For Odd N
    Our number will eventually converge to 1 irrespective of the choice of N.
    Input :  N = 7
    Output: Hailstone Numbers: 7, 22, 11, 34, 17,
            52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2,1
*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER:");
        int n = sc.nextInt();
        String s = "";
        while (n != 1) {
            s += n + " ";
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        s += n;
        System.out.println("Hailstone Numbers are: "+ s);
    }
}
