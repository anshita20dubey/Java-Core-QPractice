package Task1;
import java.util.Scanner;
/*
   Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
      + (Addition) a + b
      -(Subtraction) a – b
      (Multiplication) a * b
      / (Division) a / b
      % (Modulo or remainder) a % b
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Welcome to JAVA Calculator -> ");
            System.out.println("1 - Addition(+)\n2 - Subtraction(-)\n3 - Multiplication(*)\n4 - Division(/)\n5 - Modulo(%)\n6 - Exit");
            System.out.println("ENTER:");
            ch = sc.nextInt();
            if (ch == 1) {
                //add
                System.out.println("Enter 2 numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("sum: " + (a + b));
            } else if (ch == 2) {
                //subtract
                System.out.println("Enter 2 numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Subtract: " + (a - b));
            } else if (ch == 3) {
                //multiply
                System.out.println("Enter 2 numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Multiply: " + (a * b));
            } else if (ch == 4) {
                //division
                System.out.println("Enter 2 numbers:");
                double a = sc.nextInt();
                double b = sc.nextInt();
                System.out.println("Division: " + (a / b));
            } else if (ch == 5) {
                //modulo
                System.out.println("Enter 2 numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Modulo: " + (a % b));
            } else {
                break;
            }
            System.out.println("Press any digit to repeat");
            ch= sc.nextInt();
        } while (true);
    }
}
