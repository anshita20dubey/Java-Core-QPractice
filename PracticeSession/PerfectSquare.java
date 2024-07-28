package PracticeSession;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 25

//          Approach 1
//        int sqrt = (int) Math.sqrt(n);// 5
//        System.out.println(sqrt*sqrt == n ? "perfect" : "not perfect");


//        Approach 2
        int check = 0;
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                check = 1;
                break;
            }
        }
        System.out.println(check == 0 ? "Not perfect" : "Perfect");
    }
}
