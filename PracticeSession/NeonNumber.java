package PracticeSession;

import java.util.Scanner;

/*
     A neon number is a number where the sum of digits of the square of the number is equal to the number.
     Input  : 9
     Output : Given number  9 is Neon number

     Explanation : square of 9=9*9=81;
     sum of digit of square : 8+1=9(which is equal to given number)
*/
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt(); // 9
        int sqr = n * n; //9 * 9 = 81
        int sum = 0;
        while (sqr > 0) { // 8 + 1 = 9
            int rem = sqr % 10;
            sum += rem;
            sqr /= 10;
        }
        System.out.println(sum == n ? "Neon Number" : "Nhi hai");


    }
}
