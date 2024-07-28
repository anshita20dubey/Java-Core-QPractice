package PyqsJcm;

import java.util.Scanner;

public class Q1FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                ans[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                ans[i - 1] = "Buzz";
            } else {
                ans[i - 1] = Integer.toString(i);
            }
        }
        for (String num : ans) {
            System.out.print(num + " ");
        }
    }
}
