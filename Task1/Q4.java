package Task1;
/*
    Count Digits in a Number
    Input : n=435;   Output : 3
*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER:");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println("Total digits are: " + count);
    }
}
