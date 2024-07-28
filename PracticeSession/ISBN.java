package PracticeSession;

import java.awt.print.Book;
import java.util.Scanner;


/*

   ISBN (International Standard Book Number) is a unique numeric book identifier which is printed on every book.
   The ISBN is based on 10-digit code.
   The ISBN is legal if:
   1 * digit1 + 2*digit2 + 3*digit3 + 4*digit4 + 5*digit5 + 6*digit6 + 7*digit7 + 8*digit8 + 9*digit9 + 10*digit10 is divisible by 11.
   Example : For an ISBN 1401601499
   Sum = 1*1 + 2*4 + 3*0 + 4*1 + 5*6 + 6*0 + 7*1 + 8*4 + 9*9 + 10*9 = 253
   which is divisble by 11
   Write a program to:
   i) Input the ISBN code as a 10-digit integer.
   ii) If the ISBN is not a 10-digit integer, output the msg, "Illegal ISBN" and terminate the program.
   iii) If the number is a 10-digit, extract the digits of the number and compute the sum as explained above
        If the sum is divisible by 11, output the message, "Legal ISBN". If the sum is divisible by 11, output the message, "Illegal ISBN".

*/
public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        int copy = n;
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        if (count == 10) {
            int sum = 0;

            while (copy > 0) {
                int rem = copy % 10;
                sum = sum + (rem * count);
                count--;
                copy = copy / 10;
            }

            System.out.println(sum%11 == 0 ? "Legal ISBN" : "Illegal ISBN");

        } else {
            System.out.println("Illegal ISBN");
        }
    }
}
