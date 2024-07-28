package PracticeSession;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 12
        int b = sc.nextInt(); // 16

        // Approach 1
        int t = Math.min(a,b); // t = 12
        for (int i = t; i>0; i--){ // i = 12; i>0
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }

        // Approach 2
//        while (a!=b){
//            if(a>b) a = a-b;
//            else b = b-a;
//        }
//        System.out.println(a);
    }
}
