package PatternPrograms;

import java.util.Scanner;

public class Q49Inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // int temp = n;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= temp; j++) {
//                System.out.print("* ");
//            }
             // temp--;
//            System.out.println();
//        }
    }
}
