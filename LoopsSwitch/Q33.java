package LoopsSwitch;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans = ans * a;
        }
        System.out.println("Answer is: " + ans);
    }
}
