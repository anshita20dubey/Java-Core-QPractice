package LoopsSwitch;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i =0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);
    }
}
